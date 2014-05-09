package classDef;

import java.util.Vector;

import classes.Tchar;
import classes.Tint;
import classes.Tvoid;
import classes.array;
import classes.pointer;
import classes.struct;
import classes.type;
import core.*;

public class declaration extends root
{
	public declaration(){}
	@SuppressWarnings("unchecked")
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tvoid)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tchar)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tint)
			{
				throw new Exception();
				//return 1;
			}
			code = null;

		}
		else
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tvoid)
			{
				throw new Exception();
				//return 1;
			}
			//...........
			if(child.get(1).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			
			Vector<pair> vv = (Vector<pair>)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			Vector<location> vl = new Vector<location>();
			
			for(int i=0;i<vv.size();i++)
			{
				if(first.getfunc(vv.get(i).str)!=null)throw new Exception();
				else 
				{
					value val = vv.get(i).val;
					if(val.loc==null)val.loc = new location();
					if(val.typ.typename.equals("array")||val.typ.typename.equals("struct"))
					{
						if(first.func==null)val.loc.global = true;
						else val.loc.global = false;
						val.loc.type = "memory";
						val.loc.offset = first.Off.lastElement();
						first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
						vl.add(val.loc);
						if(val.typ.typename.equals("array"))((array)val.typ).loc = val.loc;
						
					}
					else
					{
						location l = new temp();
						if(first.func==null)l.global = true;
						else l.global = false;
						l.offset = first.Off.lastElement();
						first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);			
						vl.add(l);
						val.loc = l;
					}
												
					first.putfunc(vv.get(i).str,val);
				}

			}
			if(child.get(1).checkinit()!=0)
			{
				throw new Exception();
			}
			Vector<Object> vo = (Vector<Object>)child.get(1).record;
			
			Vector<quad> r = new Vector<quad>();
			for(int i=0;i<vv.size();i++)
			{
				type newt = vv.get(i).val.typ;
				Object t = vo.get(i);
				if(t!=null)
				{
					if(t instanceof nconst)
					{
						if(!checkequal(newt,((nconst)t).typ))throw new Exception();
						location l = new location(0,"const",0,false);
						l.contain = ((nconst)t).value;
						if(((nconst)t).typ instanceof array)
						{
							location ll = new location(0,"const",0,false);
							ll.contain = ((nconst)t).typ.size;
							r.add(new quad("load",l,ll,vl.get(i)));
						}
						if(newt.typename.equals("pointer"))
						{
							if(((pointer)newt).loc==null)((pointer)newt).loc = new location();
							((pointer)newt).loc.type = "memory";
							if(((int)((nconst)t).value)>first.GP)
							{
								((pointer)newt).loc.global = true;
								((pointer)newt).loc.offset = ((int)((nconst)t).value)-first.GP;
							}
							else
							{
								((pointer)newt).loc.global = false;
								((pointer)newt).loc.offset = ((int)((nconst)t).value)-first.SP;
							}
							first.putfunc(vv.get(i).str,new value(newt,vl.get(i)));
						}
						else r.add(new quad("load",l,null,vl.get(i)));
						
						
					}
					else
					{
						if(first.func==null)throw new Exception();
						if(!checkequal(newt,((value)t).typ))throw new Exception();
						else if(((value)t).typ instanceof struct)
						{
							location ll = new location(0,"const",0,false);
							ll.contain = ((nconst)t).typ.size;
							r.add(new quad("load",((value)t).loc,ll,vl.get(i)));
						}
						else if(newt instanceof pointer)
						{
							if(((pointer)newt).loc==null)((pointer)newt).loc = new location();
							if(((value)t).typ instanceof pointer)
							{
								((pointer)newt).loc = ((pointer)((value)t).typ).loc;
							}
							if(((value)t).typ instanceof Tint || ((value)t).typ instanceof Tchar)
							{
								//address unknown...
								int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
							}
							first.putfunc(vv.get(i).str,new value(newt,vl.get(i)));
						}
						else r.add(new quad("load",((value)t).loc,null,vl.get(i)));
						
					}
					
					
				}
				
			}
			for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
			code.addAll(r);
			
		}
		
		
		return 0;
	}
}
