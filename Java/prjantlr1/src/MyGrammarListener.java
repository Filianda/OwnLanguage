// Generated from D:/Lukasz/.Mgr_I_Sem/Jezyki_formalne_i_kompilatory/Proj2/Proj2git/OwnLanguage/Java/prjantlr1/src\MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(MyGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(MyGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(MyGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(MyGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#subbody}.
	 * @param ctx the parse tree
	 */
	void enterSubbody(MyGrammarParser.SubbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#subbody}.
	 * @param ctx the parse tree
	 */
	void exitSubbody(MyGrammarParser.SubbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#assigment}.
	 * @param ctx the parse tree
	 */
	void enterAssigment(MyGrammarParser.AssigmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#assigment}.
	 * @param ctx the parse tree
	 */
	void exitAssigment(MyGrammarParser.AssigmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MyGrammarParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MyGrammarParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#classCall}.
	 * @param ctx the parse tree
	 */
	void enterClassCall(MyGrammarParser.ClassCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#classCall}.
	 * @param ctx the parse tree
	 */
	void exitClassCall(MyGrammarParser.ClassCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#accessrules}.
	 * @param ctx the parse tree
	 */
	void enterAccessrules(MyGrammarParser.AccessrulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#accessrules}.
	 * @param ctx the parse tree
	 */
	void exitAccessrules(MyGrammarParser.AccessrulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(MyGrammarParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(MyGrammarParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MyGrammarParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MyGrammarParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#ifOperation}.
	 * @param ctx the parse tree
	 */
	void enterIfOperation(MyGrammarParser.IfOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#ifOperation}.
	 * @param ctx the parse tree
	 */
	void exitIfOperation(MyGrammarParser.IfOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MyGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MyGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterSub(MyGrammarParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nothing3}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNothing3(MyGrammarParser.Nothing3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code nothing3}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNothing3(MyGrammarParser.Nothing3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mul}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMul(MyGrammarParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterIntreal(MyGrammarParser.IntrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitIntreal(MyGrammarParser.IntrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterNothing(MyGrammarParser.NothingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitNothing(MyGrammarParser.NothingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputint}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void enterInputint(MyGrammarParser.InputintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputint}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void exitInputint(MyGrammarParser.InputintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputreal}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void enterInputreal(MyGrammarParser.InputrealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputreal}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void exitInputreal(MyGrammarParser.InputrealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputstring}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void enterInputstring(MyGrammarParser.InputstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputstring}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 */
	void exitInputstring(MyGrammarParser.InputstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MyGrammarParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MyGrammarParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MyGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MyGrammarParser.StringContext ctx);
}