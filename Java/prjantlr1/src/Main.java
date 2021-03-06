import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//        File myFile = new File("src/testypodstawowe.txt");
//        myFile.getParentFile().mkdir();
        File myFile = new File("/mnt/d/Lukasz/.Mgr_I_Sem/Jezyki_formalne_i_kompilatory/Proj2/Proj2git/OwnLanguage/Java/prjantlr1/src/testypodstawowe.txt");
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(myFile));

            MyGrammarLexer lexer = new MyGrammarLexer(input);
            MyGrammarParser parser = new MyGrammarParser(new CommonTokenStream(lexer));

            ParseTree tree = parser.main();

            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new LLVMActions2(), tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
