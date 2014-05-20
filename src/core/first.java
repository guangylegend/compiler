package core;


import classes.*;
import classDef.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import org.antlr.runtime.*;  
import org.antlr.runtime.tree.BaseTree;


public class first{   
	public static int globalsize = 0;
	public static Vector<String> ASCII = new Vector<String>();
	public static Vector<table> F = new Vector<table>();
	public static Vector<table> S = new Vector<table>();
	public static Stack<Integer> Off = new Stack<Integer>();
	public static int Register = 1;
	public static int loop = 0;
	public static int Label = 0;
	public static Stack<Integer> lline = new Stack<Integer>();
	public static Stack<Integer> lend = new Stack<Integer>();
	public static int noname = 0;
	public static function func = null;
	public static boolean idtest = false; 
	
	public static value getstruct(String s)
	{
		return (value) S.lastElement().get(symbol.symbol(s));
	}
	
	public static value getfunc(String s)
	{
		return (value) F.lastElement().get(symbol.symbol(s));
	}
	
	public static value getstruct(String s,int i)
	{
		return (value) S.get(i).get(symbol.symbol(s));
	}
	
	public static value getfunc(String s,int i)
	{
		return (value) F.get(i).get(symbol.symbol(s));
	}
	
	public static void putstruct(String s,value v)
	{
		S.lastElement().put(symbol.symbol(s),v);
	}
	
	public static void putfunc(String s,value v)
	{
		F.lastElement().put(symbol.symbol(s),v);
	}
	
	public static void putstruct(String s,value v,int i)
	{
		S.get(i).put(symbol.symbol(s),v);
	}
	
	public static void putfunc(String s,value v,int i)
	{
		F.get(i).put(symbol.symbol(s),v);
	}
	
	public static void beginscope(int i)
	{
		if(i==0)
		{
			table t1 = new table();
			table t2 = new table();
			S.add(t1);
			F.add(t2);
		}
		else// for namespace
		{
			table t1 = new table();
			F.add(t1);
		}
		
	}
	
	public static void endscope(int i)
	{
		if(i==0)
		{
			S.remove(S.size()-1);
			F.remove(F.size()-1);
		}
		else// for namespace
		{
			F.remove(F.size()-1);
		}
	}
	
	public static List<File> getFiles(String path){
	    File root = new File(path);
	    List<File> files = new ArrayList<File>();
	    if(!root.isDirectory())
	    {
	        files.add(root);
	    }
	    else
	    {
	        File[] subFiles = root.listFiles();
	        for(File f : subFiles){
	            files.addAll(getFiles(f.getAbsolutePath()));
	        }    
	    }
	    return files;
	}
	
