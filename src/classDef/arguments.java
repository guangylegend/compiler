package classDef;

import java.util.Vector;

public class arguments extends root
{
	public arguments(){}
	public int check() throws Exception
	{
		Vector<value> v = new Vector<value>();
		for (int i = 0; i < child.size(); ++i)
		{
			if (child.get(i).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			v.add(new value(((returnrecord)child.get(i).record).rtype,((returnrecord)child.get(i).record).loc));
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		record = v;
		return 0;
	}
}
