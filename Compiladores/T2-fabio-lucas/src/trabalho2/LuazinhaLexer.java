// Generated from /home/david/NetBeansProjects/T2/src/trabalho2/Luazinha.g4 by ANTLR 4.0
package trabalho2;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LuazinhaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__46=1, T__45=2, T__44=3, T__43=4, T__42=5, T__41=6, T__40=7, T__39=8, 
		T__38=9, T__37=10, T__36=11, T__35=12, T__34=13, T__33=14, T__32=15, T__31=16, 
		T__30=17, T__29=18, T__28=19, T__27=20, T__26=21, T__25=22, T__24=23, 
		T__23=24, T__22=25, T__21=26, T__20=27, T__19=28, T__18=29, T__17=30, 
		T__16=31, T__15=32, T__14=33, T__13=34, T__12=35, T__11=36, T__10=37, 
		T__9=38, T__8=39, T__7=40, T__6=41, T__5=42, T__4=43, T__3=44, T__2=45, 
		T__1=46, T__0=47, NOME=48, CADEIA=49, NUMERO=50, COMENTARIO=51, WS=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "'in'", "'local'", "','", "'['", "'while'", "'-'", "'*'", "'or'", 
		"':'", "'('", "'not'", "'if'", "'<'", "'false'", "'<='", "'until'", "'nil'", 
		"'~='", "'...'", "'{'", "'break'", "'and'", "'else'", "'}'", "'true'", 
		"'elseif'", "'do'", "'%'", "'^'", "'.'", "'function'", "')'", "'+'", "'for'", 
		"'return'", "'='", "';'", "'repeat'", "'>'", "'then'", "'/'", "'=='", 
		"'>='", "'#'", "'end'", "'..'", "NOME", "CADEIA", "NUMERO", "COMENTARIO", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__46", "T__45", "T__44", "T__43", "T__42", "T__41", "T__40", "T__39", 
		"T__38", "T__37", "T__36", "T__35", "T__34", "T__33", "T__32", "T__31", 
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "NOME", "CADEIA", "NUMERO", 
		"EXPOENTE", "COMENTARIO", "WS"
	};


	    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();


	public LuazinhaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Luazinha.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 51: COMENTARIO_action((RuleContext)_localctx, actionIndex); break;

		case 52: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4\66\u0169\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3"+
		"-\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\7\61\u0116\n\61\f\61\16\61"+
		"\u0119\13\61\3\62\3\62\7\62\u011d\n\62\f\62\16\62\u0120\13\62\3\62\3\62"+
		"\3\62\7\62\u0125\n\62\f\62\16\62\u0128\13\62\3\62\5\62\u012b\n\62\3\63"+
		"\6\63\u012e\n\63\r\63\16\63\u012f\3\63\5\63\u0133\n\63\3\63\6\63\u0136"+
		"\n\63\r\63\16\63\u0137\3\63\3\63\7\63\u013c\n\63\f\63\16\63\u013f\13\63"+
		"\3\63\5\63\u0142\n\63\3\63\3\63\6\63\u0146\n\63\r\63\16\63\u0147\3\63"+
		"\5\63\u014b\n\63\5\63\u014d\n\63\3\64\3\64\5\64\u0151\n\64\3\64\6\64\u0154"+
		"\n\64\r\64\16\64\u0155\3\65\3\65\3\65\3\65\7\65\u015c\n\65\f\65\16\65"+
		"\u015f\13\65\3\65\5\65\u0162\n\65\3\65\3\65\3\65\3\66\3\66\3\66\2\67\3"+
		"\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r"+
		"\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27"+
		"\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\""+
		"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1[/\1]\60\1_\61\1a\62"+
		"\1c\63\1e\64\1g\2\1i\65\2k\66\3\3\2\n\5C\\aac|\6\62;C\\aac|\5\f\f\17\17"+
		"))\5\f\f\17\17$$\4GGgg\4--//\4\f\f\17\17\5\13\f\17\17\"\"\u0178\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5o\3\2\2\2\7r"+
		"\3\2\2\2\tx\3\2\2\2\13z\3\2\2\2\r|\3\2\2\2\17\u0082\3\2\2\2\21\u0084\3"+
		"\2\2\2\23\u0086\3\2\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2"+
		"\2\2\33\u0091\3\2\2\2\35\u0094\3\2\2\2\37\u0096\3\2\2\2!\u009c\3\2\2\2"+
		"#\u009f\3\2\2\2%\u00a5\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00b0\3"+
		"\2\2\2-\u00b2\3\2\2\2/\u00b8\3\2\2\2\61\u00bc\3\2\2\2\63\u00c1\3\2\2\2"+
		"\65\u00c3\3\2\2\2\67\u00c8\3\2\2\29\u00cf\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00e1\3\2\2\2E\u00e3\3\2\2\2G"+
		"\u00e5\3\2\2\2I\u00e9\3\2\2\2K\u00f0\3\2\2\2M\u00f2\3\2\2\2O\u00f4\3\2"+
		"\2\2Q\u00fb\3\2\2\2S\u00fd\3\2\2\2U\u0102\3\2\2\2W\u0104\3\2\2\2Y\u0107"+
		"\3\2\2\2[\u010a\3\2\2\2]\u010c\3\2\2\2_\u0110\3\2\2\2a\u0113\3\2\2\2c"+
		"\u012a\3\2\2\2e\u014c\3\2\2\2g\u014e\3\2\2\2i\u0157\3\2\2\2k\u0166\3\2"+
		"\2\2mn\7_\2\2n\4\3\2\2\2op\7k\2\2pq\7p\2\2q\6\3\2\2\2rs\7n\2\2st\7q\2"+
		"\2tu\7e\2\2uv\7c\2\2vw\7n\2\2w\b\3\2\2\2xy\7.\2\2y\n\3\2\2\2z{\7]\2\2"+
		"{\f\3\2\2\2|}\7y\2\2}~\7j\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\u0081"+
		"\7g\2\2\u0081\16\3\2\2\2\u0082\u0083\7/\2\2\u0083\20\3\2\2\2\u0084\u0085"+
		"\7,\2\2\u0085\22\3\2\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088\24"+
		"\3\2\2\2\u0089\u008a\7<\2\2\u008a\26\3\2\2\2\u008b\u008c\7*\2\2\u008c"+
		"\30\3\2\2\2\u008d\u008e\7p\2\2\u008e\u008f\7q\2\2\u008f\u0090\7v\2\2\u0090"+
		"\32\3\2\2\2\u0091\u0092\7k\2\2\u0092\u0093\7h\2\2\u0093\34\3\2\2\2\u0094"+
		"\u0095\7>\2\2\u0095\36\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7>\2\2\u009d\u009e\7?\2\2\u009e\"\3\2\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7n\2\2"+
		"\u00a4$\3\2\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7n\2"+
		"\2\u00a8&\3\2\2\2\u00a9\u00aa\7\u0080\2\2\u00aa\u00ab\7?\2\2\u00ab(\3"+
		"\2\2\2\u00ac\u00ad\7\60\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7\60\2\2"+
		"\u00af*\3\2\2\2\u00b0\u00b1\7}\2\2\u00b1,\3\2\2\2\u00b2\u00b3\7d\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7\7m\2\2"+
		"\u00b7.\3\2\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2"+
		"\2\u00bb\60\3\2\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7u\2\2\u00bf\u00c0\7g\2\2\u00c0\62\3\2\2\2\u00c1\u00c2\7\177\2\2\u00c2"+
		"\64\3\2\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7w\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce\7h\2\2"+
		"\u00ce8\3\2\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7q\2\2\u00d1:\3\2\2\2\u00d2"+
		"\u00d3\7\'\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7`\2\2\u00d5>\3\2\2\2\u00d6"+
		"\u00d7\7\60\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7w\2\2\u00da"+
		"\u00db\7p\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7k\2\2"+
		"\u00de\u00df\7q\2\2\u00df\u00e0\7p\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7+\2"+
		"\2\u00e2D\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4F\3\2\2\2\u00e5\u00e6\7h\2\2"+
		"\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8H\3\2\2\2\u00e9\u00ea\7t\2"+
		"\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7p\2\2\u00efJ\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1L\3"+
		"\2\2\2\u00f2\u00f3\7=\2\2\u00f3N\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6"+
		"\7g\2\2\u00f6\u00f7\7r\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7c\2\2\u00f9"+
		"\u00fa\7v\2\2\u00faP\3\2\2\2\u00fb\u00fc\7@\2\2\u00fcR\3\2\2\2\u00fd\u00fe"+
		"\7v\2\2\u00fe\u00ff\7j\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101"+
		"T\3\2\2\2\u0102\u0103\7\61\2\2\u0103V\3\2\2\2\u0104\u0105\7?\2\2\u0105"+
		"\u0106\7?\2\2\u0106X\3\2\2\2\u0107\u0108\7@\2\2\u0108\u0109\7?\2\2\u0109"+
		"Z\3\2\2\2\u010a\u010b\7%\2\2\u010b\\\3\2\2\2\u010c\u010d\7g\2\2\u010d"+
		"\u010e\7p\2\2\u010e\u010f\7f\2\2\u010f^\3\2\2\2\u0110\u0111\7\60\2\2\u0111"+
		"\u0112\7\60\2\2\u0112`\3\2\2\2\u0113\u0117\t\2\2\2\u0114\u0116\t\3\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118b\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011e\7)\2\2\u011b\u011d"+
		"\n\4\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u012b\7)"+
		"\2\2\u0122\u0126\7$\2\2\u0123\u0125\n\5\2\2\u0124\u0123\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7$\2\2\u012a\u011a\3\2\2\2\u012a"+
		"\u0122\3\2\2\2\u012bd\3\2\2\2\u012c\u012e\4\62;\2\u012d\u012c\3\2\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u0133\5g\64\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u014d\3\2\2\2\u0134\u0136\4\62;\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013d\7\60\2\2\u013a\u013c\4\62;\2\u013b\u013a\3\2\2\2\u013c\u013f\3"+
		"\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0142\5g\64\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u014d\3\2\2\2\u0143\u0145\7\60\2\2\u0144\u0146\4\62;\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u014a\3\2\2\2\u0149\u014b\5g\64\2\u014a\u0149\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u012d\3\2\2\2\u014c\u0135\3\2"+
		"\2\2\u014c\u0143\3\2\2\2\u014df\3\2\2\2\u014e\u0150\t\6\2\2\u014f\u0151"+
		"\t\7\2\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0154\4\62;\2\u0153\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156h\3\2\2\2\u0157\u0158\7/\2\2\u0158\u0159"+
		"\7/\2\2\u0159\u015d\3\2\2\2\u015a\u015c\n\b\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0161\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\f\2\2\u0164\u0165\b\65"+
		"\2\2\u0165j\3\2\2\2\u0166\u0167\t\t\2\2\u0167\u0168\b\66\3\2\u0168l\3"+
		"\2\2\2\23\2\u0117\u011e\u0126\u012a\u012f\u0132\u0137\u013d\u0141\u0147"+
		"\u014a\u014c\u0150\u0155\u015d\u0161";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}