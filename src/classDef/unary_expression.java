package classDef;

import core.first;
import classes.Tint;
import classes.pointer;


public class unary_expression extends root
{
	public unary_expression(){}
	public int check() throws Exception
	{
		
		if (child.size() == 1)
		{
			if(child.get(0).check()!=0)throw new Exception();
			record = child.get(0).record;
			code = child.get(0).code;
		}
		else
		{
			root son = child.get(0);
			if (((String)son.record).equals("++") || ((String)son.record).equals("--"))
			{
				if (child.get(1).check()!=0) throw new Exception();
				if (((returnrecord)child.get(1).record).constant)throw new Exception();
				if (!((returnrecord)child.get(1).record).lvalue)throw new Exception();
				
				record = child.get(1).record;
				code.addAll(child.get(1).code);
				
				
				if(((returnrecord)child.get(1).record).rtype instanceof pointer)
				{
					pointer p = (pointer)((returnrecord)child.get(1).record).rtype;
					if(p.loc.type.equals("dynamic"))
					{
						if(((String)son.record).equals("++"))
						{
							location l = new location(0,"const",0,false);
							l.contain = p.elementType.size;
							code.add(new quad("+",l,null,p.loc));
						}
						else
						{
							location l = new location(0,"const",0,false);
							l.contain = p.elementType.size;
							code.add(new quad("-",l,null,p.loc));
						}
					}
					else
					{
						if(((String)son.record).equals("++")) p.loc.offset+=p.elementType.size; 
						else p.loc.offset-=p.elementType.size; 
					}
					if(((returnrecord)child.get(1).record).value!=null)restore(((String)((returnrecord)child.get(1).record).value),p);
				}
				else
				{
					if(checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0)
					{
						throw new Exception();
					}
					location l = new location(0,"const",0,false);
					l.contain = 1;
					if(((String)son.record).equals("++"))code.add(new quad("+",l,null,((returnrecord)record).loc));
					else code.add(new quad("-",l,null,((returnrecord)record).loc));
				}
				
				
				
				
			}			
			else if (((String)son.record).equals("sizeof"))
			{
				if (child.get(1).check()!=0) throw new Exception();
				code.addAll(child.get(1).code);
				returnrecord r = (returnrecord)child.get(1).record;
				if (r.constant)throw new Exception();
				r.lvalue= false;			
				r.constant = true;
				r.value = r.rtype.size;
				r.rtype = new Tint();
				record = r;
				
			}
			else
			{
				if (child.get(1).check()!=0) throw new Exception();
				returnrecord r = (returnrecord)child.get(1).record;
				code.addAll(child.get(1).code);
				
				if(((String)son.record).equals("*"))
				{
					if(r.constant)throw new Exception();
					if(!r.lvalue)throw new Exception();
					if(r.rtype instanceof pointer)
					{
						location l = new location(((pointer)(r.rtype)).loc);
						r.loc = l;
						r.rtype = ((pointer)(r.rtype)).elementType;
						r.rtype.addr = true;
					}
					else throw new Exception();
					
					
					
					//can't define null pointer...
					int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa;
				}
				else if(((String)son.record).equals("&"))
				{
					if(r.constant)throw new Exception();
					if(!r.lvalue)throw new Exception();
					r.rtype = new pointer(r.rtype,r.loc);
					r.lvalue = false;
					r.constant = true;
					if(r.loc.global)r.value = first.GP + r.loc.offset;
					else r.value = first.SP + r.loc.offset;
				}
				else
				{
					if (checkconvert(r.rtype, new Tint())!=0) throw new Exception();
					r.lvalue= false;
					r.rtype = new Tint();
					if(r.constant)
					{
						if(((String)son.record).equals("-"))r.value = -(int)r.value;
						else if(((String)son.record).equals("~"))r.value = ~(int)r.value;
						else if(((String)son.record).equals("!"))r.value = !(boolean)r.value;
						//"+" in heaven...
						
					}
					else
					{
						location ll = new temp();
						location l = new location(0,"const",0,false);
						l.contain = 0;
						code.add(new quad((String)son.record,r.loc,l,ll));
						r.loc = ll;
					}
					
					
				}
				record = r;
				
				
				
			}
		}
		
		return 0;
	}
}
