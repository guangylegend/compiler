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

			r.loc = v.loc;
			location l = new location(0,"const",0,false);
			l.contain = r.rtype.size;
			location nl = new temp();
			nl.offset = r.loc.offset;
			nl.global = r.loc.global;
			code.add(new quad("*",l,((returnrecord)son.record).loc,nl));
			if(r.loc.type.equals("dynamic"))
			{
				code.add(new quad("+",(location)r.loc.contain,null,nl));
			}
			else
			{
				l = new location(0,"const",0,false);
				if(r.loc.offset!=0)
				{
					l.contain = r.loc.offset;
					code.add(new quad("+",l,null,nl));
				}
				
			}
			
			r.loc.contain = nl;
			r.loc.type = "dynamic";        //WTF...
			if(r.rtype instanceof pointer)((pointer)r.rtype).loc = r.loc;
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
				if(f.argument.size()!=((Vector<type>)son.record).size())throw new Exception();
				
				location l = new location(0,"const",0,false);
				l.contain = f.name;
				code.add(new quad("loc",null,null,l));
				
				int off = f.returnType.size;
				for(int i=0;i<f.argument.size();i++)
				{
					if(!checkequal(((Vector<value>)son.record).get(i).typ,f.argument.get(i).typ))
					{
						throw new Exception();
					}
					location ll = new location(off,"memory",0,false);
					code.add(new quad("store",((Vector<value>)son.record).get(i).loc,null,ll));
					off+=((Vector<value>)son.record).get(i).typ.size;
				}
				code.add(new quad("call",null,null,l));
				r.lvalue = false;
				r.rtype = f.returnType;
				r.loc = new location(0,"memory",0,false);
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
				r.lvalue = false;
				r.rtype = f.returnType;
				r.loc = new location(0,"memory",0,false);
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
					r.rtype = s.vt.get(i).typ;
					r.loc = v.loc;
					r.loc.offset += s.vt.get(i).loc.offset;
					return r;
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
					if(p.loc!=null)
					{
						r.loc = p.loc;
						r.loc.offset += s.vt.get(i).loc.offset;
					}		
					
					//can't define null pointer...
					int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
					
					
					return r;
				}
			}
			
			throw new Exception();
		}
		else
		{
			//maybe some bugs...
			int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
			
			if(v.typ instanceof pointer)
			{
				pointer p = (pointer)v.typ;
				
				//...........
				if(p.loc == null )return r;
				//...........
				
				location save = new location(p.loc);
				
				if(p.loc.type.equals("dynamic"))
				{
					if(((String)son.record).equals("++"))
					{
						location fl = new location(v.loc);
						location l = new location(0,"const",0,false);
						l.contain = p.elementType.size;
						code.add(new quad("+",l,null,fl));
					}
					else
					{
						location fl = new location(v.loc);
						location l = new location(0,"const",0,false);
						l.contain = p.elementType.size;
						code.add(new quad("-",l,null,fl));
					}
				}
				else
				{
					if(((String)son.record).equals("++")) p.loc.offset+=p.elementType.size; 
					else p.loc.offset-=p.elementType.size; 
				}
				v.typ = new pointer(p.elementType,save);
			}
			else
			{
				if(checkconvert(v.typ,new Tint())!=0)
				{
					throw new Exception();
				}
				location l = new temp();
				l.offset = first.Off.lastElement();
				r.rtype = v.typ;
				first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
				if(first.func==null)l.global = true;
				else l.global = false;
				location ll = new location(0,"const",0,false);
				ll.contain = 1;
				location fl = new location(v.loc);
				if(((String)son.record).equals("++"))code.add(new quad("+",ll,null,fl));
				else code.add(new quad("-",ll,null,fl));
				r.loc = l;
				
			}
			
			return r;
			
		}
	}
}
