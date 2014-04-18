package classDef;



import classes.struct;
import classes.type;
import classes.union;
import core.first;
import core.symbol;

public class plain_declaration extends root
{
	public plain_declaration(){}
	public int check() throws Exception
	{
			if(child.get(0).check()!=0)throw new Exception();
			if(child.get(0).child.size()!=1)
			{
				first.e.lastElement().structtable.put(symbol.symbol(((struct)((returnrecord)child.get(0).record).rtype).name), child.get(0).record);
			}
			if(child.get(1).check()!=0)throw new Exception();
			
			pair vv = (pair)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			
			type t = vv.typ;
			String s = vv.str;

				if(t instanceof struct || t instanceof union)
				{
					if(first.e.lastElement().structtable.get(symbol.symbol(s)) == null)
					{
						first.e.lastElement().structtable.put(symbol.symbol(s),t );
					}
					else throw new Exception();
				}
				else
				{
					if(first.e.lastElement().functable.get(symbol.symbol(s)) == null)
					{
						first.e.lastElement().functable.put(symbol.symbol(s),t);
					}
					else throw new Exception();
				}
				
				record = t;
		return 0;
	}
	
}
