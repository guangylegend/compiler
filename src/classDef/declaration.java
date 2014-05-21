package classDef;

import java.util.Vector;

import classes.Tchar;
import classes.Tint;
import classes.Tvoid;
import classes.array;
import classes.struct;
import classes.type;
import core.*;

public class declaration extends root
{
	public declaration(){}
	@SuppressWarnings("unchecked")
	public int check() throws Exception
	{
		if(child.size()==1)
		{
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tvoid)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tchar)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tint)
			{
				throw new Exception();
				//return 1;
			}
			code = null;

		}
		else
		{
			Vector<quad> r = new Vector<quad>();
			
			if(child.get(0).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			if(((returnrecord)child.get(0).record).rtype instanceof Tvoid)
			{
				throw new Exception();
				//return 1;
			}
			//...........
			if(child.get(1).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			
			Vector<pair> vv = (Vector<pair>)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			Vector<location> vl = new Vector<location>();
			
			for(int i=0;i<vv.size();i++)
			{
				if(first.getfunc(vv.get(i).str)!=null)throw new Exception();
				else 
				{
					value val = vv.get(i).val;
					val.loc = new location();
					if(val.typ.typename.equals("array")||val.typ.typename.equals("struct"))
					{
						if(first.func==null)
						{
							val.loc.global = true;
							val.loc.type = "memory";
							val.loc.offset = first.globalsize;
							first.globalsize+=val.typ.size;
						}
						else
						{
							val.loc.global = false;
							val.loc.type = "memory";
							val.loc.offset = first.Off.lastElement();
							first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
						}
						
						
						if(val.typ.typename.equals("array"))
						{
							
							if(first.infinity)
							{
								//-----------------------------------------------//	
								location tmp = new temp();
								r.add(new quad("la",tmp,null,val.loc));
								if(first.func==null)
								{
									
									location l = new location(first.globalsize,"memory",0,true,false);
									r.add(new quad("store",tmp,null,l));
									first.globalsize+=4;
									val.loc =  l;
								}
								else
								{
									tmp.offset = first.Off.lastElement();
									tmp.global = false;
									first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
									val.loc = tmp;
								}
								
								//-----------------------------------------------//
							}
							else
							{
								//-----------------------------------------------//		
								r.add(new quad("la",new temp(1),null,val.loc));
								location ll = new location();
								if(first.func==null)
								{
									ll = new location(first.globalsize,"memory",0,false,false);
									ll.global = true;
									first.globalsize+=4;
								}
								else
								{
									ll = new location(first.Off.lastElement(),"memory",0,false,false);
									ll.global = false;
									first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
								}
								val.loc = ll;
								r.add(new quad("sw",new temp(1),null,ll));
								//-----------------------------------------------//
							}
							
						}
						else vl.add(val.loc);
						
					}
					else
					{
						if(val.typ.typename.equals("pointer"))
						{
							if(first.func==null)
							{
								val.loc.global = true;
								val.loc.type = "memory";
								val.loc.offset = first.globalsize;
								first.globalsize+=val.typ.size;
							}
							else
							{
								if(first.infinity)
								{
									val.loc = new temp();
									val.loc.global = false;
									val.loc.offset = first.Off.lastElement();
									first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
								}
								else
								{
									val.loc.global = false;
									val.loc.type = "memory";
									val.loc.offset = first.Off.lastElement();
									first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
								}
								
								
							}
							
							
							//-------------------------------------------//
							if(first.infinity)
							{
								vl.add(val.loc);
							}
							else
							{
								location l = new temp(1);
								r.add(new quad("la",l,null,val.loc));
								r.add(new quad("sw",l,null,val.loc));
								vl.add(val.loc);
							}
							
							//-------------------------------------------//
							
						}
						else
						{
							
							//-------------------------------------------//
							if(first.func==null)
							{
								val.loc.global = true;
								val.loc.type = "memory";
								val.loc.offset = first.globalsize;
								first.globalsize+=val.typ.size;
							}
							else
							{
								if(first.infinity)
								{
									val.loc = new temp();
									val.loc.offset = first.Off.lastElement();
									val.loc.global = false;
									first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
								}
								else
								{
									val.loc.global = false;
									val.loc.type = "memory";
									val.loc.offset = first.Off.lastElement();
									first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
								}
								
							
							}
							vl.add(val.loc);
							//-------------------------------------------//
						}
						
					}
												
					first.putfunc(vv.get(i).str,val);
				}

			}
			if(child.get(1).checkinit()!=0)
			{
				throw new Exception();
			}
			Vector<Object> vo = (Vector<Object>)child.get(1).record;
			
			
			for(int i=0;i<vv.size();i++)
			{
				type newt = vv.get(i).val.typ;
				Object t = vo.get(i);
				if(t!=null)
				{
					if(t instanceof nconst)
					{
						if(!checkequal(newt,((nconst)t).typ))throw new Exception();
						location l = new location(0,"const",0,false,false);
						l.contain = ((nconst)t).value;
						if(((nconst)t).typ instanceof array)
						{
							int k = ((nconst)t).typ.size;
							for(int j=0;j<k/4;j++)
							{
								if(first.infinity)   //maybe no this data
								{
									location t1 = new location(0,"const",0,false,false);
									t1.contain = ((Vector<Object>)((nconst)t).value).get(j);
									location t2 = new location(vl.get(i).offset+j*4,"memory",0,false,false);
									if(first.func==null)t2.global = true;
									else t2.global = false;
									r.add(new quad("li",t2,null,t1));
								}
								else
								{
									location t1 = new location(0,"const",0,false,false);
									t1.contain = ((Vector<Object>)((nconst)t).value).get(j);
									location t2 = new location(vl.get(i).offset+j*4,"memory",0,false,false);
									if(first.func==null)t2.global = true;
									else t2.global = false;
									r.add(new quad("li",t2,null,t1));
								}

								
							}
							
							//save array
						}
						else
						{
							if(first.infinity)
							{
								if(l.contain instanceof String)r.add(new quad("la",vl.get(i),null,l));
								else
								{
									if(vl.get(i).global)
									{
										location tmp = new temp();			//spill this?
										tmp.global = false;
										r.add(new quad("li",tmp,null,l));
										r.add(new quad("store",tmp,null,vl.get(i)));
									}
									else r.add(new quad("li",vl.get(i),null,l));
									
								}
							}
							else
							{
								if(l.contain instanceof String)r.add(new quad("la",new temp(1),null,l));
								else r.add(new quad("li",new temp(1),null,l));
								r.add(new quad("sw",new temp(1),null,vl.get(i)));
							}

							
						}
						
						
					}
					else
					{
						if(first.func==null)throw new Exception();
						if(!checkequal(newt,((value)t).typ))throw new Exception();
						else if(((value)t).typ instanceof struct)
						{
							int k = ((value)t).typ.size;
							for(int j=0;j<=k/4;j++)
							{
								if(first.infinity)
								{
									if(((value)t).loc.address)
									{
										location l = new location(0,"const",0,false,false);
										l.contain = j*4;
										r.add(new quad("+",((value)t).loc,((value)t).loc,l));
										location tmp = new temp();
										tmp.offset = first.Off.lastElement();
										tmp.global = false;
										first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
										r.add(new quad("lal",tmp,null,((value)t).loc));
										location t2 = new location(vl.get(i).offset+j*4,"memory",0,false,false);
										r.add(new quad("store",tmp,null,t2));
									}
									else
									{
										location t1 = new location(((value)t).loc.offset+j*4,"memory",0,false,false);
										if(first.func==null)t1.global = true;
										else t1.global = false;
										location t2 = new location(vl.get(i).offset+j*4,"memory",0,false,false);
										if(first.func==null)t2.global = true;
										else t2.global = false;
										location tmp = new temp();
										tmp.offset = first.Off.lastElement();
										tmp.global = false;
										first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
										r.add(new quad("load",tmp,null,t1));
										r.add(new quad("store",tmp,null,t2));
									}
									
								}
								else
								{
									location t1 = new location(((value)t).loc.offset+j*4,"memory",0,false,false);
									if(first.func==null)t1.global = true;
									else t1.global = false;
									location t2 = new location(vl.get(i).offset+j*4,"memory",0,false,false);
									if(first.func==null)t2.global = true;
									else t2.global = false;
									location tmp = new temp(1);
									r.add(new quad("load",tmp,null,t1));
									r.add(new quad("store",tmp,null,t2));
								}
								
							}
							
							//save struct
						}
						
						
						//--------------------------------------------------------//
						else
						{
							if(first.infinity)
							{
								location tmp = new temp();
								tmp.offset = first.Off.lastElement();
								tmp.global = false;
								first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
								if(((value)t).loc.address)
								{
									r.add(new quad("lal",tmp,null,((value)t).loc));
									r.add(new quad("move",vl.get(i),null,tmp));
								}
								else r.add(new quad("move",vl.get(i),null,((value)t).loc));
								
							}
							else
							{
								location tmp = new temp(1);
								r.add(new quad("load",tmp,null,((value)t).loc));
								if(((value)t).loc.address)r.add(new quad("lal",tmp,null,tmp));
								r.add(new quad("store",tmp,null,vl.get(i)));
							}
								
							
						}
						//--------------------------------------------------------//
						
					}
					
					
				}
				
			}
			for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
			code.addAll(r);
			
		}
		
		
		return 0;
	}
}
