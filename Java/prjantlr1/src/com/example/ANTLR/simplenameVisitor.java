// Generated from D:/Lukasz/JAVA/prjantlr1/src/com/example/ANTLR\simplename.g4 by ANTLR 4.9.2
package com.example.ANTLR;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link simplenameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface simplenameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link simplenameParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(simplenameParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(simplenameParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(simplenameParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(simplenameParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(simplenameParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(simplenameParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(simplenameParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(simplenameParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link simplenameParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(simplenameParser.ValueContext ctx);
}