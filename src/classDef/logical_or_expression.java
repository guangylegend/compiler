package classDef;

import core.first;
import classes.Tint;

public class logical_or_expression extends root
{
	public logical_or_expression(){}
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
			location ltrue = new location();
			ltrue.contain = first.Label;
			first.Label++;
			
			if(first.infinity)
			{
				location tmp = new temp();
				tmp.offset = first.Off.lastElement();
				tmp.global = false;
				first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
				r.loc = tmp;
				
				for(int i=0;i<child.size();i++)
				{
					if(child.get(i) instanceof logical_and_expression)
					{
						if(child.get(i).check()!=0)throw new Exception();
						if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();
						if(((returnrecord)child.get(i).record).constant)
						{
							code.addAll(child.get(i).code);	
							
							if((int)((returnrecord)child.get(i).record).value!=0)code.add(new quad("b",null,null,ltrue));	
						}
						else
						{
							code.addAll(child.get(i).code);				
							if(((returnrecord)child.get(i).record).loc.address)
							{
								code.add(new quad("lal",((returnrecord)child.get(i).record).loc,null,((returnrecord)child.get(i).record).loc));
							}
							code.add(new quad("bnez",((returnrecord)child.get(i).record).loc,null,ltrue));
						}
					}
				}
				location l = new location(0,"const",0,false,false);
				l.contain = 0;
				code.add(new quad("li",tmp,null,l));
				code.add(new quad("b",null,null,lend));
				code.add(new quad("label",null,null,ltrue));
				location ll = new location(0,"const",0,false,false);
				ll.contain = 1;
				code.add(new quad("li",tmp,null,ll));
				code.add(new quad("label",null,null,lend));
				
				record = r;
			}
			else
			{
				r.loc = new location(first.Off.lastElement(),"memory",0,false,false);
				first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
				
				for(int i=0;i<child.size();i++)
				{
					if(child.get(i) instanceof logical_and_expression)
					{
						if(child.get(i).check()!=0)throw new Exception();
						if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();
						if(((returnrecord)child.get(i).record).constant)
						{
							code.addAll(child.get(i).code);	
							
							if((int)((returnrecord)child.get(i).record).value!=0)code.add(new quad("b",null,null,ltrue));	
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
							code.add(new quad("bnez",new temp(1),null,ltrue));
						}
					}
				}
				location l = new location(0,"const",0,false,false);
				l.contain = 0;
				code.add(new quad("li",new temp(1),null,l));
				code.add(new quad("store",new temp(1),null,r.loc));
				code.add(new quad("b",null,null,lend));
				code.add(new quad("label",null,null,ltrue));
				location ll = new location(0,"const",0,false,false);
				ll.contain = 1;
				code.add(new quad("li",new temp(1),null,ll));
				code.add(new quad("store",new temp(1),null,r.loc));
				code.add(new quad("label",null,null,lend));
				
				record = r;
			}
			
		}
		
		return 0;
	}
}
