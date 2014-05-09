package classes;

import classDef.location;

public class array extends pointer
{
	public array(type t,int n,location l)
	{
		super(t,l);
		capacity = n;
		typename = "array";
		size = n*t.size;
	}
	public int capacity;
}