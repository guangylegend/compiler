package classDef;

import java.util.Vector;

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
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	public Object check(type t) throws Exception
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
				tmp = find((String)((returnrecord)son.record).value,0);
				if(tmp == null)throw new Exception();
			}
			if (checkconvert(tmp,new Tint())!=0)
			{
				throw new Exception();
				//r.value = "wrong";
				//return r;
			}                                                          //index over?
			if (t instanceof array )
			{
				r.rtype = ((array)t).elementType;
			}
			else if(t instanceof pointer)
			{
				r.rtype = ((pointer)t).elementType;
			}
			else throw new Exception();
				
				//r.value = "wrong";
				//return r;
			
		}
		else if (((String)son.record).equals("FUCK"))
		{
			if (child.size() == 2)
			{
				son = (root)child.get(1);
				if (!(t instanceof function))
				{
					throw new Exception();
					//r.value = "wrong";
					//return r;
				}
				
				
				function f = (function)t;
				if(f.argumentType.size()!=((Vector<type>)son.record).size())throw new Exception();
				for(int i=0;i<f.argumentType.size();i++)
				{
					if(checkequal(f.argumentType.get(i),((Vector<type>)son.record).get(i))!=0)
					{
						throw new Exception();
						//r.value = "wrong";
						//return r;
					}
				}
				r.lvalue = false;
				r.rtype = f.returnType;
				return r;
			}
			else
			{
				if (!(t instanceof function))
				{
					throw new Exception();
					//r.value = "wrong";
					//return r;
				}				
				
				function f = (function)t;
				if(f.argumentType.size()!=0)
				{
					throw new Exception();
					//r.value = "wrong";
					//return r;
				}
				r.lvalue = false;
				r.rtype = f.returnType;
				return r;
			}
			
		}
		else if (((String)son.record).equals("."))
		{
			son = child.get(1);
			if (!(t instanceof struct))
			{
				throw new Exception();
				//r.value = "wrong";
				//return r;
			}
			String name = (String)((returnrecord)son.record).value;
			struct s = (struct)t;
			for (int i = 0; i < s.vs.size(); ++i)
			{
				if (name.equals(s.vs.get(i)))
				{
					r.rtype = s.vt.get(i);
					return r;
				}
			}
				
			throw new Exception();
			//r.value = "wrong";
			//return r;
		}
		else if (((String)son.record).equals("->"))
		{
			son = child.get(1);
			String name = (String)((returnrecord)son.record).value;
			if (!(t instanceof pointer))
			{
				throw new Exception();
				//r.value = "wrong";
				//return r;
			}
			pointer p = (pointer)t;
			type k = p.elementType;
			if(k.typename.equals("name"))k = find(((name)k).str,1);
			if(k==null)throw new Exception();
			struct s = (struct)k;
			for (int i = 0; i < s.vs.size(); ++i)
			{
				if (name.equals(s.vs.get(i)))
				{
					r.rtype = s.vt.get(i);
					return r;
				}
			}
			
			throw new Exception();
			//r.value = "wrong";
			//return r;
		}
		else
		{
			if(checkconvert(t,new Tint())!=0)
			{
				throw new Exception();
				//r.value = "wrong";
				//return r;
			}
			r.rtype = new Tint();
			return r;
		}
		return r;
	}
}
