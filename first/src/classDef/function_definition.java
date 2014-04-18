package classDef;

import java.util.Vector;

import core.env;
import core.first;
import core.symbol;
import classes.function;
import classes.type;


public class function_definition extends root
{
	public function_definition(){}
	@SuppressWarnings("unchecked")
	public int check() throws Exception
	{
		if (child.get(0).check()!=0) throw new Exception();
		type returnType = ((returnrecord)child.get(0).record).rtype;

		root son = child.get(1);
		if (son.check()!=0)throw new Exception();
		pair p = (pair)son.check(returnType);
		returnType = p.typ;
		String functionName = p.str;
		if(returnType.typename.equals("name"))
		{
			returnType = find((String)((returnrecord)child.get(0).record).value,1);
			if(returnType == null)return 1;
		}
		
		
		
		
		Vector<type> argumentType = new Vector<type>();
		int scope = 0;
		if (child.size() == 4)
		{
			son = child.get(2);
			if (son.check()!=0) throw new Exception();
			argumentType = (Vector<type>)son.record;
			scope = 1;
		}
		if (first.e.get(first.e.size()-1-scope).functable.get(symbol.symbol(functionName))!=null) throw new Exception();
		type t = new function(returnType, argumentType, functionName);
		first.e.get(first.e.size()-1-scope).functable.put(symbol.symbol(functionName), t);
		
		//scope?
		if(child.size()==3)
		{
			env newe = new env();
			first.e.add(newe);
		}
		
		
		first.func = (function)t;
		
		
	
		if (child.get(child.size()-1).check()!=0) throw new Exception();
		
		first.func = null;
		
		first.e.remove(first.e.size()-1);
		
		return 0;
	}
}
