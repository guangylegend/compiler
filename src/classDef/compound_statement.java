package classDef;

import core.env;
import core.first;

public class compound_statement extends root
{
	public compound_statement(){}
	public int check() throws Exception
	{
		env newe = new env();
		first.e.add(newe);
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
		}
		first.e.remove(first.e.size()-1);
		return 0;
		
	}
}
