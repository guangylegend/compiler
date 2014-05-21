package classDef;

import core.first;
import classes.Tint;
import classes.Tvoid;
import classes.name;
import classes.pointer;
import classes.type;


public class postfix_expression extends root
{
	public postfix_expression(){}
	public int check() throws Exception
	{
		root son = child.get(0);
		if (son.check()!=0) throw new Exception();
		record = son.record;
		code.addAll(child.get(0).code);
		
		if(child.size()>1)
		{
			if(((returnrecord)record).constant)throw new Exception();
			
			type t = ((returnrecord)record).rtype;
			location l = new location();
		
			if(!(((String)((returnrecord)record).value).equals("printf") || ((String)((returnrecord)record).value).equals("malloc")))
			{
				if(t.typename.equals("function"))l = new location();
				else l = new location(((returnrecord)record).loc);
				
				if(t.typename.equals("name"))
				{
					l = find(((name)t).str,1).loc;
					t = find(((name)t).str,1).typ;
				}
				if(t==null)throw new Exception();
				
				for(int i=1;i<child.size();i++)
				{
					if(child.get(i).check()!=0)throw new Exception();
					returnrecord r = (returnrecord)child.get(i).check(new value(t,l));
					t = r.rtype;
					l = r.loc;
					if(!r.lvalue)((returnrecord)record).lvalue = false;
					code.addAll(child.get(i).code);
				}
			}
			else if(((String)((returnrecord)record).value).equals("malloc"))   //already inline
			{
				if(child.size()>2)throw new Exception();
				child = child.get(1).child.get(1).child;
				if(child.get(0).check()!=0)throw new Exception();
				if(checkconvert(((returnrecord)child.get(0).record).rtype,new Tint())!=0)throw new Exception();
				
				if(((returnrecord)child.get(0).record).constant)
				{
					code.addAll(child.get(0).code);
					location con = new location();
					con.contain = ((returnrecord)child.get(0).record).value;
					code.add(new quad("mallocli",null,null,con));
				}
				else
				{
					if(first.infinity)
					{
						code.addAll(child.get(0).code);
						if(((returnrecord)child.get(0).record).loc.address)
						{
							code.add(new quad("malloclal",null,null,((returnrecord)child.get(0).record).loc));
						}
						else code.add(new quad("mallocload",null,null,((returnrecord)child.get(0).record).loc));
					}
					else
					{
						code.addAll(child.get(0).code);
						if(((returnrecord)child.get(0).record).loc.address)
						{
							code.add(new quad("load",new temp(1),null,((returnrecord)child.get(0).record).loc));
							code.add(new quad("malloclal",null,null,new temp(1)));
						}
						else code.add(new quad("mallocload",null,null,((returnrecord)child.get(0).record).loc));
					}
					
				}
				code.add(new quad("malloc",null,null,null));
				code.add(new quad("syscall",null,null,null));
				if(first.infinity)
				{
					location tmp = new temp();
					tmp.offset = first.Off.lastElement();
					tmp.global = false;
					first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
					code.add(new quad("getpointer",null,null,tmp));
					l = tmp;
				}
				else
				{
					location p = new location(first.Off.lastElement(),"memory",0,false,false);
					first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
					code.add(new quad("getpointer",null,null,p));
					l = p;
				}
				
				t = new pointer(new Tvoid());
			}
			else if(((String)((returnrecord)record).value).equals("printf"))
			{
				child = child.get(1).child.get(1).child;
				boolean opt = false;
				if(child.size()==1)
				{
					if(child.get(0).check()!=0)throw new Exception();
					location tmp = new location();
					tmp.contain = ((returnrecord)child.get(0).record).value;
					code.add(new quad("string",null,null,tmp));
					opt = true;
				}
				else if(child.size()==6)
				{
					code.add(new quad("do",null,null,null));
				}
				else
				{
					for(int i=0;i<child.size();i++)
					{
						if(child.get(i).check()!=0)throw new Exception();
						
						if(i==0)
						{
							location tmp = new location();
							tmp.contain = ((returnrecord)child.get(i).record).value;
							code.add(new quad("string",null,null,tmp));
						}
						else
						{
							if(first.infinity)
							{
								if(((returnrecord)child.get(i).record).constant)
								{
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									location con = new location(0,"const",0,false,false);
									con.contain = ((returnrecord)child.get(i).record).value;
									code.add(new quad("parameter",con,null,tmp));
								}
								else if(((returnrecord)child.get(i).record).loc.address)
								{
									
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									code.add(new quad("parameterl",((returnrecord)child.get(i).record).loc,null,tmp));
								}
								else
								{
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									code.add(new quad("parameter",((returnrecord)child.get(i).record).loc,null,tmp));
								}
							}
							else
							{
								if(((returnrecord)child.get(i).record).constant)
								{
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									location con = new location(0,"const",0,false,false);
									con.contain = ((returnrecord)child.get(i).record).value;
									code.add(new quad("parameter",con,null,tmp));
								}
								else if(((returnrecord)child.get(i).record).loc.address)
								{
									
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									code.add(new quad("load",new temp(1),null,((returnrecord)child.get(i).record).loc));
									code.add(new quad("parameter",new temp(1),null,tmp));
								}
								else
								{
									location tmp = new location();
									tmp.contain = i;
									code.addAll(child.get(i).code);
									code.add(new quad("parameter",((returnrecord)child.get(i).record).loc,null,tmp));
								}
							}
							
							
						}
						
						
					}
				}
				
				location p = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
				code.add(new quad("storera",null,null,p));
				location tmp = new location();
				if(!opt)
				{
					tmp.contain = "printf";	
				}
				else
				{
					tmp.contain = "printf2";	
				}
					
				code.add(new quad("call",null,null,tmp));
				code.add(new quad("restorera",null,null,p));
				
			}
		
		
			((returnrecord)record).rtype = t;
			((returnrecord)record).loc = l;
		
		
		}
		
		return 0;
	}
	
}
