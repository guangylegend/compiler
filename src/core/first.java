package core;


import classes.*;
import classDef.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.antlr.runtime.*;  
import org.antlr.runtime.tree.BaseTree;


public class first{   
	public static Vector<table> F = new Vector<table>();
	public static Vector<table> S = new Vector<table>();
	public static int loop = 0;
	public static int noname = 0;
	public static function func = null;
	
	public static type getstruct(String s)
	{
		return (type) S.lastElement().get(symbol.symbol(s));
	}
	
	public static type getfunc(String s)
	{
		return (type) F.lastElement().get(symbol.symbol(s));
	}
	
	public static type getstruct(String s,int i)
	{
		return (type) S.get(i).get(symbol.symbol(s));
	}
	
	public static type getfunc(String s,int i)
	{
		return (type) F.get(i).get(symbol.symbol(s));
	}
	
	public static void putstruct(String s,type t)
	{
		S.lastElement().put(symbol.symbol(s),t);
	}
	
	public static void putfunc(String s,type t)
	{
		F.lastElement().put(symbol.symbol(s),t);
	}
	
	public static void putstruct(String s,type t,int i)
	{
		S.get(i).put(symbol.symbol(s),t);
	}
	
	public static void putfunc(String s,type t,int i)
	{
		F.get(i).put(symbol.symbol(s),t);
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
		    
		    for (int i=0;i<res.length;i++)
		    {
		    	//System.out.println(res[i]);
		    	
		    	
		    	root tmp = new root();
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
		    	    for(int j =1;j<=cnt;j++)his.remove(his.size()-1);
		    	    
		    	}
		    	else
		    	{
		    		tmp.record = res[i];
		    		his.lastElement().child.add(tmp);
		    	}
		    	
		    	
		    	
		    }

		    return(rt.check());
		    
		    
		}catch(Exception a) {
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

	//System.out.println(work(new File("D:\\compiler2014-testcases\\CompileError\\func1-5100379071-puyouer.c")));
	System.exit(work(new File(args[0])));
}
}
