// Generated from D:/Lukasz/.Mgr_I_Sem/Jezyki_formalne_i_kompilatory/Proj2/Proj2git/OwnLanguage/Java/prjantlr1/src\MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(MyGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(MyGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#subbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubbody(MyGrammarParser.SubbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(MyGrammarParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(MyGrammarParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#classCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCall(MyGrammarParser.ClassCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#accessrules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessrules(MyGrammarParser.AccessrulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(MyGrammarParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(MyGrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MyGrammarParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MyGrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#ifOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfOperation(MyGrammarParser.IfOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MyGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MyGrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(MyGrammarParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nothing3}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing3(MyGrammarParser.Nothing3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mul}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(MyGrammarParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intreal}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntreal(MyGrammarParser.IntrealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nothing}
	 * labeled alternative in {@link MyGrammarParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNothing(MyGrammarParser.NothingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputint}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputint(MyGrammarParser.InputintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputreal}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputreal(MyGrammarParser.InputrealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputstring}
	 * labeled alternative in {@link MyGrammarParser#enteroperations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputstring(MyGrammarParser.InputstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(MyGrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MyGrammarParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyGrammarParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(MyGrammarParser.StringContext ctx);
}