package classDef;

import core.first;

public class temp extends location
{
	public temp(int n)
	{
		super(0,"register",0,false,false);
		doublenumber = n;
	}
	public temp()
	{
		super(0,"register",++first.Register,false,false);
	}
}