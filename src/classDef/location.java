package classDef;

public class location
{
	public location(int off,String t,int num,boolean g,boolean a)
	{
		offset = off;
		type = t;
		number = num;
		global = g;
		address = a;
	}
	public location(location l)
	{
		contain = l.contain;	
		offset = l.offset;
		type = l.type;
		number = l.number;
		global = l.global;
		address = l.address;
	}
	public location()
	{
		address = false;
	}
	public Object contain;
	public int offset;
	public String type;
	public int number;
	public boolean global;
	public boolean address;
}