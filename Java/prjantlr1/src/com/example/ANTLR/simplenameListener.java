// Generated from D:/Lukasz/JAVA/prjantlr1/src/com/example/ANTLR\simplename.g4 by ANTLR 4.9.2
package com.example.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link simplenameParser}.
 */
public interface simplenameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link simplenameParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(simplenameParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(simplenameParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(simplenameParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(simplenameParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(simplenameParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(simplenameParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(simplenameParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(simplenameParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(simplenameParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(simplenameParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(simplenameParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(simplenameParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(simplenameParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(simplenameParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(simplenameParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(simplenameParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link simplenameParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(simplenameParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link simplenameParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(simplenameParser.ValueContext ctx);
}