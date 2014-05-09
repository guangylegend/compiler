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
				code.add(new quad("jal",null,null,l));
			}
			else
			{
				location l = new location();
				l.contain = first.lend.lastElement();
				code.add(new quad("jal",null,null,l));
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
				code.add(new quad("storereturn",null,null,ll));
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
					location ll = new location();
					ll.contain = first.func.name;
					code.add(new quad("storereturn",l,null,ll));
				}
				else
				{
					location ll = new location();
					ll.contain = first.func.name;
					code.add(new quad("storereturn",((returnrecord)child.get(1).record).loc,null,ll));
				}
				location l = new location();
				l.contain = first.func.name;
				code.add(new quad("return",null,null,l));
			}
			
		}
		return 0;
	}
}
