// Generated from NotSimpleCalculator.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NotSimpleCalculatorParser}.
 */
public interface NotSimpleCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NotSimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NotSimpleCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(NotSimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(NotSimpleCalculatorParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NotSimpleCalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NotSimpleCalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(NotSimpleCalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(NotSimpleCalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#cumTerm}.
	 * @param ctx the parse tree
	 */
	void enterCumTerm(NotSimpleCalculatorParser.CumTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#cumTerm}.
	 * @param ctx the parse tree
	 */
	void exitCumTerm(NotSimpleCalculatorParser.CumTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NotSimpleCalculatorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NotSimpleCalculatorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NotSimpleCalculatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NotSimpleCalculatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(NotSimpleCalculatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(NotSimpleCalculatorParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(NotSimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(NotSimpleCalculatorParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterNumber(NotSimpleCalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link NotSimpleCalculatorParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitNumber(NotSimpleCalculatorParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(NotSimpleCalculatorParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(NotSimpleCalculatorParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end(NotSimpleCalculatorParser.Begin_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#begin_end}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end(NotSimpleCalculatorParser.Begin_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#print_simple}.
	 * @param ctx the parse tree
	 */
	void enterPrint_simple(NotSimpleCalculatorParser.Print_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#print_simple}.
	 * @param ctx the parse tree
	 */
	void exitPrint_simple(NotSimpleCalculatorParser.Print_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#print_literal}.
	 * @param ctx the parse tree
	 */
	void enterPrint_literal(NotSimpleCalculatorParser.Print_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#print_literal}.
	 * @param ctx the parse tree
	 */
	void exitPrint_literal(NotSimpleCalculatorParser.Print_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#if_then}.
	 * @param ctx the parse tree
	 */
	void enterIf_then(NotSimpleCalculatorParser.If_thenContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#if_then}.
	 * @param ctx the parse tree
	 */
	void exitIf_then(NotSimpleCalculatorParser.If_thenContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#while_do}.
	 * @param ctx the parse tree
	 */
	void enterWhile_do(NotSimpleCalculatorParser.While_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#while_do}.
	 * @param ctx the parse tree
	 */
	void exitWhile_do(NotSimpleCalculatorParser.While_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#for_do}.
	 * @param ctx the parse tree
	 */
	void enterFor_do(NotSimpleCalculatorParser.For_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#for_do}.
	 * @param ctx the parse tree
	 */
	void exitFor_do(NotSimpleCalculatorParser.For_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void enterLoop_do(NotSimpleCalculatorParser.Loop_doContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#loop_do}.
	 * @param ctx the parse tree
	 */
	void exitLoop_do(NotSimpleCalculatorParser.Loop_doContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#cumopr}.
	 * @param ctx the parse tree
	 */
	void enterCumopr(NotSimpleCalculatorParser.CumoprContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#cumopr}.
	 * @param ctx the parse tree
	 */
	void exitCumopr(NotSimpleCalculatorParser.CumoprContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(NotSimpleCalculatorParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(NotSimpleCalculatorParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NotSimpleCalculatorParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(NotSimpleCalculatorParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link NotSimpleCalculatorParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(NotSimpleCalculatorParser.AdditiveContext ctx);
}