


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.antlr.runtime.*;  
import org.antlr.runtime.tree.BaseTree;


public class first{   
public static void main(String[] args)throws Exception   
{   
	File f = new File("D:\\1.c");  
    InputStream in = new FileInputStream(f);
    ANTLRInputStream input = new ANTLRInputStream(in);   
    firstLexer lex = new firstLexer(input);   
    CommonTokenStream tokens = new CommonTokenStream(lex);   
    firstParser parser = new firstParser(tokens);
    firstParser.program_return r = parser.program();
    String s = ((BaseTree)r.getTree()).toStringTree();
    System.out.println(s);
    String[] res = s.split(" ");
    int cnt = 0;
    
    
    for (int i=0;i<res.length;i++)
    {
    	if(res[i].contains("("))
    	{
    		int ccc = 0;
    	    for (int ii =0;ii<res[i].length();ii++)
    	    {
    	    	if(res[i].charAt(ii)=='(')ccc++;
    	    }
    	    cnt+=ccc;
    	}
    	if(res[i].contains(")"))
    	{
    		int ccc = 0;
    	    for (int ii =0;ii<res[i].length();ii++)
    	    {
    	    	if(res[i].charAt(ii)==')')ccc++;
    	    }
    	    cnt-=ccc;
    	}
    	
    	for (int ii =0;ii<res[i].length();ii++)
	    {
	    	if(res[i].charAt(ii)!=')'&&res[i].charAt(ii)!='(') System.out.print(res[i].charAt(ii));
	    }
    	System.out.print('\n');
    	
    	for (int j=1;j<=cnt;j++)System.out.print('\t');

    	
    	
    }
    //firstParser.string_return result;
    //result = parser.string();
    //Tree t = (Tree)result.getTree();
	//System.out.println(t.toStringTree());
	//CommonTree tree = (CommonTree)parser.parameters().getTree();//parse().getTree();
	//DOTTreeGenerator gen = new DOTTreeGenerator();
	//StringTemplate st = gen.toDOT(tree);
	//System.out.println(st);
    
    
}   
}  