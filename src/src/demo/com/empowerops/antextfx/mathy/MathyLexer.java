// Generated from C:/Users/Geoff/Code/ANTextFX/src/src/demo\Mathy.g4 by ANTLR 4.5.1
package com.empowerops.antextfx.mathy;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MathyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, DECIMAL=16, 
		ID=17, DIGIT=18, WHITESPACE=19, COMMENT=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "STRING", "DECIMAL", "ID", 
		"DIGIT", "WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'('", "')'", "','", "'*'", "'/'", "'+'", "'-'", "'var'", 
		"'val'", "'let'", "'def'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "STRING", "DECIMAL", "ID", "DIGIT", "WHITESPACE", "COMMENT"
	};
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


	public MathyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mathy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\7\20U\n\20\f\20\16\20X\13\20\3\20\3\20\3\21\6\21]\n\21\r\21\16\21"+
		"^\3\21\3\21\6\21c\n\21\r\21\16\21d\5\21g\n\21\3\22\6\22j\n\22\r\22\16"+
		"\22k\3\23\3\23\3\24\6\24q\n\24\r\24\16\24r\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\7\25{\n\25\f\25\16\25~\13\25\3\25\5\25\u0081\n\25\3\25\3\25\3\25\3"+
		"\25\4V|\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\4\5\2C\\aac|\5\2\f\f\17\17"+
		"\"\"\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2"+
		"\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219"+
		"\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27A\3\2\2\2\31E\3\2\2\2\33I\3\2\2\2\35"+
		"M\3\2\2\2\37R\3\2\2\2!\\\3\2\2\2#i\3\2\2\2%m\3\2\2\2\'p\3\2\2\2)v\3\2"+
		"\2\2+,\7?\2\2,\4\3\2\2\2-.\7=\2\2.\6\3\2\2\2/\60\7*\2\2\60\b\3\2\2\2\61"+
		"\62\7+\2\2\62\n\3\2\2\2\63\64\7.\2\2\64\f\3\2\2\2\65\66\7,\2\2\66\16\3"+
		"\2\2\2\678\7\61\2\28\20\3\2\2\29:\7-\2\2:\22\3\2\2\2;<\7/\2\2<\24\3\2"+
		"\2\2=>\7x\2\2>?\7c\2\2?@\7t\2\2@\26\3\2\2\2AB\7x\2\2BC\7c\2\2CD\7n\2\2"+
		"D\30\3\2\2\2EF\7n\2\2FG\7g\2\2GH\7v\2\2H\32\3\2\2\2IJ\7f\2\2JK\7g\2\2"+
		"KL\7h\2\2L\34\3\2\2\2MN\7p\2\2NO\7w\2\2OP\7n\2\2PQ\7n\2\2Q\36\3\2\2\2"+
		"RV\7$\2\2SU\13\2\2\2TS\3\2\2\2UX\3\2\2\2VW\3\2\2\2VT\3\2\2\2WY\3\2\2\2"+
		"XV\3\2\2\2YZ\7$\2\2Z \3\2\2\2[]\5%\23\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_f\3\2\2\2`b\7\60\2\2ac\5%\23\2ba\3\2\2\2cd\3\2\2\2db\3\2"+
		"\2\2de\3\2\2\2eg\3\2\2\2f`\3\2\2\2fg\3\2\2\2g\"\3\2\2\2hj\t\2\2\2ih\3"+
		"\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l$\3\2\2\2mn\4\62;\2n&\3\2\2\2oq\t"+
		"\3\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\24\2\2u("+
		"\3\2\2\2vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2"+
		"\2|}\3\2\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177\u0081\7\17\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\b\25\2\2\u0085*\3\2\2\2\13\2V^dfkr"+
		"|\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}