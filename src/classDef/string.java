package classDef;

import core.first;
import classes.Tchar;
import classes.pointer;

public class string extends root
{
	public string(){}
	public int check()
	{
		returnrecord r = new returnrecord();
		r.constant = true;
		first.ASCII.add((String)child.get(0).record);
		r.value = "Legend_"+first.ASCII.size();
		r.lvalue = false;
		r.rtype = new pointer(new Tchar());
		record = r;
		
		
		
		return 0;
	}
}
