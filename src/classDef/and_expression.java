package classDef;

import classes.Tint;

public class and_expression extends root
{
	public and_expression(){}
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			record = child.get(0).record;
		}
		else
		{
			returnrecord r = new returnrecord();
			r.lvalue = false;
			r.constant = true;
			r.rtype = new Tint();
			
			for(int i=0;i<child.size();i++)
			{
				if(child.get(i) instanceof equality_expression)
				{
					if(child.get(i).check()!=0)
					{
						throw new Exception();
						//return 1;
					}
					if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)
					{
						throw new Exception();
						//return 1;
					}
					if(!((returnrecord)child.get(i).record).constant)r.constant = false;
				}
			}
			record = r;
		}
		
		return 0;
	}
}
