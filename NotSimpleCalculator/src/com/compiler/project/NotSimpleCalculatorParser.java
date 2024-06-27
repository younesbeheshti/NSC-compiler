// Generated from NotSimpleCalculator.g4 by ANTLR 4.13.1
package com.compiler.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NotSimpleCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, ID=31, NUMBER=32, 
		STRING=33, WS=34, COMMENT=35;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_cumTerm = 4, RULE_term = 5, RULE_factor = 6, RULE_exponent = 7, RULE_assign_statement = 8, 
		RULE_begin_end = 9, RULE_print_simple = 10, RULE_print_literal = 11, RULE_if_then = 12, 
		RULE_while_do = 13, RULE_for_do = 14, RULE_loop_do = 15, RULE_cumopr = 16, 
		RULE_multiplicative = 17, RULE_additive = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "expr", "cumTerm", "term", "factor", 
			"exponent", "assign_statement", "begin_end", "print_simple", "print_literal", 
			"if_then", "while_do", "for_do", "loop_do", "cumopr", "multiplicative", 
			"additive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'('", "')'", "'='", "';'", "'begin'", "'end'", "'print'", 
			"','", "'if'", "'then'", "'else'", "'while'", "'do'", "'for'", "'of'", 
			"'to'", "'loop'", "':'", "'>'", "'<='", "'>='", "'=='", "'!='", "'<'", 
			"'*'", "'/'", "'%'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "NUMBER", "STRING", "WS", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "NotSimpleCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NotSimpleCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2147788096L) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Assign_statementContext assign_statement() {
			return getRuleContext(Assign_statementContext.class,0);
		}
		public Begin_endContext begin_end() {
			return getRuleContext(Begin_endContext.class,0);
		}
		public If_thenContext if_then() {
			return getRuleContext(If_thenContext.class,0);
		}
		public While_doContext while_do() {
			return getRuleContext(While_doContext.class,0);
		}
		public For_doContext for_do() {
			return getRuleContext(For_doContext.class,0);
		}
		public Loop_doContext loop_do() {
			return getRuleContext(Loop_doContext.class,0);
		}
		public Print_simpleContext print_simple() {
			return getRuleContext(Print_simpleContext.class,0);
		}
		public Print_literalContext print_literal() {
			return getRuleContext(Print_literalContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assign_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				begin_end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				if_then();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(49);
				while_do();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				for_do();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(51);
				loop_do();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				print_simple();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(53);
				print_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<CumTermContext> cumTerm() {
			return getRuleContexts(CumTermContext.class);
		}
		public CumTermContext cumTerm(int i) {
			return getRuleContext(CumTermContext.class,i);
		}
		public List<CumoprContext> cumopr() {
			return getRuleContexts(CumoprContext.class);
		}
		public CumoprContext cumopr(int i) {
			return getRuleContext(CumoprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			cumTerm();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) {
				{
				{
				setState(57);
				cumopr();
				setState(58);
				cumTerm();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CumTermContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<AdditiveContext> additive() {
			return getRuleContexts(AdditiveContext.class);
		}
		public AdditiveContext additive(int i) {
			return getRuleContext(AdditiveContext.class,i);
		}
		public CumTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterCumTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitCumTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitCumTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CumTermContext cumTerm() throws RecognitionException {
		CumTermContext _localctx = new CumTermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cumTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			term();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				{
				setState(66);
				additive();
				setState(67);
				term();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplicativeContext> multiplicative() {
			return getRuleContexts(MultiplicativeContext.class);
		}
		public MultiplicativeContext multiplicative(int i) {
			return getRuleContext(MultiplicativeContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			factor();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
				{
				{
				setState(75);
				multiplicative();
				setState(76);
				factor();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public List<ExponentContext> exponent() {
			return getRuleContexts(ExponentContext.class);
		}
		public ExponentContext exponent(int i) {
			return getRuleContext(ExponentContext.class,i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			exponent();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				match(T__0);
				setState(85);
				exponent();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExponentContext extends ParserRuleContext {
		public ExponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponent; }
	 
		public ExponentContext() { }
		public void copyFrom(ExponentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExponentContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesizedExpressionContext(ExponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExponentContext {
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public IdentifierContext(ExponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ExponentContext {
		public TerminalNode NUMBER() { return getToken(NotSimpleCalculatorParser.NUMBER, 0); }
		public NumberContext(ExponentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExponentContext exponent() throws RecognitionException {
		ExponentContext _localctx = new ExponentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exponent);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ParenthesizedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__1);
				setState(92);
				expr();
				setState(93);
				match(T__2);
				}
				break;
			case ID:
				_localctx = new IdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ID);
				}
				break;
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__3);
			setState(101);
			expr();
			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Begin_endContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Begin_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterBegin_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitBegin_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitBegin_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_endContext begin_end() throws RecognitionException {
		Begin_endContext _localctx = new Begin_endContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_begin_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
			statements();
			setState(106);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_simpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public Print_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterPrint_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitPrint_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitPrint_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_simpleContext print_simple() throws RecognitionException {
		Print_simpleContext _localctx = new Print_simpleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__7);
			setState(109);
			match(ID);
			setState(110);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Print_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(NotSimpleCalculatorParser.STRING, 0); }
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public Print_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterPrint_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitPrint_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitPrint_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_literalContext print_literal() throws RecognitionException {
		Print_literalContext _localctx = new Print_literalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__7);
			setState(113);
			match(STRING);
			setState(114);
			match(T__8);
			setState(115);
			match(ID);
			setState(116);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_thenContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_thenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterIf_then(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitIf_then(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitIf_then(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_thenContext if_then() throws RecognitionException {
		If_thenContext _localctx = new If_thenContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__9);
			setState(119);
			expr();
			setState(120);
			match(T__10);
			setState(121);
			statement();
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(122);
				match(T__11);
				setState(123);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_doContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterWhile_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitWhile_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitWhile_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_doContext while_do() throws RecognitionException {
		While_doContext _localctx = new While_doContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__12);
			setState(127);
			expr();
			setState(128);
			match(T__13);
			setState(129);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class For_doContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(NotSimpleCalculatorParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(NotSimpleCalculatorParser.NUMBER, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterFor_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitFor_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitFor_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_doContext for_do() throws RecognitionException {
		For_doContext _localctx = new For_doContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__14);
			setState(132);
			match(ID);
			setState(133);
			match(T__15);
			setState(134);
			match(NUMBER);
			setState(135);
			match(T__16);
			setState(136);
			match(NUMBER);
			setState(137);
			match(T__13);
			setState(138);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Loop_doContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(NotSimpleCalculatorParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(NotSimpleCalculatorParser.NUMBER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Loop_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterLoop_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitLoop_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitLoop_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_doContext loop_do() throws RecognitionException {
		Loop_doContext _localctx = new Loop_doContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__17);
			setState(141);
			match(ID);
			setState(142);
			match(T__18);
			setState(143);
			match(NUMBER);
			setState(144);
			match(T__13);
			setState(145);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CumoprContext extends ParserRuleContext {
		public CumoprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cumopr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterCumopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitCumopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitCumopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CumoprContext cumopr() throws RecognitionException {
		CumoprContext _localctx = new CumoprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cumopr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeContext extends ParserRuleContext {
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NotSimpleCalculatorListener ) ((NotSimpleCalculatorListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NotSimpleCalculatorVisitor ) return ((NotSimpleCalculatorVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u009a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001"+
		"-\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003=\b\u0003\n\u0003\f\u0003"+
		"@\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"F\b\u0004\n\u0004\f\u0004I\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005O\b\u0005\n\u0005\f\u0005R\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006W\b\u0006\n\u0006\f\u0006Z\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007b\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f}\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0003\u0001\u0000\u0014"+
		"\u0019\u0001\u0000\u001a\u001c\u0001\u0000\u001d\u001e\u0095\u0000&\u0001"+
		"\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000"+
		"\u0000\u00068\u0001\u0000\u0000\u0000\bA\u0001\u0000\u0000\u0000\nJ\u0001"+
		"\u0000\u0000\u0000\fS\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000"+
		"\u0000\u0010c\u0001\u0000\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014"+
		"l\u0001\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018v\u0001"+
		"\u0000\u0000\u0000\u001a~\u0001\u0000\u0000\u0000\u001c\u0083\u0001\u0000"+
		"\u0000\u0000\u001e\u008c\u0001\u0000\u0000\u0000 \u0093\u0001\u0000\u0000"+
		"\u0000\"\u0095\u0001\u0000\u0000\u0000$\u0097\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0002\u0001\u0000\'\u0001\u0001\u0000\u0000\u0000(*\u0003\u0004"+
		"\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000.7\u0003\u0010\b\u0000/7\u0003\u0012\t"+
		"\u000007\u0003\u0018\f\u000017\u0003\u001a\r\u000027\u0003\u001c\u000e"+
		"\u000037\u0003\u001e\u000f\u000047\u0003\u0014\n\u000057\u0003\u0016\u000b"+
		"\u00006.\u0001\u0000\u0000\u00006/\u0001\u0000\u0000\u000060\u0001\u0000"+
		"\u0000\u000061\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u000063\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000065\u0001\u0000\u0000\u0000"+
		"7\u0005\u0001\u0000\u0000\u00008>\u0003\b\u0004\u00009:\u0003 \u0010\u0000"+
		":;\u0003\b\u0004\u0000;=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?\u0007\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AG\u0003"+
		"\n\u0005\u0000BC\u0003$\u0012\u0000CD\u0003\n\u0005\u0000DF\u0001\u0000"+
		"\u0000\u0000EB\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\t\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000JP\u0003\f\u0006\u0000KL\u0003\"\u0011\u0000"+
		"LM\u0003\f\u0006\u0000MO\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u000b\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000SX\u0003"+
		"\u000e\u0007\u0000TU\u0005\u0001\u0000\u0000UW\u0003\u000e\u0007\u0000"+
		"VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0002\u0000\u0000\\]\u0003\u0006\u0003\u0000]^\u0005"+
		"\u0003\u0000\u0000^b\u0001\u0000\u0000\u0000_b\u0005\u001f\u0000\u0000"+
		"`b\u0005 \u0000\u0000a[\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u0005\u001f"+
		"\u0000\u0000de\u0005\u0004\u0000\u0000ef\u0003\u0006\u0003\u0000fg\u0005"+
		"\u0005\u0000\u0000g\u0011\u0001\u0000\u0000\u0000hi\u0005\u0006\u0000"+
		"\u0000ij\u0003\u0002\u0001\u0000jk\u0005\u0007\u0000\u0000k\u0013\u0001"+
		"\u0000\u0000\u0000lm\u0005\b\u0000\u0000mn\u0005\u001f\u0000\u0000no\u0005"+
		"\u0005\u0000\u0000o\u0015\u0001\u0000\u0000\u0000pq\u0005\b\u0000\u0000"+
		"qr\u0005!\u0000\u0000rs\u0005\t\u0000\u0000st\u0005\u001f\u0000\u0000"+
		"tu\u0005\u0005\u0000\u0000u\u0017\u0001\u0000\u0000\u0000vw\u0005\n\u0000"+
		"\u0000wx\u0003\u0006\u0003\u0000xy\u0005\u000b\u0000\u0000y|\u0003\u0004"+
		"\u0002\u0000z{\u0005\f\u0000\u0000{}\u0003\u0004\u0002\u0000|z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0019\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005\r\u0000\u0000\u007f\u0080\u0003\u0006\u0003\u0000\u0080"+
		"\u0081\u0005\u000e\u0000\u0000\u0081\u0082\u0003\u0004\u0002\u0000\u0082"+
		"\u001b\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u000f\u0000\u0000\u0084"+
		"\u0085\u0005\u001f\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000\u0086"+
		"\u0087\u0005 \u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088\u0089"+
		"\u0005 \u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0003"+
		"\u0004\u0002\u0000\u008b\u001d\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\u0012\u0000\u0000\u008d\u008e\u0005\u001f\u0000\u0000\u008e\u008f\u0005"+
		"\u0013\u0000\u0000\u008f\u0090\u0005 \u0000\u0000\u0090\u0091\u0005\u000e"+
		"\u0000\u0000\u0091\u0092\u0003\u0004\u0002\u0000\u0092\u001f\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0007\u0000\u0000\u0000\u0094!\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0007\u0001\u0000\u0000\u0096#\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0007\u0002\u0000\u0000\u0098%\u0001\u0000\u0000\u0000\b"+
		"+6>GPXa|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}