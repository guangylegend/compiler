package classes;

import java.util.Vector;

public final class struct extends record 
{
	public struct(String n,Vector<type> t,Vector<String> s)
	{
		name = n;
		vt = t;
		vs = s;
		typename = "struct";
	}
	public struct(String n)
	{
		name = n;
		typename = "struct";
	}
} 
