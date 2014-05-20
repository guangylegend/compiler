package classDef;

import core.first;
import classes.Tint;

public class logical_and_expression extends root
{
	public logical_and_expression(){}
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)throw new Exception();
			record = child.get(0).record;
			code = child.get(0).code;
		}
		else
		{
			returnrecord r = new returnrecord();
			r.lvalue = false;
			r.constant = false;
			r.rtype = new Tint();
			r.loc = null;
			location lend = new location();
			lend.contain = first.Label;
			first.Label++;
			location lfalse = new location();
			lfalse.contain = first.Label;
			first.Label++;
			
			r.loc = new location(first.Off.lastElement(),"memory",0,false,false);
			first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
			
			for(int i=0;i<child.size();i++)
			{
				if(child.get(i) instanceof inclusive_or_expression)
				{
					if(child.get(i).check()!=0)throw new Exception();
					if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();
					if(((returnrecord)child.get(i).record).constant)
					{
						code.addAll(child.get(i).code);		
						if((int)((returnrecord)child.get(i).record).value==0)code.add(new quad("b",null,null,lfalse));	
					}
					else
					{
						code.addAll(child.get(i).code);	
						if(((returnrecord)child.get(i).record).loc.address)
						{
							code.add(new quad("load",new temp(1),null,((returnrecord)child.get(i).record).loc));
							code.add(new quad("lal",new temp(1),null,new temp(1)));
						}
						else
						{
							code.add(new quad("load",new temp(1),null,((returnrecord)child.get(i).record).loc));
						}
		
						code.add(new quad("beqz",new temp(1),null,lfalse));
					}
				}
			}
			location l = new location(0,"const",0,false,false);
			l.contain = 1;
			code.add(new quad("li",new temp(1),null,l));
			code.add(new quad("store",new temp(1),null,r.loc));
			code.add(new quad("b",null,null,lend));
			code.add(new quad("label",null,null,lfalse));
			location ll = new location(0,"const",0,false,false);
			ll.contain = 0;
			code.add(new quad("li",new temp(1),null,ll));
			code.add(new quad("store",new temp(1),null,r.loc));
			code.add(new quad("label",null,null,lend));
			
			record = r;
		}
		
		return 0;
	}
}
