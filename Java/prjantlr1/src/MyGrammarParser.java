// Generated from D:/Lukasz/JAVA/prjantlr1/src\MyGrammar.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, START=11, STOP=12, ARRAYS=13, PRINT=14, INPUT=15, TYPEINT=16, 
		TYPEREAL=17, IF=18, ELSE=19, FOR=20, WHILE=21, FUNC=22, CALL=23, GLOBAL=24, 
		LOCAL=25, CLASS=26, MUL=27, DIV=28, SUB=29, ADD=30, GREATER=31, LESS=32, 
		GREATEREQ=33, LESSEQ=34, ISEQ=35, NOTEQ=36, ID=37, STRING=38, INT=39, 
		REAL=40, WHITESPACE=41, NEWLINE=42;
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
			"'}'", "'start'", "'stop'", "'array'", "'print'", "'input'", "'int'", 
			"'real'", "'if'", "'else'", "'for'", "'while'", "'func'", "'call'", "'global'", 
			"'local'", "'class'", "'*'", "'/'", "'-'", "'+'", "'>'", "'<'", "'>='", 
			"'<='", "'?='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "START", 
			"STOP", "ARRAYS", "PRINT", "INPUT", "TYPEINT", "TYPEREAL", "IF", "ELSE", 
			"FOR", "WHILE", "FUNC", "CALL", "GLOBAL", "LOCAL", "CLASS", "MUL", "DIV", 
			"SUB", "ADD", "GREATER", "LESS", "GREATEREQ", "LESSEQ", "ISEQ", "NOTEQ", 
			"ID", "STRING", "INT", "REAL", "WHITESPACE", "NEWLINE"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
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
		public SubbodyContext subbody() {
			return getRuleContext(SubbodyContext.class,0);
		}
		public IfOperationContext ifOperation() {
			return getRuleContext(IfOperationContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			setState(61);
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
				subbody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				ifOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				functionDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				accessrules();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(57);
				classDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(58);
				classCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(59);
				assigment();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(60);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSubbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubbodyContext subbody() throws RecognitionException {
		SubbodyContext _localctx = new SubbodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subbody);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				concat(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(T__0);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(71);
				subbody();
				}
				break;
			case 2:
				{
				setState(72);
				value();
				}
				break;
			}
			setState(75);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDecl);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(CLASS);
				setState(78);
				match(ID);
				setState(79);
				match(T__2);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(80);
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
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(83);
					array();
					}
				}

				setState(86);
				match(T__2);
				setState(87);
				match(T__3);
				setState(88);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitClassCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassCallContext classCall() throws RecognitionException {
		ClassCallContext _localctx = new ClassCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classCall);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(CALL);
				setState(92);
				match(ID);
				setState(93);
				match(T__2);
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(94);
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
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(97);
					array();
					}
				}

				setState(100);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAccessrules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessrulesContext accessrules() throws RecognitionException {
		AccessrulesContext _localctx = new AccessrulesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accessrules);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(GLOBAL);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(LOCAL);
				setState(105);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDecl);
		int _la;
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(FUNC);
				setState(109);
				match(ID);
				setState(110);
				match(T__4);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(111);
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
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(114);
					array();
					}
				}

				setState(117);
				match(T__5);
				setState(118);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionCall);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(CALL);
				setState(122);
				match(ID);
				setState(123);
				match(T__4);
				setState(125);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(124);
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
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAYS) {
					{
					setState(127);
					array();
					}
				}

				setState(130);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FOR);
			setState(134);
			match(INT);
			setState(135);
			match(T__7);
			setState(136);
			match(INT);
			setState(137);
			match(T__3);
			setState(138);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(WHILE);
			setState(141);
			condition();
			setState(142);
			match(T__3);
			setState(143);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIfOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfOperationContext ifOperation() throws RecognitionException {
		IfOperationContext _localctx = new IfOperationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IF);
			setState(146);
			condition();
			setState(147);
			match(T__3);
			setState(148);
			block();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(149);
				match(ELSE);
				setState(150);
				match(T__3);
				setState(151);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				value();
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==GREATER || _la==LESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				value();
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==GREATEREQ || _la==LESSEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				value();
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==ISEQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__8);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << ARRAYS) | (1L << PRINT) | (1L << INPUT) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNC) | (1L << CALL) | (1L << GLOBAL) | (1L << LOCAL) | (1L << CLASS) | (1L << SUB) | (1L << ID) | (1L << STRING) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				{
				setState(169);
				body();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNothing3(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIntreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NothingContext extends ArithmeticContext {
		public TerminalNode SUB() { return getToken(MyGrammarParser.SUB, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NothingContext(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNothing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNothing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNothing(this);
			else return visitor.visitChildren(this);
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
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				_localctx = new Nothing3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				match(T__4);
				setState(179);
				arithmetic(0);
				setState(180);
				match(T__6);
				}
				break;
			case SUB:
				{
				_localctx = new NothingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(SUB);
				setState(183);
				number();
				}
				break;
			case INT:
			case REAL:
				{
				_localctx = new IntrealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						match(MUL);
						setState(189);
						arithmetic(7);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						match(DIV);
						setState(192);
						arithmetic(6);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						match(ADD);
						setState(195);
						arithmetic(5);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(SUB);
						setState(198);
						arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(203);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
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
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(205);
				match(STRING);
				}
				break;
			case ID:
				{
				setState(206);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
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
					setState(209);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(210);
					match(ADD);
					setState(211);
					concat(4);
					}
					} 
				}
				setState(216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputrealContext extends EnteroperationsContext {
		public TerminalNode INPUT() { return getToken(MyGrammarParser.INPUT, 0); }
		public TerminalNode TYPEREAL() { return getToken(MyGrammarParser.TYPEREAL, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public InputrealContext(EnteroperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputreal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputreal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputintContext extends EnteroperationsContext {
		public TerminalNode INPUT() { return getToken(MyGrammarParser.INPUT, 0); }
		public TerminalNode TYPEINT() { return getToken(MyGrammarParser.TYPEINT, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public InputintContext(EnteroperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInputint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnteroperationsContext enteroperations() throws RecognitionException {
		EnteroperationsContext _localctx = new EnteroperationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enteroperations);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(PRINT);
				setState(218);
				match(T__4);
				setState(219);
				value();
				setState(220);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new InputintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(INPUT);
				setState(223);
				match(TYPEINT);
				setState(224);
				match(ID);
				}
				break;
			case 3:
				_localctx = new InputrealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(INPUT);
				setState(226);
				match(TYPEREAL);
				setState(227);
				match(ID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ARRAYS);
			setState(233);
			match(T__8);
			setState(234);
			value();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(235);
				match(T__1);
				setState(236);
				value();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(242);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				number();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\4\3\4\3"+
		"\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\5\5L\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6T"+
		"\n\6\3\6\5\6W\n\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\5\7b\n\7\3\7\5"+
		"\7e\n\7\3\7\5\7h\n\7\3\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\5\ts\n\t\3\t"+
		"\5\tv\n\t\3\t\3\t\5\tz\n\t\3\n\3\n\3\n\3\n\5\n\u0080\n\n\3\n\5\n\u0083"+
		"\n\n\3\n\5\n\u0086\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17\7\17"+
		"\u00ad\n\17\f\17\16\17\u00b0\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00bc\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u00ca\n\20\f\20\16\20\u00cd\13\20\3\21\3\21"+
		"\3\21\5\21\u00d2\n\21\3\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e7"+
		"\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00f0\n\24\f\24\16\24\u00f3"+
		"\13\24\3\24\3\24\3\25\3\25\3\25\5\25\u00fa\n\25\3\25\2\4\36 \26\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2!\"\3\2#$\3\2%&\3\2)*\2"+
		"\u0115\2*\3\2\2\2\4?\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\n[\3\2\2\2\fg\3\2\2"+
		"\2\16l\3\2\2\2\20y\3\2\2\2\22\u0085\3\2\2\2\24\u0087\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u0093\3\2\2\2\32\u00a8\3\2\2\2\34\u00aa\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00d1\3\2\2\2\"\u00e6\3\2\2\2$\u00e8\3\2\2\2&\u00ea\3\2\2\2(\u00f9"+
		"\3\2\2\2*.\7\r\2\2+-\5\4\3\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2"+
		"/\61\3\2\2\2\60.\3\2\2\2\61\62\7\16\2\2\62\3\3\2\2\2\63@\5\"\22\2\64@"+
		"\5\6\4\2\65@\5\30\r\2\66@\5\24\13\2\67@\5\26\f\28@\5\20\t\29@\5\22\n\2"+
		":@\5\16\b\2;@\5\n\6\2<@\5\f\7\2=@\5\b\5\2>@\5(\25\2?\63\3\2\2\2?\64\3"+
		"\2\2\2?\65\3\2\2\2?\66\3\2\2\2?\67\3\2\2\2?8\3\2\2\2?9\3\2\2\2?:\3\2\2"+
		"\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@\5\3\2\2\2AF\5&\24\2BF\5 \21"+
		"\2CF\5\32\16\2DF\5\36\20\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\7"+
		"\3\2\2\2GH\7\'\2\2HK\7\3\2\2IL\5\6\4\2JL\5(\25\2KI\3\2\2\2KJ\3\2\2\2L"+
		"M\3\2\2\2MN\7\4\2\2N\t\3\2\2\2OP\7\34\2\2PQ\7\'\2\2QS\7\5\2\2RT\5(\25"+
		"\2SR\3\2\2\2ST\3\2\2\2T\\\3\2\2\2UW\5&\24\2VU\3\2\2\2VW\3\2\2\2WX\3\2"+
		"\2\2XY\7\5\2\2YZ\7\6\2\2Z\\\5\34\17\2[O\3\2\2\2[V\3\2\2\2\\\13\3\2\2\2"+
		"]^\7\31\2\2^_\7\'\2\2_a\7\5\2\2`b\5(\25\2a`\3\2\2\2ab\3\2\2\2bh\3\2\2"+
		"\2ce\5&\24\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7\5\2\2g]\3\2\2\2gd\3\2\2"+
		"\2h\r\3\2\2\2im\7\32\2\2jk\7\33\2\2km\5(\25\2li\3\2\2\2lj\3\2\2\2m\17"+
		"\3\2\2\2no\7\30\2\2op\7\'\2\2pr\7\7\2\2qs\5(\25\2rq\3\2\2\2rs\3\2\2\2"+
		"sz\3\2\2\2tv\5&\24\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\b\2\2xz\5\34\17"+
		"\2yn\3\2\2\2yu\3\2\2\2z\21\3\2\2\2{|\7\31\2\2|}\7\'\2\2}\177\7\7\2\2~"+
		"\u0080\5(\25\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0086\3\2\2\2\u0081"+
		"\u0083\5&\24\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0086\7\t\2\2\u0085{\3\2\2\2\u0085\u0082\3\2\2\2\u0086\23\3"+
		"\2\2\2\u0087\u0088\7\26\2\2\u0088\u0089\7)\2\2\u0089\u008a\7\n\2\2\u008a"+
		"\u008b\7)\2\2\u008b\u008c\7\6\2\2\u008c\u008d\5\34\17\2\u008d\25\3\2\2"+
		"\2\u008e\u008f\7\27\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\6\2\2\u0091"+
		"\u0092\5\34\17\2\u0092\27\3\2\2\2\u0093\u0094\7\24\2\2\u0094\u0095\5\32"+
		"\16\2\u0095\u0096\7\6\2\2\u0096\u009a\5\34\17\2\u0097\u0098\7\25\2\2\u0098"+
		"\u0099\7\6\2\2\u0099\u009b\5\34\17\2\u009a\u0097\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\31\3\2\2\2\u009c\u009d\5(\25\2\u009d\u009e\t\2\2\2\u009e"+
		"\u009f\5(\25\2\u009f\u00a9\3\2\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\t\3"+
		"\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\5(\25\2\u00a5"+
		"\u00a6\t\4\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a9\3\2\2\2\u00a8\u009c\3\2"+
		"\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\33\3\2\2\2\u00aa\u00ae"+
		"\7\13\2\2\u00ab\u00ad\5\4\3\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b2\7\f\2\2\u00b2\35\3\2\2\2\u00b3\u00b4\b\20\1\2\u00b4"+
		"\u00b5\7\7\2\2\u00b5\u00b6\5\36\20\2\u00b6\u00b7\7\t\2\2\u00b7\u00bc\3"+
		"\2\2\2\u00b8\u00b9\7\37\2\2\u00b9\u00bc\5$\23\2\u00ba\u00bc\5$\23\2\u00bb"+
		"\u00b3\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00cb\3\2"+
		"\2\2\u00bd\u00be\f\b\2\2\u00be\u00bf\7\35\2\2\u00bf\u00ca\5\36\20\t\u00c0"+
		"\u00c1\f\7\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00ca\5\36\20\b\u00c3\u00c4"+
		"\f\6\2\2\u00c4\u00c5\7 \2\2\u00c5\u00ca\5\36\20\7\u00c6\u00c7\f\5\2\2"+
		"\u00c7\u00c8\7\37\2\2\u00c8\u00ca\5\36\20\6\u00c9\u00bd\3\2\2\2\u00c9"+
		"\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\37\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00cf\b\21\1\2\u00cf\u00d2\7(\2\2\u00d0\u00d2\7\'\2\2\u00d1"+
		"\u00ce\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d4\f\5"+
		"\2\2\u00d4\u00d5\7 \2\2\u00d5\u00d7\5 \21\6\u00d6\u00d3\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9!\3\2\2\2"+
		"\u00da\u00d8\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00de"+
		"\5(\25\2\u00de\u00df\7\t\2\2\u00df\u00e7\3\2\2\2\u00e0\u00e1\7\21\2\2"+
		"\u00e1\u00e2\7\22\2\2\u00e2\u00e7\7\'\2\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5"+
		"\7\23\2\2\u00e5\u00e7\7\'\2\2\u00e6\u00db\3\2\2\2\u00e6\u00e0\3\2\2\2"+
		"\u00e6\u00e3\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00e9\t\5\2\2\u00e9%\3\2\2\2"+
		"\u00ea\u00eb\7\17\2\2\u00eb\u00ec\7\13\2\2\u00ec\u00f1\5(\25\2\u00ed\u00ee"+
		"\7\4\2\2\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f4\u00f5\7\f\2\2\u00f5\'\3\2\2\2\u00f6\u00fa\5$\23\2\u00f7\u00fa"+
		"\7(\2\2\u00f8\u00fa\7\'\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa)\3\2\2\2\36.?EKSV[adglruy\177\u0082\u0085\u009a\u00a8"+
		"\u00ae\u00bb\u00c9\u00cb\u00d1\u00d8\u00e6\u00f1\u00f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}