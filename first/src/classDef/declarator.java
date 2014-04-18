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
					if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();			
				}
			}
		}
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
/*			son = (root)vec.get(1);
			if (son.checkSon() == WA) return WA;
			
			if (vec.size() == 2) return AC;
			
			son = (root)vec.get(2);
			if (son.checkSon() == WA) return WA;*/
			

			//System.out.println("declarator miss");
		}
		else
		{
			//System.out.println("declarator");
			type typ = ((pair)child.get(0).check(t)).typ;
			String str = ((pair)child.get(0).check(t)).str;
			
			for (int i = child.size() - 1; i > 0; i--)  //index......................
			{
				typ = new array(typ,20);
			}
			return new pair(str,typ);
		}
		return 0; //T T
	}
	
}
