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
				
				
				if(((returnrecord)child.get(1).record).rtype.equals("pointer") )
				{
					if(first.infinity)
					{
						pointer p = (pointer)((returnrecord)child.get(1).record).rtype;
						location l = new location(0,"const",0,false,false);
						l.contain = p.size;
						if(((String)son.record).equals("++"))code.add(new quad("+",((returnrecord)record).loc,((returnrecord)record).loc,l));
						else code.add(new quad("-",((returnrecord)record).loc,((returnrecord)record).loc,l));
					}
					else
					{
						pointer p = (pointer)((returnrecord)child.get(1).record).rtype;
						location l = new location(0,"const",0,false,false);
						l.contain = p.size;
						code.add(new quad("load",new temp(1),null,((returnrecord)record).loc));
						if(((String)son.record).equals("++"))code.add(new quad("+",new temp(1),new temp(1),l));
						else code.add(new quad("-",new temp(1),new temp(1),l));
						code.add(new quad("store",new temp(1),null,((returnrecord)record).loc));
					}
					
				}
				else
				{
					if(checkconvert(((returnrecord)child.get(1).record).rtype,new Tint())!=0)
					{
						throw new Exception();
					}
					
					if(((returnrecord)record).loc.address)
					{
						if(first.infinity)
						{
							location l = new location(0,"const",0,false,false);
							l.contain = 1;
							location tmp = new temp();
							tmp.offset = first.Off.lastElement();
							tmp.global = false;
							first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
							code.add(new quad("lal",tmp,null,((returnrecord)record).loc));
							if(((String)son.record).equals("++"))code.add(new quad("+",tmp,tmp,l));
							else code.add(new quad("-",tmp,tmp,l));
							code.add(new quad("sal",tmp,null,((returnrecord)record).loc));
						}
						else
						{
							location l = new location(0,"const",0,false,false);
							l.contain = 1;
							code.add(new quad("load",new temp(1),null,((returnrecord)record).loc));
							code.add(new quad("lal",new temp(2),null,new temp(1)));
							if(((String)son.record).equals("++"))code.add(new quad("+",new temp(2),new temp(2),l));
							else code.add(new quad("-",new temp(2),new temp(2),l));
							code.add(new quad("sal",new temp(2),null,new temp(1)));
						}
						
					}
					else
					{
						if(first.infinity)
						{
							location l = new location(0,"const",0,false,false);
							l.contain = 1;
							if(((String)son.record).equals("++"))code.add(new quad("+",((returnrecord)record).loc,((returnrecord)record).loc,l));
							else code.add(new quad("-",((returnrecord)record).loc,((returnrecord)record).loc,l));
						}
						else
						{
							location l = new location(0,"const",0,false,false);
							l.contain = 1;
							code.add(new quad("load",new temp(1),null,((returnrecord)record).loc));
							if(((String)son.record).equals("++"))code.add(new quad("+",new temp(1),new temp(1),l));
							else code.add(new quad("-",new temp(1),new temp(1),l));
							code.add(new quad("store",new temp(1),null,((returnrecord)record).loc));
						}
						
					}
					
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
						r.rtype = ((pointer)(r.rtype)).elementType;
						//location l = new temp();
						//l.offset = first.Off.lastElement();
						//first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);						
						//code.add(new quad("la",l,null,r.loc));
						location tmp = new temp();
						tmp.offset = first.Off.lastElement();
						tmp.global = false;
						first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
						if(r.loc.address)
						{
							code.add(new quad("lal",tmp,null,r.loc));
							r.loc = tmp;
						}
						else r.loc = new location(r.loc);
						r.loc.address = true;
					}
					else throw new Exception();
					
				}
				else if(((String)son.record).equals("&"))
				{
					if(r.constant)throw new Exception();
					if(!r.lvalue)throw new Exception();
					if(first.infinity)
					{
						r.rtype = new Tint();
						location tmp = new temp();
						tmp.offset = first.Off.lastElement();
						tmp.global = false;
						first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
						if(!r.loc.global)code.add(new quad("spill",null,null,new location(r.loc)));
						code.add(new quad("la",tmp,null,new location(r.loc)));
						r.loc = tmp;
						r.lvalue = false;
					}
					else
					{
						location l = new location(first.Off.lastElement(),"memory",0,false,false);
						r.rtype = new Tint();
						first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);	
						location tmp = new location(r.loc);
						code.add(new quad("la",new temp(1),null,tmp));
						code.add(new quad("sw",new temp(1),null,l));
						r.loc = new location(l);
						r.lvalue = false;
					}
					
					
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
						if(first.infinity)
						{
							location tmp = new temp();
							tmp.offset = first.Off.lastElement();
							tmp.global = false;
							first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
							if(r.loc.address)
							{
								r.loc.address = false;
								code.add(new quad("lal",tmp,null,r.loc));
								if(son.record.equals("~"))
								{
									code.add(new quad("not",tmp,null,tmp));
								}
								else if(((String)son.record).equals("-"))
								{
									code.add(new quad("neg",tmp,null,tmp));
								}
								else if(((String)son.record).equals("!"))
								{
									location l = new location(0,"const",0,false,false);
									l.contain = 0;
									code.add(new quad("seq",tmp,tmp,l));
								}
							}
							else
							{
								if(son.record.equals("~"))
								{
									code.add(new quad("not",tmp,null,r.loc));
								}
								else if(((String)son.record).equals("-"))
								{
									code.add(new quad("neg",tmp,null,r.loc));
								}
								else if(((String)son.record).equals("!"))
								{
									location l = new location(0,"const",0,false,false);
									l.contain = 0;
									code.add(new quad("seq",tmp,r.loc,l));
								}
							}
							
							r.loc = tmp;
						}
						else
						{
							location ll = new location(first.Off.lastElement(),"memory",0,false,false);
							first.Off.setElementAt(first.Off.lastElement()+r.rtype.size, first.Off.size()-1);
							code.add(new quad("load",new temp(1),null,r.loc));
							if(r.loc.address)
							{
								r.loc.address = false;
								code.add(new quad("lal",new temp(1),null,new temp(1)));
							}
							if(son.record.equals("~"))
							{
								code.add(new quad("not",new temp(1),null,new temp(1)));
							}
							else if(((String)son.record).equals("-"))
							{
								code.add(new quad("neg",new temp(1),null,new temp(1)));
							}
							else if(((String)son.record).equals("!"))
							{
								location l = new location(0,"const",0,false,false);
								l.contain = 0;
								code.add(new quad("seq",new temp(1),new temp(1),l));
							}
							code.add(new quad("store",new temp(1),null,ll));
							r.loc = ll;
						}
						
					}
					
					
				}
				record = r;
				
				
				
			}
		}
		
		return 0;
	}
}
