package classDef;

public class expression_statement extends root
{
	public expression_statement(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		return 0;
	}
}
