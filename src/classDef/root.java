package classDef;

import classes.*;

import java.util.Vector;

import core.first;
import core.symbol;

public class root
{
	public root()
	{
		child = new Vector<root>();
		record = new Object();
	};
	public Vector<root> child;
	public Object record;
	public int check() throws Exception
	{
		return 0;
	}
	
	public Object check(type t) throws Exception
	{
		return 0;
	}
	
	public static int checkconvert(type a,type b) throws Exception
	{
		//System.out.println(a.typename);
		//System.out.println(b.typename);
		if(a.typename.equals("array"))return 1;
		else if(b.typename.equals("pointer") && ((pointer)b).elementType.typename.equals("void"))return 0;
		else if(a.typename.equals("pointer") && b.typename.equals("pointer"))return checkconvert(((pointer)a).elementType,((pointer)b).elementType);
		else if(a.typename.equals("pointer") && b.typename.equals("array"))return checkconvert(((pointer)a).elementType,((array)b).elementType);
		else if(a.typename.equals("struct") && b.typename.equals("struct") )
		{
			if(((struct)a).name.equals(((struct)b).name))return 0;
		}
		else if(a.typename.equals("name") && b.typename.equals("name")) //!!!!!!!!!!!!!!!!!!
		{
			if(((name)a).str.equals(((name)b).str))return 0;
		}
		else if(a.typename.equals("function") || b.typename.equals("function"))return 1;
		else if(a.typename.equals(b.typename))return 0;
		else if(a.typename.equals("int") && b.typename.equals("char"))return 0;
		else if(a.typename.equals("char") && b.typename.equals("int"))return 0;
		else if(a.typename.equals("pointer") && (b.typename.equals("int") || b.typename.equals("char")))return 0;
		else if((a.typename.equals("int") || a.typename.equals("char")) && b.typename.equals("pointer"))return 0;
		throw new Exception();
		//return 1;
	} 
	
	public static int checkequal(type a,type b) throws Exception
	{
		//System.out.println(a.typename);
		//System.out.println(b.typename);
		if(b.typename.equals("pointer") && ((pointer)b).elementType.typename.equals("void"))return 0;
		else if(a.typename.equals("pointer") && b.typename.equals("pointer"))return checkequal(((pointer)a).elementType,((pointer)b).elementType);
		else if(a.typename.equals("pointer") && b.typename.equals("array"))return checkequal(((pointer)a).elementType,((array)b).elementType);
		else if(a.typename.equals("array") && b.typename.equals("array"))return checkequal(((array)a).elementType,((array)b).elementType);
		else if(a.typename.equals("struct") && b.typename.equals("struct") )
		{
			if(((struct)a).name.equals(((struct)b).name))return 0;
		}
		else if(a.typename.equals("name") && b.typename.equals("name")) //!!!!!!!!!!!!!!!!!!
		{
			if(((name)a).str.equals(((name)b).str))return 0;
		}
		else if(a.typename.equals("function") || b.typename.equals("function"))return 1;
		else if(a.typename.equals(b.typename))return 0;
		else if(a.typename.equals("int") && b.typename.equals("char"))return 0;
		else if(a.typename.equals("char") && b.typename.equals("int"))return 0;
		else if(a.typename.equals("pointer") && (b.typename.equals("int") || b.typename.equals("char")))return 0;
		else if((a.typename.equals("int") || a.typename.equals("char")) && b.typename.equals("pointer"))return 0;
		throw new Exception();
		//return 1;
	} 
	
	
	public static type find(String s)
	{
		type t = null;
		//System.out.println(s);
		for(int i=first.e.size()-1;i>=0;i--)
		{
			if(first.e.get(i).functable.get(symbol.symbol(s))!=null)
			{
				t = (type) first.e.get(i).functable.get(symbol.symbol(s));
				break;
			}
			else if(first.e.get(i).structtable.get(symbol.symbol(s))!=null)
			{
				t = (type) first.e.get(i).structtable.get(symbol.symbol(s));
				break;
			}
		}
		
		return t;
	}
	
	public static type find(String s,int k) //find struct
	{
		type t = null;
		//System.out.println(s);
		for(int i=first.e.size()-1;i>=0;i--)
		{
			if(first.e.get(i).structtable.get(symbol.symbol(s))!=null)
			{
				t = (type) first.e.get(i).structtable.get(symbol.symbol(s));
				break;
			}
		}
		
		return t;
	}
	
	public int checkinit() throws Exception
	{
		return 0;
	}
	
	
}