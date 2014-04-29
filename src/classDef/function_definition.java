package classDef;

import java.util.Vector;

import core.first;
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
		if (first.getfunc(functionName,first.F.size()-1-scope)!=null) throw new Exception();
		type t = new function(returnType, argumentType, functionName);
		first.putfunc(functionName, t,first.F.size()-1-scope);
		
		//scope?
		if(child.size()==3)
		{
			first.beginscope(0);
		}
		
		
		first.func = (function)t;
		
		
	
		if (child.get(child.size()-1).check()!=0) throw new Exception();
		
		first.func = null;
		
		first.endscope(0);
		
		return 0;
	}
}
