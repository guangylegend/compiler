package classDef;

import core.first;
import classes.Tint;


public class iteration_statement extends root
{
	public iteration_statement(){}
	public int check() throws Exception
	{
		root son = child.get(0);
		
		if (((String)son.record).equals("while"))
		{
			
			location lline = new location();
			lline.contain = first.Label;
			first.lline.push(first.Label);
			first.Label++;
			location lend = new location();
			
			
			
			son = child.get(1);
			if (son.check()!=0) throw new Exception();
			if (checkconvert(((returnrecord)son.record).rtype,new Tint())!=0) throw new Exception();

			lend.contain = first.Label;
			first.lend.push(first.Label);
			first.Label++;
			code.add(new quad("label",null,null,lend));
			
			code.addAll(son.code);
			if(((returnrecord)son.record).constant)
			{
				if(((boolean)((returnrecord)son.record).value)!=true)code.add(new quad("b",null,null,lline));
			}
			else
			{
				if(first.infinity)
				{
					if(((returnrecord)son.record).loc.address)
					{
						code.add(new quad("lal",((returnrecord)son.record).loc,null,((returnrecord)son.record).loc));
					}
					code.add(new quad("beqz",((returnrecord)son.record).loc,null,lline));
				}
				else
				{
					if(((returnrecord)son.record).loc.address)
					{
						code.add(new quad("load",new temp(1),null,((returnrecord)son.record).loc));
						code.add(new quad("lal",new temp(1),null,new temp(1)));
					}
					else
					{
						code.add(new quad("load",new temp(1),null,((returnrecord)son.record).loc));
					}
					code.add(new quad("beqz",new temp(1),null,lline));
				}
				
			}
			
			
			
			first.loop++;
			
			if (child.get(2).check()!=0) throw new Exception();
			
			code.addAll(child.get(2).code);
			code.add(new quad("b",null,null,lend));
			code.add(new quad("label",null,null,lline));
			
			first.loop--;
			
			first.lline.pop();
			first.lend.pop();
 		}
		else
		{
			location lend = new location();
			location lline = new location();
			lline.contain = first.Label;
			first.lline.push(first.Label);
			first.Label++;
			location lstart = new location();
			lstart.contain = first.Label;
			first.Label++;
			
			for(int i=1;i<4;i++)
			{
				if(child.get(i).check()!=0)throw new Exception();
			}
			if (checkconvert(((returnrecord)child.get(2).record).rtype,new Tint())!=0) throw new Exception();
			
			first.loop++;
			
			code.addAll(child.get(1).code);
			
			code.add(new quad("label",null,null,lstart));
			
			
			code.addAll(child.get(2).code);
			if(((returnrecord)child.get(2).record).constant)
			{
				if(((boolean)((returnrecord)child.get(2).record).value)!=true)code.add(new quad("b",null,null,lline));
			}
			else
			{
				if(first.infinity)
				{
					if(((returnrecord)child.get(2).record).loc.address)
					{
						code.add(new quad("lal",((returnrecord)child.get(2).record).loc,null,((returnrecord)child.get(2).record).loc));
					}					
					code.add(new quad("beqz",((returnrecord)child.get(2).record).loc,null,lline));
				}
				else
				{
					if(((returnrecord)child.get(2).record).loc.address)
					{
						code.add(new quad("load",new temp(1),null,((returnrecord)child.get(2).record).loc));
						code.add(new quad("lal",new temp(1),null,new temp(1)));
					}
					else
					{
						code.add(new quad("load",new temp(1),null,((returnrecord)child.get(2).record).loc));
					}
					
					code.add(new quad("beqz",new temp(1),null,lline));
				}
			}
			
			if(child.size()==5)
			{
				if (child.get(4).check()!=0) throw new Exception();	
				code.addAll(child.get(4).code);
			}
					
			lend.contain = first.Label;
			first.lend.push(first.Label);
			first.Label++;
			code.add(new quad("label",null,null,lend));

			
			code.addAll(child.get(3).code);
			
			code.add(new quad("b",null,null,lstart));
			code.add(new quad("label",null,null,lline));
			
			first.loop--;
			
			first.lline.pop();
			first.lend.pop();
 		}
		
		return 0;
	}
}
