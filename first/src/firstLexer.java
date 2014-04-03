// $ANTLR 3.5.1 D:\\JAVA\\first\\src\\first.g 2014-04-03 22:12:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class firstLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int ARGUMENT=4;
	public static final int COMMENT=5;
	public static final int Dec=6;
	public static final int FUNC_DECL=7;
	public static final int Header=8;
	public static final int Hex=9;
	public static final int INDEX=10;
	public static final int LINE_COMMENT=11;
	public static final int METHOD=12;
	public static final int Nice_character_constant=13;
	public static final int Nice_identifier=14;
	public static final int Nice_string=15;
	public static final int Oct=16;
	public static final int POINTER=17;
	public static final int POSTADD=18;
	public static final int POSTUNDERLINE=19;
	public static final int PREADD=20;
	public static final int PREUNDERLINE=21;
	public static final int TYPE_DECL=22;
	public static final int VAR_DECL=23;
	public static final int WS=24;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public firstLexer() {} 
	public firstLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public firstLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\JAVA\\first\\src\\first.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:2:7: ( '!' )
			// D:\\JAVA\\first\\src\\first.g:2:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:3:7: ( '!=' )
			// D:\\JAVA\\first\\src\\first.g:3:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:4:7: ( '%' )
			// D:\\JAVA\\first\\src\\first.g:4:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:5:7: ( '%=' )
			// D:\\JAVA\\first\\src\\first.g:5:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:6:7: ( '&&' )
			// D:\\JAVA\\first\\src\\first.g:6:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:7:7: ( '&' )
			// D:\\JAVA\\first\\src\\first.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:8:7: ( '&=' )
			// D:\\JAVA\\first\\src\\first.g:8:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:9:7: ( '(' )
			// D:\\JAVA\\first\\src\\first.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:10:7: ( ')' )
			// D:\\JAVA\\first\\src\\first.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:11:7: ( '*' )
			// D:\\JAVA\\first\\src\\first.g:11:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:12:7: ( '*=' )
			// D:\\JAVA\\first\\src\\first.g:12:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:13:7: ( '+' )
			// D:\\JAVA\\first\\src\\first.g:13:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:14:7: ( '++' )
			// D:\\JAVA\\first\\src\\first.g:14:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:15:7: ( '+=' )
			// D:\\JAVA\\first\\src\\first.g:15:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:16:7: ( ',' )
			// D:\\JAVA\\first\\src\\first.g:16:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:17:7: ( '.' )
			// D:\\JAVA\\first\\src\\first.g:17:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:18:7: ( '/' )
			// D:\\JAVA\\first\\src\\first.g:18:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:19:7: ( '/=' )
			// D:\\JAVA\\first\\src\\first.g:19:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:20:7: ( ';' )
			// D:\\JAVA\\first\\src\\first.g:20:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:21:7: ( '<' )
			// D:\\JAVA\\first\\src\\first.g:21:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:22:7: ( '<<' )
			// D:\\JAVA\\first\\src\\first.g:22:9: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:23:7: ( '<<=' )
			// D:\\JAVA\\first\\src\\first.g:23:9: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:24:7: ( '<=' )
			// D:\\JAVA\\first\\src\\first.g:24:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:25:7: ( '=' )
			// D:\\JAVA\\first\\src\\first.g:25:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:26:7: ( '==' )
			// D:\\JAVA\\first\\src\\first.g:26:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:27:7: ( '>' )
			// D:\\JAVA\\first\\src\\first.g:27:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:28:7: ( '>=' )
			// D:\\JAVA\\first\\src\\first.g:28:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:29:7: ( '>>' )
			// D:\\JAVA\\first\\src\\first.g:29:9: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:30:7: ( '>>=' )
			// D:\\JAVA\\first\\src\\first.g:30:9: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:31:7: ( '[' )
			// D:\\JAVA\\first\\src\\first.g:31:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:32:7: ( ']' )
			// D:\\JAVA\\first\\src\\first.g:32:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:33:7: ( '^' )
			// D:\\JAVA\\first\\src\\first.g:33:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:34:7: ( '^=' )
			// D:\\JAVA\\first\\src\\first.g:34:9: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:35:7: ( '_' )
			// D:\\JAVA\\first\\src\\first.g:35:9: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:36:7: ( '_=' )
			// D:\\JAVA\\first\\src\\first.g:36:9: '_='
			{
			match("_="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:37:7: ( '_>' )
			// D:\\JAVA\\first\\src\\first.g:37:9: '_>'
			{
			match("_>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:38:7: ( '__' )
			// D:\\JAVA\\first\\src\\first.g:38:9: '__'
			{
			match("__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:39:7: ( 'break' )
			// D:\\JAVA\\first\\src\\first.g:39:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:40:7: ( 'char' )
			// D:\\JAVA\\first\\src\\first.g:40:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:41:7: ( 'continue' )
			// D:\\JAVA\\first\\src\\first.g:41:9: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:42:7: ( 'else' )
			// D:\\JAVA\\first\\src\\first.g:42:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:43:7: ( 'for' )
			// D:\\JAVA\\first\\src\\first.g:43:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:44:7: ( 'if' )
			// D:\\JAVA\\first\\src\\first.g:44:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:45:7: ( 'int' )
			// D:\\JAVA\\first\\src\\first.g:45:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:46:7: ( 'return' )
			// D:\\JAVA\\first\\src\\first.g:46:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:47:7: ( 'sizeof' )
			// D:\\JAVA\\first\\src\\first.g:47:9: 'sizeof'
			{
			match("sizeof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:48:7: ( 'struct' )
			// D:\\JAVA\\first\\src\\first.g:48:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:49:7: ( 'union' )
			// D:\\JAVA\\first\\src\\first.g:49:9: 'union'
			{
			match("union"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:50:7: ( 'void' )
			// D:\\JAVA\\first\\src\\first.g:50:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:51:7: ( 'while' )
			// D:\\JAVA\\first\\src\\first.g:51:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:52:7: ( '{' )
			// D:\\JAVA\\first\\src\\first.g:52:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:53:7: ( '|' )
			// D:\\JAVA\\first\\src\\first.g:53:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:54:7: ( '|=' )
			// D:\\JAVA\\first\\src\\first.g:54:9: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:55:7: ( '||' )
			// D:\\JAVA\\first\\src\\first.g:55:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:56:7: ( '}' )
			// D:\\JAVA\\first\\src\\first.g:56:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:57:7: ( '~' )
			// D:\\JAVA\\first\\src\\first.g:57:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			int _type = Dec;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:164:5: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:165:2: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:165:6: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\JAVA\\first\\src\\first.g:165:16: ( '0' .. '9' )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dec"

	// $ANTLR start "Hex"
	public final void mHex() throws RecognitionException {
		try {
			int _type = Hex;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:168:5: ( ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
			// D:\\JAVA\\first\\src\\first.g:169:2: ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			{
			// D:\\JAVA\\first\\src\\first.g:169:2: ( '0x' | '0X' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='x') ) {
					alt3=1;
				}
				else if ( (LA3_1=='X') ) {
					alt3=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:169:3: '0x'
					{
					match("0x"); 

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:169:8: '0X'
					{
					match("0X"); 

					}
					break;

			}

			// D:\\JAVA\\first\\src\\first.g:169:13: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'F')||(LA4_0 >= 'a' && LA4_0 <= 'f')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Hex"

	// $ANTLR start "Oct"
	public final void mOct() throws RecognitionException {
		try {
			int _type = Oct;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:171:5: ( '0' ( '0' .. '7' )+ )
			// D:\\JAVA\\first\\src\\first.g:172:2: '0' ( '0' .. '7' )+
			{
			match('0'); 
			// D:\\JAVA\\first\\src\\first.g:172:5: ( '0' .. '7' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '7')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Oct"

	// $ANTLR start "Nice_identifier"
	public final void mNice_identifier() throws RecognitionException {
		try {
			int _type = Nice_identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:182:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
			// D:\\JAVA\\first\\src\\first.g:182:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\JAVA\\first\\src\\first.g:182:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Nice_identifier"

	// $ANTLR start "Nice_character_constant"
	public final void mNice_character_constant() throws RecognitionException {
		try {
			int _type = Nice_character_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:196:2: ( '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// D:\\JAVA\\first\\src\\first.g:198:2: '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// D:\\JAVA\\first\\src\\first.g:198:6: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\\') ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '&')||(LA7_0 >= '(' && LA7_0 <= '[')||(LA7_0 >= ']' && LA7_0 <= '\uFFFF')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:198:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					{
					// D:\\JAVA\\first\\src\\first.g:198:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					// D:\\JAVA\\first\\src\\first.g:198:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:198:54: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Nice_character_constant"

	// $ANTLR start "Nice_string"
	public final void mNice_string() throws RecognitionException {
		try {
			int _type = Nice_string;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:206:2: ( '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"' )
			// D:\\JAVA\\first\\src\\first.g:206:6: '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"'
			{
			match('\"'); 
			// D:\\JAVA\\first\\src\\first.g:206:11: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='\\') ) {
					alt8=1;
				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:206:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					{
					// D:\\JAVA\\first\\src\\first.g:206:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					// D:\\JAVA\\first\\src\\first.g:206:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:206:59: ~ ( '\\\\' | '\\\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Nice_string"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:210:6: ( '/*' ( . )* '*/' )
			// D:\\JAVA\\first\\src\\first.g:210:10: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\JAVA\\first\\src\\first.g:210:15: ( . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='*') ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1=='/') ) {
						alt9=2;
					}
					else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:210:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:214:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' ) )
			// D:\\JAVA\\first\\src\\first.g:214:6: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' )
			{
			match("//"); 

			// D:\\JAVA\\first\\src\\first.g:214:11: (~ ( '\\n' | '\\r' ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop10;
				}
			}

			// D:\\JAVA\\first\\src\\first.g:214:29: ( '\\n' | '\\r' | '\\r\\n' )
			int alt11=3;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='\n') ) {
				alt11=1;
			}
			else if ( (LA11_0=='\r') ) {
				int LA11_2 = input.LA(2);
				if ( (LA11_2=='\n') ) {
					alt11=3;
				}

				else {
					alt11=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:214:30: '\\n'
					{
					match('\n'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:214:37: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:214:44: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;

			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "Header"
	public final void mHeader() throws RecognitionException {
		try {
			int _type = Header;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:218:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' ) )
			// D:\\JAVA\\first\\src\\first.g:218:6: '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' )
			{
			match('#'); 
			// D:\\JAVA\\first\\src\\first.g:218:10: (~ ( '\\n' | '\\r' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop12;
				}
			}

			// D:\\JAVA\\first\\src\\first.g:218:28: ( '\\n' | '\\r' | '\\r\\n' )
			int alt13=3;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='\n') ) {
				alt13=1;
			}
			else if ( (LA13_0=='\r') ) {
				int LA13_2 = input.LA(2);
				if ( (LA13_2=='\n') ) {
					alt13=3;
				}

				else {
					alt13=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:218:29: '\\n'
					{
					match('\n'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:218:36: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:218:43: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;

			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Header"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\first.g:222:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\JAVA\\first\\src\\first.g:222:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\JAVA\\first\\src\\first.g:222:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\t' && LA14_0 <= '\n')||LA14_0=='\r'||LA14_0==' ') ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | Dec | Hex | Oct | Nice_identifier | Nice_character_constant | Nice_string | COMMENT | LINE_COMMENT | Header | WS )
		int alt15=66;
		alt15 = dfa15.predict(input);
		switch (alt15) {
			case 1 :
				// D:\\JAVA\\first\\src\\first.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// D:\\JAVA\\first\\src\\first.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// D:\\JAVA\\first\\src\\first.g:1:22: T__27
				{
				mT__27(); 

				}
				break;
			case 4 :
				// D:\\JAVA\\first\\src\\first.g:1:28: T__28
				{
				mT__28(); 

				}
				break;
			case 5 :
				// D:\\JAVA\\first\\src\\first.g:1:34: T__29
				{
				mT__29(); 

				}
				break;
			case 6 :
				// D:\\JAVA\\first\\src\\first.g:1:40: T__30
				{
				mT__30(); 

				}
				break;
			case 7 :
				// D:\\JAVA\\first\\src\\first.g:1:46: T__31
				{
				mT__31(); 

				}
				break;
			case 8 :
				// D:\\JAVA\\first\\src\\first.g:1:52: T__32
				{
				mT__32(); 

				}
				break;
			case 9 :
				// D:\\JAVA\\first\\src\\first.g:1:58: T__33
				{
				mT__33(); 

				}
				break;
			case 10 :
				// D:\\JAVA\\first\\src\\first.g:1:64: T__34
				{
				mT__34(); 

				}
				break;
			case 11 :
				// D:\\JAVA\\first\\src\\first.g:1:70: T__35
				{
				mT__35(); 

				}
				break;
			case 12 :
				// D:\\JAVA\\first\\src\\first.g:1:76: T__36
				{
				mT__36(); 

				}
				break;
			case 13 :
				// D:\\JAVA\\first\\src\\first.g:1:82: T__37
				{
				mT__37(); 

				}
				break;
			case 14 :
				// D:\\JAVA\\first\\src\\first.g:1:88: T__38
				{
				mT__38(); 

				}
				break;
			case 15 :
				// D:\\JAVA\\first\\src\\first.g:1:94: T__39
				{
				mT__39(); 

				}
				break;
			case 16 :
				// D:\\JAVA\\first\\src\\first.g:1:100: T__40
				{
				mT__40(); 

				}
				break;
			case 17 :
				// D:\\JAVA\\first\\src\\first.g:1:106: T__41
				{
				mT__41(); 

				}
				break;
			case 18 :
				// D:\\JAVA\\first\\src\\first.g:1:112: T__42
				{
				mT__42(); 

				}
				break;
			case 19 :
				// D:\\JAVA\\first\\src\\first.g:1:118: T__43
				{
				mT__43(); 

				}
				break;
			case 20 :
				// D:\\JAVA\\first\\src\\first.g:1:124: T__44
				{
				mT__44(); 

				}
				break;
			case 21 :
				// D:\\JAVA\\first\\src\\first.g:1:130: T__45
				{
				mT__45(); 

				}
				break;
			case 22 :
				// D:\\JAVA\\first\\src\\first.g:1:136: T__46
				{
				mT__46(); 

				}
				break;
			case 23 :
				// D:\\JAVA\\first\\src\\first.g:1:142: T__47
				{
				mT__47(); 

				}
				break;
			case 24 :
				// D:\\JAVA\\first\\src\\first.g:1:148: T__48
				{
				mT__48(); 

				}
				break;
			case 25 :
				// D:\\JAVA\\first\\src\\first.g:1:154: T__49
				{
				mT__49(); 

				}
				break;
			case 26 :
				// D:\\JAVA\\first\\src\\first.g:1:160: T__50
				{
				mT__50(); 

				}
				break;
			case 27 :
				// D:\\JAVA\\first\\src\\first.g:1:166: T__51
				{
				mT__51(); 

				}
				break;
			case 28 :
				// D:\\JAVA\\first\\src\\first.g:1:172: T__52
				{
				mT__52(); 

				}
				break;
			case 29 :
				// D:\\JAVA\\first\\src\\first.g:1:178: T__53
				{
				mT__53(); 

				}
				break;
			case 30 :
				// D:\\JAVA\\first\\src\\first.g:1:184: T__54
				{
				mT__54(); 

				}
				break;
			case 31 :
				// D:\\JAVA\\first\\src\\first.g:1:190: T__55
				{
				mT__55(); 

				}
				break;
			case 32 :
				// D:\\JAVA\\first\\src\\first.g:1:196: T__56
				{
				mT__56(); 

				}
				break;
			case 33 :
				// D:\\JAVA\\first\\src\\first.g:1:202: T__57
				{
				mT__57(); 

				}
				break;
			case 34 :
				// D:\\JAVA\\first\\src\\first.g:1:208: T__58
				{
				mT__58(); 

				}
				break;
			case 35 :
				// D:\\JAVA\\first\\src\\first.g:1:214: T__59
				{
				mT__59(); 

				}
				break;
			case 36 :
				// D:\\JAVA\\first\\src\\first.g:1:220: T__60
				{
				mT__60(); 

				}
				break;
			case 37 :
				// D:\\JAVA\\first\\src\\first.g:1:226: T__61
				{
				mT__61(); 

				}
				break;
			case 38 :
				// D:\\JAVA\\first\\src\\first.g:1:232: T__62
				{
				mT__62(); 

				}
				break;
			case 39 :
				// D:\\JAVA\\first\\src\\first.g:1:238: T__63
				{
				mT__63(); 

				}
				break;
			case 40 :
				// D:\\JAVA\\first\\src\\first.g:1:244: T__64
				{
				mT__64(); 

				}
				break;
			case 41 :
				// D:\\JAVA\\first\\src\\first.g:1:250: T__65
				{
				mT__65(); 

				}
				break;
			case 42 :
				// D:\\JAVA\\first\\src\\first.g:1:256: T__66
				{
				mT__66(); 

				}
				break;
			case 43 :
				// D:\\JAVA\\first\\src\\first.g:1:262: T__67
				{
				mT__67(); 

				}
				break;
			case 44 :
				// D:\\JAVA\\first\\src\\first.g:1:268: T__68
				{
				mT__68(); 

				}
				break;
			case 45 :
				// D:\\JAVA\\first\\src\\first.g:1:274: T__69
				{
				mT__69(); 

				}
				break;
			case 46 :
				// D:\\JAVA\\first\\src\\first.g:1:280: T__70
				{
				mT__70(); 

				}
				break;
			case 47 :
				// D:\\JAVA\\first\\src\\first.g:1:286: T__71
				{
				mT__71(); 

				}
				break;
			case 48 :
				// D:\\JAVA\\first\\src\\first.g:1:292: T__72
				{
				mT__72(); 

				}
				break;
			case 49 :
				// D:\\JAVA\\first\\src\\first.g:1:298: T__73
				{
				mT__73(); 

				}
				break;
			case 50 :
				// D:\\JAVA\\first\\src\\first.g:1:304: T__74
				{
				mT__74(); 

				}
				break;
			case 51 :
				// D:\\JAVA\\first\\src\\first.g:1:310: T__75
				{
				mT__75(); 

				}
				break;
			case 52 :
				// D:\\JAVA\\first\\src\\first.g:1:316: T__76
				{
				mT__76(); 

				}
				break;
			case 53 :
				// D:\\JAVA\\first\\src\\first.g:1:322: T__77
				{
				mT__77(); 

				}
				break;
			case 54 :
				// D:\\JAVA\\first\\src\\first.g:1:328: T__78
				{
				mT__78(); 

				}
				break;
			case 55 :
				// D:\\JAVA\\first\\src\\first.g:1:334: T__79
				{
				mT__79(); 

				}
				break;
			case 56 :
				// D:\\JAVA\\first\\src\\first.g:1:340: T__80
				{
				mT__80(); 

				}
				break;
			case 57 :
				// D:\\JAVA\\first\\src\\first.g:1:346: Dec
				{
				mDec(); 

				}
				break;
			case 58 :
				// D:\\JAVA\\first\\src\\first.g:1:350: Hex
				{
				mHex(); 

				}
				break;
			case 59 :
				// D:\\JAVA\\first\\src\\first.g:1:354: Oct
				{
				mOct(); 

				}
				break;
			case 60 :
				// D:\\JAVA\\first\\src\\first.g:1:358: Nice_identifier
				{
				mNice_identifier(); 

				}
				break;
			case 61 :
				// D:\\JAVA\\first\\src\\first.g:1:374: Nice_character_constant
				{
				mNice_character_constant(); 

				}
				break;
			case 62 :
				// D:\\JAVA\\first\\src\\first.g:1:398: Nice_string
				{
				mNice_string(); 

				}
				break;
			case 63 :
				// D:\\JAVA\\first\\src\\first.g:1:410: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 64 :
				// D:\\JAVA\\first\\src\\first.g:1:418: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 65 :
				// D:\\JAVA\\first\\src\\first.g:1:431: Header
				{
				mHeader(); 

				}
				break;
			case 66 :
				// D:\\JAVA\\first\\src\\first.g:1:438: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\1\uffff\1\51\1\53\1\56\2\uffff\1\60\1\63\2\uffff\1\67\1\uffff\1\72\1"+
		"\74\1\77\2\uffff\1\101\1\105\12\43\1\uffff\1\125\2\uffff\1\42\26\uffff"+
		"\1\131\5\uffff\1\133\5\uffff\1\134\1\uffff\5\43\1\142\7\43\12\uffff\4"+
		"\43\1\156\1\uffff\1\157\7\43\1\167\1\43\1\171\2\uffff\4\43\1\176\1\43"+
		"\1\u0080\1\uffff\1\43\1\uffff\3\43\1\u0085\1\uffff\1\u0086\1\uffff\1\43"+
		"\1\u0088\1\u0089\1\u008a\2\uffff\1\43\3\uffff\1\u008c\1\uffff";
	static final String DFA15_eofS =
		"\u008d\uffff";
	static final String DFA15_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\2\uffff\1\52\1\uffff\1\74\2\75\2\uffff"+
		"\1\75\1\44\1\162\1\150\1\154\1\157\1\146\1\145\1\151\1\156\1\157\1\150"+
		"\1\uffff\1\75\2\uffff\1\60\26\uffff\1\75\5\uffff\1\75\5\uffff\1\44\1\uffff"+
		"\1\145\1\141\1\156\1\163\1\162\1\44\2\164\1\172\1\162\3\151\12\uffff\1"+
		"\141\1\162\1\164\1\145\1\44\1\uffff\1\44\1\165\1\145\1\165\1\157\1\144"+
		"\1\154\1\153\1\44\1\151\1\44\2\uffff\1\162\1\157\1\143\1\156\1\44\1\145"+
		"\1\44\1\uffff\1\156\1\uffff\1\156\1\146\1\164\1\44\1\uffff\1\44\1\uffff"+
		"\1\165\3\44\2\uffff\1\145\3\uffff\1\44\1\uffff";
	static final String DFA15_maxS =
		"\1\176\3\75\2\uffff\2\75\2\uffff\1\75\1\uffff\2\75\1\76\2\uffff\1\75\1"+
		"\172\1\162\1\157\1\154\1\157\1\156\1\145\1\164\1\156\1\157\1\150\1\uffff"+
		"\1\174\2\uffff\1\170\26\uffff\1\75\5\uffff\1\75\5\uffff\1\172\1\uffff"+
		"\1\145\1\141\1\156\1\163\1\162\1\172\2\164\1\172\1\162\3\151\12\uffff"+
		"\1\141\1\162\1\164\1\145\1\172\1\uffff\1\172\1\165\1\145\1\165\1\157\1"+
		"\144\1\154\1\153\1\172\1\151\1\172\2\uffff\1\162\1\157\1\143\1\156\1\172"+
		"\1\145\1\172\1\uffff\1\156\1\uffff\1\156\1\146\1\164\1\172\1\uffff\1\172"+
		"\1\uffff\1\165\3\172\2\uffff\1\145\3\uffff\1\172\1\uffff";
	static final String DFA15_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\1\20\1\uffff\1\23\3\uffff\1\36\1\37\14"+
		"\uffff\1\63\1\uffff\1\67\1\70\1\uffff\1\71\1\74\1\75\1\76\1\101\1\102"+
		"\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1\16\1\14\1\22\1\77\1\100"+
		"\1\21\1\uffff\1\27\1\24\1\31\1\30\1\33\1\uffff\1\32\1\41\1\40\1\43\1\44"+
		"\1\uffff\1\42\15\uffff\1\65\1\66\1\64\1\72\1\73\1\26\1\25\1\35\1\34\1"+
		"\45\5\uffff\1\53\13\uffff\1\52\1\54\7\uffff\1\47\1\uffff\1\51\4\uffff"+
		"\1\61\1\uffff\1\46\4\uffff\1\60\1\62\1\uffff\1\55\1\56\1\57\1\uffff\1"+
		"\50";
	static final String DFA15_specialS =
		"\u008d\uffff}>";
	static final String[] DFA15_transitionS = {
			"\2\47\2\uffff\1\47\22\uffff\1\47\1\1\1\45\1\46\1\43\1\2\1\3\1\44\1\4"+
			"\1\5\1\6\1\7\1\10\1\uffff\1\11\1\12\1\41\11\42\1\uffff\1\13\1\14\1\15"+
			"\1\16\2\uffff\32\43\1\17\1\uffff\1\20\1\21\1\22\1\uffff\1\43\1\23\1\24"+
			"\1\43\1\25\1\26\2\43\1\27\10\43\1\30\1\31\1\43\1\32\1\33\1\34\3\43\1"+
			"\35\1\36\1\37\1\40",
			"\1\50",
			"\1\52",
			"\1\54\26\uffff\1\55",
			"",
			"",
			"\1\57",
			"\1\61\21\uffff\1\62",
			"",
			"",
			"\1\65\4\uffff\1\66\15\uffff\1\64",
			"",
			"\1\70\1\71",
			"\1\73",
			"\1\75\1\76",
			"",
			"",
			"\1\100",
			"\1\43\13\uffff\12\43\3\uffff\1\102\1\103\2\uffff\32\43\4\uffff\1\104"+
			"\1\uffff\32\43",
			"\1\106",
			"\1\107\6\uffff\1\110",
			"\1\111",
			"\1\112",
			"\1\113\7\uffff\1\114",
			"\1\115",
			"\1\116\12\uffff\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"",
			"\1\123\76\uffff\1\124",
			"",
			"",
			"\10\127\40\uffff\1\126\37\uffff\1\126",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\130",
			"",
			"",
			"",
			"",
			"",
			"\1\132",
			"",
			"",
			"",
			"",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\170",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\177",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0081",
			"",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0087",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\u008b",
			"",
			"",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | Dec | Hex | Oct | Nice_identifier | Nice_character_constant | Nice_string | COMMENT | LINE_COMMENT | Header | WS );";
		}
	}

}
