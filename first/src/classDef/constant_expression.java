package classDef;


public class constant_expression extends root
{
	public constant_expression(){}
	public int check() throws Exception
	{
		if(child.get(0).check()!=0)
		{
			throw new Exception();
			//return 1;
		}
		record = child.get(0).record;
		return 0;
	}
}
