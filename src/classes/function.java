package classes;

import java.util.Vector;

import classDef.value;

public final class function extends type { 
	public function(type t,Vector<value> a,String n)
	{
		returnType = t;
		argument = a;
		name = n;
		typename = "function";
		size = 0;
	};
	public Vector<value> argument; 
	public type returnType; 
	public String name;
} 
