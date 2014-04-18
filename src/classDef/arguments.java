package classDef;

import java.util.Vector;

import classes.*;

public class arguments extends root
{
	public arguments(){}
	public int check() throws Exception
	{
		Vector<type> v = new Vector<type>();
		for (int i = 0; i < child.size(); ++i)
		{
			if (child.get(i).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			v.add(((returnrecord)child.get(i).record).rtype);
		}
		record = v;
		return 0;
	}
}
