package classDef;

import java.util.Vector;

import classes.Tchar;
import classes.Tint;
import classes.Tvoid;
import classes.function;
import classes.type;
import core.*;

public class program extends root
{
	public program(){}
	public int check() throws Exception
	{
		env newe = new env();
		first.e.add(newe);
		
		
		
		Vector<type> v = new Vector<type>();
		v.add(new Tchar());
		v.add(new Tint());
		function f = new function(new Tvoid(),v,"printf");
		first.e.lastElement().functable.put(symbol.symbol("printf"), f);
		
		
		
		for(int i=0;i<child.size();i++)
		{
			if(child.get(i).check()!=0)throw new Exception();
		}
		first.e.remove(first.e.size()-1);
		return 0;
		
	}
}
