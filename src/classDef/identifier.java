package classDef;

import core.first;


public class identifier extends root
{
	public identifier(){}
	public int check() throws Exception
	{
		returnrecord r = new returnrecord();
		r.constant = false;
		r.value = child.get(0).record;
		r.lvalue = true;
		r.rtype = find((String)r.value,0).typ;
		r.loc = find((String)r.value,0).loc;

		/*if(r.rtype!=null)
		{
			System.out.println(r.rtype.typename);
		}*/
		if(first.idtest)System.out.println(r.value);
		
		
		
		record = r;
		
		
		
		
		
		return 0;
	}
	
}
