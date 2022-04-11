// Generated from MyGrammar.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, START=11, STOP=12, ARRAYS=13, PRINT=14, INPUT=15, IF=16, ELSE=17, 
		FOR=18, WHILE=19, FUNC=20, CALL=21, GLOBAL=22, LOCAL=23, CLASS=24, MUL=25, 
		DIV=26, SUB=27, ADD=28, GREATER=29, LESS=30, GREATEREQ=31, LESSEQ=32, 
		ISEQ=33, NOTEQ=34, ID=35, STRING=36, INT=37, REAL=38, WHITESPACE=39, NEWLINE=40;
	public static final int
		RULE_main = 0, RULE_body = 1, RULE_subbody = 2, RULE_assigment = 3, RULE_classDecl = 4, 
		RULE_classCall = 5, RULE_accessrules = 6, RULE_functionDecl = 7, RULE_functionCall = 8, 
		RULE_forLoop = 9, RULE_whileLoop = 10, RULE_ifOperation = 11, RULE_condition = 12, 
		RULE_block = 13, RULE_arithmetic = 14, RULE_concat = 15, RULE_enteroperations = 16, 
		RULE_number = 17, RULE_array = 18, RULE_value = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "body", "subbody", "assigment", "classDecl", "classCall", "accessrules", 
			"functionDecl", "functionCall", "forLoop", "whileLoop", "ifOperation", 
			"condition", "block", "arithmetic", "concat", "enteroperations", "number", 
			"array", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'|'", "':'", "'('", "'):'", "')'", "'->'", "'{'", 
			"'}'", "'start'", "'stop'", "'array'", "'print'", "'input'", "'if'", 
			"'else'", "'for'", "'while'", "'func'", "'call'", "'global'", "'local'", 
			"'class'", "'*'", "'/'", "'-'", "'+'", "'>'", "'<'", "'>='", "'<='", 
			"'?='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "START", 
			"STOP", "ARRAYS", "PRINT", "INPUT", "IF", "ELSE", "FOR", "WHILE", "FUNC", 
			"CALL", "GLOBAL", "LOCAL", "CLASS", "MUL", "DIV", "SUB", "ADD", "GREATER", 
			"LESS", "GREATEREQ", "LESSEQ", "ISEQ", "NOTEQ", "ID", "STRING", "INT", 
			"REAL", "WHITESPACE", "NEWLINE"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(MyGrammarParser.START, 0); }
		public TerminalNode STOP() { return getToken(MyGrammarParser.STOP, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(START);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ARRAYS) | (1L << PRINT) | (1L << INPUT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNC) | (1L << CALL) | (1L << GLOBAL) | (1L << LOCAL) | (1L << CLASS) | (1L << SUB) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				{
				setState(41);
				body();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
			match(STOP);
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

	public static class BodyContext extends ParserRuleContext {
		public EnteroperationsContext enteroperations() {
			return getRuleContext(EnteroperationsContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public SubbodyContext subbody() {
			return getRuleContext(SubbodyContext.class,0);
		}
		public IfOperationContext ifOperation() {
			return getRuleContext(IfOperationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AccessrulesContext accessrules() {
			return getRuleContext(AccessrulesContext.class,0);
		}
		public ClassDeclContext classDecl() {
			return getRuleContext(ClassDeclContext.class,0);
		}
		public ClassCallContext classCall() {
			return getRuleContext(ClassCallContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				enteroperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				arithmetic(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				subbody();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				ifOperation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				forLoop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				whileLoop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				functionDecl();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				functionCall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				accessrules();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(59);
				classDecl();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(60);
				classCall();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(61);
				assigment();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(62);
				value();
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

	public static class SubbodyContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public SubbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSubbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSubbody(this);
		}
	}

	public final SubbodyContext subbody() throws RecognitionException {
		SubbodyContext _localctx = new SubbodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subbody);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				concat(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				arithmetic(0);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public SubbodyContext subbody() {
			return getRuleContext(SubbodyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssigment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssigment(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(T__0);
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(73);
				subbody();
				}
				break;
			case 2:
				{
				setState(74);
				value();
				}
				break;
			}
			setState(77);
			match(T__1);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MyGrammarParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitClassDecl(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(CLASS);
				setState(80);
				match(ID);
				setState(81);
				match(T__2);
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(82);
					value();
					}
					break;
				}
				}
				break;
			case T__2:
			case ARRAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(85);
					array();
					}
				}

				setState(88);
				match(T__2);
				setState(89);
				match(T__3);
				setState(90);
				block();
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

	public static class ClassCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MyGrammarParser.CALL, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ClassCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterClassCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitClassCall(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classCall);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(CALL);
				setState(94);
				match(ID);
				setState(95);
				match(T__2);
				setState(97);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(96);
					value();
					}
					break;
				}
				}
				break;
			case T__2:
			case ARRAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(99);
					array();
					}
				}

				setState(102);
				match(T__2);
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

	public static class AccessrulesContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(MyGrammarParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(MyGrammarParser.LOCAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AccessrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessrules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAccessrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAccessrules(this);
		}
	}

	public final AccessrulesContext accessrules() throws RecognitionException {
		AccessrulesContext _localctx = new AccessrulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accessrules);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(GLOBAL);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(LOCAL);
				setState(107);
				value();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(MyGrammarParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDecl);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(FUNC);
				setState(111);
				match(ID);
				setState(112);
				match(T__4);
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(113);
					value();
					}
					break;
				}
				}
				break;
			case T__5:
			case ARRAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(116);
					array();
					}
				}

				setState(119);
				match(T__5);
				setState(120);
				block();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(MyGrammarParser.CALL, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(CALL);
				setState(124);
				match(ID);
				setState(125);
				match(T__4);
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(126);
					value();
					}
					break;
				}
				}
				break;
			case T__6:
			case ARRAYS:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(129);
					array();
					}
				}

				setState(132);
				match(T__6);
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

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyGrammarParser.FOR, 0); }
		public List<TerminalNode> INT() { return getTokens(MyGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MyGrammarParser.INT, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FOR);
			setState(136);
			match(INT);
			setState(137);
			match(T__7);
			setState(138);
			match(INT);
			setState(139);
			match(T__3);
			setState(140);
			block();
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

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyGrammarParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(WHILE);
			setState(143);
			condition();
			setState(144);
			match(T__3);
			setState(145);
			block();
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

	public static class IfOperationContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyGrammarParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MyGrammarParser.ELSE, 0); }
		public IfOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIfOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIfOperation(this);
		}
	}

	public final IfOperationContext ifOperation() throws RecognitionException {
		IfOperationContext _localctx = new IfOperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IF);
			setState(148);
			condition();
			setState(149);
			match(T__3);
			setState(150);
			block();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(151);
				match(ELSE);
				setState(152);
				match(T__3);
				setState(153);
				block();
				}
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode LESS() { return getToken(MyGrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(MyGrammarParser.GREATER, 0); }
		public TerminalNode LESSEQ() { return getToken(MyGrammarParser.LESSEQ, 0); }
		public TerminalNode GREATEREQ() { return getToken(MyGrammarParser.GREATEREQ, 0); }
		public TerminalNode ISEQ() { return getToken(MyGrammarParser.ISEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(MyGrammarParser.NOTEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				value();
				setState(157);
				_la = _input.LA(1);
				if ( !(_la==GREATER || _la==LESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				value();
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==GREATEREQ || _la==LESSEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(162);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				value();
				setState(165);
				_la = _input.LA(1);
				if ( !(_la==ISEQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				value();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__8);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ARRAYS) | (1L << PRINT) | (1L << INPUT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNC) | (1L << CALL) | (1L << GLOBAL) | (1L << LOCAL) | (1L << CLASS) | (1L << SUB) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				{
				setState(171);
				body();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__9);
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

	public static class ArithmeticContext extends ParserRuleContext {
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	 
		public ArithmeticContext() { }
		public void copyFrom(ArithmeticContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public AddContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd(this);
		}
	}
	public static class DivContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public DivContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDiv(this);
		}
	}
	public static class SubContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public SubContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSub(this);
		}
	}
	public static class Nothing3Context extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Nothing3Context(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNothing3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNothing3(this);
		}
	}
	public static class MulContext extends ArithmeticContext {
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode MUL() { return getToken(MyGrammarParser.MUL, 0); }
		public MulContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMul(this);
		}
	}
	public static class IntrealContext extends ArithmeticContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IntrealContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIntreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIntreal(this);
		}
	}
	public static class Nothing2Context extends ArithmeticContext {
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Nothing2Context(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNothing2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNothing2(this);
		}
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		return arithmetic(0);
	}

	private ArithmeticContext arithmetic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, _parentState);
		ArithmeticContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithmetic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				{
				_localctx = new IntrealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				number();
				}
				break;
			case SUB:
				{
				_localctx = new Nothing2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(SUB);
				setState(182);
				number();
				}
				break;
			case T__4:
				{
				_localctx = new Nothing3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__4);
				setState(184);
				arithmetic(0);
				setState(185);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(189);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(190);
						match(ADD);
						setState(191);
						arithmetic(8);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(192);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(193);
						match(SUB);
						setState(194);
						arithmetic(7);
						}
						break;
					case 3:
						{
						_localctx = new MulContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(195);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(196);
						match(MUL);
						setState(197);
						arithmetic(6);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(198);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(199);
						match(DIV);
						setState(200);
						arithmetic(5);
						}
						break;
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConcatContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public List<ConcatContext> concat() {
			return getRuleContexts(ConcatContext.class);
		}
		public ConcatContext concat(int i) {
			return getRuleContext(ConcatContext.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitConcat(this);
		}
	}

	public final ConcatContext concat() throws RecognitionException {
		return concat(0);
	}

	private ConcatContext concat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConcatContext _localctx = new ConcatContext(_ctx, _parentState);
		ConcatContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_concat, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(207);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(208);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_concat);
					setState(211);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(212);
					match(ADD);
					setState(213);
					concat(4);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnteroperationsContext extends ParserRuleContext {
		public EnteroperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enteroperations; }
	 
		public EnteroperationsContext() { }
		public void copyFrom(EnteroperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputContext extends EnteroperationsContext {
		public TerminalNode INPUT() { return getToken(MyGrammarParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public InputContext(EnteroperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInput(this);
		}
	}
	public static class PrintContext extends EnteroperationsContext {
		public TerminalNode PRINT() { return getToken(MyGrammarParser.PRINT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PrintContext(EnteroperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint(this);
		}
	}

	public final EnteroperationsContext enteroperations() throws RecognitionException {
		EnteroperationsContext _localctx = new EnteroperationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enteroperations);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(PRINT);
				setState(220);
				match(T__4);
				setState(221);
				value();
				setState(222);
				match(T__6);
				}
				break;
			case INPUT:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(INPUT);
				setState(225);
				match(ID);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(MyGrammarParser.REAL, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==REAL) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAYS() { return getToken(MyGrammarParser.ARRAYS, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(ARRAYS);
			setState(231);
			match(T__8);
			setState(232);
			value();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(233);
				match(T__1);
				setState(234);
				value();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(T__9);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
		case 15:
			return concat_sempred((ConcatContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmetic_sempred(ArithmeticContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean concat_sempred(ConcatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00fa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3"+
		"\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\5\5N\n\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\5\6V\n\6\3\6\5\6Y\n\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\5\7d\n\7"+
		"\3\7\5\7g\n\7\3\7\5\7j\n\7\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\5\tu\n"+
		"\t\3\t\5\tx\n\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\5\n\u0082\n\n\3\n\5\n"+
		"\u0085\n\n\3\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ab\n\16\3\17\3\17"+
		"\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u00cc\n\20\f\20\16\20\u00cf\13\20\3\21"+
		"\3\21\3\21\5\21\u00d4\n\21\3\21\3\21\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\24\3"+
		"\24\3\25\3\25\3\25\5\25\u00f8\n\25\3\25\2\4\36 \26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\6\3\2\37 \3\2!\"\3\2#$\3\2\'(\2\u0114\2*\3"+
		"\2\2\2\4A\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\n]\3\2\2\2\fi\3\2\2\2\16n\3\2"+
		"\2\2\20{\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u0090\3\2\2\2\30"+
		"\u0095\3\2\2\2\32\u00aa\3\2\2\2\34\u00ac\3\2\2\2\36\u00bd\3\2\2\2 \u00d3"+
		"\3\2\2\2\"\u00e4\3\2\2\2$\u00e6\3\2\2\2&\u00e8\3\2\2\2(\u00f7\3\2\2\2"+
		"*.\7\r\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2"+
		"\2\2\60.\3\2\2\2\61\62\7\16\2\2\62\3\3\2\2\2\63B\5\"\22\2\64B\5\36\20"+
		"\2\65B\5\6\4\2\66B\5\30\r\2\67B\5\32\16\28B\5\24\13\29B\5\26\f\2:B\5\20"+
		"\t\2;B\5\22\n\2<B\5\16\b\2=B\5\n\6\2>B\5\f\7\2?B\5\b\5\2@B\5(\25\2A\63"+
		"\3\2\2\2A\64\3\2\2\2A\65\3\2\2\2A\66\3\2\2\2A\67\3\2\2\2A8\3\2\2\2A9\3"+
		"\2\2\2A:\3\2\2\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3"+
		"\2\2\2B\5\3\2\2\2CH\5&\24\2DH\5 \21\2EH\5\32\16\2FH\5\36\20\2GC\3\2\2"+
		"\2GD\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\7%\2\2JM\7\3\2\2KN\5\6\4"+
		"\2LN\5(\25\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\7\4\2\2P\t\3\2\2\2QR\7\32"+
		"\2\2RS\7%\2\2SU\7\5\2\2TV\5(\25\2UT\3\2\2\2UV\3\2\2\2V^\3\2\2\2WY\5&\24"+
		"\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\5\2\2[\\\7\6\2\2\\^\5\34\17\2]Q\3"+
		"\2\2\2]X\3\2\2\2^\13\3\2\2\2_`\7\27\2\2`a\7%\2\2ac\7\5\2\2bd\5(\25\2c"+
		"b\3\2\2\2cd\3\2\2\2dj\3\2\2\2eg\5&\24\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2"+
		"hj\7\5\2\2i_\3\2\2\2if\3\2\2\2j\r\3\2\2\2ko\7\30\2\2lm\7\31\2\2mo\5(\25"+
		"\2nk\3\2\2\2nl\3\2\2\2o\17\3\2\2\2pq\7\26\2\2qr\7%\2\2rt\7\7\2\2su\5("+
		"\25\2ts\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\5&\24\2wv\3\2\2\2wx\3\2\2\2xy\3"+
		"\2\2\2yz\7\b\2\2z|\5\34\17\2{p\3\2\2\2{w\3\2\2\2|\21\3\2\2\2}~\7\27\2"+
		"\2~\177\7%\2\2\177\u0081\7\7\2\2\u0080\u0082\5(\25\2\u0081\u0080\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0088\3\2\2\2\u0083\u0085\5&\24\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\7\t\2\2\u0087"+
		"}\3\2\2\2\u0087\u0084\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008b\7\'\2\2\u008b\u008c\7\n\2\2\u008c\u008d\7\'\2\2\u008d\u008e\7\6"+
		"\2\2\u008e\u008f\5\34\17\2\u008f\25\3\2\2\2\u0090\u0091\7\25\2\2\u0091"+
		"\u0092\5\32\16\2\u0092\u0093\7\6\2\2\u0093\u0094\5\34\17\2\u0094\27\3"+
		"\2\2\2\u0095\u0096\7\22\2\2\u0096\u0097\5\32\16\2\u0097\u0098\7\6\2\2"+
		"\u0098\u009c\5\34\17\2\u0099\u009a\7\23\2\2\u009a\u009b\7\6\2\2\u009b"+
		"\u009d\5\34\17\2\u009c\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\31\3\2"+
		"\2\2\u009e\u009f\5(\25\2\u009f\u00a0\t\2\2\2\u00a0\u00a1\5(\25\2\u00a1"+
		"\u00ab\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\t\3\2\2\u00a4\u00a5\5("+
		"\25\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\t\4\2\2\u00a8"+
		"\u00a9\5(\25\2\u00a9\u00ab\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00a6\3\2\2\2\u00ab\33\3\2\2\2\u00ac\u00b0\7\13\2\2\u00ad\u00af"+
		"\5\4\3\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\f"+
		"\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\b\20\1\2\u00b6\u00be\5$\23\2\u00b7\u00b8"+
		"\7\35\2\2\u00b8\u00be\5$\23\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\5\36\20"+
		"\2\u00bb\u00bc\7\t\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b7"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00cd\3\2\2\2\u00bf\u00c0\f\t\2\2\u00c0"+
		"\u00c1\7\36\2\2\u00c1\u00cc\5\36\20\n\u00c2\u00c3\f\b\2\2\u00c3\u00c4"+
		"\7\35\2\2\u00c4\u00cc\5\36\20\t\u00c5\u00c6\f\7\2\2\u00c6\u00c7\7\33\2"+
		"\2\u00c7\u00cc\5\36\20\b\u00c8\u00c9\f\6\2\2\u00c9\u00ca\7\34\2\2\u00ca"+
		"\u00cc\5\36\20\7\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c5\3"+
		"\2\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\37\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\b\21\1"+
		"\2\u00d1\u00d4\7&\2\2\u00d2\u00d4\7%\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\f\5\2\2\u00d6\u00d7\7\36\2\2"+
		"\u00d7\u00d9\5 \21\6\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db!\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00de\7\20\2\2\u00de\u00df\7\7\2\2\u00df\u00e0\5(\25\2\u00e0\u00e1\7"+
		"\t\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\21\2\2\u00e3\u00e5\7%\2\2\u00e4"+
		"\u00dd\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5#\3\2\2\2\u00e6\u00e7\t\5\2\2"+
		"\u00e7%\3\2\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00ef"+
		"\5(\25\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee\5(\25\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\f\2\2\u00f3\'\3\2\2\2\u00f4\u00f8"+
		"\5$\23\2\u00f5\u00f8\7&\2\2\u00f6\u00f8\7%\2\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8)\3\2\2\2\36.AGMUX]cfintw{\u0081"+
		"\u0084\u0087\u009c\u00aa\u00b0\u00bd\u00cb\u00cd\u00d3\u00da\u00e4\u00ef"+
		"\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}