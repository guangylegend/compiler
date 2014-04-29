package classDef;

import java.util.Vector;

import classes.Tchar;
import classes.Tint;
import classes.Tvoid;
import classes.type;
import core.*;

public class declaration extends root
{
	public declaration(){}
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
			//first.e.lastElement().structtable.put(symbol.symbol(((struct)((returnrecord)child.get(0).record).rtype).name), child.get(0).record);
		}
		else
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
			//...........
			if(child.get(1).check()!=0)
			{
				throw new Exception();
				//return 1;
			}
			
			@SuppressWarnings("unchecked")
			Vector<pair> vv = (Vector<pair>)child.get(1).check(((returnrecord)child.get(0).record).rtype);
			
			for(int i=0;i<vv.size();i++)
			{
				if(first.getfunc(vv.get(i).str)!=null)throw new Exception();
				else first.putfunc(vv.get(i).str,vv.get(i).typ);

			}
			if(child.get(1).checkinit()!=0)
			{
				throw new Exception();
				//return 1;
			}
			@SuppressWarnings("unchecked")
			Vector<pair> v = (Vector<pair>)child.get(1).record;
			for(int i=0;i<v.size();i++)
			{
				type newt = vv.get(i).typ;
				type t = v.get(i).typ;
				if(t!=null)
				{
					if(checkequal(newt,t)!=0)throw new Exception();
				}
				
				
			}
		}
		return 0;
	}
}
