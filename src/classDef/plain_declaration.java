package classDef;
import classes.array;
import classes.struct;
import classes.union;
import core.first;

public class plain_declaration extends root
{
	public plain_declaration(){}
	public int check() throws Exception
	{
			if(child.get(0).check()!=0)throw new Exception();

			if(child.get(1).check()!=0)throw new Exception();
			
			for(int i=0;i<child.size();i++)code.addAll(child.get(i).code);
			
			pair vv = (pair)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			
			value t = vv.val;
			String s = vv.str;

				/*if(t.typ instanceof struct || t.typ instanceof union)
				{
					if(first.getstruct(s) == null)
					{
						t.loc.offset = first.Off.lastElement();
						if(first.func==null)t.loc.global = true;
						else t.loc.global = false;
						first.putstruct(s,t);
						first.Off.setElementAt(first.Off.lastElement()+t.typ.size, first.Off.size()-1);
					}
					else throw new Exception();
				}*/
					if(first.getfunc(s) == null)
					{
						if(t.typ instanceof struct || t.typ instanceof union || t.typ instanceof array)
						{
							if(t.loc==null)t.loc = new location();
							t.loc.offset = first.Off.lastElement();
							t.loc.type = "memory";
							t.loc.global = false;
							first.putfunc(s,t);
							first.Off.setElementAt(first.Off.lastElement()+t.typ.size, first.Off.size()-1);
						}
						else
						{
							location l = new location();
							l.global = false;
							l.type = "memory";
							l.offset = first.Off.lastElement();
							t.loc = new temp();	
							t.loc.offset = first.Off.lastElement();
							t.loc.global = false;
							//unknown size?
							first.Off.setElementAt(first.Off.lastElement()+t.typ.size, first.Off.size()-1);
							first.putfunc(s,t);
							code.add(new quad("load",l,null,t.loc));
						}
						
					}
					else throw new Exception();
				
				record = t;
		return 0;
	}
	
}
