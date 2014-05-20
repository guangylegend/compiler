package classDef;

import java.util.Vector;

import core.first;
import classes.Tint;
import classes.name;
import classes.array;
import classes.function;
import classes.pointer;
import classes.struct;
import classes.type;


public class postfix extends root
{
	public postfix(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		return 0;
		
	}
	
	@SuppressWarnings("unchecked")
	public Object check(value v) throws Exception
	{
		root son = child.get(0);
		returnrecord r = new returnrecord();
		r.lvalue = true;
		if (((String)son.record).equals("["))
		{
			son = child.get(1);
			
			type tmp = ((returnrecord)son.record).rtype;
			if(tmp==null)
			{
				tmp = find((String)((returnrecord)son.record).value,0).typ;
				if(tmp == null)throw new Exception();
			}
			if (checkconvert(tmp,new Tint())!=0)
			{
				throw new Exception();
			} 
			if (v.typ instanceof array )
			{
				r.rtype = ((array)v.typ).elementType;
			}		
			else if(v.typ instanceof pointer )
			{
				r.rtype = ((pointer)v.typ).elementType;
			}
			else throw new Exception();
			
			location tmp1 = new temp(1);
			location tmp2 = new temp(2);
			
			location p = new location(first.Off.lastElement(),"memory",0,false,false);
			
			location l = new location(0,"const",0,false,false);
			l.contain = r.rtype.size;
			
			first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);						
			
			if(((returnrecord)son.record).constant)
			{
				location cons = new location(0,"const",0,false,false);
				cons.contain = ((returnrecord)son.record).value;
				code.add(new quad("li",tmp1,null,cons));
			}
			else
			{
				code.add(new quad("load",tmp1,null,((returnrecord)son.record).loc));
				if(((returnrecord)son.record).loc.address)code.add(new quad("lal",tmp1,null,tmp1));
			}
			
			
			code.add(new quad("*",tmp1,tmp1,l));
			
			code.add(new quad("load",tmp2,null,v.loc));
			if(v.loc.address)code.add(new quad("lal",tmp2,null,tmp2));
			
			code.add(new quad("+",tmp2,tmp1,tmp2));

			code.add(new quad("store",tmp2,null,p));
			r.loc = p;
			if(!(r.rtype instanceof pointer))r.loc.address = true;
			else r.loc.address = false;
			if(v.typ.typename.equals("pointer") && r.rtype.typename.equals("pointer"))r.loc.address = true;
			if(v.typ.typename.equals("array") && r.rtype.typename.equals("pointer"))r.loc.address = true;
			
			return r;
				
		}
		else if (((String)son.record).equals("FUCK"))
		{
			if (child.size() == 2)
			{
				son = (root)child.get(1);
				if (!(v.typ instanceof function))
				{
					throw new Exception();
				}
				
				
				function f = (function)v.typ;
				if(f.argument.size()!=((Vector<Object>)son.record).size())throw new Exception();
				
				location l = new location(0,"const",0,false,false);
				l.contain = f.name;
				int off = 0;
				location p = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
				code.add(new quad("storera",null,null,p));
				code.add(new quad("loc",null,null,l));
				
				
				for(int i=0;i<f.argument.size();i++)
				{
					if(((Vector<Object>)son.record).get(i) instanceof nconst)
					{
						if(!checkequal(((nconst)((Vector<Object>)son.record).get(i)).typ,f.argument.get(i).typ))
						{
							throw new Exception();
						}
						location tmp = new location(0,"const",0,false,false);
						tmp.contain = ((nconst)((Vector<Object>)son.record).get(i)).value;
						location ll = new location(off,"memory",0,false,false);
						if(tmp.contain instanceof String)code.add(new quad("la",new temp(1),null,tmp));
						else code.add(new quad("li",new temp(1),null,tmp));
						code.add(new quad("store",new temp(1),null,ll));
						off+=((nconst)((Vector<Object>)son.record).get(i)).typ.size;
					}
					else
					{
						if(!checkequal(((value)((Vector<Object>)son.record).get(i)).typ,f.argument.get(i).typ))
						{
							throw new Exception();
						}
					
						
						location ll = new location(off,"memory",0,false,false);
						if(((value)((Vector<Object>)son.record).get(i)).typ.typename.equals("struct"))
						{
							int k = ((value)((Vector<Object>)son.record).get(i)).typ.size;
							for(int j=0;j<k/4;j++)
							{
								location t1 = new location(((value)((Vector<Object>)son.record).get(i)).loc.offset+j*4,"memory",0,false,false);
								if(first.func==null)t1.global = true;
								else t1.global = false;
								location t2 = new location(ll.offset+j*4,"memory",0,false,false);
								if(first.func==null)t2.global = true;
								else t2.global = false;
								location tmp = new temp(1);
								code.add(new quad("ld",tmp,null,t1));
								code.add(new quad("store",tmp,null,t2));
							}
						}
						else
						{
							code.add(new quad("ld",new temp(1),null,((value)((Vector<Object>)son.record).get(i)).loc));
							if(((value)((Vector<Object>)son.record).get(i)).loc.address)code.add(new quad("lal",new temp(1),null,new temp(1)));
							code.add(new quad("store",new temp(1),null,ll));
						}			
						
						if(((value)((Vector<Object>)son.record).get(i)).typ.typename.equals("array"))off+=4;
						else off+=((value)((Vector<Object>)son.record).get(i)).typ.size;
					}
					
				}
				
				code.add(new quad("call",null,null,l));
				code.add(new quad("restorera",null,null,p));
				r.lvalue = false;
				r.rtype = f.returnType;
				r.loc = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
				if(r.rtype.typename.equals("struct"))
				{
					int k = r.rtype.size;
					for(int j=0;j<k/4;j++)
					{
						location t1 = new location(j*4,"return",0,false,false);
						if(first.func==null)t1.global = true;
						else t1.global = false;
						location t2 = new location(r.loc.offset+j*4,"memory",0,false,false);
						if(first.func==null)t2.global = true;
						else t2.global = false;
						location tmp = new temp(1);
						code.add(new quad("ld",tmp,null,t1));
						code.add(new quad("store",tmp,null,t2));
					}
				}
				else
				{
					location re  = new location(0,"return",0,false,false);
					code.add(new quad("load",new temp(1),null,re));
					code.add(new quad("store",new temp(1),null,r.loc));
				}
				
				return r;
				
			}
			else
			{
				if (!(v.typ instanceof function))
				{
					throw new Exception();
				}				
				
				function f = (function)v.typ;
				if(f.argument.size()!=0)
				{
					throw new Exception();
				}
				
				location l = new location(0,"const",0,false,false);
				l.contain = f.name;
				location p = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
				code.add(new quad("storera",null,null,p));
				code.add(new quad("loc",null,null,l));
				
				code.add(new quad("call",null,null,l));
				code.add(new quad("restorera",null,null,p));
				r.lvalue = false;
				r.rtype = f.returnType;
				r.loc = new location(0,"return",0,false,false);
				return r;
			}
			
		}
		else if (((String)son.record).equals("."))
		{
			son = child.get(1);
			if (!(v.typ instanceof struct))
			{
				throw new Exception();
			}
			String name = (String)((returnrecord)son.record).value;
			struct s = (struct)v.typ;
			for (int i = 0; i < s.vs.size(); ++i)
			{
				if (name.equals(s.vs.get(i)))
				{
					if(v.loc.address)
					{
						r.rtype = s.vt.get(i).typ;
						if(r.rtype.typename.equals("array"))
						{
							r.loc = v.loc;
							code.add(new quad("load",new temp(1),null,r.loc));
							location ll = new location(0,"const",0,false,false);
							ll.contain = s.vt.get(i).loc.offset-r.rtype.size;
							code.add(new quad("-",new temp(2),new temp(1),ll));
							location l = new location(0,"const",0,false,false);
							l.contain = s.vt.get(i).loc.offset;
							code.add(new quad("+",new temp(1),new temp(1),l));
							code.add(new quad("sal",new temp(2),null,new temp(1)));
							code.add(new quad("store",new temp(1),null,r.loc));
						}
						else
						{
							r.loc = v.loc;
							code.add(new quad("load",new temp(1),null,r.loc));
							location l = new location(0,"const",0,false,false);
							l.contain = s.vt.get(i).loc.offset;
							code.add(new quad("+",new temp(1),new temp(1),l));
							code.add(new quad("store",new temp(1),null,r.loc));
						}
						
						return r;
					}
					else
					{
						r.rtype = s.vt.get(i).typ;
						if(r.rtype.typename.equals("array"))
						{
							location a = new location(v.loc.offset+s.vt.get(i).loc.offset-r.rtype.size,"memory",0,false,false);
							location b = new location(v.loc.offset+s.vt.get(i).loc.offset,"memory",0,false,false);
							if(v.loc.global)
							{
								a.global = true;
								b.global = true;
							}
							code.add(new quad("la",new temp(1),null,a));
							code.add(new quad("sw",new temp(1),null,b));
						}
						r.loc = v.loc;
						if(s.isunion)r.loc.offset = 0;
						else r.loc.offset += s.vt.get(i).loc.offset;
						return r;
					}
					
				}
			}
				
			throw new Exception();

		}
		else if (((String)son.record).equals("->"))
		{
			son = child.get(1);
			String name = (String)((returnrecord)son.record).value;
			if (!(v.typ.typename.equals("pointer")))
			{
				throw new Exception();
			}
			pointer p = (pointer)v.typ;
			type k = p.elementType;
	
			if(k.typename.equals("name"))k = find(((name)k).str,1).typ;
			if(k==null)throw new Exception();
			struct s = (struct)k;
			for (int i = 0; i < s.vs.size(); ++i)
			{
				if (name.equals(s.vs.get(i)))
				{
					r.rtype = s.vt.get(i).typ;
					location l = new location(0,"const",0,false,false);
					l.contain = s.vt.get(i).loc.offset;
					location temp = new location(first.Off.lastElement(),"memory",0,false,false);
					first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);	
					code.add(new quad("load",new temp(1),null,v.loc));
					if(v.loc.address)code.add(new quad("lal",new temp(1),null,new temp(1)));
					code.add(new quad("+",new temp(1),new temp(1),l));
					code.add(new quad("store",new temp(1),null,temp));
					r.loc = temp;
					r.loc.address = true;
					
					return r;
				}
			}
			
