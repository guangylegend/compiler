package classes;

import java.util.Vector;

import classDef.value;

public final class struct extends record 
{
	public struct(String n,Vector<value> t,Vector<String> s)
	{
		name = n;
		vt = t;
		vs = s;
		typename = "struct";
		size = 0;
		isunion = false;
		for(int i=0;i<t.size();i++)
		{
			size+=(t.get(i).typ.size);
			if(t.get(i).typ.typename.equals("array"))size+=4;
		}
	}
	public struct(String n)
	{
		name = n;
		typename = "struct";
	}
} 
