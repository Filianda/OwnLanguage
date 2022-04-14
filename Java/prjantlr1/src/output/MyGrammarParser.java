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
		T__9=10, T__10=11, T__11=12, START=13, STOP=14, ARRAYS=15, PRINT=16, INPUT=17, 
		TYPEINT=18, TYPEREAL=19, TYPESTRING=20, IF=21, ELSE=22, FOR=23, WHILE=24, 
		FUNC=25, CALL=26, GLOBAL=27, LOCAL=28, CLASS=29, MUL=30, DIV=31, SUB=32, 
		ADD=33, GREATER=34, LESS=35, GREATEREQ=36, LESSEQ=37, ISEQ=38, NOTEQ=39, 
		ID=40, STRING=41, INT=42, REAL=43, WHITESPACE=44, NEWLINE=45;
	public static final int
		RULE_main = 0, RULE_body = 1, RULE_subbody = 2, RULE_assigment = 3, RULE_arrayindex = 4, 
		RULE_declarationArray = 5, RULE_classDecl = 6, RULE_classCall = 7, RULE_accessrules = 8, 
		RULE_functionDecl = 9, RULE_functionCall = 10, RULE_forLoop = 11, RULE_whileLoop = 12, 
		RULE_ifOperation = 13, RULE_condition = 14, RULE_block = 15, RULE_arithmetic = 16, 
		RULE_enteroperations = 17, RULE_number = 18, RULE_array = 19, RULE_value = 20, 
		RULE_string = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "body", "subbody", "assigment", "arrayindex", "declarationArray", 
			"classDecl", "classCall", "accessrules", "functionDecl", "functionCall", 
			"forLoop", "whileLoop", "ifOperation", "condition", "block", "arithmetic", 
			"enteroperations", "number", "array", "value", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'['", "']'", "'|'", "':'", "'('", "'):'", "')'", 
			"'->'", "'{'", "'}'", "'start'", "'stop'", "'array'", "'print'", "'input'", 
			"'int'", "'real'", "'string'", "'if'", "'else'", "'for'", "'while'", 
			"'func'", "'call'", "'global'", "'local'", "'class'", "'*'", "'/'", "'-'", 
			"'+'", "'>'", "'<'", "'>='", "'<='", "'?='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "START", "STOP", "ARRAYS", "PRINT", "INPUT", "TYPEINT", "TYPEREAL", 
			"TYPESTRING", "IF", "ELSE", "FOR", "WHILE", "FUNC", "CALL", "GLOBAL", 
			"LOCAL", "CLASS", "MUL", "DIV", "SUB", "ADD", "GREATER", "LESS", "GREATEREQ", 
			"LESSEQ", "ISEQ", "NOTEQ", "ID", "STRING", "INT", "REAL", "WHITESPACE", 
			"NEWLINE"
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
			setState(44);
			match(START);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << PRINT) | (1L << INPUT) | (1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNC) | (1L << CALL) | (1L << GLOBAL) | (1L << LOCAL) | (1L << CLASS) | (1L << SUB) | (1L << ID) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				{
				setState(45);
				body();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
		public DeclarationArrayContext declarationArray() {
			return getRuleContext(DeclarationArrayContext.class,0);
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
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				enteroperations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				subbody();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				ifOperation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				forLoop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				whileLoop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				functionDecl();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(60);
				accessrules();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(61);
				classDecl();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(62);
				classCall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(63);
				assigment();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(64);
				declarationArray();
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				array();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ArrayindexContext arrayindex() {
			return getRuleContext(ArrayindexContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(ID);
				setState(73);
				match(T__0);
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(74);
					value();
					}
					break;
				case 2:
					{
					setState(75);
					string();
					}
					break;
				case 3:
					{
					setState(76);
					arithmetic(0);
					}
					break;
				}
				setState(79);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(ID);
				setState(82);
				arrayindex();
				setState(83);
				match(T__0);
				setState(84);
				number();
				setState(85);
				match(T__1);
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

	public static class ArrayindexContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public ArrayindexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayindex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterArrayindex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitArrayindex(this);
		}
	}

	public final ArrayindexContext arrayindex() throws RecognitionException {
		ArrayindexContext _localctx = new ArrayindexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayindex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(T__2);
			setState(90);
			match(INT);
			setState(91);
			match(T__3);
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

	public static class DeclarationArrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DeclarationArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDeclarationArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDeclarationArray(this);
		}
	}

	public final DeclarationArrayContext declarationArray() throws RecognitionException {
		DeclarationArrayContext _localctx = new DeclarationArrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(ID);
			setState(94);
			match(T__0);
			setState(95);
			array();
			setState(96);
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
		enterRule(_localctx, 12, RULE_classDecl);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(CLASS);
				setState(99);
				match(ID);
				setState(100);
				match(T__4);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(101);
					value();
					}
					break;
				}
				}
				break;
			case T__4:
			case TYPEINT:
			case TYPEREAL:
			case TYPESTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING))) != 0)) {
					{
					setState(104);
					array();
					}
				}

				setState(107);
				match(T__4);
				setState(108);
				match(T__5);
				setState(109);
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
		enterRule(_localctx, 14, RULE_classCall);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(CALL);
				setState(113);
				match(ID);
				setState(114);
				match(T__4);
				setState(116);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(115);
					value();
					}
					break;
				}
				}
				break;
			case T__4:
			case TYPEINT:
			case TYPEREAL:
			case TYPESTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING))) != 0)) {
					{
					setState(118);
					array();
					}
				}

				setState(121);
				match(T__4);
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
		enterRule(_localctx, 16, RULE_accessrules);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(GLOBAL);
				}
				break;
			case LOCAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(LOCAL);
				setState(126);
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
		enterRule(_localctx, 18, RULE_functionDecl);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(FUNC);
				setState(130);
				match(ID);
				setState(131);
				match(T__6);
				setState(133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(132);
					value();
					}
					break;
				}
				}
				break;
			case T__7:
			case TYPEINT:
			case TYPEREAL:
			case TYPESTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING))) != 0)) {
					{
					setState(135);
					array();
					}
				}

				setState(138);
				match(T__7);
				setState(139);
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
		enterRule(_localctx, 20, RULE_functionCall);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(CALL);
				setState(143);
				match(ID);
				setState(144);
				match(T__6);
				setState(146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(145);
					value();
					}
					break;
				}
				}
				break;
			case T__8:
			case TYPEINT:
			case TYPEREAL:
			case TYPESTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING))) != 0)) {
					{
					setState(148);
					array();
					}
				}

				setState(151);
				match(T__8);
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
		enterRule(_localctx, 22, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FOR);
			setState(155);
			match(INT);
			setState(156);
			match(T__9);
			setState(157);
			match(INT);
			setState(158);
			match(T__5);
			setState(159);
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
		enterRule(_localctx, 24, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(WHILE);
			setState(162);
			condition();
			setState(163);
			match(T__5);
			setState(164);
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
		enterRule(_localctx, 26, RULE_ifOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IF);
			setState(167);
			condition();
			setState(168);
			match(T__5);
			setState(169);
			block();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				match(ELSE);
				setState(171);
				match(T__5);
				setState(172);
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
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				value();
				setState(176);
				_la = _input.LA(1);
				if ( !(_la==GREATER || _la==LESS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				value();
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==GREATEREQ || _la==LESSEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				value();
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==ISEQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(185);
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
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__10);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << PRINT) | (1L << INPUT) | (1L << TYPEINT) | (1L << TYPEREAL) | (1L << TYPESTRING) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << FUNC) | (1L << CALL) | (1L << GLOBAL) | (1L << LOCAL) | (1L << CLASS) | (1L << SUB) | (1L << ID) | (1L << INT) | (1L << REAL))) != 0)) {
				{
				{
				setState(190);
				body();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(T__11);
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
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
	public static class Nothing1Context extends ArithmeticContext {
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public Nothing1Context(ArithmeticContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNothing1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNothing1(this);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_arithmetic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				_localctx = new Nothing1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				match(T__6);
				setState(200);
				arithmetic(0);
				setState(201);
				match(T__8);
				}
				break;
			case SUB:
				{
				_localctx = new Nothing2Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				match(SUB);
				setState(204);
				number();
				}
				break;
			case INT:
			case REAL:
				{
				_localctx = new Nothing3Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(208);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(209);
						match(MUL);
						setState(210);
						arithmetic(7);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(211);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(212);
						match(DIV);
						setState(213);
						arithmetic(6);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(ADD);
						setState(216);
						arithmetic(5);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ArithmeticContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(SUB);
						setState(219);
						arithmetic(4);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	}
	public static class InputstringContext extends EnteroperationsContext {
		public TerminalNode INPUT() { return getToken(MyGrammarParser.INPUT, 0); }
		public TerminalNode TYPESTRING() { return getToken(MyGrammarParser.TYPESTRING, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public InputstringContext(EnteroperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInputstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInputstring(this);
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
	}

	public final EnteroperationsContext enteroperations() throws RecognitionException {
		EnteroperationsContext _localctx = new EnteroperationsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enteroperations);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(PRINT);
				setState(226);
				match(T__6);
				setState(227);
				value();
				setState(228);
				match(T__8);
				}
				break;
			case 2:
				_localctx = new InputintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(INPUT);
				setState(231);
				match(TYPEINT);
				setState(232);
				match(ID);
				}
				break;
			case 3:
				_localctx = new InputrealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				match(INPUT);
				setState(234);
				match(TYPEREAL);
				setState(235);
				match(ID);
				}
				break;
			case 4:
				_localctx = new InputstringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(INPUT);
				setState(237);
				match(TYPESTRING);
				setState(238);
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
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		public TerminalNode TYPEINT() { return getToken(MyGrammarParser.TYPEINT, 0); }
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public TerminalNode TYPEREAL() { return getToken(MyGrammarParser.TYPEREAL, 0); }
		public TerminalNode TYPESTRING() { return getToken(MyGrammarParser.TYPESTRING, 0); }
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
		enterRule(_localctx, 38, RULE_array);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(TYPEINT);
				setState(244);
				match(T__2);
				setState(245);
				match(INT);
				setState(246);
				match(T__3);
				}
				break;
			case TYPEREAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(TYPEREAL);
				setState(248);
				match(T__2);
				setState(249);
				match(INT);
				setState(250);
				match(T__3);
				}
				break;
			case TYPESTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(TYPESTRING);
				setState(252);
				match(T__2);
				setState(253);
				match(INT);
				setState(254);
				match(T__3);
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

	public static class ValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyGrammarParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(STRING);
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
		case 16:
			return arithmetic_sempred((ArithmeticContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\7\2\61\n\2"+
		"\f\2\16\2\64\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3D\n\3\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\5\bi\n\b\3\b\5\bl\n\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t"+
		"\3\t\3\t\5\tw\n\t\3\t\5\tz\n\t\3\t\5\t}\n\t\3\n\3\n\3\n\5\n\u0082\n\n"+
		"\3\13\3\13\3\13\3\13\5\13\u0088\n\13\3\13\5\13\u008b\n\13\3\13\3\13\5"+
		"\13\u008f\n\13\3\f\3\f\3\f\3\f\5\f\u0095\n\f\3\f\5\f\u0098\n\f\3\f\5\f"+
		"\u009b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\21\3\21\7\21\u00c2"+
		"\n\21\f\21\16\21\u00c5\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u00d1\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u00df\n\22\f\22\16\22\u00e2\13\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f2\n\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0102\n\25\3\26\3\26\5\26\u0106\n\26\3\27\3\27\5\27\u010a\n\27\3"+
		"\27\2\3\"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2$%"+
		"\3\2&\'\3\2()\3\2,-\2\u0124\2.\3\2\2\2\4C\3\2\2\2\6H\3\2\2\2\bY\3\2\2"+
		"\2\n[\3\2\2\2\f_\3\2\2\2\16p\3\2\2\2\20|\3\2\2\2\22\u0081\3\2\2\2\24\u008e"+
		"\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2\2\2\32\u00a3\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2\2\"\u00d0\3\2\2\2$\u00f1\3\2\2\2"+
		"&\u00f3\3\2\2\2(\u0101\3\2\2\2*\u0105\3\2\2\2,\u0109\3\2\2\2.\62\7\17"+
		"\2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\20\2\2\66\3\3\2\2\2\67D\5$\23\28"+
		"D\5\6\4\29D\5\34\17\2:D\5\30\r\2;D\5\32\16\2<D\5\24\13\2=D\5\26\f\2>D"+
		"\5\22\n\2?D\5\16\b\2@D\5\20\t\2AD\5\b\5\2BD\5\f\7\2C\67\3\2\2\2C8\3\2"+
		"\2\2C9\3\2\2\2C:\3\2\2\2C;\3\2\2\2C<\3\2\2\2C=\3\2\2\2C>\3\2\2\2C?\3\2"+
		"\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EI\5(\25\2FI\5\36\20\2GI"+
		"\5\"\22\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2\2I\7\3\2\2\2JK\7*\2\2KO\7\3\2\2"+
		"LP\5*\26\2MP\5,\27\2NP\5\"\22\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2PQ\3\2\2"+
		"\2QR\7\4\2\2RZ\3\2\2\2ST\7*\2\2TU\5\n\6\2UV\7\3\2\2VW\5&\24\2WX\7\4\2"+
		"\2XZ\3\2\2\2YJ\3\2\2\2YS\3\2\2\2Z\t\3\2\2\2[\\\7\5\2\2\\]\7,\2\2]^\7\6"+
		"\2\2^\13\3\2\2\2_`\7*\2\2`a\7\3\2\2ab\5(\25\2bc\7\4\2\2c\r\3\2\2\2de\7"+
		"\37\2\2ef\7*\2\2fh\7\7\2\2gi\5*\26\2hg\3\2\2\2hi\3\2\2\2iq\3\2\2\2jl\5"+
		"(\25\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\7\2\2no\7\b\2\2oq\5 \21\2pd\3"+
		"\2\2\2pk\3\2\2\2q\17\3\2\2\2rs\7\34\2\2st\7*\2\2tv\7\7\2\2uw\5*\26\2v"+
		"u\3\2\2\2vw\3\2\2\2w}\3\2\2\2xz\5(\25\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{}\7\7\2\2|r\3\2\2\2|y\3\2\2\2}\21\3\2\2\2~\u0082\7\35\2\2\177\u0080\7"+
		"\36\2\2\u0080\u0082\5*\26\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082\23"+
		"\3\2\2\2\u0083\u0084\7\33\2\2\u0084\u0085\7*\2\2\u0085\u0087\7\t\2\2\u0086"+
		"\u0088\5*\26\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008f\3\2"+
		"\2\2\u0089\u008b\5(\25\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\n\2\2\u008d\u008f\5 \21\2\u008e\u0083\3\2"+
		"\2\2\u008e\u008a\3\2\2\2\u008f\25\3\2\2\2\u0090\u0091\7\34\2\2\u0091\u0092"+
		"\7*\2\2\u0092\u0094\7\t\2\2\u0093\u0095\5*\26\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u009b\3\2\2\2\u0096\u0098\5(\25\2\u0097\u0096\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\7\13\2\2\u009a"+
		"\u0090\3\2\2\2\u009a\u0097\3\2\2\2\u009b\27\3\2\2\2\u009c\u009d\7\31\2"+
		"\2\u009d\u009e\7,\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1"+
		"\7\b\2\2\u00a1\u00a2\5 \21\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\32\2\2\u00a4"+
		"\u00a5\5\36\20\2\u00a5\u00a6\7\b\2\2\u00a6\u00a7\5 \21\2\u00a7\33\3\2"+
		"\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\u00af\5 \21\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b0\5"+
		" \21\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\35\3\2\2\2\u00b1"+
		"\u00b2\5*\26\2\u00b2\u00b3\t\2\2\2\u00b3\u00b4\5*\26\2\u00b4\u00be\3\2"+
		"\2\2\u00b5\u00b6\5*\26\2\u00b6\u00b7\t\3\2\2\u00b7\u00b8\5*\26\2\u00b8"+
		"\u00be\3\2\2\2\u00b9\u00ba\5*\26\2\u00ba\u00bb\t\4\2\2\u00bb\u00bc\5*"+
		"\26\2\u00bc\u00be\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00b9\3\2\2\2\u00be\37\3\2\2\2\u00bf\u00c3\7\r\2\2\u00c0\u00c2\5\4\3"+
		"\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4"+
		"\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\16\2\2"+
		"\u00c7!\3\2\2\2\u00c8\u00c9\b\22\1\2\u00c9\u00ca\7\t\2\2\u00ca\u00cb\5"+
		"\"\22\2\u00cb\u00cc\7\13\2\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\7\"\2\2\u00ce"+
		"\u00d1\5&\24\2\u00cf\u00d1\5&\24\2\u00d0\u00c8\3\2\2\2\u00d0\u00cd\3\2"+
		"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00e0\3\2\2\2\u00d2\u00d3\f\b\2\2\u00d3"+
		"\u00d4\7 \2\2\u00d4\u00df\5\"\22\t\u00d5\u00d6\f\7\2\2\u00d6\u00d7\7!"+
		"\2\2\u00d7\u00df\5\"\22\b\u00d8\u00d9\f\6\2\2\u00d9\u00da\7#\2\2\u00da"+
		"\u00df\5\"\22\7\u00db\u00dc\f\5\2\2\u00dc\u00dd\7\"\2\2\u00dd\u00df\5"+
		"\"\22\6\u00de\u00d2\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d8\3\2\2\2\u00de"+
		"\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1#\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5"+
		"\7\t\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\13\2\2\u00e7\u00f2\3\2\2\2"+
		"\u00e8\u00e9\7\23\2\2\u00e9\u00ea\7\24\2\2\u00ea\u00f2\7*\2\2\u00eb\u00ec"+
		"\7\23\2\2\u00ec\u00ed\7\25\2\2\u00ed\u00f2\7*\2\2\u00ee\u00ef\7\23\2\2"+
		"\u00ef\u00f0\7\26\2\2\u00f0\u00f2\7*\2\2\u00f1\u00e3\3\2\2\2\u00f1\u00e8"+
		"\3\2\2\2\u00f1\u00eb\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2%\3\2\2\2\u00f3"+
		"\u00f4\t\5\2\2\u00f4\'\3\2\2\2\u00f5\u00f6\7\24\2\2\u00f6\u00f7\7\5\2"+
		"\2\u00f7\u00f8\7,\2\2\u00f8\u0102\7\6\2\2\u00f9\u00fa\7\25\2\2\u00fa\u00fb"+
		"\7\5\2\2\u00fb\u00fc\7,\2\2\u00fc\u0102\7\6\2\2\u00fd\u00fe\7\26\2\2\u00fe"+
		"\u00ff\7\5\2\2\u00ff\u0100\7,\2\2\u0100\u0102\7\6\2\2\u0101\u00f5\3\2"+
		"\2\2\u0101\u00f9\3\2\2\2\u0101\u00fd\3\2\2\2\u0102)\3\2\2\2\u0103\u0106"+
		"\5&\24\2\u0104\u0106\7*\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"+\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u010a\7+\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010a-\3\2\2\2\36\62CHOYhkpvy|\u0081\u0087\u008a\u008e"+
		"\u0094\u0097\u009a\u00af\u00bd\u00c3\u00d0\u00de\u00e0\u00f1\u0101\u0105"+
		"\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}