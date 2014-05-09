package classDef;

import core.first;
import classes.Tint;

public class selection_statement extends root
{
	public selection_statement(){}
	public int check() throws Exception
	{
		location lend = new location();
		lend.contain = first.Label;
		first.Label++;
		
		for (int i = 1; i < child.size(); ++i)
		{
			if (child.get(i).check()!=0) throw new Exception();
		}
		if (checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0) throw new Exception();
				
		code.addAll(child.get(1).code);
		if(((returnrecord)child.get(1).record).constant)
		{
			if(((int)((returnrecord)child.get(1).record).value)==0)code.add(new quad("jal",null,null,lend));
		}
		else code.add(new quad("beqz",((returnrecord)child.get(1).record).loc,null,lend));
		code.addAll(child.get(2).code);
		code.add(new quad("label",null,null,lend));
		if(child.size()>3)code.addAll(child.get(3).code);


		return 0;
	}
}
