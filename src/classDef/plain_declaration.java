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

				
					if(first.getfunc(s) == null)
					{
						if(t.typ instanceof struct || t.typ instanceof union)
						{
							t.loc = new location();
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
							t.loc = new location(l);
							if(t.typ instanceof array) first.Off.setElementAt(first.Off.lastElement()+4, first.Off.size()-1);
							else first.Off.setElementAt(first.Off.lastElement()+t.typ.size, first.Off.size()-1);
							first.putfunc(s,t);
						}
						
					}
					else throw new Exception();
				
				record = t;
		return 0;
	}
	
}
