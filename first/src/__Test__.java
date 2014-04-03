import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        firstLexer lex = new firstLexer(new ANTLRFileStream("D:\\1.c", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        firstParser g = new firstParser(tokens, 49133, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}