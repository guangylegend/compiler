package classes;

import classDef.location;

public class pointer extends type
{
	public pointer(type t,location l)
	{
		elementType = t;
		typename = "pointer";
		loc = l;
		size = 4;
	}
	public pointer(pointer p)
	{
		elementType = p.elementType;
		typename = "pointer";
		loc = new location(p.loc);
		size = 4;
	}
	public type elementType;
	public location loc;
}