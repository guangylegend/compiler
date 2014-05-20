package classDef;


import classes.Tint;
import classes.array;
import classes.type;

public class declarator extends root
{
	public declarator(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		if(child.size()>1)
		{
			
			if(child.get(1) instanceof constant_expression)
			{
				
				for (int i = child.size() - 1; i > 0; i--)
				{
					if(!((returnrecord)child.get(i).record).constant)throw new Exception();	
					if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();			
				}
			}
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		record = child.get(0).record;
		return 0;
	}
	public Object check(type t) throws Exception
	{
		root son = child.get(0);
		if(child.size()==1)
		{
			return son.check(t);
		}
		else if (child.get(1) instanceof parameters)
		{

			//System.out.println("declarator miss");
		}
		else
		{
			value val = ((pair)child.get(0).check(t)).val;
			String str = ((pair)child.get(0).check(t)).str;
			
			for (int i = child.size() - 1; i > 0; i--)
			{
				int index = (int)((returnrecord)child.get(i).record).value;
				val.typ = new array(val.typ,index);
			}
			
			return new pair(str,val);
		}
		return 0;
	}
	
}
