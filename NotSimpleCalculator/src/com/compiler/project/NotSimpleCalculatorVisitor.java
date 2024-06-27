// Generated from NotSimpleCalculator.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NotSimpleCalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NotSimpleCalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NotSimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(NotSimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NotSimpleCalculatorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(NotSimpleCalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#cumTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCumTerm(NotSimpleCalculatorParser.CumTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(NotSimpleCalculatorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(NotSimpleCalculatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(NotSimpleCalculatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(NotSimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(NotSimpleCalculatorParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(NotSimpleCalculatorParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#begin_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end(NotSimpleCalculatorParser.Begin_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#print_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_simple(NotSimpleCalculatorParser.Print_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#print_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_literal(NotSimpleCalculatorParser.Print_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#if_then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then(NotSimpleCalculatorParser.If_thenContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#while_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_do(NotSimpleCalculatorParser.While_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#for_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_do(NotSimpleCalculatorParser.For_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#loop_do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do(NotSimpleCalculatorParser.Loop_doContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#cumopr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCumopr(NotSimpleCalculatorParser.CumoprContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(NotSimpleCalculatorParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NotSimpleCalculatorParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(NotSimpleCalculatorParser.AdditiveContext ctx);
}