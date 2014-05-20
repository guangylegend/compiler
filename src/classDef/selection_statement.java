package classDef;

import core.first;
import classes.Tint;

public class selection_statement extends root
{
	public selection_statement(){}
	public int check() throws Exception
	{	
		
		for (int i = 1; i < child.size(); ++i)
		{
			if (child.get(i).check()!=0) throw new Exception();
		}
		if (checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0) throw new Exception();
				
		location lend = new location();
		lend.contain = first.Label;
		first.Label++;
		
		location lline = new location();
		if(child.size()>3)
		{
			lline.contain = first.Label;
			first.Label++;
		}
		
		code.addAll(child.get(1).code);
		if(((returnrecord)child.get(1).record).constant)
		{
			if(((boolean)((returnrecord)child.get(1).record).value)!=true)code.add(new quad("b",null,null,lend));
		}
		else 
		{
			if(first.infinity)
			{
				if(((returnrecord)child.get(1).record).loc.address)
				{
					code.add(new quad("lal",((returnrecord)child.get(1).record).loc,null,((returnrecord)child.get(1).record).loc));
				}			
				code.add(new quad("beqz",((returnrecord)child.get(1).record).loc,null,lend));
			}
			else
			{
				if(((returnrecord)child.get(1).record).loc.address)
				{
					code.add(new quad("load",new temp(1),null,((returnrecord)child.get(1).record).loc));
					code.add(new quad("lal",new temp(1),null,new temp(1)));
				}
				else
				{
					code.add(new quad("load",new temp(1),null,((returnrecord)child.get(1).record).loc));
				}
				
				code.add(new quad("beqz",new temp(1),null,lend));
			}
			
		}
		code.addAll(child.get(2).code);
		if(child.size()>3)code.add(new quad("b",null,null,lline));
		code.add(new quad("label",null,null,lend));	
		if(child.size()>3)
		{
			code.addAll(child.get(3).code);
			code.add(new quad("label",null,null,lline));	
		}
		


		return 0;
	}
}
