package classDef;

import classes.Tvoid;
import classes.name;
import classes.pointer;
import classes.type;


public class postfix_expression extends root
{
	public postfix_expression(){}
	public int check() throws Exception
	{
		root son = child.get(0);
		if (son.check()!=0) throw new Exception();
		record = son.record;
		
		
		if(child.size()>1)
		{
			if(((returnrecord)record).constant)throw new Exception();
		
		
		type t = ((returnrecord)record).rtype;
		
		if(!(((String)((returnrecord)record).value).equals("printf") || ((String)((returnrecord)record).value).equals("malloc")))
		{
			//System.out.println((String)((returnrecord)record).value);
			
			if(t.typename.equals("name"))
			{System.out.println(((name)t).str);
				t = find(((name)t).str,1);
			}
			if(t==null)throw new Exception();
			for(int i=1;i<child.size();i++)
			{
				if(child.get(i).check()!=0)throw new Exception();
				returnrecord r = (returnrecord)child.get(i).check(t);
				if(((String)r.value)!=null)throw new Exception();
				t = r.rtype;
				if(!r.lvalue)((returnrecord)record).lvalue = false;
			}
		}
		else
		{
			t = new pointer(new Tvoid());
		}
		
		
			
		
		
		

		
		
		((returnrecord)record).rtype = t;
		
		
		}
		
		return 0;
	}
	
}
