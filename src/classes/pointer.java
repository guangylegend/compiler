package classes;

public class pointer extends type
{
	public pointer(type t)
	{
		elementType = t;
		typename = "pointer";
		size = 4;
	}
	public pointer(pointer p)
	{
		elementType = p.elementType;
		typename = "pointer";
		size = 4;
	}
	public type elementType;
}