package classDef;

public class location
{
	public location(int off,String t,int num,boolean g)
	{
		offset = off;
		type = t;
		number = num;
		global = g;
	}
	public location(location l)
	{
		contain = l.contain;	
		offset = l.offset;
		type = l.type;
		number = l.number;
		global = l.global;
	}
	public location(){}
	public Object contain;
	public int offset;
	public String type;
	public int number;
	public boolean global;
}