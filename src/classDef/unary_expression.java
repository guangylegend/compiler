package classDef;

import classes.Tint;
import classes.pointer;


public class unary_expression extends root
{
	public unary_expression(){}
	public int check() throws Exception
	{
		
		if (child.size() == 1)
		{
			if(child.get(0).check()!=0)throw new Exception();
			record = child.get(0).record;
		}
		else
		{
			root son = child.get(0);
			if (((String)son.record).equals("++") || ((String)son.record).equals("--"))
			{
				if (child.get(1).check()!=0) throw new Exception();
				if (((returnrecord)child.get(1).record).constant)throw new Exception();
				if (!((returnrecord)child.get(1).record).lvalue)throw new Exception();
				record = child.get(1).record;
				
			}			
			else if (((String)son.record).equals("sizeof"))//difference?
			{
				if (child.get(1).check()!=0) throw new Exception();
				returnrecord r = (returnrecord)child.get(1).record;
				if (r.constant)throw new Exception();
				r.lvalue= false;
				r.rtype = new Tint();
				record = r;
				
			}
			else
			{
				if (child.get(1).check()!=0) throw new Exception();
				returnrecord r = (returnrecord)child.get(1).record;
				if(((String)son.record).equals("*"))
				{
					if(!r.lvalue)throw new Exception();
					if(r.rtype instanceof pointer)
					{
						r.rtype = ((pointer)(r.rtype)).elementType;
					}
					else throw new Exception();
				}
				else if(((String)son.record).equals("&"))
				{
					if(!r.lvalue)throw new Exception();
					r.rtype = new pointer(r.rtype);
					r.lvalue = false;
				}
				else
				{
					if (checkconvert(r.rtype, new Tint())!=0) throw new Exception();
					r.lvalue= false;
					r.rtype = new Tint();
				}
				record = r;
				
				
				
			}
		}
		
		return 0;
	}
}
