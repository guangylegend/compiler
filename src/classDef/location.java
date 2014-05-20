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
	public int doublenumber;
	public boolean global;
	public boolean address;
	public String toString()
	{
		/*else if(this.type==null)
		{
    		if(this.global)return this.offset + "($s0)";
    		else return this.offset + "($sp)";
		}*/
    	if(this.type.equals("const"))return this.contain.toString();
    	else if(this.type.equals("register"))return "$t"+this.number;
    	else if(this.type.equals("memory"))
    	{
    		if(this.global)return this.offset + "($s0)";
    		else return this.offset + "($sp)";
    	}
    	else if(this.type.equals("return"))return this.offset + "($v1)";
    	else return "";
	}
}