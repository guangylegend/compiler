package classDef;

import java.util.Vector;

import core.first;

public class parameters extends root
{
	public parameters(){};
	public int check() throws Exception
	{
		Vector<value> r = new Vector<value>();
		
		first.beginscope(0);
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
			r.add((value)child.get(i).record);
		}
		record = r;
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		
		
		return 0;
	}
}
