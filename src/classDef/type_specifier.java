package classDef;


import java.util.Vector;

import core.first;
import classes.*;
public class type_specifier extends root
{
	public type_specifier(){}
	@SuppressWarnings("unchecked")
	public int check() throws Exception
	{
		returnrecord r = new returnrecord();
		
		if(child.size()==1)
		{
						
			if(((String)child.get(0).record).equals("int"))
			{
				r.rtype = new Tint();
				record = r;
			}
			if(((String)child.get(0).record).equals("void"))
			{
				r.rtype = new Tvoid();
				record = r;
			}
			if(((String)child.get(0).record).equals("char"))
			{
				r.rtype = new Tchar();
				record = r;
			}
		}
		else if(child.size()>2)
		{
			//union?...mark it
			
				String s = "";
				root son = child.get(1);
				if (son.check()!=0) throw new Exception();
				
				if(son instanceof identifier)
				{
					s += (String)((returnrecord)son.record).value;
				}
				else
					s += "Legend_" + String.valueOf(first.noname++);
				
				//System.out.println(first.S.size());
				
				first.beginscope(1);
				first.Off.push(0);
				
				//inverse...
				Vector<value> vt = new Vector<value>();
				Vector<String> vs = new Vector<String>();
				
				for(int i=1+(child.size()-1)%2;i<child.size();i+=2)
				{
					if(child.get(i).check()!=0)throw new Exception();
					type t = ((returnrecord)child.get(i).record).rtype;
					if(child.get(i+1).check()!=0)throw new Exception();
					Vector<String> v = (Vector<String>)child.get(i+1).record;
					for(int j=0;j<v.size();j++)if(first.getfunc(v.get(j))!=null)throw new Exception();
					Vector<pair> p = (Vector<pair>)child.get(i+1).check(t);
					for(int j=0;j<p.size();j++)
					{
						value val = p.get(j).val;
						val.loc = new location();
						if(val.typ.typename.equals("array"))
						{
							val.loc.offset = first.Off.lastElement()+val.typ.size;
							first.Off.setElementAt(first.Off.lastElement()+val.typ.size+4, first.Off.size()-1);
						}
						else
						{
							val.loc.offset = first.Off.lastElement();
							first.Off.setElementAt(first.Off.lastElement()+val.typ.size, first.Off.size()-1);
						}
						
						vt.add(val);
						vs.add(p.get(j).str);
						first.putfunc(p.get(j).str,p.get(j).val);
					}
									
				}
				

				first.endscope(1);
			
				if (first.getstruct(s) != null)throw new Exception();
				type struct = new struct(s, vt, vs);
				if(child.get(0).record.equals("union"))((struct)struct).isunion = true;
				
				//System.out.println("%%%");
				//System.out.println(s);
				first.Off.pop();
			
				first.putstruct(s, new value(struct,new location()));
				
				

				r.rtype = struct;
				record = r;
				
				
		}
		else
		{
				if (child.get(1).check()!=0) throw new Exception();
				String s = (String)((returnrecord)child.get(1).record).value;
				type struct = find(s,1).typ;
				
				//System.out.println(first.S.size());
				if (struct == null)struct = new name(s);
				
				
				r.rtype = struct;
				record = r;

				
				
		}
		return 0;
	}
}