			throw new Exception();
		}
		else
		{
			
			if(v.typ.typename.equals("pointer") )
			{
				pointer p = (pointer)v.typ;
				location fl = new location(v.loc);
				location l = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+p.size, first.Off.size()-1);						
				l.address = true;
				
				code.add(new quad("load",new temp(1),null,fl));
				code.add(new quad("store",new temp(1),null,l));
				
				location ll = new location(0,"const",0,false,false);
				ll.contain = p.size;
				if(((String)son.record).equals("++"))code.add(new quad("+",new temp(1),new temp(1),ll));
				else code.add(new quad("-",new temp(1),new temp(1),ll));
				code.add(new quad("store",new temp(1),null,fl));
				r.loc = l;
			}
			else
			{
				if(checkconvert(v.typ,new Tint())!=0)
				{
					throw new Exception();
				}
				r.rtype = v.typ;
				
				if(v.loc.address)
				{
					location fl = new location(v.loc);
					location l = new location(first.Off.lastElement(),"memory",0,false,false);
					first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);						
					
					code.add(new quad("load",new temp(1),null,fl));
					code.add(new quad("lal",new temp(2),null,new temp(1)));
					code.add(new quad("store",new temp(2),null,l));
					
					location ll = new location(0,"const",0,false,false);
					ll.contain = 1;
					if(((String)son.record).equals("++"))code.add(new quad("+",new temp(2),new temp(2),ll));
					else code.add(new quad("-",new temp(2),new temp(2),ll));
					code.add(new quad("sal",new temp(2),null,new temp(1)));
					r.loc = l;
				}
				else
				{
					location fl = new location(v.loc);
					location l = new location(first.Off.lastElement(),"memory",0,false,false);
					first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);						
					
					code.add(new quad("load",new temp(1),null,fl));
					code.add(new quad("store",new temp(1),null,l));
					
					location ll = new location(0,"const",0,false,false);
					ll.contain = 1;
					if(((String)son.record).equals("++"))code.add(new quad("+",new temp(1),new temp(1),ll));
					else code.add(new quad("-",new temp(1),new temp(1),ll));
					code.add(new quad("store",new temp(1),null,fl));
					r.loc = l;
				}
				
				
			}
			
			return r;
			
		}
	}
}
