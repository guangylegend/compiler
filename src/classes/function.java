package classes;

import java.util.Vector;

public final class function extends type { 
	public function(type t,Vector<type> a,String n)
	{
		returnType = t;
		argumentType = a;
		name = n;
		typename = "function";
	};
	public Vector<type> argumentType; 
	public type returnType; 
	public String name;
} 
