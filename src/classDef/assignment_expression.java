package classDef;
import java.util.Vector;

import core.first;
import classes.Tchar;
import classes.Tint;
import classes.pointer;
import classes.struct;
import classes.type;

public class assignment_expression extends root
{
	public assignment_expression(){}
	public int check() throws Exception
	{
		Vector<quad> v = new Vector<quad>();
		if (child.size() != 1)
		{
			root son = child.get(0);
			if (son.check()!=0) 
			{
				throw new Exception();
				//return 1; 
			}
			if (!((returnrecord)son.record).lvalue) 
			{
				throw new Exception();
				//return 1;
			}
			returnrecord r = (returnrecord)son.record;
			type t = r.rtype;
			r.constant = false;
			
			if (child.get(2).check()!=0) 
			{
				throw new Exception();
				//return 1;
			}
			
			if (((String)child.get(1).record).equals("="))
			{
				//System.out.println(t.typename);
				if (checkconvert(((returnrecord)child.get(2).record).rtype,t)!=0)
				{
					throw new Exception();
					//return 1;
				}
				if(((returnrecord)child.get(2).record).constant)
				{
					if(t instanceof pointer)
					{
						if(((pointer)t).loc==null)((pointer)t).loc = new location();
						((pointer)t).loc.type = "memory";
						if(((int)((returnrecord)child.get(2).record).value)>first.GP)
						{
							((pointer)t).loc.global = true;
							((pointer)t).loc.offset = ((int)((returnrecord)child.get(2).record).value)-first.GP;
						}
						else
						{
							((pointer)t).loc.global = false;
							((pointer)t).loc.offset = ((int)((returnrecord)child.get(2).record).value)-first.SP;
						}
						if(((returnrecord)son.record).value!=null)restore((String)((returnrecord)son.record).value,t);
					}
					else
					{
						location l = new location(0,"const",0,false);
						l.contain = ((returnrecord)child.get(2).record).value;
						if(t.addr)v.add(new quad("store",l,null,((returnrecord)son.record).loc));
						else v.add(new quad("load",l,null,((returnrecord)son.record).loc));
					}
					
				}
				else
				{
					if(t instanceof struct)
					{
						location ll = new location(0,"const",0,false);
						ll.contain = ((returnrecord)child.get(2).record).rtype.size;
						if(t.addr)v.add(new quad("store",((returnrecord)child.get(2).record).loc,ll,((returnrecord)son.record).loc));
						else v.add(new quad("load",((returnrecord)child.get(2).record).loc,ll,((returnrecord)son.record).loc));
					}
					else if(t instanceof pointer)
					{
						if(((pointer)t).loc==null)((pointer)t).loc = new location();
						if(((returnrecord)child.get(2).record).rtype instanceof pointer)
						{
							((pointer)t).loc = ((pointer)((returnrecord)child.get(2).record).rtype).loc;
						}
						if(((returnrecord)child.get(2).record).rtype instanceof Tint || ((returnrecord)child.get(2).record).rtype instanceof Tchar)
						{
							//address unknown...
							int a;
						}
						if(((returnrecord)son.record).value!=null)restore((String)((returnrecord)son.record).value,t);
					}
					else 
					{
						if(t.addr)v.add(new quad("store",((returnrecord)child.get(2).record).loc,null,((returnrecord)son.record).loc));
						else v.add(new quad("load",((returnrecord)child.get(2).record).loc,null,((returnrecord)son.record).loc));
					}
				}
				
			}
				
					
			else
			{
				if (checkconvert(((returnrecord)child.get(2).record).rtype,new Tint())!=0) 
				{
					throw new Exception();
					//return 1;
				}
				if(t instanceof pointer && (((String)child.get(1).record).equals("+=") || ((String)child.get(1).record).equals("-=")))
				{
					if(((pointer)t).loc.type.equals("dynamic"))
					{
						if(((returnrecord)child.get(2).record).constant)
						{
							if(((String)child.get(1).record).equals("+="))
							{
								location ll = new location(0,"const",0,false);
								ll.contain = ((returnrecord)child.get(2).record).constant;
								v.add(new quad("+",ll,null,((pointer)t).loc));
							}
							else
							{
								location ll = new location(0,"const",0,false);
								ll.contain = ((returnrecord)child.get(2).record).constant;
								v.add(new quad("-",ll,null,((pointer)t).loc));
							}
						}
						else
						{
							if(((String)child.get(1).record).equals("+="))
							{
								v.add(new quad("+",((returnrecord)child.get(2).record).loc,null,((pointer)t).loc));
							}
							else
							{
								v.add(new quad("-",((returnrecord)child.get(2).record).loc,null,((pointer)t).loc));
							}
						}
					}
					else
					{
						if(((returnrecord)child.get(2).record).constant)
						{
							if(((String)child.get(1).record).equals("+="))
							{
								((pointer)t).loc.offset+=(int)((returnrecord)child.get(2).record).value;
							}
							else ((pointer)t).loc.offset-=(int)((returnrecord)child.get(2).record).value;
							 
						}
						else
						{
							if(((String)child.get(1).record).equals("+="))
							{
								location ll = new location(0,"const",0,false);
								ll.contain = ((pointer)t).loc.offset;
								location l = new temp();
								v.add(new quad("+",ll,((returnrecord)child.get(2).record).loc,l));
								((pointer)t).loc.contain = l;
								((pointer)t).loc.type = "dynamic";
							}
							else
							{
								location ll = new location(0,"const",0,false);
								ll.contain = ((pointer)t).loc.offset;
								location l = new temp();
								v.add(new quad("-",ll,((returnrecord)child.get(2).record).loc,l));
								((pointer)t).loc.contain = l;
								((pointer)t).loc.type = "dynamic";
							}
						}
					}
					
				}
				else
				{
					if (checkconvert(t,new Tint())!=0) 
					{
						throw new Exception();
						//return 1;
					}
					if(((returnrecord)child.get(2).record).constant)
					{
						location l = new location(0,"const",0,false);
						l.contain = ((returnrecord)child.get(2).record).value;
						v.add(new quad(((String)child.get(1).record),l,null,((returnrecord)son.record).loc));
					}
					else
					{
						v.add(new quad(((String)child.get(1).record),((returnrecord)child.get(2).record).loc,null,((returnrecord)son.record).loc));
					}
				}
				
			}
			record = r;
			
			
		}
		else
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
			}
			record = child.get(0).record;
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		code.addAll(v);
		
		return 0;
	}
}
