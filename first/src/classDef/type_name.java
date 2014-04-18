package classDef;

import classes.pointer;
import classes.type;

public class type_name extends root
{
	public type_name(){}
	public int check() throws Exception
	{
		if(child.get(0).check()!=0)throw new Exception();
		returnrecord r = (returnrecord)child.get(0).record;
		type t = r.rtype;
		for(int i=1;i<child.size();i++)
		{
			t = new pointer(t);
		}
		r.rtype = t;
		record = r;
		return 0;
	}
}
