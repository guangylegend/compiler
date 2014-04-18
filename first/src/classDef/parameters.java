package classDef;

import java.util.Vector;

import core.env;
import core.first;
import classes.type;

public class parameters extends root
{
	public parameters(){};
	public int check() throws Exception
	{
		Vector<type> r = new Vector<type>();
		
		env newe = new env();
		first.e.add(newe);
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
			r.add((type)child.get(i).record);
		}
		record = r;
		
		
		return 0;
	}
}
