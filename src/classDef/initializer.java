package classDef;

import java.util.Vector;

import classes.array;
import classes.type;

public class initializer extends root
{
	public initializer(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		if(child.get(0) instanceof assignment_expression)
		{
			if(((returnrecord)child.get(0).record).constant)record = new nconst(((returnrecord)child.get(0).record).rtype,((returnrecord)child.get(0).record).value);
			else record = new value(((returnrecord)child.get(0).record).rtype,((returnrecord)child.get(0).record).loc);
		}
		else
		{
			int n = child.size();
			Vector<Object> v = new Vector<Object>();
			type a = null;
			for(int i=0;i<child.size();i++)
			{
				if(a==null)
				{
					if(child.get(i).record instanceof nconst)
					{
						a = ((nconst)child.get(i).record).typ;
						v.add(((nconst)child.get(i).record).value);
					}
					else
					{
						a = ((value)child.get(i).record).typ;
						v.add(((value)child.get(i).record).loc);
					}
					
					
				}
				else
				{
					if(checkconvert((type)child.get(i).record,a)!=0)throw new Exception();
					if(child.get(i).record instanceof nconst)
					{
						v.add(((nconst)child.get(i).record).value);
					}
					else
					{
						v.add(((value)child.get(i).record).loc);
					}
				}
			}
			record = new nconst(new array(a,n,null),v);//set content...
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		return 0;
	}
}
