package classDef;


public class statement extends root
{
	public statement(){}
	public int check() throws Exception
	{
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
		return 0;
		
	}
}
