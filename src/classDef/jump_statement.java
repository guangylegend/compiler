package classDef;

import classes.Tvoid;
import classes.type;
import core.first;



public class jump_statement extends root
{
	public jump_statement(){}
	public int check() throws Exception
	{
		if (child.size() == 1 && !((String)child.get(0).record).equals("return"))
		{
			if (first.loop == 0) throw new Exception();
		}
		else
		{
			if(child.size() == 1)
			{
				if(first.func == null) throw new Exception();
				if(checkconvert(first.func.returnType, new Tvoid())!=0)throw new Exception();
			}
			else
			{
				if (child.get(1).check()!=0) throw new Exception();
				type t = ((returnrecord)child.get(1).record).rtype;
				if(first.func == null) throw new Exception();
				if(t==null)throw new Exception();
				if(checkconvert(t, first.func.returnType)!=0)
					throw new Exception();
			}
			
		}
		return 0;
	}
}
