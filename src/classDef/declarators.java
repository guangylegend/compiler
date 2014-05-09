package classDef;

import java.util.Vector;

import classes.type;

public class declarators extends root
{
	public declarators(){}
	public int check() throws Exception
	{
		Vector<String> s = new Vector<String>();
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			s.add((String)((returnrecord)child.get(i).record).value);
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		record = s;
		return 0;
	}
	
	public Object check(type t) throws Exception
	{
		Vector<pair> v = new Vector<pair>();
		for(int i=0;i<child.size();i++)
		{
			v.add((pair)child.get(i).check(t));
		}
		return v;
	}
}
