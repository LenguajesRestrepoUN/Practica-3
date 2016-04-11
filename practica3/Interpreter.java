import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {

    public static void main(String[] args) throws Exception {
        try {
            //File f = new File(args[0]);
            // crear un analizador le   xico que se alimenta apartir de la entrada (archivo o consola)
            PsicoderLexer lexer;
            if (args.length > 0)
                lexer = new PsicoderLexer(new ANTLRFileStream(args[0]));
            else
                lexer = new PsicoderLexer(new ANTLRInputStream(System.in));

            // Identificar al analizador lexico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Crear objeto del analizador sint�ctico que se alimenta apartir del buffer de tokens
            PsicoderParser parser = new PsicoderParser(tokens);

            ParseTree tree = parser.ps(); // begin parsing at init rule

            //ParseTreeWalker walker = new ParseTreeWalker();
            //walker.walk(new PsicoderBaseListener(), tree);
            //System.out.println();

            System.out.println(tree.toStringTree(parser));
            Visitor visitor = new Visitor();
            visitor.visit(tree);
            System.out.println();

        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}
