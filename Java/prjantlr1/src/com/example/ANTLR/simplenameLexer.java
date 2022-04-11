// Generated from D:/Lukasz/JAVA/prjantlr1/src/com/example/ANTLR\simplename.g4 by ANTLR 4.9.2
package com.example.ANTLR;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplenameLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, ID=13, MUL=14, DIV=15, SUB=16, ADD=17, NUMBER=18, 
		REAL=19, STRING=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "ID", "MUL", "DIV", "SUB", "ADD", "NUMBER", 
			"REAL", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'hi'", "'bye'", "'print'", "'let'", "'be'", "'read'", "'('", "')'", 
			"'arr'", "'['", "','", "']'", null, "'*'", "'/'", "'-'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "MUL", "DIV", "SUB", "ADD", "NUMBER", "REAL", "STRING", "WS"
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


	public simplenameLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simplename.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\6\16V\n\16\r\16\16\16W\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6"+
		"\23c\n\23\r\23\16\23d\3\24\3\24\5\24i\n\24\3\24\7\24l\n\24\f\24\16\24"+
		"o\13\24\3\24\3\24\6\24s\n\24\r\24\16\24t\3\24\6\24x\n\24\r\24\16\24y\5"+
		"\24|\n\24\3\25\3\25\6\25\u0080\n\25\r\25\16\25\u0081\3\25\3\25\3\26\6"+
		"\26\u0087\n\26\r\26\16\26\u0088\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27\3\2\7\3\2c|\3\2\62;\4\2--//\6\2\62;C\\aac|\5\2\13\f\17\17\"\""+
		"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2"+
		"\5\60\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13>\3\2\2\2\rA\3\2\2\2\17F\3\2\2"+
		"\2\21H\3\2\2\2\23J\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33U\3\2"+
		"\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%b\3\2\2\2\'f\3\2\2\2"+
		")}\3\2\2\2+\u0086\3\2\2\2-.\7j\2\2./\7k\2\2/\4\3\2\2\2\60\61\7d\2\2\61"+
		"\62\7{\2\2\62\63\7g\2\2\63\6\3\2\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7"+
		"k\2\2\678\7p\2\289\7v\2\29\b\3\2\2\2:;\7n\2\2;<\7g\2\2<=\7v\2\2=\n\3\2"+
		"\2\2>?\7d\2\2?@\7g\2\2@\f\3\2\2\2AB\7t\2\2BC\7g\2\2CD\7c\2\2DE\7f\2\2"+
		"E\16\3\2\2\2FG\7*\2\2G\20\3\2\2\2HI\7+\2\2I\22\3\2\2\2JK\7c\2\2KL\7t\2"+
		"\2LM\7t\2\2M\24\3\2\2\2NO\7]\2\2O\26\3\2\2\2PQ\7.\2\2Q\30\3\2\2\2RS\7"+
		"_\2\2S\32\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\34"+
		"\3\2\2\2YZ\7,\2\2Z\36\3\2\2\2[\\\7\61\2\2\\ \3\2\2\2]^\7/\2\2^\"\3\2\2"+
		"\2_`\7-\2\2`$\3\2\2\2ac\t\3\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e&\3\2\2\2fh\7T\2\2gi\t\4\2\2hg\3\2\2\2hi\3\2\2\2i{\3\2\2\2jl\t\3\2"+
		"\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pr\13\2"+
		"\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2vx\t\3"+
		"\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{m\3\2\2\2{w\3\2"+
		"\2\2|(\3\2\2\2}\177\7$\2\2~\u0080\t\5\2\2\177~\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\7$\2\2\u0084*\3\2\2\2\u0085\u0087\t\6\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\26\2\2\u008b,\3\2\2\2\f\2Wdhmty{\u0081\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}