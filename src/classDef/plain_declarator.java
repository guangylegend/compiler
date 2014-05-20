package classDef;

import classes.pointer;
import classes.type;

public class plain_declarator extends root
{
	public plain_declarator(){}
	public int check() throws Exception
	{
		child.lastElement().check();
		record = child.lastElement().record;
		code = child.lastElement().code;
		return 0;
	}
	
	public Object check(type t) throws Exception
	{
		for(int i=0;i<child.size()-1;i++)
		{
			t = new pointer(t);
			t.size = 4;	
		}
		return new pair((String)((returnrecord)record).value,new value(t,((returnrecord)child.lastElement().record).loc));
		
	}
}
