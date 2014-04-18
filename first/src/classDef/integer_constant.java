package classDef;

import classes.Tint;

public class integer_constant extends root
{
	public integer_constant(){}
	public int check() throws Exception
	{
		returnrecord r = new returnrecord();
		r.constant = true;
		r.value = Integer.decode((String)child.get(0).record);
		r.lvalue = false;
		r.rtype = new Tint();
		record = r;
		
		//System.out.println(r.value);
		
		return 0;
	}
	
}
