package classDef;

import java.util.Vector;

import core.first;
import classes.type;

public class parameters extends root
{
	public parameters(){};
	public int check() throws Exception
	{
		Vector<type> r = new Vector<type>();
		
		first.beginscope(0);
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
			r.add((type)child.get(i).record);
		}
		record = r;
		
		
		return 0;
	}
}
