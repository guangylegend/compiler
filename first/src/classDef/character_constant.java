package classDef;

import classes.Tchar;

public class character_constant extends root
{
	public character_constant(){}
	public int check() throws Exception
	{
		returnrecord r = new returnrecord();
		r.constant = true;
		r.value = child.get(0).record;
		r.lvalue = false;
		r.rtype = new Tchar();
		record = r;
		
		//System.out.println(r.value);
		
		return 0;
	}
	
}
