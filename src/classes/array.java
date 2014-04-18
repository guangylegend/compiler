package classes;

public class array extends pointer
{
	public array(type t,int n)
	{
		super(t);
		capacity = n;
		typename = "array";
	}
	int capacity;
}