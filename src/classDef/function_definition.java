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
		returnType = p.val.typ;
		String functionName = p.str;
		
		first.Off.push(0);
		
		location l = new location();
		l.contain = functionName;
		code.add(new quad("func",null,null,l));
		
		if(returnType.typename.equals("name"))
		{
			returnType = find((String)((returnrecord)child.get(0).record).value,1).typ;
			if(returnType == null)throw new Exception();
		}
		
		
		Vector<value> argument = new Vector<value>();
		int scope = 0;
		if (child.size() == 4)
		{
			son = child.get(2);
			if (son.check()!=0) throw new Exception();
			argument = (Vector<value>)son.record;
			scope = 1;
			code.addAll(son.code);
		}
		if (first.getfunc(functionName,first.F.size()-1-scope)!=null) throw new Exception();
		type t = new function(returnType, argument, functionName);
		first.putfunc(functionName, new value(t,null),first.F.size()-1-scope);
		
		if(child.size()==3)
		{
			first.beginscope(0);
		}
		
		
		first.func = (function)t;
		
		
	
		if (child.get(child.size()-1).check()!=0) throw new Exception();
		code.addAll(child.get(child.size()-1).code);
		
		first.func = null;
		
		t.size = first.Off.lastElement()+4;  //for $ra
		first.putfunc(functionName, new value(t,null),first.F.size()-1-scope);
		//System.out.println(functionName);
		//System.out.println(t.size);
		if(!code.lastElement().operator.equals("return"))
		{
			location ll = new location();
			ll.contain = functionName;
			code.add(new quad("return",null,null,ll));
		}
		
		code.add(new quad("funcend",null,null,l));
		
		first.endscope(0);
		first.Off.pop();
		
		return 0;
	}
}
