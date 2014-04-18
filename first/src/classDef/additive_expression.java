package classDef;
import classes.*;

public class additive_expression extends root
{
	public additive_expression(){}
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
			
			for(int i=child.size()-1;i>=0;i-=2)
			{
					if(child.get(i).check()!=0)
					{
						throw new Exception();
						//return 1;
					}
					if(!(((returnrecord)child.get(i).record).rtype instanceof pointer))
					{
						if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)
						{
							throw new Exception();
							//return 1;
						}
						if(i!=child.size()-1)
						{
							if(((String)child.get(i+1).record).equals("-") && ((returnrecord)child.get(i).record).rtype instanceof pointer)return 1; 
						}
					}
					else
					{
						if(r.rtype.typename.equals("int"))
						{
							r.lvalue = true;
							r.rtype = ((returnrecord)child.get(i).record).rtype;
						}
					}
					if(!((returnrecord)child.get(i).record).constant)r.constant = false;
				}
			record = r;
			}
			
		
		return 0;
	}
}
