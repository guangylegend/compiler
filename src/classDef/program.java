package classDef;
import java.util.Vector;

import core.*;

public class program extends root
{
	public program(){}
	public int check() throws Exception
	{
		first.beginscope(0);
	
		first.Off.push(0);
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		Vector<quad> r = new Vector<quad>();
		for(int i=0;i<child.size();i++)
		{			
			if(child.get(i).code!=null)r.addAll(child.get(i).code);
		}
		code = r;
		first.Off.pop();
		//first.endscope(0);     //for search
		return 0;
		
	}
}
