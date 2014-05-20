package classDef;

import core.first;

public class temp extends location
{
	public temp(int n)
	{
		super(0,"register",n,false,false);
	}
	public temp()
	{
		super(0,"register",++first.Register,false,false);
	}
}