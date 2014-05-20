package core;


import classes.*;
import classDef.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
	public static boolean infinity = true;
	
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
	
	@SuppressWarnings("unchecked")
	static public String work(File file) throws Exception
	{
		try
		{
			F = new Vector<table>();
			S = new Vector<table>();
			loop = 0;
			noname = 0;
			func = null; 
		    InputStream iin = new FileInputStream(file);
		    ANTLRInputStream input = new ANTLRInputStream(iin);   
		    astLexer lex = new astLexer(input);   
		    CommonTokenStream tokens = new CommonTokenStream(lex);   
		    astParser parser = new astParser(tokens);
		    astParser.program_return r = parser.program();
		    String s = ((BaseTree)r.getTree()).toStringTree();
		    //output+=ln(s);
		    String[] res = s.split(" ");
		    Vector<root> his = new Vector<root>();
		    root rt = new root();
		    int stringcnt = 0;
		    String space = "";
		    boolean todo = false;
		    for (int i=0;i<res.length;i++)
		    {
		    	//output+=ln(res[i]);
		    	
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
		    
		    
		    String output = "";
		    
		    output+=(".data"+"\n");
		    if(globalsize!=0)
		    {
		    	output+="Legend_global:.space ";
		    	output+=(globalsize+"\n");
		    }
		    output+="Legend_return:.space ";
		    output+=(40000+"\n");
		    
		    for(int i=1;i<=ASCII.size();i++)
		    {
		    	output+=("Legend_");
		    	output+=(i);
		    	output+=(":.asciiz ");
		    	output+=(ASCII.get(i-1)+"\n");
		    	output+=(".align 2"+"\n");
		    }
		    output+=("printf_buf: .space 2"+"\n");
		    output+=(".text"+"\n");
		    output+=("main:"+"\n");
		    if(globalsize!=0)
		    {
		    	output+=("la"+"\t"+"$s0"+"\t"+"Legend_global"+"\n");
		    	
		    }
		    output+=("la"+"\t"+"$v1"+"\t"+"Legend_return"+"\n");
		    
		    Vector<Integer> reguse = new Vector<Integer>();
		    Vector<String> funcsize = new Vector<String>();
		    int regmax = 0;
		    
		    Vector<Vector<Integer>> succ = new Vector<Vector<Integer>>();
		    Vector<Vector<Integer>> def = new Vector<Vector<Integer>>();
		    Vector<Vector<Integer>> use = new Vector<Vector<Integer>>();

			HashSet<Integer> in[] = new HashSet[10000];
		    HashSet<Integer> inh[] = new HashSet[10000];
			HashSet<Integer> out[] = new HashSet[10000];
		    HashSet<Integer> outh[] = new HashSet[10000];
		    int label[] = new int[1000];
		    int left[] = new int[1000];
		    int right[] = new int[1000];
		    int reg[] = new int[15];
		    int tab[] = new int[1000];
		    Vector<Integer> lab = new Vector<Integer>();
		    int infinitynumber = 0;
		    
		    for(int i=0;i<label.length;i++)
		    {
		    	label[i] = -1;
		    	left[i] = -1;
		    	right[i] = -1;
		    	tab[i] = 0;
		    }
		    for(int i=0;i<reg.length;i++)
		    {
		    	reg[i] = 0;
		    }
		    
		    
		    for(int i=0;i<rt.code.size();i++)
		    {
		    	quad q = rt.code.get(i);
		    	if(q.operator.equals("func"))
		    	{
		    		if(!flag)flag=true;
		    	}
		    	if(flag)
		    	{
		    		if(q.operator.equals("func"))
		    		{
		    			funcsize.add((String)q.arg3.contain);
		    			continue;
		    		}
		    		else if(q.operator.equals("spill"))
		    		{
		    			if(q.arg3.type.equals("register"))tab[q.arg3.number] = 1000;
		    			continue;
		    		}
		    		else if(q.operator.equals("call"))continue;
		    		else if(q.operator.equals("return"))continue;
		    		else if(q.operator.equals("jal"))continue;
		    		else if(q.operator.equals("storereturn"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);    		
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		use.lastElement().add(q.arg1.number);

		    		}
		    		else if(q.operator.equals("loc"))continue;
		    		else if(q.operator.equals("parameter"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg1.number > regmax) regmax = q.arg1.number;
			    		if(q.arg1.number!=0)use.lastElement().add(q.arg1.number);
			    		continue;
		    		}
		    		else if(q.operator.equals("parameterl"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg1.number > regmax) regmax = q.arg1.number;
			    		use.lastElement().add(q.arg1.number);
			    		continue;
		    		}
		    		else if(q.operator.equals("funcend"))
		    		{
		    			reguse.add(regmax);
		    			continue;
		    		}
		    		else if(q.operator.equals("b"))
		    		{
		    			q.arg1 = new location(0,"const",succ.size()-1,false,false);
		    			continue;
		    		}
		    		else if(q.operator.equals("string"))continue;
		    		else if(q.operator.equals("storera"))continue;
		    		else if(q.operator.equals("restorera"))continue;
		    		else if(q.operator.equals("mallocli"))continue;
		    		else if(q.operator.equals("malloc"))continue;
		    		else if(q.operator.equals("syscall"))continue;
		    		else if(q.operator.equals("malloclal"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg3.number > regmax) regmax = q.arg3.number;
			    		use.lastElement().add(q.arg3.number);
			    		continue;
		    		}
		    		else if(q.operator.equals("mallocload"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg3.number > regmax) regmax = q.arg3.number;
			    		use.lastElement().add(q.arg3.number);
			    		continue;
		    		}
		    		else if(q.operator.equals("getpointer"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg3.number > regmax) regmax = q.arg3.number;
			    		use.lastElement().add(q.arg3.number);
			    		continue;
		    		}
		    		else if(q.operator.equals("label"))
		    		{
		    			lab.add((int) q.arg3.contain);
		    			continue;
		    		}
		    		else if(q.operator.equals("beqz"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg1.number > regmax) regmax = q.arg1.number;
			    		use.lastElement().add(q.arg1.number);
			    		q.arg2 = new location(0,"const",succ.size()-1,false,false);
			    		continue;
		    		}
		    		else if(q.operator.equals("bnez"))
		    		{
		    			Vector<Integer> su = new Vector<Integer>();
			    		su.add(succ.size()+1);
			    		if(lab.size()>0)
			    		{
			    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
			    			lab.clear();
			    		}
			    		succ.add(su);
			    		def.add(new Vector<Integer>());
			    		use.add(new Vector<Integer>());
			    		if(q.arg1.number > regmax) regmax = q.arg1.number;
			    		use.lastElement().add(q.arg1.number);
			    		q.arg2 = new location(0,"const",succ.size()-1,false,false);
			    		continue;
		    		}
		    		
		    		
		    		Vector<Integer> su = new Vector<Integer>();
		    		su.add(succ.size()+1);    		
		    		if(lab.size()>0)
		    		{
		    			for(int j=0;j<lab.size();j++)label[lab.get(j)] = succ.size();
		    			lab.clear();
		    		}
		    		succ.add(su);
		    		def.add(new Vector<Integer>());
		    		if(q.arg1.number > regmax) regmax = q.arg1.number;
		    		def.lastElement().add(q.arg1.number);
		    		use.add(new Vector<Integer>());
		    		if(q.arg2!=null && q.arg2.number!=0)
		    		{
		    			if(q.arg2.number > regmax) regmax = q.arg2.number;
		    			use.lastElement().add(q.arg2.number);
		    		}
		    		if(q.arg3!=null && q.arg3.number!=0)
		    		{
		    			if(q.arg3.number > regmax) regmax = q.arg3.number;
		    			use.lastElement().add(q.arg3.number);
		    		}
		    		
		    	}
		    }
		    
		    succ.lastElement().clear();
			for(int k=0;k<rt.code.size();k++)
		    {
		    	quad qq = rt.code.get(k);
		    	if(qq.operator.equals("b"))
		    	{
		    		if(label[(int) qq.arg3.contain]!=-1)succ.get(qq.arg1.number).add(label[(int) qq.arg3.contain]);
		    	}
		    	else if(qq.operator.equals("bnez"))
		    	{
		    		if(label[(int) qq.arg3.contain]!=-1)succ.get(qq.arg2.number).add(label[(int) qq.arg3.contain]);
		    	}
		    	else if(qq.operator.equals("beqz"))
		    	{
		    		if(label[(int) qq.arg3.contain]!=-1)succ.get(qq.arg2.number).add(label[(int) qq.arg3.contain]);
		    	}
		    }
			
			for(int k=0;k<succ.size();k++)
			{
				in[k] = new HashSet<Integer>();
				out[k] = new HashSet<Integer>();
			}
			
			/*for(int j=0;j<succ.size();j++)
			{
				for(int k=0;k<succ.get(j).size();k++)System.out.print(succ.get(j).get(k)+1+" ");
				System.out.print("~~");
				for(int k=0;k<def.get(j).size();k++)System.out.print(def.get(j).get(k)+" ");
				System.out.print("~~");
				for(int k=0;k<use.get(j).size();k++)System.out.print(use.get(j).get(k)+" ");
				System.out.println();
			}*/
			//System.out.flush();
			
			//int cnt = 0;
			
			//System.setOut(new PrintStream(new FileOutputStream("D:\\xxx.txt")));
			
			while(true)
			{
				for(int k=succ.size()-1;k>=0;k--)
    			{
    				inh[k] = new HashSet<Integer>(in[k]);
    				outh[k] = new HashSet<Integer>(out[k]);
    				out[k] = new HashSet<Integer>();
    				for(int j=0;j<succ.get(k).size();j++)out[k].addAll(in[succ.get(k).get(j)]);
    				out[k].removeAll(def.get(k));
    				out[k].addAll(use.get(k));
    				in[k] = new HashSet<Integer>(out[k]);

    			}
				
				boolean f = true;
				for(int k=succ.size()-1;k>=0;k--)
				{
					//TODO size
					if(inh[k].size()!=in[k].size())f = false;
					if(outh[k].size()!=out[k].size())f = false;
				}
				
				
				
				//cnt++;
				if(f)break;
				
			}
			
			//System.out.println(cnt);
		
			/*for(int k=0;k<succ.size();k++)
			{
				Iterator<Integer> iter = in[k].iterator();
				while(iter.hasNext())System.out.print(iter.next().hashCode()+" ");
				System.out.print("~~");
				iter = out[k].iterator();
				while(iter.hasNext())System.out.print(iter.next().hashCode()+" ");
				System.out.println();
			}*/

			
			
			
			for(int k=0;k<succ.size();k++)
			{
				Iterator<Integer> iter = out[k].iterator();
				while(iter.hasNext())
				{
					int tmp = iter.next().hashCode();
					if(tmp > infinitynumber)infinitynumber = tmp;
					if(left[tmp]==-1)
					{
						left[tmp] = k;
						right[tmp] = k;
					}
					if(right[tmp]<k)right[tmp] = k;
				}
				/*iter = in[k].iterator();
				while(iter.hasNext())
				{
					int tmp = iter.next().hashCode();
					if(tmp > infinitynumber)infinitynumber = tmp;
					if(left[tmp]==-1)
					{
						left[tmp] = k;
						right[tmp] = k;
					}
					if(right[tmp]<k)right[tmp] = k;
				}*/
				if(def.get(k).size()>0)
				{
					int tmp = def.get(k).get(0);
					if(tmp > infinitynumber)infinitynumber = tmp;
					if(left[tmp]==-1)
					{
						left[tmp] = k;
						right[tmp] = k;
					}
					if(right[tmp]<k)right[tmp] = k;
				}
				
			}
			
			for(int k=0;k<succ.size();k++)
			{
				Iterator<Integer> iter = out[k].iterator();
				while(iter.hasNext())
				{
					int tmp = iter.next().hashCode();
					if(tab[tmp]==0)
					{
						for(int j=1;j<reg.length;j++)
						{
							if(reg[j]==0)
							{
								reg[j] = tmp;
								tab[tmp] = j;
								break;
							}
						}
						if(tab[tmp]==0)
						{
							tab[tmp] = 1000;
						}
					}		    					
				}
				
				/*iter = in[k].iterator();
				while(iter.hasNext())
				{
					int tmp = iter.next().hashCode();
					if(tab[tmp]==0)
					{
						for(int j=0;j<reg.length;j++)
						{
							if(reg[j]==0)
							{
								reg[j] = tmp;
								tab[tmp] = j;
								break;
							}
						}
						if(tab[tmp]==0)
						{
							//spill~
						}
					}		    					
				}*/
				
				if(def.get(k).size()>0)
				{
					int tmp = def.get(k).get(0);
					if(tab[tmp]==0)
					{
						for(int j=1;j<reg.length;j++)
						{
							if(reg[j]==0)
							{
								reg[j] = tmp;
								tab[tmp] = j;
								break;
							}
						}
						if(tab[tmp]==0)
						{
							tab[tmp] = 1000;
						}
					}	
				}
				
				
				
				Iterator<Integer> iteri = out[k].iterator();
				while(iteri.hasNext())
				{
					int tmp = iteri.next().hashCode();
					if(right[tmp]==k)
					{
						if(tab[tmp]!=1000)reg[tab[tmp]]=0;
					}
				}
				
				/*iteri = in[k].iterator();
				while(iteri.hasNext())
				{
					int tmp = iteri.next().hashCode();
					if(right[tmp]==k)
					{
						reg[tab[tmp]]=0;
					}
				}*/
				
				if(def.get(k).size()>0)
				{
					int tmp = def.get(k).get(0);
					if(right[tmp]==k)
					{
						if(tab[tmp]!=1000)reg[tab[tmp]]=0;

					}
				}
			}
			//for(int k=1;k<=infinitynumber;k++)System.out.println(k+" "+tab[k]);
			
			
			int last = 0;
			int max = 0;
			for(int k=0;k<reguse.size();k++)
			{
				for(int j=last;j<=reguse.get(k);j++)
				{
					if(tab[j] > max && tab[j]!=1000)max = tab[j];
				}
				last = reguse.get(k)+1;
				reguse.set(k, max); 
				value v = getfunc(funcsize.get(k));
				v.typ.size+=max*4;
				putfunc(funcsize.get(k),v);
			}
		    
		    
		    
		    
		    flag = false;
		    int funccnt = -1;
		    String funcname = "";
		    
		    
		    for(int i=0;i<rt.code.size();i++)
		    {
		    	quad q = rt.code.get(i);

		    	if(q.operator.equals("func"))
		    	{
		    		if(flag == false)
		    		{
		    			output+=("sw"+"\t"+"$ra"+"\t"+"0($sp)"+"\n");
		    			output+=("add"+"\t"+"$sp"+"\t"+"$sp"+"\t-"+getfunc("main").typ.size+"\n");
		    			output+=("jal"+"\t"+"Legend_main"+"\n");
		    			output+=("lw"+"\t"+"$ra"+"\t"+"0($sp)"+"\n");
		    			output+=("jr"+"\t"+"$ra"+"\n");
			    		flag = true;
		    		}
		    		output+=("\n");
		    		output+=("Legend_"+q.arg3.contain+":");
		    		funccnt++;
		    		funcname = (String) q.arg3.contain;
		    	}
		    	else if(q.operator.equals("do"))
		    	{
		    		output+=("la"+"\t"+"$a0"+"\t"+"Legend_1"+"\n");
		    		output+=("li"+"\t"+"$a1"+"\t"+"10");
		    		output+=("li"+"\t"+"$a2"+"\t"+"34"+"\n");
		    		output+=("la"+"\t"+"$a3"+"\t"+"Legend_1"+"\n");
		    		output+=("li"+"\t"+"$s1"+"\t"+"34"+"\n");
		    		output+=("sw"+"\t"+"$s1"+"\t"+"16($v1)"+"\n");
		    		output+=("li"+"\t"+"$s1"+"\t"+"10"+"\n");
		    		output+=("sw"+"\t"+"$s1"+"\t"+"20($v1)");
		    	}
		    	else if(q.operator.equals("storera"))
		    	{
		    		output+=("sw"+"\t"+"$ra"+"\t");
		    		output+=(q.arg3.offset);
		    		if(q.arg3.global)output+=("($s0)");
		    		else output+=("($sp)");
		    		
		    	}
		    	else if(q.operator.equals("restorera"))
		    	{
		    		output+=("lw"+"\t"+"$ra"+"\t");
		    		output+=(q.arg3.offset);
		    		if(q.arg3.global)output+=("($s0)");
		    		else output+=("($sp)");
		    		
		    	}
		    	else if(q.operator.equals("call"))
			    {
		    		funcoffset = 0;
		    		output+=("jal");
		    		output+=("\t");
			    	if(!q.arg3.contain.equals("printf"))output+=("Legend_");
			    	output+=(q.arg3.contain);
			    	if(!q.arg3.contain.equals("printf"))
			    	{
			    		int size = getfunc(funcname).typ.size-4;
			    		if(reguse.get(funccnt)>14)
			    		{
			    			for(int k=1;k<=14;k++)
				    		{
				    			output+=("\n"+"lw"+"\t"+"$tmp"+k+"\t"+size+"($sp)");
				    			size-=4;
				    		}
			    		}
			    		else
			    		{
			    			for(int k=1;k<=(int)reguse.get(funccnt);k++)
				    		{
				    			output+=("\n"+"lw"+"\t"+"$tmp"+k+"\t"+size+"($sp)");
				    			size-=4;
				    		}
			    		}
			    		
			    	}
			    }
		    	else if(q.operator.equals("funcend"))
		    	{
		    		output+=("\n");
		    	}
		    	else if(q.operator.equals("parameterl"))
		    	{
		    		if((int)q.arg3.contain<4)
		    		{	
		    			output+=("lw");
	    				output+=("\t");
		    			output+=("$a");
			    		output+=(q.arg3.contain);
			    		output+=("\t");
				    	output+=("0($t");
				    	output+=(q.arg1.number);
				    	output+=(")");
		    		}
		    		else                                            //some bugs...
		    		{
		    			output+=("sw"+"\t"+"$t"+q.arg1.number+"\t"+"16($v1)");
		    		}	
		    	}
		    	else if(q.operator.equals("parameter"))
		    	{
		    		if(first.infinity)
		    		{
		    			if(!q.arg1.type.equals("const"))
			    		{	
				    		if((int)q.arg3.contain<4)
				    		{	
				    			if(q.arg1.global)
				    			{
				    				output+=("lw");
				    				output+=("\t");
					    			output+=("$a");
						    		output+=(q.arg3.contain);
						    		output+=("\t");
							    	output+=(q.arg1.offset);
							    	output+=("($s0)");
				    			}
				    			else if(q.arg1.type.equals("return"))
						    	{
				    				output+=("lw");
				    				output+=("\t");
				    				output+=("$a");
				    				output+=(q.arg3.contain);
				    				output+=("\t");
						    		output+=(q.arg1.offset);
						    		output+=("($v1)");
						    	}
				    			else
				    			{
				    				if(tab[q.arg1.number]==1000)
				    				{
				    					output+=("lw"+"\t"+"$tmp16"+"\t"+q.arg1.offset+"($sp)"+"\n");
				    				}
				    				output+=("move");
				    				output+=("\t");
					    			output+=("$a");
						    		output+=(q.arg3.contain);
						    		output+=("\t");
						    		if(tab[q.arg1.number]==1000)
				    				{
						    			output+=("$tmp16");
				    				}
						    		else
						    		{
						    			output+=("$t");
								    	output+=(q.arg1.number);
						    		}
							    	
				    			}
				    			
				    		}
				    		else
				    		{
				    			output+=("sw"+"\t"+"$t"+q.arg1.number+"\t"+"16($v1)");
				    		}	

			    		}
			    		else
			    		{
			    			if((int)q.arg3.contain<4)
				    		{
			    				output+=("li");
			    				output+=("\t");
			    				output+=("$a");
			    				output+=(q.arg3.contain);
			    				output+=("\t");
			    				output+=(q.arg1.contain);
				    		}
			    			else
			    			{
			    				output+=("li");
			    				output+=("\t");
			    				output+=("$s1");
			    				output+=("\t");
			    				output+=(q.arg1.contain);
			    				output+=("\n");
				    			output+=("sw"+"\t"+"$s1"+"\t"+"16($v1)");
			    			}
			    		}
		    		}
		    		else
		    		{
		    			if(!q.arg1.type.equals("const"))
			    		{
			    			output+=("lw");
			    			output+=("\t");
				    		if((int)q.arg3.contain<4)
				    		{
				    			output+=("$a");
					    		output+=(q.arg3.contain);
					    		output+=("\t");
					    		if(q.arg1 == null)
						    		output+=("");
						    	else if(q.arg1.type.equals("register"))
						    	{
						    		output+=("0($s");
						    		output+=(q.arg1.number);
						    		output+=(")");
						    	}
						    	else if(q.arg1.type.equals("memory"))
						    	{
						    		output+=(q.arg1.offset);
						    		if(q.arg1.global)output+=("($s0)");
						    		else output+=("($sp)");
						    	}
						    	else if(q.arg1.type.equals("return"))
						    	{
						    		output+=(q.arg1.offset);
						    		output+=("($v1)");
						    	}
				    		}
				    		else
				    		{
				    			output+=("$s1");
					    		output+=("\t");
				    			if(q.arg1 == null)
						    		output+=("");
						    	else if(q.arg1.type.equals("register"))
						    	{
						    		output+=("0($s");
						    		output+=(q.arg1.number);
						    		output+=(")");
						    	}
						    	else if(q.arg1.type.equals("memory"))
						    	{
						    		output+=(q.arg1.offset);
						    		if(q.arg1.global)output+=("($s0)");
						    		else output+=("($sp)");
						    	}
						    	else if(q.arg1.type.equals("return"))
						    	{
						    		output+=(q.arg1.offset);
						    		output+=("($v1)");
						    	}
				    			output+=("\n");
				    			output+=("sw"+"\t"+"$s1"+"\t"+"16($v1)");
				    		}	
				    		
				    		
			    		}
			    		else
			    		{
			    			if((int)q.arg3.contain<4)
				    		{
			    				output+=("li");
			    				output+=("\t");
			    				output+=("$a");
			    				output+=(q.arg3.contain);
			    				output+=("\t");
			    				output+=(q.arg1.contain);
				    		}
			    			else
			    			{
			    				output+=("li");
			    				output+=("\t");
			    				output+=("$s1");
			    				output+=("\t");
			    				output+=(q.arg1.contain);
			    				output+=("\n");
				    			output+=("sw"+"\t"+"$s1"+"\t"+"16($v1)");
			    			}
			    		}
		    		}
		    		
		    	}
		    	else if(q.operator.equals("mallocload"))
		    	{
		    		if(first.infinity)
		    		{
		    			if(tab[q.arg3.number]==1000)
		    			{
		    				output+=("lw");
				    		output+=("\t");
				    		output+=("$a0");
				    		output+=("\t");
					    	output+=(q.arg3.offset);
					    	output+=("($sp)");
		    			}
		    			else
		    			{
		    				output+=("move");
				    		output+=("\t");
				    		output+=("$a0");
				    		output+=("\t");
					    	output+=("$t");
					    	output+=(q.arg3.number);
		    			}
		    			
		    		}
		    		else
		    		{
		    			output+=("lw");
			    		output+=("\t");
			    		output+=("$a0");
			    		output+=("\t");
				    	output+=(q.arg3.offset);
				    	if(q.arg3.global)output+=("($s0)");
				    	else output+=("($sp)");
		    		}
		    		
		    	}
		    	else if(q.operator.equals("mallocli"))
		    	{
		    		output+=("li");
		    		output+=("\t");
		    		output+=("$a0");
		    		output+=("\t");
			    	output+=(q.arg3.contain);
		    	}
		    	else if(q.operator.equals("malloclal"))
		    	{
		    		output+=("li");
		    		output+=("\t");
		    		output+=("$a0");
		    		output+=("\t");
		    		output+=("0($t");
		    		output+=(q.arg3.number);
		    		output+=(")");
		    	}
		    	else if(q.operator.equals("malloc"))
		    	{
		    		output+=("li");
		    		output+=("\t");
		    		output+=("$v0");
		    		output+=("\t");
		    		output+=("9");
		    	}
		    	else if(q.operator.equals("getpointer"))
		    	{
		    		if(first.infinity)
		    		{
		    			output+=("move");
			    		output+=("\t");
			    		output+=("$t");
			    		output+=(q.arg3.number);
			    		output+=("\t");
			    		output+=("$v0");
			    		
		    		}
		    		else
		    		{
		    			output+=("sw");
			    		output+=("\t");
			    		output+=("$v0");
			    		output+=("\t");
			    		output+=(q.arg3.offset);
				    	if(q.arg3.global)output+=("($s0)");
				    	else output+=("($sp)");
		    		}
		    		
		    	}
		    	else if(q.operator.equals("string"))
		    	{
		    		output+=("la");
		    		output+=("\t");
		    		output+=("$a0");
		    		output+=("\t");
		    		output+=(q.arg3.contain);
		    		
		    	}
		    	else if(q.operator.equals("storereturn"))
		    	{
		    		output+=("sw");
		    		output+=("\t");
		    		if(q.arg1 != null)output+=(q.arg1.toString() + "\t");
		    		output+=(q.arg3.offset);
		    		output+=("($v1)");
		    	}
		    	else if(q.operator.equals("return"))
		    	{ 		
		    		output+=("add"+"\t"+"$sp"+"\t"+"$sp"+"\t"+ getfunc(funcname).typ.size + "\n");
		    		output+=("jr"+"\t"+"$ra");
		    	}
		    	else if(q.operator.equals("label"))
		    	{
		    		output+=("L"+q.arg3.contain+":");
		    	}
		    	else if(q.operator.equals("jal"))
		    	{
		    		output+=("jal"+"\t"+"L"+q.arg3.contain);
		    	}
		    	else if(q.operator.equals("b"))
		    	{
		    		output+=("b"+"\t"+"L"+q.arg3.contain);
		    	}
		    	else if(q.operator.equals("lal"))
		    	{
		    		boolean flag1 = false;
		    		if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
		    			flag1 = true;
		    		}
		    		output+=("lw");
		    		output+=("\t");
		    		if(flag1)
		    		{
		    			output+=("$tmp15");
		    		}
		    		else
		    		{
		    			output+=("$t");
			    		output+=(q.arg1.number);
		    		}  		
		    		output+=("\t");
		    		if(tab[q.arg3.number]==1000)
		    		{
		    			output+=(q.arg3.offset);
			    		output+=("($sp)");
		    		}
		    		else
		    		{
		    			output+=("0($t");
			    		output+=(q.arg3.number);
			    		output+=(")");
		    		}
		    		if(flag1)
			    	{
			    		output+=("\n"+"sw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)");
			    	}
		    	}
		    	else if(q.operator.equals("ld"))
		    	{
		    		if(q.arg3.type.equals("register"))
		    		{
		    			output+=("move");
			    		output+=("\t");
			    		output+=("$t");
			    		output+=(q.arg1.number);
			    		output+=("\t");
			    		output+=("$t");
			    		output+=(q.arg3.number);
		    		}
		    		else
		    		{
		    			output+=("lw");
			    		output+=("\t");
			    		output+=("$t");
			    		output+=(q.arg1.number);
			    		output+=("\t");
			    		
		    			if(q.arg3.type.equals("return"))
				    	{
					    	output+=(q.arg3.offset);
					    	output+=("($v1)");
				    	}
				    	else
				    	{
				    		if(q.arg3.global)
					    	{
					    		output+=(q.arg3.offset);
					    		output+=("($s0)");
					    	}
					    	else
					    	{
					    		output+=(q.arg3.offset+funcoffset);
					    		output+=("($sp)");
					    	}
				    	}	
		    		}
		    			
		    	}
		    	else if (q.operator.equals("spill"))continue;
		    	else if(q.operator.equals("sal"))
		    	{
		    		boolean flag1 = false;
		    		if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
		    			flag1 = true;
		    		}
		    		output+=("sw");
		    		output+=("\t");
		    		if(flag1)
		    		{
		    			output+=("$tmp15");
		    		}
		    		else
		    		{
		    			output+=("$t");
			    		output+=(q.arg1.number);
		    		}  		
		    		output+=("\t");
		    		if(tab[q.arg3.number]==1000)
		    		{
		    			output+=(q.arg3.offset);
			    		output+=("($sp)");
		    		}
		    		else
		    		{
		    			output+=("0($t");
			    		output+=(q.arg3.number);
			    		output+=(")");
		    		}
		    		
		    		
		    		
		    	}
		    	else if(q.operator.equals("bnez"))
		    	{
		    		boolean flag1 = false;
		    		if(q.arg1!=null && q.arg1.global && q.arg1.type.equals("memory"))
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.toString()+"\n");
		    			flag1 = true;
		    		}
		    		else if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
		    			flag1 = true;
		    		}
		    		output+=("bnez" + "\t");
		    		if(q.arg1!=null)
			    	{
			    		if(flag1)output+=("$tmp15"+"\t");
			    		else output+=(q.arg1.toString()+"\t");
			    	}
		    		output+=("L" + q.arg3.contain);
		    	}
		    	else if(q.operator.equals("beqz"))
		    	{
		    		boolean flag1 = false;
		    		if(q.arg1!=null && q.arg1.global && q.arg1.type.equals("memory"))
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.toString()+"\n");
		    			flag1 = true;
		    		} 
		    		else if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
		    			flag1 = true;
		    		}
		    		output+=("beqz" + "\t");
		    		if(q.arg1!=null)
			    	{
			    		if(flag1)output+=("$tmp15"+"\t");
			    		else output+=(q.arg1.toString()+"\t");
			    	}
		    		output+=("L" + q.arg3.contain);
		    	}
		    	else if(q.operator.equals("loc"))
		    	{
		    		int size = getfunc(funcname).typ.size-4;
		    		if(reguse.get(funccnt)>14)
		    		{
		    			for(int k=1;k<=14;k++)
			    		{
			    			output+=("\n"+"sw"+"\t"+"$tmp"+k+"\t"+size+"($sp)");
			    			size-=4;
			    		}
		    		}
		    		else
		    		{
		    			for(int k=1;k<=(int)reguse.get(funccnt);k++)
			    		{
			    			output+=("\n"+"sw"+"\t"+"$tmp"+k+"\t"+size+"($sp)");
			    			size-=4;
			    		}
		    		}
		    		output+="\n";
		    		size = getfunc((String)q.arg3.contain).typ.size;
		    		output+=("add\t$sp\t"+"$sp"+"\t"+"-"+size);
		    		funcoffset = size;
		    	}
		    	else if(q.operator.equals("la"))
		    	{
		    		boolean flag1 = false;
		    		if(q.arg1!=null && q.arg1.global && q.arg1.type.equals("memory"))
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.toString()+"\n");
		    			flag1 = true;
		    		} 
		    		else if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    		{
		    			output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
		    			flag1 = true;
		    		}
		    		output+=("la" + "\t");
		    		if(q.arg1!=null)
			    	{
			    		if(flag1)output+=("$tmp15"+"\t");
			    		else output+=(q.arg1.toString()+"\t");
			    	}
		    		if(q.arg3.global)output+=(q.arg3.offset + "($s0)");
		    		else output+=(q.arg3.offset + "($sp)");
		    	}
		    	else
		    	{		
		    		boolean flag1 = false;
		    		boolean flag2 = false;
		    		boolean flag3 = false;
		    		
		    		if(flag)
		    		{
		    			if(q.arg1!=null && q.arg1.global && q.arg1.type.equals("memory"))
			    		{
			    			//output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($s0)"+"\n");
			    			flag1 = true;
			    		}
		    			else if(q.arg1!=null && q.arg1.type.equals("register") && tab[q.arg1.number]==1000)
		    			{
		    				//output+=("lw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)"+"\n");
			    			flag1 = true;
		    			}
			    		if(q.arg2!=null && q.arg2.global && q.arg2.type.equals("memory") && !q.operator.equals("load"))
			    		{
			    			output+=("lw"+"\t"+"$tmp16"+"\t"+q.arg2.offset+"($s0)"+"\n");
			    			flag2 = true;
			    		}
			    		else if(q.arg2!=null && q.arg2.type.equals("register") && tab[q.arg2.number]==1000)
		    			{
		    				output+=("lw"+"\t"+"$tmp16"+"\t"+q.arg2.offset+"($sp)"+"\n");
			    			flag2 = true;
		    			}
			    		if(q.arg3!=null && q.arg3.global && q.arg3.type.equals("memory") && !q.operator.equals("load"))
			    		{
			    			output+=("lw"+"\t"+"$k0"+"\t"+q.arg3.offset+"($s0)"+"\n");
			    			flag3 = true;
			    		}
			    		else if(q.arg3!=null && q.arg3.type.equals("register") && tab[q.arg3.number]==1000)
		    			{
		    				output+=("lw"+"\t"+"$k0"+"\t"+q.arg3.offset+"($sp)"+"\n");
			    			flag3 = true;
		    			}
		    		}
		    		

		    		if(q.operator.equals("load"))output+=("lw");
		    		else if(q.operator.equals("store"))output+=("sw");
		    		else if(q.operator.equals("+="))output+=("add");
		    		else if(q.operator.equals("-="))output+=("sub");
		    		else if(q.operator.equals("!="))output+=("sne");
		    		else if(q.operator.equals("<="))output+=("sle");
		    		else if(q.operator.equals(">="))output+=("sge");
		    		else if(q.operator.equals("^="))output+=("xor");
		    		else if(q.operator.equals("^"))output+=("xor");
		    		else if(q.operator.equals("=="))output+=("seq");
		    		else if(q.operator.equals("+"))output+=("add");
		    		else if(q.operator.equals("-"))output+=("sub");
		    		else if(q.operator.equals("<<"))output+=("sll");
		    		else if(q.operator.equals(">>"))output+=("srl");
		    		else if(q.operator.equals("*"))output+=("mul");
		    		else if(q.operator.equals("*="))output+=("mul");
		    		else if(q.operator.equals("/"))output+=("div");
		    		else if(q.operator.equals("/="))output+=("div");
		    		else if(q.operator.equals("%"))output+=("rem");
		    		else if(q.operator.equals("|"))output+=("or");
		    		else if(q.operator.equals("<"))output+=("slt");
		    		else if(q.operator.equals(">"))output+=("sgt");
		    		else if(q.operator.equals("&"))output+=("and");
		    		else if(q.operator.equals("move"))
		    		{
		    			if(q.arg3.type.equals("return"))output+=("lw");
		    			else output+=("move");
		    		}
		    		else output+=(q.operator);
		    		
			    	output+=("\t");
			    	
			    	if(q.arg1!=null)
			    	{
			    		if(flag1)output+=("$tmp15"+"\t");
			    		else output+=(q.arg1.toString()+"\t");
			    	}
			    	if(q.arg2!=null)
			    	{
			    		if(flag2)output+=("$tmp16"+"\t");
			    		else output+=(q.arg2.toString()+"\t");
			    	}
			    	if(q.arg3!=null)
			    	{
			    		if(flag3)output+=("$k0"+"\t");
			    		else output+=(q.arg3.toString());
			    	}
			    	if(flag1)
			    	{
			    		if(tab[q.arg1.number]==1000)output+=("\n"+"sw"+"\t"+"$tmp15"+"\t"+q.arg1.offset+"($sp)");
			    		else output+=("\n"+"sw"+"\t"+"$tmp15"+"\t"+q.arg1.toString());
			    	}
			
		    	}
		    	output+=("\n");
		    }
		    
		    for(int i=infinitynumber;i>=1;i--)
		    {
		    	if(tab[i]!=0)output = output.replace("$t"+i, "$tmp"+tab[i]);
		    }
		    
		    for(int i=16;i>=8;i--)
		    {
		    	output = output.replace("$tmp"+i, "$t"+(i-7));
		    }
		    output = output.replace("$tmp", "$s");
		    
		    //System.out.print(output);
		    
		    FileReader fr = new FileReader(first.class.getResource("/print.txt").getFile()); 
		    //FileReader fr = new FileReader("D:\\print.txt");  
		    int ch = 0;    
		    while((ch = fr.read())!=-1 ){    
		        output+=( (char)ch );    
		    }  
		    
		    return output;
		        
		}catch(Exception a) {
			return "";
			//return(1);
		}
		
	}
	
public static void main(String[] args)throws Exception   
{    
	/*String s = "D:\\compiler2014-testcases\\Normal";
    List<File> files = getFiles(s);
    for(File f : files){
    	output+=ln(f.getName());
    	output+=ln(work(f));
    }*/
	//System.setOut(new PrintStream(new FileOutputStream("D:\\t.s")));
	//System.out.print(work(new File("D:\\t.c")));
	System.out.print(work(new File(args[0])));
}
}
