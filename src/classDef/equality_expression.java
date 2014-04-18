package classDef;

import classes.Tint;

public class equality_expression extends root
{
	public equality_expression(){}
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)throw new Exception();
			record = child.get(0).record;
		}
		else
		{
			returnrecord r = new returnrecord();
			r.lvalue = false;
			r.constant = true;
			r.rtype = new Tint();
			
			for(int i=child.size()-1;i>=0;i--)
			{
				if(child.get(i) instanceof relational_expression)
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
