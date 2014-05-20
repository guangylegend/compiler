package classDef;


import classes.Tvoid;
import classes.type;
import core.first;



public class jump_statement extends root
{
	public jump_statement(){}
	public int check() throws Exception
	{
		if (child.size() == 1 && !((String)child.get(0).record).equals("return"))
		{
			if (first.loop == 0) throw new Exception();
			if(((String)child.get(0).record).equals("break"))
			{
				location l = new location();
				l.contain = first.lline.lastElement();
				code.add(new quad("b",null,null,l));
			}
			else
			{
				location l = new location();
				l.contain = first.lend.lastElement();
				code.add(new quad("b",null,null,l));
			}
		}
		else
		{
			if(child.size() == 1)
			{
				if(first.func == null) throw new Exception();
				if(checkconvert(first.func.returnType, new Tvoid())!=0)throw new Exception();
				location ll = new location();
				ll.contain = first.func.name;
				code.add(new quad("return",null,null,ll));
			}
			else
			{
				if (child.get(1).check()!=0) throw new Exception();
				code.addAll(child.get(1).code);
				type t = ((returnrecord)child.get(1).record).rtype;
				if(first.func == null) throw new Exception();
				if(t==null)throw new Exception();
				if(checkconvert(t, first.func.returnType)!=0)throw new Exception();
				if(((returnrecord)child.get(1).record).constant)
				{
					location l = new location();
					l.type = "const";
					l.contain = ((returnrecord)child.get(1).record).value;
					location ll = new location(0,"",0,false,false);
					code.add(new quad("li",new temp(1),null,l));
					code.add(new quad("storereturn",new temp(1),null,ll));
				}
				else
				{
					if(t.typename.equals("struct"))
					{
						int k = t.size;
						for(int j=0;j<k/4;j++)
						{
							location tmp = new temp(1);
							
							if(((returnrecord)child.get(1).record).loc.address)
							{	
								code.add(new quad("ld",tmp,null,((returnrecord)child.get(1).record).loc));
								location ll = new location(0,"const",0,false,false);
								ll.contain = j*4;
								code.add(new quad("+",tmp,tmp,ll));
								code.add(new quad("lal",tmp,null,tmp));
							}
							else
							{
								location t1 = new location(((returnrecord)child.get(1).record).loc.offset+j*4,"memory",0,false,false);
								if(first.func==null)t1.global = true;
								else t1.global = false;
								code.add(new quad("ld",tmp,null,t1));
							}
							
							
							location t2 = new location(j*4,"",0,false,false);
							if(first.func==null)t2.global = true;
							else t2.global = false;	
							code.add(new quad("storereturn",tmp,null,t2));
						}
					}
					else
					{
						location ll = new location(0,"",0,false,false);
						code.add(new quad("load",new temp(1),null,((returnrecord)child.get(1).record).loc));
						if(((returnrecord)child.get(1).record).loc.address)code.add(new quad("lal",new temp(1),null,new temp(1)));
						code.add(new quad("storereturn",new temp(1),null,ll));
					}
						

				}
				location l = new location();
				l.contain = first.func.name;
				code.add(new quad("return",null,null,l));
			}
			
		}
		return 0;
	}
}
