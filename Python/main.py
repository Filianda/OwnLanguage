import sys
import antlr4
from dist.MyGrammarLexer import MyGrammarLexer
from dist.MyGrammarParser import MyGrammarParser
from dist.MyGrammarListener import MyGrammarListener as MyGrammarBaseListener
from dist.MyGrammarVisitor import MyGrammarVisitor

class MyGrammarListener(MyGrammarBaseListener):
     pass
#    def enterFunctionDef(self, ctx : MyGrammerParser.FunctionDefContext):
#        print('func name:', ctx.IDENTIFIER().getText())
        
def main():
    input_stream = antlr4.FileStream(sys.argv[1])
    lexer = MyGrammarLexer(input_stream)
    token_stream = antlr4.CommonTokenStream(lexer)
    parser = MyGrammarParser(token_stream)

    parse_tree = parser.main() #main() -> symbol startowy gramatyki
    listener = MyGrammarListener()

    walker = antlr4.ParseTreeWalker()
    walker.walk(listener, parse_tree)
    
#if __name__ == '__main__':
#	main()
main()
