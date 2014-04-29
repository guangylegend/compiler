package classDef;



import classes.struct;
import classes.type;
import classes.union;
import core.first;

public class plain_declaration extends root
{
	public plain_declaration(){}
	public int check() throws Exception
	{
			if(child.get(0).check()!=0)throw new Exception();

			if(child.get(1).check()!=0)throw new Exception();
			
			pair vv = (pair)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			
			type t = vv.typ;
			String s = vv.str;

				if(t instanceof struct || t instanceof union)
				{
					if(first.getstruct(s) == null)
					{
						first.putstruct(s,t);
					}
					else throw new Exception();
				}
				else
				{
					if(first.getfunc(s) == null)
					{
						first.putfunc(s,t);
					}
					else throw new Exception();
				}
				
				record = t;
		return 0;
	}
	
}
