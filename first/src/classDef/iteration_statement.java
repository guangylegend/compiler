package classDef;

import core.first;
import classes.Tint;


public class iteration_statement extends root
{
	public iteration_statement(){}
	public int check() throws Exception
	{
		root son = child.get(0);
		
		if (((String)son.record).equals("while"))
		{
			son = child.get(1);
			if (son.check()!=0) throw new Exception();
			if (checkconvert(((returnrecord)son.record).rtype,new Tint())!=0) throw new Exception();
			
			first.loop++;
			
			if (child.get(2).check()!=0) throw new Exception();
			
			first.loop--;
 		}
		else
		{
			for(int i=1;i<child.size()-1;i++)
			{
				if(child.get(i).check()!=0)throw new Exception();
			}
			if (checkconvert(((returnrecord)child.get(2).record).rtype,new Tint())!=0) throw new Exception();
			
			first.loop++;
			
			if (child.get(child.size()-1).check()!=0) throw new Exception();
			
			first.loop--;
 		}
		
		return 0;
	}
}
