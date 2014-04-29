package classDef;

import classes.*;

import java.util.Vector;

import core.first;

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
	
	public static int checkconvert(type a,type b) throws Exception//a to b
	{
		//System.out.println(a.typename);
		//System.out.println(b.typename);
		if(a.typename.equals("name"))
		{
			if(find(((name)a).str,1)==null)throw new Exception();
			else a = find(((name)a).str,1);
		}
		if(b.typename.equals("name"))
		{
			//System.out.println(((name)b).str);
			if(find(((name)b).str,1)==null)throw new Exception();
			else b = find(((name)b).str,1);
		}
		if(a.typename.equals("array"))return 1;
		else if(a.typename.equals("pointer") && ((pointer)a).elementType.typename.equals("void"))return 0;
		else if(a.typename.equals("pointer") && b.typename.equals("pointer"))return checkconvert(((pointer)a).elementType,((pointer)b).elementType);
		else if(a.typename.equals("pointer") && b.typename.equals("array"))return checkconvert(((pointer)a).elementType,((array)b).elementType);
		else if(a.typename.equals("struct") && b.typename.equals("struct") )
		{
			if(((struct)a).name.equals(((struct)b).name))return 0;
		}
		else if(a.typename.equals("function") || b.typename.equals("function"))throw new Exception();
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
		//System.out.print("!!!");		
		//System.out.println(a.typename);
		//System.out.print("!!!");
		//System.out.println(b.typename);
		if(a.typename.equals("name"))
		{
			if(find(((name)a).str,1)==null)throw new Exception();
			else a = find(((name)a).str,1);
		}
		if(b.typename.equals("name"))
		{
			//System.out.println(((name)b).str);
			if(find(((name)b).str,1)==null)throw new Exception();
			else b = find(((name)b).str,1);
		}
		if(b.typename.equals("pointer") && ((pointer)b).elementType.typename.equals("void"))return 0;
		else if(a.typename.equals("pointer") && b.typename.equals("pointer"))return checkequal(((pointer)a).elementType,((pointer)b).elementType);
		else if(a.typename.equals("pointer") && b.typename.equals("array"))return checkequal(((pointer)a).elementType,((array)b).elementType);
		else if(a.typename.equals("array") && b.typename.equals("array"))return checkequal(((array)a).elementType,((array)b).elementType);
		else if(b.typename.equals("function") && a.typename.equals("pointer") && ((pointer)a).elementType.typename.equals("int"))return 0;
		else if(a.typename.equals("function") || b.typename.equals("function"))throw new Exception();
		else if(a.typename.equals(b.typename))return 0;
		else if(a.typename.equals("int") && b.typename.equals("char"))return 0;
		else if(a.typename.equals("char") && b.typename.equals("int"))return 0;
		else if(a.typename.equals("pointer") && (b.typename.equals("int") || b.typename.equals("char")))return 0;
		else if((a.typename.equals("int") || a.typename.equals("char")) && b.typename.equals("pointer"))return 0;
		throw new Exception();
		//return 1;
	} 
	
	
	public static type find(String s,int k) 
	{
		type t = null;
		if(k==0)
		{		
			//System.out.println(s);
			for(int i=first.F.size()-1;i>=0;i--)
			{
				if(first.getfunc(s,i)!=null)
				{
					t = (type) first.getfunc(s,i);
					break;
				}
				int j = i-first.F.size()+first.S.size();
				if(j>=0)
				{
					if(first.getstruct(s,j)!=null)//assume that S > F
					{
						//if(first.e.get(i).structtable.get(symbol.symbol(s)) instanceof returnrecord)
						//System.out.println(((struct)((returnrecord) first.e.get(i).structtable.get(symbol.symbol(s))).rtype).name);
						t = (type) first.getstruct(s,j);
						break;
					}
				}
				
			}
			
		}
		else
		{
			//System.out.println(s);
			for(int i=first.S.size()-1;i>=0;i--)
			{
				if(first.getstruct(s,i)!=null)
				{
					t = (type) first.getstruct(s,i);
					break;
				}
			}
		}
			
		return t;
	}
	
	public int checkinit() throws Exception
	{
		return 0;
	}
	
	
	
	
}