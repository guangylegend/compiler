package classes;

import java.util.Vector;

import classDef.value;

public final class union extends record 
{
	public union(String n,Vector<value> t,Vector<String> s)
	{
		name = n;
		vt = t;
		vs = s;
	}
	public union(String n)
	{
		name = n;
	}
} 