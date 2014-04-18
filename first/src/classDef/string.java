package classDef;

import classes.Tchar;
import classes.pointer;

public class string extends root
{
	public string(){}
	public int check()
	{
		returnrecord r = new returnrecord();
		r.constant = true;
		r.value = child.get(0).record;
		r.lvalue = false;
		r.rtype = new pointer(new Tchar());
		record = r;
		
		//System.out.println(r.value);
		
		return 0;
	}
}
