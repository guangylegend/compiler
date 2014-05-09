package classDef;

import core.first;
import classes.Tint;
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
		code.addAll(child.get(0).code);
		
		if(child.size()>1)
		{
			if(((returnrecord)record).constant)throw new Exception();
			
			type t = ((returnrecord)record).rtype;
			location l = ((returnrecord)record).loc;
		
			if(!(((String)((returnrecord)record).value).equals("printf") || ((String)((returnrecord)record).value).equals("malloc")))
			{
			
				if(t.typename.equals("name"))
				{
					l = find(((name)t).str,1).loc;
					t = find(((name)t).str,1).typ;
				}
				if(t==null)throw new Exception();
				
				for(int i=1;i<child.size();i++)
				{
					if(child.get(i).check()!=0)throw new Exception();
					returnrecord r = (returnrecord)child.get(i).check(new value(t,l));
					if(((returnrecord)record).value!=null && t.typename.equals("pointer") && (child.get(i).equals("++") || child.get(i).equals("--")))restore(((String)((returnrecord)record).value),new pointer((pointer)r.rtype));
					t = r.rtype;
					l = r.loc;
					if(!r.lvalue)((returnrecord)record).lvalue = false;
					code.addAll(child.get(i).code);
				}
			}
			else if(((String)((returnrecord)record).value).equals("malloc"))
			{
				if(child.size()>2)throw new Exception();
				if(child.get(1).check()!=0)throw new Exception();
				if(checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0)throw new Exception();
				if(((returnrecord)child.get(1).record).constant)
				{
					location size = new location();
					size.type = "memory";
					size.offset = first.Off.lastElement();
					first.Off.setElementAt(first.Off.lastElement()+(int)((returnrecord)child.get(1).record).value, first.Off.size()-1);
					t = new pointer(new Tvoid(),size);
				}
				else throw new Exception();
			}
			else
			{
				t = new pointer(new Tvoid(),null);
			}
		
		
			((returnrecord)record).rtype = t;
			((returnrecord)record).loc = l;
		
		
		}
		
		return 0;
	}
	
}
