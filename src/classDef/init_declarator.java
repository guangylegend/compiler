package classDef;



import classes.type;

public class init_declarator extends root
{
	public init_declarator(){}
	public int check() throws Exception
	{
		if(child.get(0).check()!=0)throw new Exception();
		if(child.size()==1)
		{
			record = new pair((String)((returnrecord)child.get(0).record).value,null);
		}
			
		return 0;
	}
	
	public Object check(type t) throws Exception
	{
		return child.get(0).check(t);
	}
	
	public int checkinit() throws Exception
	{
		if(child.size()>1)
		{
			if(child.get(1).check()!=0)return 1;
			record = new pair((String)((returnrecord)child.get(0).record).value,(type)child.get(1).record);
		}
		return 0;
	}
}
