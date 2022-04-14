// Generated from D:/Lukasz/.Mgr_I_Sem/Jezyki_formalne_i_kompilatory/Proj2/Proj2git/OwnLanguage/Java/prjantlr1/src\MyGrammar.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, START=13, STOP=14, ARRAYS=15, PRINT=16, INPUT=17, 
		TYPEINT=18, TYPEREAL=19, TYPESTRING=20, IF=21, ELSE=22, FOR=23, WHILE=24, 
		FUNC=25, CALL=26, GLOBAL=27, LOCAL=28, CLASS=29, MUL=30, DIV=31, SUB=32, 
		ADD=33, GREATER=34, LESS=35, GREATEREQ=36, LESSEQ=37, ISEQ=38, NOTEQ=39, 
		ID=40, STRING=41, INT=42, REAL=43, WHITESPACE=44, NEWLINE=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "START", "STOP", "ARRAYS", "PRINT", "INPUT", 
			"TYPEINT", "TYPEREAL", "TYPESTRING", "IF", "ELSE", "FOR", "WHILE", "FUNC", 
			"CALL", "GLOBAL", "LOCAL", "CLASS", "MUL", "DIV", "SUB", "ADD", "GREATER", 
			"LESS", "GREATEREQ", "LESSEQ", "ISEQ", "NOTEQ", "ID", "STRING", "INT", 
			"REAL", "WHITESPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\6)\u00ed\n)\r)\16)\u00ee\3)\5)\u00f2"+
		"\n)\3)\5)\u00f5\n)\3*\3*\7*\u00f9\n*\f*\16*\u00fc\13*\3*\6*\u00ff\n*\r"+
		"*\16*\u0100\3*\7*\u0104\n*\f*\16*\u0107\13*\3*\3*\3+\6+\u010c\n+\r+\16"+
		"+\u010d\3,\7,\u0111\n,\f,\16,\u0114\13,\3,\3,\6,\u0118\n,\r,\16,\u0119"+
		"\3-\6-\u011d\n-\r-\16-\u011e\3-\3-\3.\3.\5.\u0125\n.\3.\5.\u0128\n.\3"+
		".\3.\3\u00fa\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\5\4\2C\\c|\3\2"+
		"\62;\4\2\13\13\"\"\2\u0136\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]"+
		"\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3"+
		"\2\2\2\21k\3\2\2\2\23n\3\2\2\2\25p\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33"+
		"w\3\2\2\2\35}\3\2\2\2\37\u0082\3\2\2\2!\u0088\3\2\2\2#\u008e\3\2\2\2%"+
		"\u0094\3\2\2\2\'\u0098\3\2\2\2)\u009d\3\2\2\2+\u00a4\3\2\2\2-\u00a7\3"+
		"\2\2\2/\u00ac\3\2\2\2\61\u00b0\3\2\2\2\63\u00b6\3\2\2\2\65\u00bb\3\2\2"+
		"\2\67\u00c0\3\2\2\29\u00c7\3\2\2\2;\u00cd\3\2\2\2=\u00d3\3\2\2\2?\u00d5"+
		"\3\2\2\2A\u00d7\3\2\2\2C\u00d9\3\2\2\2E\u00db\3\2\2\2G\u00dd\3\2\2\2I"+
		"\u00df\3\2\2\2K\u00e2\3\2\2\2M\u00e5\3\2\2\2O\u00e8\3\2\2\2Q\u00ec\3\2"+
		"\2\2S\u00f6\3\2\2\2U\u010b\3\2\2\2W\u0112\3\2\2\2Y\u011c\3\2\2\2[\u0127"+
		"\3\2\2\2]^\7?\2\2^\4\3\2\2\2_`\7=\2\2`\6\3\2\2\2ab\7]\2\2b\b\3\2\2\2c"+
		"d\7_\2\2d\n\3\2\2\2ef\7~\2\2f\f\3\2\2\2gh\7<\2\2h\16\3\2\2\2ij\7*\2\2"+
		"j\20\3\2\2\2kl\7+\2\2lm\7<\2\2m\22\3\2\2\2no\7+\2\2o\24\3\2\2\2pq\7/\2"+
		"\2qr\7@\2\2r\26\3\2\2\2st\7}\2\2t\30\3\2\2\2uv\7\177\2\2v\32\3\2\2\2w"+
		"x\7u\2\2xy\7v\2\2yz\7c\2\2z{\7t\2\2{|\7v\2\2|\34\3\2\2\2}~\7u\2\2~\177"+
		"\7v\2\2\177\u0080\7q\2\2\u0080\u0081\7r\2\2\u0081\36\3\2\2\2\u0082\u0083"+
		"\7c\2\2\u0083\u0084\7t\2\2\u0084\u0085\7t\2\2\u0085\u0086\7c\2\2\u0086"+
		"\u0087\7{\2\2\u0087 \3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a"+
		"\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\"\3\2\2\2\u008e"+
		"\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7r\2\2\u0091\u0092\7w\2\2"+
		"\u0092\u0093\7v\2\2\u0093$\3\2\2\2\u0094\u0095\7k\2\2\u0095\u0096\7p\2"+
		"\2\u0096\u0097\7v\2\2\u0097&\3\2\2\2\u0098\u0099\7t\2\2\u0099\u009a\7"+
		"g\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c(\3\2\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7i\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7h\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7n\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab.\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7t\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1"+
		"\u00b2\7j\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\62\3\2\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7"+
		"p\2\2\u00b9\u00ba\7e\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd"+
		"\7c\2\2\u00bd\u00be\7n\2\2\u00be\u00bf\7n\2\2\u00bf\66\3\2\2\2\u00c0\u00c1"+
		"\7i\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7q\2\2\u00c3\u00c4\7d\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c68\3\2\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7n\2\2"+
		"\u00cc:\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7c\2"+
		"\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7u\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7"+
		",\2\2\u00d4>\3\2\2\2\u00d5\u00d6\7\61\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7"+
		"/\2\2\u00d8B\3\2\2\2\u00d9\u00da\7-\2\2\u00daD\3\2\2\2\u00db\u00dc\7@"+
		"\2\2\u00dcF\3\2\2\2\u00dd\u00de\7>\2\2\u00deH\3\2\2\2\u00df\u00e0\7@\2"+
		"\2\u00e0\u00e1\7?\2\2\u00e1J\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\u00e4\7"+
		"?\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7A\2\2\u00e6\u00e7\7?\2\2\u00e7N\3\2"+
		"\2\2\u00e8\u00e9\7#\2\2\u00e9\u00ea\7?\2\2\u00eaP\3\2\2\2\u00eb\u00ed"+
		"\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\7a\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5R\3\2\2\2\u00f6\u00fa\7$\2\2\u00f7"+
		"\u00f9\t\3\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00ff\t\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101\u0105\3\2\2\2\u0102\u0104\t\3\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0108\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7$\2\2\u0109"+
		"T\3\2\2\2\u010a\u010c\t\3\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2"+
		"\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010eV\3\2\2\2\u010f\u0111\t"+
		"\3\2\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\7\60"+
		"\2\2\u0116\u0118\t\3\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011aX\3\2\2\2\u011b\u011d\t\4\2\2"+
		"\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b-\2\2\u0121Z\3\2\2\2\u0122\u0124"+
		"\7\17\2\2\u0123\u0125\7\f\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2"+
		"\u0125\u0128\3\2\2\2\u0126\u0128\7\f\2\2\u0127\u0122\3\2\2\2\u0127\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b.\2\2\u012a\\\3\2\2\2\17\2\u00ee"+
		"\u00f1\u00f4\u00fa\u0100\u0105\u010d\u0112\u0119\u011e\u0124\u0127\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}