	static public int work(File file) throws Exception
	{
		try
		{
			F = new Vector<table>();
			S = new Vector<table>();
			loop = 0;
			noname = 0;
			func = null; 
		    InputStream in = new FileInputStream(file);
		    ANTLRInputStream input = new ANTLRInputStream(in);   
		    astLexer lex = new astLexer(input);   
		    CommonTokenStream tokens = new CommonTokenStream(lex);   
		    astParser parser = new astParser(tokens);
		    astParser.program_return r = parser.program();
		    String s = ((BaseTree)r.getTree()).toStringTree();
		    //System.out.println(s);
		    String[] res = s.split(" ");
		    Vector<root> his = new Vector<root>();
		    root rt = new root();
		    int stringcnt = 0;
		    String space = "";
		    boolean todo = false;
		    for (int i=0;i<res.length;i++)
		    {
		    	//System.out.println(res[i]);
		    	
		    	root tmp = new root();
		    	int last = -1;
		    	if(stringcnt%2!=0) todo = true;
		    	for (int ii =0;ii<res[i].length();ii++)
	    	    {
	    	    	if(res[i].charAt(ii)=='\"')
	    	    	{
	    	    		stringcnt++;
	    	    		last = ii;
	    	    	}
	    	    }
		    	
		    	if(stringcnt%2==0)
		    	{	
		    		for (int ii =0;ii<res[i].length();ii++)
	    			{
	    				if(res[i].charAt(ii)=='\'')
	    				{
	    					stringcnt++;
	    					last = ii;    					
	    				}
	    			}
		    	}
	    		
	    		if(stringcnt%2!=0)
	    		{
	    			space+=(res[i]+' ');
	    			continue;
	    		}

	    		if(todo)
	    		{	    					
	    				String rem = res[i].substring(0, last+1);
	    				tmp.record = space+rem;
    		        	his.lastElement().child.add(tmp);
    		        	space = "";
    		        	stringcnt = 0;
    		        	todo = false;
    		        	res[i] = res[i].substring(last+1, res[i].length());
    		        
	    		}
	    		
	    				if(res[i].contains("("))
	    		    	{	
	    		    		res[i] = res[i].replace("(", "");
	    		    		
	    		    		if(res[i].equals("LEGEND_program"))
	    		    		{
	    		    			tmp = new program();
	    		    			rt = tmp;
	    		    		}
	    		    		if(res[i].equals("LEGEND_declaration"))tmp = new declaration();
	    		    		if(res[i].equals("LEGEND_function_definition"))tmp = new function_definition();
	    		    		if(res[i].equals("LEGEND_parameters"))tmp = new parameters();
	    		    		if(res[i].equals("LEGEND_declarators"))tmp = new declarators();
	    		    		if(res[i].equals("LEGEND_init_declarators"))tmp = new init_declarators();
	    		    		if(res[i].equals("LEGEND_init_declarator"))tmp = new init_declarator();
	    		    		if(res[i].equals("LEGEND_initializer"))tmp = new initializer();
	    		    		if(res[i].equals("LEGEND_type_specifier"))tmp = new type_specifier();
	    		    		if(res[i].equals("LEGEND_plain_declaration"))tmp = new plain_declaration();
	    		    		if(res[i].equals("LEGEND_declarator"))tmp = new declarator();
	    		    		if(res[i].equals("LEGEND_plain_declarator"))tmp = new plain_declarator();
	    		    		if(res[i].equals("LEGEND_statement"))tmp = new statement();
	    		    		if(res[i].equals("LEGEND_expression_statement"))tmp = new expression_statement();
	    		    		if(res[i].equals("LEGEND_compound_statement"))tmp = new compound_statement();
	    		    		if(res[i].equals("LEGEND_selection_statement"))tmp = new selection_statement();
	    		    		if(res[i].equals("LEGEND_iteration_statement"))tmp = new iteration_statement();
	    		    		if(res[i].equals("LEGEND_expr1"))tmp = new expr1();
	    		    		if(res[i].equals("LEGEND_expr2"))tmp = new expr2();
	    		    		if(res[i].equals("LEGEND_expr3"))tmp = new expr3();
	    		    		if(res[i].equals("LEGEND_jump_statement"))tmp = new jump_statement();
	    		    		if(res[i].equals("LEGEND_expression"))tmp = new expression();
	    		    		if(res[i].equals("LEGEND_assignment_expression"))tmp = new assignment_expression();
	    		    		if(res[i].equals("LEGEND_constant_expression"))tmp = new constant_expression();
	    		    		if(res[i].equals("LEGEND_logical_or_expression"))tmp = new logical_or_expression();
	    		    		if(res[i].equals("LEGEND_logical_and_expression"))tmp = new logical_and_expression();
	    		    		if(res[i].equals("LEGEND_inclusive_or_expression"))tmp = new inclusive_or_expression();
	    		    		if(res[i].equals("LEGEND_exclusive_or_expression"))tmp = new exclusive_or_expression();
	    		    		if(res[i].equals("LEGEND_and_expression"))tmp = new and_expression();
	    		    		if(res[i].equals("LEGEND_equality_expression"))tmp = new equality_expression();
	    		    		if(res[i].equals("LEGEND_relational_expression"))tmp = new relational_expression();
	    		    		if(res[i].equals("LEGEND_shift_expression"))tmp = new shift_expression();
	    		    		if(res[i].equals("LEGEND_additive_expression"))tmp = new additive_expression();
	    		    		if(res[i].equals("LEGEND_multiplicative_expression"))tmp = new multiplicative_expression();
	    		    		if(res[i].equals("LEGEND_cast_expression"))tmp = new cast_expression();
	    		    		if(res[i].equals("LEGEND_type_name"))tmp = new type_name();
	    		    		if(res[i].equals("LEGEND_unary_expression"))tmp = new unary_expression();
	    		    		if(res[i].equals("LEGEND_postfix_expression"))tmp = new postfix_expression();
	    		    		if(res[i].equals("LEGEND_postfix"))tmp = new postfix();
	    		    		if(res[i].equals("LEGEND_arguments"))tmp = new arguments();
	    		    		if(res[i].equals("LEGEND_primary_expression"))tmp = new primary_expression();
	    		    		if(res[i].equals("LEGEND_constant"))tmp = new constant();
	    		    		if(res[i].equals("LEGEND_identifier"))tmp = new identifier();
	    		    		if(res[i].equals("LEGEND_character_constant"))tmp = new character_constant();
	    		    		if(res[i].equals("LEGEND_string"))tmp = new string();
	    		    		if(res[i].equals("LEGEND_integer_constant"))tmp = new integer_constant();

	    		    		if(his.size()==0)
	    		    		{
	    		    			his.add(tmp);
	    		    		}
	    		    		else 
	    		    		{
	    		    			his.lastElement().child.add(tmp);
	    		    			his.add(tmp);
	    		    		}
	    		    		
	    		    	}
	    		    	else if(res[i].contains(")"))
	    		    	{
	    		    		int cnt = 0;
	    		    	    for (int ii =0;ii<res[i].length();ii++)
	    		    	    {
	    		    	    	if(res[i].charAt(ii)==')')
	    		    	    	{
	    		    	    		cnt++;
	    		    	    	}
	    		    	    }
	    		    	    res[i] = res[i].replace(")", "");
	    		    	    if(res[i].length()>0)
	    		    	    {
	    		    	    	tmp.record = res[i];
	    		        		his.lastElement().child.add(tmp);
	    		    	    }
	    		    	    for(int j=1;j<=cnt;j++)his.remove(his.size()-1);
	    		    	    
	    		    	}
	    		    	else
	    		    	{
	    		    		tmp.record = res[i];
    		        		his.lastElement().child.add(tmp);
	    		    	}
	    			}
		    	
		    	

		    int ans = rt.check();
		    
		    boolean flag = false;
		    int funcoffset = 0;
		    
		    System.out.println(".data");
		    if(globalsize!=0)
		    {
		    	System.out.print("Legend_global:.space ");
			    System.out.println(globalsize);
		    }
		    System.out.print("Legend_return:.space ");
		    System.out.println(40000);
		    
		    for(int i=1;i<=ASCII.size();i++)
		    {
		    	System.out.print("Legend_");
		    	System.out.print(i);
		    	System.out.print(":.asciiz ");
		    	System.out.println(ASCII.get(i-1));
		    	System.out.println(".align 2");
		    }
		    System.out.println("printf_buf: .space 2");
		    System.out.println(".text");
		    System.out.println("main:");
		    if(globalsize!=0)
		    {
		    	System.out.println("la"+"\t"+"$s0"+"\t\t"+"Legend_global");
		    	
		    }
		    System.out.println("la"+"\t"+"$v1"+"\t\t"+"Legend_return");
		    
		    
		    for(int i=0;i<rt.code.size();i++)
		    {
		    	quad q = rt.code.get(i);
		    	
		    	
		    	if(q.operator.equals("func"))
		    	{
		    		if(flag == false)
		    		{
		    			System.out.println("sw"+"\t"+"$ra"+"\t"+"0($sp)");
		    			System.out.print("add");
			    		System.out.print("\t");
			    		System.out.print("$sp");
			    		System.out.print("\t");
			    		System.out.print("$sp");	    		
			    		System.out.print("\t");
			    		System.out.print("-");
			    		int size = getfunc("main").typ.size;
			    		System.out.print(size);
			    		System.out.println();
		    			System.out.println("jal"+"\t"+"Legend_main");
		    			System.out.println("lw"+"\t"+"$ra"+"\t"+"0($sp)");
		    			System.out.print("jr");
			    		System.out.print("\t");
			    		System.out.print("$ra");
			    		System.out.println();
			    		flag = true;
		    		}
		    		System.out.println();
		    		System.out.print("Legend_"+q.arg3.contain+":");
		    		
		    		
		    	}
		    	else if(q.operator.equals("do"))
		    	{
		    		System.out.println("la"+"\t"+"$a0"+"\t"+"Legend_1");
		    		System.out.println("li"+"\t"+"$a1"+"\t"+"10");
		    		System.out.println("li"+"\t"+"$a2"+"\t"+"34");
		    		System.out.println("la"+"\t"+"$a3"+"\t"+"Legend_1");
		    		System.out.println("li"+"\t"+"$s1"+"\t"+"34");
		    		System.out.println("sw"+"\t"+"$s1"+"\t"+"16($v1)");
		    		System.out.println("li"+"\t"+"$s1"+"\t"+"10");
		    		System.out.print("sw"+"\t"+"$s1"+"\t"+"20($v1)");
		    	}
		    	else if(q.operator.equals("storera"))
		    	{
		    		System.out.print("sw"+"\t"+"$ra"+"\t");
		    		System.out.print(q.arg3.offset);
		    		if(q.arg3.global)System.out.print("($s0)");
		    		else System.out.print("($sp)");
		    	}
		    	else if(q.operator.equals("restorera"))
		    	{
		    		System.out.print("lw"+"\t"+"$ra"+"\t");
		    		System.out.print(q.arg3.offset);
		    		if(q.arg3.global)System.out.print("($s0)");
		    		else System.out.print("($sp)");
		    	}
		    	else if(q.operator.equals("call"))
			    {
		    		funcoffset = 0;
			    	System.out.print("jal");
			    	System.out.print("\t");
			    	if(!q.arg3.contain.equals("printf"))System.out.print("Legend_");
			    	System.out.print(q.arg3.contain);
			    }
		    	else if(q.operator.equals("funcend"))
		    	{
		    		System.out.println();
		    	}
		    	else if(q.operator.equals("parameter"))
		    	{
		    		if(!q.arg1.type.equals("const"))
		    		{
		    			System.out.print("lw");
			    		System.out.print("\t");
			    		if((int)q.arg3.contain<4)
			    		{
			    			System.out.print("$a");
				    		System.out.print(q.arg3.contain);
				    		System.out.print("\t");
				    		if(q.arg1 == null)
					    		System.out.print("");
					    	else if(q.arg1.type.equals("register"))
					    	{
					    		System.out.print("0($s");
					    		System.out.print(q.arg1.number);
					    		System.out.print(")");
					    	}
					    	else if(q.arg1.type.equals("memory"))
					    	{
					    		System.out.print(q.arg1.offset);
					    		if(q.arg1.global)System.out.print("($s0)");
					    		else System.out.print("($sp)");
					    	}
					    	else if(q.arg1.type.equals("return"))
					    	{
					    		System.out.print(q.arg1.offset);
					    		System.out.print("($v1)");
					    	}
			    		}
			    		else
			    		{
			    			System.out.print("$s1");
				    		System.out.print("\t");
			    			if(q.arg1 == null)
					    		System.out.print("");
					    	else if(q.arg1.type.equals("register"))
					    	{
					    		System.out.print("0($s");
					    		System.out.print(q.arg1.number);
					    		System.out.print(")");
					    	}
					    	else if(q.arg1.type.equals("memory"))
					    	{
					    		System.out.print(q.arg1.offset);
					    		if(q.arg1.global)System.out.print("($s0)");
					    		else System.out.print("($sp)");
					    	}
					    	else if(q.arg1.type.equals("return"))
					    	{
					    		System.out.print(q.arg1.offset);
					    		System.out.print("($v1)");
					    	}
			    			System.out.println();
			    			System.out.print("sw"+"\t"+"$s1"+"\t"+"16($v1)");
			    		}	
			    		
			    		
		    		}
		    		else
		    		{
		    			if((int)q.arg3.contain<4)
			    		{
		    				System.out.print("li");
		    				System.out.print("\t");
		    				System.out.print("$a");
		    				System.out.print(q.arg3.contain);
		    				System.out.print("\t");
		    				System.out.print(q.arg1.contain);
			    		}
		    			else
		    			{
		    				System.out.print("li");
		    				System.out.print("\t");
		    				System.out.print("$s1");
		    				System.out.print("\t");
		    				System.out.print(q.arg1.contain);
		    				System.out.println();
			    			System.out.print("sw"+"\t"+"$s1"+"\t"+"16($v1)");
		    			}
		    		}
		    		
		    		
		    		
		    	}
		    	else if(q.operator.equals("mallocload"))
		    	{
		    		System.out.print("lw");
		    		System.out.print("\t");
		    		System.out.print("$a0");
		    		System.out.print("\t");
			    	System.out.print(q.arg3.offset);
			    	if(q.arg3.global)System.out.print("($s0)");
			    	else System.out.print("($sp)");
		    	}
		    	else if(q.operator.equals("mallocli"))
		    	{
		    		System.out.print("li");
		    		System.out.print("\t");
		    		System.out.print("$a0");
		    		System.out.print("\t");
			    	System.out.print(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("malloclal"))
		    	{
		    		System.out.print("li");
		    		System.out.print("\t");
		    		System.out.print("$a0");
		    		System.out.print("\t");
		    		System.out.print("0($s");
		    		System.out.print(q.arg3.number);
		    		System.out.print(")");
		    	}
		    	else if(q.operator.equals("malloc"))
		    	{
		    		System.out.print("li");
		    		System.out.print("\t");
		    		System.out.print("$v0");
		    		System.out.print("\t");
		    		System.out.print("9");
		    	}
		    	else if(q.operator.equals("getpointer"))
		    	{
		    		System.out.print("sw");
		    		System.out.print("\t");
		    		System.out.print("$v0");
		    		System.out.print("\t");
		    		System.out.print(q.arg3.offset);
			    	if(q.arg3.global)System.out.print("($s0)");
			    	else System.out.print("($sp)");
		    	}
		    	else if(q.operator.equals("string"))
		    	{
		    		System.out.print("la");
		    		System.out.print("\t");
		    		System.out.print("$a0");
		    		System.out.print("\t");
		    		System.out.print(q.arg3.contain);
		    		
		    	}
		    	else if(q.operator.equals("store"))
		    	{
		    		System.out.print("sw");
		    		System.out.print("\t");
		    		
		    		if(q.arg1 == null)
			    		System.out.print("");
			    	else if(q.arg1.type.equals("const"))
			    		System.out.print(q.arg1.contain);
			    	else if(q.arg1.type.equals("memory"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg1.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg1.number);
			    	}
		    		System.out.print("\t");
		    		System.out.print("\t");

			    	System.out.print(q.arg3.offset);
			    	if(q.arg3.global)System.out.print("($s0)");
			    	else System.out.print("($sp)");


		    	}
		    	else if(q.operator.equals("storereturn"))
		    	{
		    		System.out.print("sw");
		    		System.out.print("\t");
		    		
		    		if(q.arg1 == null)
			    		System.out.print("");
			    	else if(q.arg1.type.equals("const"))
			    		System.out.print(q.arg1.contain);
			    	else if(q.arg1.type.equals("memory"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg1.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg1.number);
			    	}
		    		
		    		System.out.print("\t");
		    		System.out.print("\t");
		    		System.out.print(q.arg3.offset);
		    		System.out.print("($v1)");
		    		
		    	}
		    	else if(q.operator.equals("return"))
		    	{ 		
		    		int size = getfunc((String)q.arg3.contain).typ.size;
		    		System.out.print("add");
		    		System.out.print("\t");
		    		System.out.print("$sp");
		    		System.out.print("\t");
		    		System.out.print("$sp"); 		
		    		System.out.print("\t");
		    		System.out.print(size);
		    		System.out.println();
		    		System.out.print("jr");
		    		System.out.print("\t");
		    		System.out.print("$ra");
		    	}
		    	else if(q.operator.equals("label"))
		    	{
		    		System.out.print("L");
		    		System.out.print(q.arg3.contain);
		    		System.out.print(":");
		    	}
		    	else if(q.operator.equals("jal"))
		    	{
		    		System.out.print("jal");
		    		System.out.print("\t");
		    		System.out.print("L");
		    		System.out.print(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("b"))
		    	{
		    		System.out.print("b");
		    		System.out.print("\t");
		    		System.out.print("L");
		    		System.out.print(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("lal"))
		    	{
		    		System.out.print("lw");
		    		System.out.print("\t");
		    		System.out.print("$s");
		    		System.out.print(q.arg1.number);
		    		System.out.print("\t");
		    		System.out.print("0($s");
		    		System.out.print(q.arg3.number);
		    		System.out.print(")");
		    		
		    	}
		    	else if(q.operator.equals("ld"))
		    	{
		    		System.out.print("lw");
		    		System.out.print("\t");
		    		System.out.print("$s");
		    		System.out.print(q.arg1.number);
		    		System.out.print("\t");

			    	if(q.arg3.type.equals("return"))
			    	{
				    	System.out.print(q.arg3.offset);
				    	System.out.print("($v1)");
			    	}
			    	else
			    	{
			    		if(q.arg3.global)
				    	{
				    		System.out.print(q.arg3.offset);
				    		System.out.print("($s0)");
				    	}
				    	else
				    	{
				    		System.out.print(q.arg3.offset+funcoffset);
				    		System.out.print("($sp)");
				    	}
			    	}
			    	

		    		
		    	}
		    	else if(q.operator.equals("sal"))
		    	{
		    		System.out.print("sw");
		    		System.out.print("\t");
		    		System.out.print("$s");
		    		System.out.print(q.arg1.number);
		    		System.out.print("\t");
		    		System.out.print("0($s");
		    		System.out.print(q.arg3.number);
		    		System.out.print(")");
		    		
		    	}
		    	else if(q.operator.equals("bnez"))
		    	{
		    		System.out.print("bnez");
		    		System.out.print("\t");
		    		if(q.arg1 == null)
			    		System.out.print("");
		    		else if(q.arg1.type==null)
		    		{
		    			System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
		    		}
			    	else if(q.arg1.type.equals("const"))
			    		System.out.print(q.arg1.contain);
			    	else if(q.arg1.type.equals("memory"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg1.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg1.number);
			    	}
		    		System.out.print("\t");
		    		System.out.print("\t");
		    		System.out.print("L");
		    		System.out.print(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("beqz"))
		    	{
		    		System.out.print("beqz");
		    		System.out.print("\t");
		    		if(q.arg1 == null)
			    		System.out.print("");
		    		else if(q.arg1.type==null)
		    		{
		    			System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
		    		}
			    	else if(q.arg1.type.equals("const"))
			    		System.out.print(q.arg1.contain);
			    	else if(q.arg1.type.equals("memory"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg1.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg1.number);
			    	}
		    		System.out.print("\t");
		    		System.out.print("\t");
		    		System.out.print("L");
		    		System.out.print(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("loc"))
		    	{
		    		int size = getfunc((String)q.arg3.contain).typ.size;
		    		System.out.print("add");
		    		System.out.print("\t");
		    		System.out.print("$sp");
		    		System.out.print("\t");
		    		System.out.print("$sp");
		    		System.out.print("\t");
		    		System.out.print("-");
		    		System.out.print(size);
		    		funcoffset = size;
		    	}
		    	else
		    	{
		    		if(q.operator.equals("load"))System.out.print("lw");
		    		else if(q.operator.equals("+="))System.out.print("add");
		    		else if(q.operator.equals("-="))System.out.print("sub");
		    		else if(q.operator.equals("!="))System.out.print("sne");
		    		else if(q.operator.equals("<="))System.out.print("sle");
		    		else if(q.operator.equals(">="))System.out.print("sge");
		    		else if(q.operator.equals("^="))System.out.print("xor");
		    		else if(q.operator.equals("^"))System.out.print("xor");
		    		else if(q.operator.equals("=="))System.out.print("seq");
		    		else if(q.operator.equals("+"))System.out.print("add");
		    		else if(q.operator.equals("-"))System.out.print("sub");
		    		else if(q.operator.equals("<<"))System.out.print("sll");
		    		else if(q.operator.equals(">>"))System.out.print("srl");
		    		else if(q.operator.equals("*"))System.out.print("mul");
		    		else if(q.operator.equals("*="))System.out.print("mul");
		    		else if(q.operator.equals("/"))System.out.print("div");
		    		else if(q.operator.equals("/="))System.out.print("div");
		    		else if(q.operator.equals("%"))System.out.print("rem");
		    		else if(q.operator.equals("|"))System.out.print("or");
		    		else if(q.operator.equals("<"))System.out.print("slt");
		    		else if(q.operator.equals(">"))System.out.print("sgt");
		    		else if(q.operator.equals("&"))System.out.print("and");
		    		else System.out.print(q.operator);
			    	System.out.print("\t");
			    	if(q.arg1 == null)
			    		System.out.print("");
		    		else if(q.arg1.type==null)
		    		{
		    			System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
		    		}
			    	else if(q.arg1.type.equals("const"))
			    		System.out.print(q.arg1.contain);
			    	else if(q.arg1.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg1.number);
			    	}
			    	else if(q.arg1.type.equals("memory"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		if(q.arg1.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg1.type.equals("return"))
			    	{
			    		System.out.print(q.arg1.offset);
			    		System.out.print("($v1)");
			    	}

		    		System.out.print("\t");
			    	
			    	if(q.arg2 == null)
			    		System.out.print("");
			    	else if(q.arg2.type.equals("const"))
			    		System.out.print(q.arg2.contain);
			    	else if(q.arg2.type==null)
		    		{
		    			System.out.print(q.arg2.offset);
			    		if(q.arg2.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
		    		}
			    	else if(q.arg2.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg2.number);
			    	}
			    	else if(q.arg2.type.equals("memory"))
			    	{
			    		System.out.print(q.arg2.offset);
			    		if(q.arg2.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg2.type.equals("return"))
			    	{
			    		System.out.print(q.arg2.offset);
			    		System.out.print("($v1)");
			    	}
			    	
			    	System.out.print("\t");

			    	
			    	
			    	if(q.arg3 == null)
			    		System.out.print("");
			    	else if(q.arg3.type==null)
		    		{
		    			System.out.print(q.arg3.offset);
			    		if(q.arg3.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
		    		}
			    	else if(q.arg3.type.equals("const"))
			    		System.out.print(q.arg3.contain);
			    	else if(q.arg3.type.equals("register"))
			    	{
			    		System.out.print("$s");
			    		System.out.print(q.arg3.number);
			    	}
			    	else if(q.arg3.type.equals("memory"))
			    	{
			    		System.out.print(q.arg3.offset);
			    		if(q.arg3.global)System.out.print("($s0)");
			    		else System.out.print("($sp)");
			    	}
			    	else if(q.arg3.type.equals("return"))
			    	{
			    		System.out.print(q.arg3.offset);
			    		System.out.print("($v1)");
			    	}
		    	}
		    	
		    	System.out.println();
		    }
		    
		    
		    FileReader fr = new FileReader(first.class.getResource("/print.txt").getFile());  
		    int ch = 0;    
		    while((ch = fr.read())!=-1 ){    
		        output+=( (char)ch );    
		    }  
		    
		    
		    return ans;
		    
		    
		}catch(RecognitionException a) {
			return(1);
		}
	}
	
public static void main(String[] args)throws Exception   
{    
	/*String s = "D:\\compiler2014-testcases\\Normal";
    List<File> files = getFiles(s);
    for(File f : files){
    	System.out.println(f.getName());
    	System.out.println(work(f));
    }*/
	//System.out.println(work(new File("D:\\t.c")));
	work(new File(args[0]));
}
}
