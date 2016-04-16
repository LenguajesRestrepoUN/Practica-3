import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public class Interpreter {

    public static Symbol.Type getType(int tokenType) {
        switch ( tokenType ) {
            case PsicoderParser.CADENA :  return Symbol.Type.tCADENA;
            case PsicoderParser.CARACTER :   return Symbol.Type.tCARACTER;
            case PsicoderParser.REAL : return Symbol.Type.tREAL;
            case PsicoderParser.ENTERO : return Symbol.Type.tENTERO ;
            case PsicoderParser.ESTRUCTURA : return Symbol.Type.tESTRUCTURA ;
            case PsicoderParser.BOOLEANO : return Symbol.Type.tBOOLEANO;
        }
        return Symbol.Type.tINVALID;
    }

    public static void error(Token t, String msg) {
        System.err.printf("line %d:%d %s\n", t.getLine(), t.getCharPositionInLine(), msg);
    }

    public static void main(String[] args) throws Exception {

        try {
            PsicoderLexer lexer;

            if (args.length > 0)
                lexer = new PsicoderLexer(new ANTLRFileStream(args[0]));
            else
                lexer = new PsicoderLexer(new ANTLRInputStream(System.in));
            //ANTLRFileStream input = new ANTLRFileStream("input2.txt");
            //lexer = new PsicoderLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            PsicoderParser parser = new PsicoderParser(tokens);

            ParseTree tree = parser.ps();

            System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase();
            walker.walk(def, tree);

            //Visitor visitor = new Visitor();
            //visitor.visit(tree);
            System.out.println();

        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}
