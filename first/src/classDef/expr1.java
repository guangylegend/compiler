package classDef;

public class expr1 extends root
{
	public expr1(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		record = child.get(0).record;
		return 0;
	}
}
