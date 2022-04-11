// Generated from D:/Lukasz/JAVA/prjantlr1/src\MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, START=11, STOP=12, ARRAYS=13, PRINT=14, INPUT=15, IF=16, ELSE=17, 
		FOR=18, WHILE=19, FUNC=20, CALL=21, GLOBAL=22, LOCAL=23, CLASS=24, MUL=25, 
		DIV=26, SUB=27, ADD=28, GREATER=29, LESS=30, GREATEREQ=31, LESSEQ=32, 
		ISEQ=33, NOTEQ=34, ID=35, STRING=36, INT=37, REAL=38, WHITESPACE=39, NEWLINE=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "START", "STOP", "ARRAYS", "PRINT", "INPUT", "IF", "ELSE", "FOR", 
			"WHILE", "FUNC", "CALL", "GLOBAL", "LOCAL", "CLASS", "MUL", "DIV", "SUB", 
			"ADD", "GREATER", "LESS", "GREATEREQ", "LESSEQ", "ISEQ", "NOTEQ", "ID", 
			"STRING", "INT", "REAL", "WHITESPACE", "NEWLINE"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0104\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\6$\u00cf\n$"+
		"\r$\16$\u00d0\3$\5$\u00d4\n$\3$\5$\u00d7\n$\3%\3%\6%\u00db\n%\r%\16%\u00dc"+
		"\3%\3%\3&\6&\u00e2\n&\r&\16&\u00e3\3\'\5\'\u00e7\n\'\3\'\7\'\u00ea\n\'"+
		"\f\'\16\'\u00ed\13\'\3\'\3\'\6\'\u00f1\n\'\r\'\16\'\u00f2\3(\6(\u00f6"+
		"\n(\r(\16(\u00f7\3(\3(\3)\3)\5)\u00fe\n)\3)\5)\u0101\n)\3)\3)\2\2*\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*\3\2\6\4\2C\\c|\3\2\62;\4\2--//\4\2\13\13\"\"\2\u010e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5"+
		"U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17`\3\2\2\2\21"+
		"b\3\2\2\2\23e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31o\3\2\2\2\33t\3\2\2\2"+
		"\35z\3\2\2\2\37\u0080\3\2\2\2!\u0086\3\2\2\2#\u0089\3\2\2\2%\u008e\3\2"+
		"\2\2\'\u0092\3\2\2\2)\u0098\3\2\2\2+\u009d\3\2\2\2-\u00a2\3\2\2\2/\u00a9"+
		"\3\2\2\2\61\u00af\3\2\2\2\63\u00b5\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3"+
		"\2\2\29\u00bb\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2?\u00c1\3\2\2\2A\u00c4"+
		"\3\2\2\2C\u00c7\3\2\2\2E\u00ca\3\2\2\2G\u00ce\3\2\2\2I\u00d8\3\2\2\2K"+
		"\u00e1\3\2\2\2M\u00e6\3\2\2\2O\u00f5\3\2\2\2Q\u0100\3\2\2\2ST\7?\2\2T"+
		"\4\3\2\2\2UV\7=\2\2V\6\3\2\2\2WX\7~\2\2X\b\3\2\2\2YZ\7<\2\2Z\n\3\2\2\2"+
		"[\\\7*\2\2\\\f\3\2\2\2]^\7+\2\2^_\7<\2\2_\16\3\2\2\2`a\7+\2\2a\20\3\2"+
		"\2\2bc\7/\2\2cd\7@\2\2d\22\3\2\2\2ef\7}\2\2f\24\3\2\2\2gh\7\177\2\2h\26"+
		"\3\2\2\2ij\7u\2\2jk\7v\2\2kl\7c\2\2lm\7t\2\2mn\7v\2\2n\30\3\2\2\2op\7"+
		"u\2\2pq\7v\2\2qr\7q\2\2rs\7r\2\2s\32\3\2\2\2tu\7c\2\2uv\7t\2\2vw\7t\2"+
		"\2wx\7c\2\2xy\7{\2\2y\34\3\2\2\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~"+
		"\177\7v\2\2\177\36\3\2\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082"+
		"\u0083\7r\2\2\u0083\u0084\7w\2\2\u0084\u0085\7v\2\2\u0085 \3\2\2\2\u0086"+
		"\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\"\3\2\2\2\u0089\u008a\7g\2\2\u008a"+
		"\u008b\7n\2\2\u008b\u008c\7u\2\2\u008c\u008d\7g\2\2\u008d$\3\2\2\2\u008e"+
		"\u008f\7h\2\2\u008f\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091&\3\2\2\2\u0092"+
		"\u0093\7y\2\2\u0093\u0094\7j\2\2\u0094\u0095\7k\2\2\u0095\u0096\7n\2\2"+
		"\u0096\u0097\7g\2\2\u0097(\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7w\2"+
		"\2\u009a\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c*\3\2\2\2\u009d\u009e\7"+
		"e\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7n\2\2\u00a1,"+
		"\3\2\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7d\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8.\3\2\2\2\u00a9"+
		"\u00aa\7n\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7e\2\2\u00ac\u00ad\7c\2\2"+
		"\u00ad\u00ae\7n\2\2\u00ae\60\3\2\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7"+
		"n\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7u\2\2\u00b4\62"+
		"\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\64\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		"\66\3\2\2\2\u00b9\u00ba\7/\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc"+
		":\3\2\2\2\u00bd\u00be\7@\2\2\u00be<\3\2\2\2\u00bf\u00c0\7>\2\2\u00c0>"+
		"\3\2\2\2\u00c1\u00c2\7@\2\2\u00c2\u00c3\7?\2\2\u00c3@\3\2\2\2\u00c4\u00c5"+
		"\7>\2\2\u00c5\u00c6\7?\2\2\u00c6B\3\2\2\2\u00c7\u00c8\7A\2\2\u00c8\u00c9"+
		"\7?\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7#\2\2\u00cb\u00cc\7?\2\2\u00ccF\3"+
		"\2\2\2\u00cd\u00cf\t\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d4\t\3"+
		"\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d7\7a\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7H\3\2\2\2\u00d8"+
		"\u00da\7$\2\2\u00d9\u00db\t\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\7$\2\2\u00dfJ\3\2\2\2\u00e0\u00e2\t\3\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4L\3\2\2\2"+
		"\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb"+
		"\3\2\2\2\u00e8\u00ea\t\3\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00f0\7\60\2\2\u00ef\u00f1\t\3\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3N\3\2\2\2"+
		"\u00f4\u00f6\t\5\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\b(\2\2\u00fa"+
		"P\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fe\7\f\2\2\u00fd\u00fc\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u0101\7\f\2\2\u0100\u00fb"+
		"\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b)\2\2\u0103"+
		"R\3\2\2\2\16\2\u00d0\u00d3\u00d6\u00dc\u00e3\u00e6\u00eb\u00f2\u00f7\u00fd"+
		"\u0100\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}