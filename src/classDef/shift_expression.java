package classDef;

import core.first;
import classes.Tint;

public class shift_expression extends root
{
	public shift_expression(){}
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
				if(child.get(i) instanceof additive_expression)
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
								if(child.get(i-1).record.equals(">>"))r.value = (int)r.value >> (int)((returnrecord)child.get(i).record).value;
								else if(child.get(i-1).record.equals("<<"))r.value = ((int)r.value) << (int)((returnrecord)child.get(i).record).value;
								
							}
						}
						else
						{
							if(first.infinity)
							{
								location l = new location(0,"const",0,false,false);
								l.contain = ((returnrecord)child.get(i).record).value;
								code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,l));
							}
							else
							{
								location l = new location(0,"const",0,false,false);
								l.contain = ((returnrecord)child.get(i).record).value;
								code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,l));
							}
							
						}
					}
					else
					{
						code.addAll(child.get(i).code);
						if(r.loc==null)
						{
							if(first.infinity)
							{
								r.loc = new temp();
								r.loc.offset = first.Off.lastElement();
								first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
								if(first.func==null)r.loc.global = true;
								else r.loc.global = false;
								if(((returnrecord)child.get(i).record).loc.address)
								{
									code.add(new quad("lal",r.loc,null,((returnrecord)child.get(i).record).loc));
								}
								else code.add(new quad("move",r.loc,null,((returnrecord)child.get(i).record).loc));
								r.rtype = ((returnrecord)child.get(i).record).rtype;
								
								if(i!=0)
								{

									location l = new location(0,"const",0,false,false);
									l.contain = r.value;
									code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,l));
								}
							}
							else
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
									code.add(new quad((String)child.get(i-1).record,tmp1,tmp1,l));
									code.add(new quad("store",tmp1,null,r.loc));
								}
							}
							
						}
						else
						{
							if(first.infinity)
							{
								if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",((returnrecord)child.get(i).record).loc,null,((returnrecord)child.get(i).record).loc));
								code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,((returnrecord)child.get(i).record).loc));
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
			}
			
			record = r;
		}
		
		return 0;
	}
}
