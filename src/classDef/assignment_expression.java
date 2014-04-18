package classDef;
import classes.Tint;
import classes.type;

public class assignment_expression extends root
{
	public assignment_expression(){}
	public int check() throws Exception
	{
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
			type t = ((returnrecord)son.record).rtype;
			
			returnrecord r = (returnrecord)son.record;
			r.rtype = t;
			
			if (child.get(2).check()!=0) 
			{
				throw new Exception();
				//return 1;
			}
			
			if (((String)child.get(1).record).equals("="))
			{
				//System.out.println(t.typename);
				if (checkconvert( t,((returnrecord)child.get(2).record).rtype)!=0)
				{
					throw new Exception();
					//return 1;
				}
			}
				
					
			else
			{
				if (checkconvert(((returnrecord)child.get(2).record).rtype,new Tint())!=0) 
				{
					throw new Exception();
					//return 1;
				}
				if (checkconvert(t,new Tint())!=0)
				{
					throw new Exception();
					//return 1;
				}
			}
			record = r;
			
		}
		else
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			record = child.get(0).record;
		}
		return 0;
	}
}
