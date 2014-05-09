package classDef;

import classes.pointer;

public class cast_expression extends root
{
	public cast_expression(){}
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
			}
			record = child.get(0).record;
			code = child.get(0).code;
		}
		else
		{
			for(int i=0;i<child.size();i++)
			{
				if(child.get(i).check()!=0)
				{
					throw new Exception();
					//return 1;
				}
			}
			
			if(checkconvert(((returnrecord)child.get(1).record).rtype,((returnrecord)child.get(0).record).rtype)!=0)
			{
				throw new Exception();
				//return 1;
			}
			returnrecord r = (returnrecord)child.get(1).record;
			r.rtype = ((returnrecord)child.get(0).record).rtype;
			if(((returnrecord)child.get(1).record).rtype instanceof pointer)((pointer)(((returnrecord)child.get(0).record).rtype)).loc = ((pointer)(((returnrecord)child.get(1).record).rtype)).loc;
			record = r;
			code = child.get(1).code;
			
		}
		return 0;
	}
}
