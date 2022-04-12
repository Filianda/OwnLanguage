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
		T__9=10, START=11, STOP=12, ARRAYS=13, PRINT=14, INPUT=15, TYPEINT=16, 
		TYPEREAL=17, IF=18, ELSE=19, FOR=20, WHILE=21, FUNC=22, CALL=23, GLOBAL=24, 
		LOCAL=25, CLASS=26, MUL=27, DIV=28, SUB=29, ADD=30, GREATER=31, LESS=32, 
		GREATEREQ=33, LESSEQ=34, ISEQ=35, NOTEQ=36, ID=37, STRING=38, INT=39, 
		REAL=40, WHITESPACE=41, NEWLINE=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "START", "STOP", "ARRAYS", "PRINT", "INPUT", "TYPEINT", "TYPEREAL", 
			"IF", "ELSE", "FOR", "WHILE", "FUNC", "CALL", "GLOBAL", "LOCAL", "CLASS", 
			"MUL", "DIV", "SUB", "ADD", "GREATER", "LESS", "GREATEREQ", "LESSEQ", 
			"ISEQ", "NOTEQ", "ID", "STRING", "INT", "REAL", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u010e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\6&\u00dc\n&\r&\16&\u00dd\3&\5&"+
		"\u00e1\n&\3&\5&\u00e4\n&\3\'\3\'\6\'\u00e8\n\'\r\'\16\'\u00e9\3\'\3\'"+
		"\3(\6(\u00ef\n(\r(\16(\u00f0\3)\7)\u00f4\n)\f)\16)\u00f7\13)\3)\3)\6)"+
		"\u00fb\n)\r)\16)\u00fc\3*\6*\u0100\n*\r*\16*\u0101\3*\3*\3+\3+\5+\u0108"+
		"\n+\3+\5+\u010b\n+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\5\4\2C\\"+
		"c|\3\2\62;\4\2\13\13\"\"\2\u0117\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2"+
		"\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17d\3\2\2\2\21f\3\2\2\2\23i\3\2"+
		"\2\2\25k\3\2\2\2\27m\3\2\2\2\31s\3\2\2\2\33x\3\2\2\2\35~\3\2\2\2\37\u0084"+
		"\3\2\2\2!\u008a\3\2\2\2#\u008e\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2"+
		")\u009b\3\2\2\2+\u009f\3\2\2\2-\u00a5\3\2\2\2/\u00aa\3\2\2\2\61\u00af"+
		"\3\2\2\2\63\u00b6\3\2\2\2\65\u00bc\3\2\2\2\67\u00c2\3\2\2\29\u00c4\3\2"+
		"\2\2;\u00c6\3\2\2\2=\u00c8\3\2\2\2?\u00ca\3\2\2\2A\u00cc\3\2\2\2C\u00ce"+
		"\3\2\2\2E\u00d1\3\2\2\2G\u00d4\3\2\2\2I\u00d7\3\2\2\2K\u00db\3\2\2\2M"+
		"\u00e5\3\2\2\2O\u00ee\3\2\2\2Q\u00f5\3\2\2\2S\u00ff\3\2\2\2U\u010a\3\2"+
		"\2\2WX\7?\2\2X\4\3\2\2\2YZ\7=\2\2Z\6\3\2\2\2[\\\7~\2\2\\\b\3\2\2\2]^\7"+
		"<\2\2^\n\3\2\2\2_`\7*\2\2`\f\3\2\2\2ab\7+\2\2bc\7<\2\2c\16\3\2\2\2de\7"+
		"+\2\2e\20\3\2\2\2fg\7/\2\2gh\7@\2\2h\22\3\2\2\2ij\7}\2\2j\24\3\2\2\2k"+
		"l\7\177\2\2l\26\3\2\2\2mn\7u\2\2no\7v\2\2op\7c\2\2pq\7t\2\2qr\7v\2\2r"+
		"\30\3\2\2\2st\7u\2\2tu\7v\2\2uv\7q\2\2vw\7r\2\2w\32\3\2\2\2xy\7c\2\2y"+
		"z\7t\2\2z{\7t\2\2{|\7c\2\2|}\7{\2\2}\34\3\2\2\2~\177\7r\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083"+
		"\36\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7r\2\2\u0087"+
		"\u0088\7w\2\2\u0088\u0089\7v\2\2\u0089 \3\2\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\"\3\2\2\2\u008e\u008f\7t\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092$\3\2\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095&\3\2\2\2\u0096\u0097\7g\2\2\u0097"+
		"\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a(\3\2\2\2\u009b"+
		"\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d\u009e\7t\2\2\u009e*\3\2\2\2\u009f"+
		"\u00a0\7y\2\2\u00a0\u00a1\7j\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7n\2\2"+
		"\u00a3\u00a4\7g\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7w\2"+
		"\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7e\2\2\u00a9.\3\2\2\2\u00aa\u00ab\7"+
		"e\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7n\2\2\u00ae\60"+
		"\3\2\2\2\u00af\u00b0\7i\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2"+
		"\u00b3\7d\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2\u00b5\62\3\2\2\2\u00b6"+
		"\u00b7\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7c\2\2"+
		"\u00ba\u00bb\7n\2\2\u00bb\64\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7"+
		"n\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7u\2\2\u00c1\66"+
		"\3\2\2\2\u00c2\u00c3\7,\2\2\u00c38\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5"+
		":\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9>"+
		"\3\2\2\2\u00ca\u00cb\7@\2\2\u00cb@\3\2\2\2\u00cc\u00cd\7>\2\2\u00cdB\3"+
		"\2\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d0\7?\2\2\u00d0D\3\2\2\2\u00d1\u00d2"+
		"\7>\2\2\u00d2\u00d3\7?\2\2\u00d3F\3\2\2\2\u00d4\u00d5\7A\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6H\3\2\2\2\u00d7\u00d8\7#\2\2\u00d8\u00d9\7?\2\2\u00d9J\3"+
		"\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\t\3"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\7a\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4L\3\2\2\2\u00e5"+
		"\u00e7\7$\2\2\u00e6\u00e8\t\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7$\2\2\u00ecN\3\2\2\2\u00ed\u00ef\t\3\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1P\3\2\2\2"+
		"\u00f2\u00f4\t\3\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fa\7\60\2\2\u00f9\u00fb\t\3\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdR\3\2\2\2\u00fe\u0100"+
		"\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b*\2\2\u0104T\3\2\2\2\u0105"+
		"\u0107\7\17\2\2\u0106\u0108\7\f\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u010b\3\2\2\2\u0109\u010b\7\f\2\2\u010a\u0105\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b+\2\2\u010dV\3\2\2\2\r"+
		"\2\u00dd\u00e0\u00e3\u00e9\u00f0\u00f5\u00fc\u0101\u0107\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}