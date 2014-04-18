package classDef;

import classes.Tint;

public class selection_statement extends root
{
	public selection_statement(){}
	public int check() throws Exception
	{
		for (int i = 1; i < child.size(); ++i)
		{
			if (child.get(i).check()!=0) throw new Exception();
		}
		if (checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0) throw new Exception();
				
		return 0;
	}
}
