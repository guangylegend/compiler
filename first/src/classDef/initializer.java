package classDef;

import classes.array;
import classes.type;

public class initializer extends root
{
	public initializer(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		if(child.get(0) instanceof assignment_expression)
		{
			record = ((returnrecord)child.get(0).record).rtype;
		}
		else
		{
			int n = child.size();
			type a = null;
			for(int i=0;i<child.size();i++)
			{
				if(a==null)a = (type)child.get(i).record;
				else
				{
					if(checkconvert((type)child.get(i).record,a)!=0)throw new Exception();
				}
			}
			record = new array(a,n);
		}
		return 0;
	}
}
