package classDef;

import core.first;
import classes.Tint;

public class relational_expression extends root
{
	public relational_expression(){}
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
			r.constant = true;
			r.rtype = new Tint();
			r.loc = null;
			
			for(int i=0;i<child.size();i++)
			{
				if(child.get(i) instanceof shift_expression)
				{
					if(child.get(i).check()!=0)throw new Exception();
					if(checkconvert(((returnrecord)child.get(i).record).rtype,new Tint())!=0)throw new Exception();
					if(!((returnrecord)child.get(i).record).constant)r.constant = false;
					if(((returnrecord)child.get(i).record).constant)
					{
						if(r.constant)
						{
							if(i==0)r.value = ((returnrecord)child.get(i).record).value;
							else
							{
								if(child.get(i-1).equals(">"))r.value = (int)r.value > (int)((returnrecord)child.get(i).record).value;
								else if(child.get(i-1).equals(">="))r.value = (int)r.value >= (int)((returnrecord)child.get(i).record).value;
								else if(child.get(i-1).equals("<"))r.value = (int)r.value < (int)((returnrecord)child.get(i).record).value;
								else if(child.get(i-1).equals("<="))r.value = (int)r.value <= (int)((returnrecord)child.get(i).record).value;
							}
						}
						else
						{
							location l = new location(0,"const",0,false);
							l.contain = ((returnrecord)child.get(i).record).value;
							code.add(new quad((String)child.get(i-1).record,l,null,r.loc));
						}
					}
					else
					{
						code.addAll(child.get(i).code);
						if(r.loc==null)
						{
							r.loc = new temp();
							code.add(new quad("load",((returnrecord)child.get(i).record).loc,null,r.loc));				
							if(i!=0)
							{
								location l = new location(0,"const",0,false);
								l.contain = r.value;
								code.add(new quad((String)child.get(i-1).record,l,r.loc,r.loc));
							}
						}
						else
						{
							code.add(new quad((String)child.get(i-1).record,((returnrecord)child.get(i).record).loc,null,r.loc));
						}
					}
				}
			}
			if(r.loc!=null)
			{
				r.loc.offset = first.Off.lastElement();
				first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
				if(first.func==null)r.loc.global = true;
				else r.loc.global = false;
			}
			
			record = r;
		}
		
		return 0;
	}
}
