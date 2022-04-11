package com.example.ANTLR;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

//        File myFile = new File("src/com/example/ANTLR/test.txt");
//        myFile.getParentFile().mkdir();
        File myFile = new File("/mnt/d/Lukasz/Java/src/com/example/ANTLR/test.txt");
        try {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(myFile));

            simplenameLexer lexer = new simplenameLexer(input);
            simplenameParser parser = new simplenameParser(new CommonTokenStream(lexer));
//            parser.addParseListener(new MyListener());

            // Start parsing
            ParseTree tree = parser.program();

//Przyklad uruchomienia ze stony https://www.baeldung.com/java-antlr
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new LLVMActions(), tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
