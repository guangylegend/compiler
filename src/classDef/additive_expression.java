package classDef;
import core.first;
import classes.*;

public class additive_expression extends root
{
	public additive_expression(){}
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
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
				if(child.get(i) instanceof multiplicative_expression)
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
								if(child.get(i-1).record.equals("+"))r.value = (int)r.value + (int)((returnrecord)child.get(i).record).value;
								else if(child.get(i-1).record.equals("-"))r.value = (int)r.value - (int)((returnrecord)child.get(i).record).value;
							}
						}
						else
						{
							
							if(first.infinity)
							{
								if(r.rtype instanceof pointer)
								{
									location l = new location(0,"const",0,false,false);
									l.contain = (int)((returnrecord)child.get(i).record).value*((pointer)r.rtype).size;
									code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,l));
								}
								else
								{
									location l = new location(0,"const",0,false,false);
									l.contain = ((returnrecord)child.get(i).record).value;
									code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,l));
								}
							}
							else
							{
								if(r.rtype instanceof pointer)
								{
									location l = new location(0,"const",0,false,false);
									l.contain = (int)((returnrecord)child.get(i).record).value*((pointer)r.rtype).size;
									location tmp = new temp(1);
									code.add(new quad("load",tmp,null,r.loc));
									code.add(new quad((String)child.get(i-1).record,tmp,tmp,l));
									code.add(new quad("store",tmp,null,r.loc));
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
									if(((returnrecord)child.get(i).record).rtype instanceof pointer)throw new Exception();

									location l = new location(0,"const",0,false,false);
									l.contain = r.value;
									location ll = new temp();
									code.add(new quad("li",ll,null,l));
									code.add(new quad((String)child.get(i-1).record,r.loc,ll,r.loc));
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
								//if(r.rtype instanceof pointer)r.loc.address = true;
								
								if(i!=0)
								{
									if(((returnrecord)child.get(i).record).rtype instanceof pointer)throw new Exception();

									location l = new location(0,"const",0,false,false);
									l.contain = r.value;
									code.add(new quad("li",new temp(2),null,l));
									location tmp1 = new temp(1);
									code.add(new quad("load",tmp1,null,r.loc));
									code.add(new quad((String)child.get(i-1).record,tmp1,new temp(2),tmp1));
									code.add(new quad("store",tmp1,null,r.loc));
								}
							}
							
						}
						else
						{
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("int") && child.get(i-1).record.equals("-"))throw new Exception();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("pointer") && child.get(i-1).record.equals("+"))throw new Exception();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("pointer") && child.get(i-1).record.equals("-"))r.rtype = new Tint();
							
							if(first.infinity)
							{
								if(r.rtype.typename.equals("pointer"))
								{
									if(((returnrecord)child.get(i).record).rtype instanceof pointer)
									{
										code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,((returnrecord)child.get(i).record).loc));
										if(((pointer)((returnrecord)child.get(i).record).rtype).elementType.typename.equals(((pointer)r.rtype).elementType.typename))
										{
											location l = new location(0,"const",0,false,false);
											l.contain = ((pointer)r.rtype).elementType.size;
											code.add(new quad("/",r.loc,r.loc,l));
										}
									}
									else
									{
										if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",((returnrecord)child.get(i).record).loc,null,((returnrecord)child.get(i).record).loc));
										location l = new location(0,"const",0,false,false);
										l.contain = r.rtype.size;
										code.add(new quad("*",((returnrecord)child.get(i).record).loc,((returnrecord)child.get(i).record).loc,l));
										code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,((returnrecord)child.get(i).record).loc));
									}
								}
								else
								{
									if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",((returnrecord)child.get(i).record).loc,null,((returnrecord)child.get(i).record).loc));
									code.add(new quad((String)child.get(i-1).record,r.loc,r.loc,((returnrecord)child.get(i).record).loc));
								}
							}
							else
							{
								if(r.rtype.typename.equals("pointer"))
								{
									if(((returnrecord)child.get(i).record).rtype instanceof pointer)
									{
										location tmp1 = new temp(1);
										code.add(new quad("load",tmp1,null,r.loc));
										location tmp2 = new temp(2);
										code.add(new quad("load",tmp2,null,((returnrecord)child.get(i).record).loc));
										code.add(new quad((String)child.get(i-1).record,tmp1,tmp1,tmp2));
										if(((pointer)((returnrecord)child.get(i).record).rtype).elementType.typename.equals(((pointer)r.rtype).elementType.typename))
										{
											location l = new location(0,"const",0,false,false);
											l.contain = ((pointer)r.rtype).elementType.size;
											code.add(new quad("/",tmp1,tmp1,l));
										}
										code.add(new quad("store",tmp1,null,r.loc));
									}
									else
									{
										location tmp1 = new temp(1);
										code.add(new quad("load",tmp1,null,r.loc));
										location tmp2 = new temp(2);
										code.add(new quad("load",tmp2,null,((returnrecord)child.get(i).record).loc));
										if(((returnrecord)child.get(i).record).loc.address)code.add(new quad("lal",tmp2,null,tmp2));
										location l = new location(0,"const",0,false,false);
										l.contain = r.rtype.size;
										code.add(new quad("*",tmp2,tmp2,l));
										code.add(new quad((String)child.get(i-1).record,tmp1,tmp1,tmp2));
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
				}
			}
			
			if(r.rtype instanceof pointer)
			{
				r.lvalue = true;
			}
			
			
			record = r;
		}
			
		
		return 0;
	}
}
