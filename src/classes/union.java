package classes;

import java.util.Vector;

public final class union extends record 
{
	public union(String n,Vector<type> t,Vector<String> s)
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