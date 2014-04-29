package classDef;
import core.*;

public class program extends root
{
	public program(){}
	public int check() throws Exception
	{
		first.beginscope(0);
	
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		first.endscope(0);
		return 0;
		
	}
}
