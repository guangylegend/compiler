package classDef;

import core.first;
import classes.Tint;

public class multiplicative_expression extends root
{
	public multiplicative_expression(){}
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
				if(child.get(i) instanceof cast_expression)
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
								if(((String)child.get(i-1).record).equals("*"))r.value = (int)r.value * (int)((returnrecord)child.get(i).record).value;
								else if(((String)child.get(i-1).record).equals("/"))r.value = (int)r.value / (int)((returnrecord)child.get(i).record).value;
								else if(((String)child.get(i-1).record).equals("%"))r.value = (int)r.value % (int)((returnrecord)child.get(i).record).value;
							}
						}
						else
						{
							location l = new location(0,"const",0,false,false);
							l.contain = ((returnrecord)child.get(i).record).value;
							location tmp = new temp(1);
							code.add(new quad("load",tmp,null,r.loc));
							code.add(new quad((String)child.get(i-1).record,tmp,tmp,l));
							code.add(new quad("store",tmp,null,r.loc));
						}
					}
					else
					{
						code.addAll(child.get(i).code);
						if(r.loc==null)
						{
							r.loc = new location();
							r.loc.type = "memory";
							r.loc.offset = first.Off.lastElement();
							first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
							if(first.func==null)r.loc.global = true;
							else r.loc.global = false;
							location tmp = new temp(1);
							code.add(new quad("load",tmp,null,((returnrecord)child.get(i).record).loc));
							if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",tmp,null,tmp));
							code.add(new quad("store",tmp,null,r.loc));
							r.rtype = ((returnrecord)child.get(i).record).rtype;
							
							if(i!=0)
							{

								location l = new location(0,"const",0,false,false);
								l.contain = r.value;
								location tmp1 = new temp(1);
								code.add(new quad("load",tmp1,null,r.loc));
								code.add(new quad((String)child.get(i-1).record,tmp1,l,tmp1));
								code.add(new quad("store",tmp1,null,r.loc));
							}
						}
						else
						{
							location tmp1 = new temp(1);
							code.add(new quad("load",tmp1,null,r.loc));
							location tmp2 = new temp(2);
							code.add(new quad("load",tmp2,null,((returnrecord)child.get(i).record).loc));
							if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",tmp2,null,tmp2));
							code.add(new quad((String)child.get(i-1).record,tmp1,tmp1,tmp2));
							code.add(new quad("store",tmp1,null,r.loc));
						}
					}
				}
			}
			
			record = r;
		}
		
		return 0;
	}
}
