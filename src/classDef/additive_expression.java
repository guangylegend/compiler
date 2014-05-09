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
							if(r.rtype instanceof pointer)
							{
								if(((pointer)r.rtype).loc.type.equals("dynamic"))
								{
									location l = new location(0,"const",0,false);
									l.contain = ((returnrecord)child.get(i).record).value;
									code.add(new quad((String)child.get(i-1).record,l,null,((pointer)r.rtype).loc));	
								}
								else
								{
									if(child.get(i-1).equals("+"))((pointer)r.rtype).loc.offset+=(int)((returnrecord)child.get(i).record).value;
									else ((pointer)r.rtype).loc.offset-=(int)((returnrecord)child.get(i).record).value;
								}
								
							}
							else
							{
								location l = new location(0,"const",0,false);
								l.contain = ((returnrecord)child.get(i).record).value;
								code.add(new quad((String)child.get(i-1).record,l,null,r.loc));
							}
							
						}
					}
					else
					{
						code.addAll(child.get(i).code);
						if(r.loc==null)
						{
							r.loc = new temp();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer)
							{
								r.rtype = new pointer((pointer)((returnrecord)child.get(i).record).rtype);
							}
							else
							{
								code.add(new quad("load",((returnrecord)child.get(i).record).loc,null,r.loc));
								r.rtype = ((returnrecord)child.get(i).record).rtype;
							}
							
							if(i!=0)
							{
								if(((returnrecord)child.get(i).record).rtype instanceof pointer)
								{
									if(child.get(i-1).record.equals("-"))throw new Exception();
									else ((pointer)((returnrecord)child.get(i).record).rtype).loc.offset+=(int)r.value;
								}
								else
								{
									location l = new location(0,"const",0,false);
									l.contain = r.value;
									code.add(new quad((String)child.get(i-1).record,l,r.loc,r.loc));
								}
								
							}
						}
						else
						{
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("int") && child.get(i-1).record.equals("-"))throw new Exception();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("pointer") && child.get(i-1).record.equals("+"))throw new Exception();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer && r.rtype.equals("pointer") && child.get(i-1).record.equals("-"))r.rtype = new Tint();
							if(((returnrecord)child.get(i).record).rtype instanceof pointer)
							{
								if(((pointer)r.rtype).loc.type.equals("dynamic"))
								{
									code.add(new quad((String)child.get(i-1).record,((returnrecord)child.get(i).record).loc,null,((pointer)r.rtype).loc));	
								}
								else
								{				
									location ll = new location(0,"const",0,false);
									ll.contain = ((pointer)r.rtype).loc.offset;
									location l = new temp();
									code.add(new quad((String)child.get(i-1).record,ll,((returnrecord)child.get(i).record).loc,l));
									((pointer)r.rtype).loc.contain = l;
									((pointer)r.rtype).loc.type = "dynamic";
								}
							}
							else code.add(new quad((String)child.get(i-1).record,((returnrecord)child.get(i).record).loc,null,r.loc));
						}
					}
				}
			}
			
			if(r.rtype instanceof pointer)
			{
				r.lvalue = true;
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
