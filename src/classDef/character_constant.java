package classDef;

import classes.Tchar;

public class character_constant extends root
{
	public character_constant(){}
	public int check() throws Exception
	{
		returnrecord r = new returnrecord();
		r.constant = true;
		String s = (String)child.get(0).record;
		//System.out.println(s);
		if(s.charAt(1)!='\\')r.value = (int)s.charAt(1);
		else if(s.charAt(2)=='n')r.value = (int)'\n';
		else if(s.charAt(2)=='t')r.value = (int)'\t';
		else if(s.charAt(2)=='r')r.value = (int)'\r';
		else if(s.charAt(2)=='0')r.value = Integer.decode(s.substring(2, s.length()-1));
		r.lvalue = false;
		r.rtype = new Tchar();
		record = r;
		
		//System.out.println(r.value);
		
		return 0;
	}
	
}