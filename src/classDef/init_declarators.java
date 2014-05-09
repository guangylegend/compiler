package classDef;

import java.util.Vector;

import classes.type;

public class init_declarators extends root
{
	public init_declarators(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
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
	public int checkinit() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).checkinit()!=0)throw new Exception();
		}
		Vector<Object> v = new Vector<Object>();
		for(int i=0;i<child.size();i++)
		{
			v.add(child.get(i).record);
		}
		record = v;
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		
		return 0;
	}
}
