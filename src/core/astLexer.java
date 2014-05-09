// $ANTLR 3.5.1 D:\\JAVA\\first\\src\\core\\ast.g 2014-05-05 23:05:20

package core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class astLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int COMMENT=4;
	public static final int Dec=5;
	public static final int FUCK=6;
	public static final int Header=7;
	public static final int Hex=8;
	public static final int LEGEND_additive_expression=9;
	public static final int LEGEND_and_expression=10;
	public static final int LEGEND_arguments=11;
	public static final int LEGEND_assignment_expression=12;
	public static final int LEGEND_assignment_operator=13;
	public static final int LEGEND_cast_expression=14;
	public static final int LEGEND_character_constant=15;
	public static final int LEGEND_compound_statement=16;
	public static final int LEGEND_constant=17;
	public static final int LEGEND_constant_expression=18;
	public static final int LEGEND_declaration=19;
	public static final int LEGEND_declarator=20;
	public static final int LEGEND_declarators=21;
	public static final int LEGEND_equality_expression=22;
	public static final int LEGEND_exclusive_or_expression=23;
	public static final int LEGEND_expr1=24;
	public static final int LEGEND_expr2=25;
	public static final int LEGEND_expr3=26;
	public static final int LEGEND_expression=27;
	public static final int LEGEND_expression_statement=28;
	public static final int LEGEND_function_definition=29;
	public static final int LEGEND_identifier=30;
	public static final int LEGEND_inclusive_or_expression=31;
	public static final int LEGEND_init_declarator=32;
	public static final int LEGEND_init_declarators=33;
	public static final int LEGEND_initializer=34;
	public static final int LEGEND_integer_constant=35;
	public static final int LEGEND_iteration_statement=36;
	public static final int LEGEND_jump_statement=37;
	public static final int LEGEND_logical_and_expression=38;
	public static final int LEGEND_logical_or_expression=39;
	public static final int LEGEND_multiplicative_expression=40;
	public static final int LEGEND_parameters=41;
	public static final int LEGEND_plain_declaration=42;
	public static final int LEGEND_plain_declarator=43;
	public static final int LEGEND_postfix=44;
	public static final int LEGEND_postfix_expression=45;
	public static final int LEGEND_primary_expression=46;
	public static final int LEGEND_program=47;
	public static final int LEGEND_relational_expression=48;
	public static final int LEGEND_selection_statement=49;
	public static final int LEGEND_shift_expression=50;
	public static final int LEGEND_statement=51;
	public static final int LEGEND_string=52;
	public static final int LEGEND_struct_or_union=53;
	public static final int LEGEND_type_name=54;
	public static final int LEGEND_type_specifier=55;
	public static final int LEGEND_unary_expression=56;
	public static final int LEGEND_unary_operator=57;
	public static final int LINE_COMMENT=58;
	public static final int Nice_character_constant=59;
	public static final int Nice_identifier=60;
	public static final int Nice_string=61;
	public static final int Oct=62;
	public static final int WS=63;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public astLexer() {} 
	public astLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public astLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\JAVA\\first\\src\\core\\ast.g"; }

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:6:7: ( '!' )
			// D:\\JAVA\\first\\src\\core\\ast.g:6:9: '!'
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
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:7:7: ( '!=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:7:9: '!='
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
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:8:7: ( '%' )
			// D:\\JAVA\\first\\src\\core\\ast.g:8:9: '%'
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
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:9:7: ( '%=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:9:9: '%='
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
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:10:7: ( '&&' )
			// D:\\JAVA\\first\\src\\core\\ast.g:10:9: '&&'
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
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:11:7: ( '&' )
			// D:\\JAVA\\first\\src\\core\\ast.g:11:9: '&'
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
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:12:7: ( '&=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:12:9: '&='
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:13:7: ( '(' )
			// D:\\JAVA\\first\\src\\core\\ast.g:13:9: '('
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:14:7: ( ')' )
			// D:\\JAVA\\first\\src\\core\\ast.g:14:9: ')'
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:15:7: ( '*' )
			// D:\\JAVA\\first\\src\\core\\ast.g:15:9: '*'
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
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:16:7: ( '*=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:16:9: '*='
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
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:17:7: ( '+' )
			// D:\\JAVA\\first\\src\\core\\ast.g:17:9: '+'
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
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:18:7: ( '++' )
			// D:\\JAVA\\first\\src\\core\\ast.g:18:9: '++'
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
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:19:7: ( '+=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:19:9: '+='
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
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:20:7: ( ',' )
			// D:\\JAVA\\first\\src\\core\\ast.g:20:9: ','
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
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:21:7: ( '-' )
			// D:\\JAVA\\first\\src\\core\\ast.g:21:9: '-'
			{
			match('-'); 
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
			// D:\\JAVA\\first\\src\\core\\ast.g:22:7: ( '--' )
			// D:\\JAVA\\first\\src\\core\\ast.g:22:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:23:7: ( '-=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:23:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:24:7: ( '->' )
			// D:\\JAVA\\first\\src\\core\\ast.g:24:9: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:25:7: ( '.' )
			// D:\\JAVA\\first\\src\\core\\ast.g:25:9: '.'
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
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:26:7: ( '/' )
			// D:\\JAVA\\first\\src\\core\\ast.g:26:9: '/'
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
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:27:7: ( '/=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:27:9: '/='
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
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:28:7: ( ';' )
			// D:\\JAVA\\first\\src\\core\\ast.g:28:9: ';'
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
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:29:7: ( '<' )
			// D:\\JAVA\\first\\src\\core\\ast.g:29:9: '<'
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
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:30:7: ( '<<' )
			// D:\\JAVA\\first\\src\\core\\ast.g:30:9: '<<'
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
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:31:7: ( '<<=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:31:9: '<<='
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
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:32:7: ( '<=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:32:9: '<='
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
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:33:7: ( '=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:33:9: '='
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
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:34:7: ( '==' )
			// D:\\JAVA\\first\\src\\core\\ast.g:34:9: '=='
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
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:35:7: ( '>' )
			// D:\\JAVA\\first\\src\\core\\ast.g:35:9: '>'
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
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:36:7: ( '>=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:36:9: '>='
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
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:37:7: ( '>>' )
			// D:\\JAVA\\first\\src\\core\\ast.g:37:9: '>>'
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
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:38:7: ( '>>=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:38:9: '>>='
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
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:39:7: ( '[' )
			// D:\\JAVA\\first\\src\\core\\ast.g:39:9: '['
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
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:40:7: ( ']' )
			// D:\\JAVA\\first\\src\\core\\ast.g:40:9: ']'
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
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:41:7: ( '^' )
			// D:\\JAVA\\first\\src\\core\\ast.g:41:9: '^'
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
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:42:8: ( '^=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:42:10: '^='
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
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:43:8: ( 'break' )
			// D:\\JAVA\\first\\src\\core\\ast.g:43:10: 'break'
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
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:44:8: ( 'char' )
			// D:\\JAVA\\first\\src\\core\\ast.g:44:10: 'char'
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
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:45:8: ( 'continue' )
			// D:\\JAVA\\first\\src\\core\\ast.g:45:10: 'continue'
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
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:46:8: ( 'else' )
			// D:\\JAVA\\first\\src\\core\\ast.g:46:10: 'else'
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
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:47:8: ( 'for' )
			// D:\\JAVA\\first\\src\\core\\ast.g:47:10: 'for'
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
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:48:8: ( 'if' )
			// D:\\JAVA\\first\\src\\core\\ast.g:48:10: 'if'
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
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:49:8: ( 'int' )
			// D:\\JAVA\\first\\src\\core\\ast.g:49:10: 'int'
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
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:50:8: ( 'return' )
			// D:\\JAVA\\first\\src\\core\\ast.g:50:10: 'return'
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
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:51:8: ( 'sizeof' )
			// D:\\JAVA\\first\\src\\core\\ast.g:51:10: 'sizeof'
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
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:52:8: ( 'struct' )
			// D:\\JAVA\\first\\src\\core\\ast.g:52:10: 'struct'
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
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:53:8: ( 'union' )
			// D:\\JAVA\\first\\src\\core\\ast.g:53:10: 'union'
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
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:54:8: ( 'void' )
			// D:\\JAVA\\first\\src\\core\\ast.g:54:10: 'void'
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
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:55:8: ( 'while' )
			// D:\\JAVA\\first\\src\\core\\ast.g:55:10: 'while'
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
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:56:8: ( '{' )
			// D:\\JAVA\\first\\src\\core\\ast.g:56:10: '{'
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
	// $ANTLR end "T__114"

	// $ANTLR start "T__115"
	public final void mT__115() throws RecognitionException {
		try {
			int _type = T__115;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:57:8: ( '|' )
			// D:\\JAVA\\first\\src\\core\\ast.g:57:10: '|'
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
	// $ANTLR end "T__115"

	// $ANTLR start "T__116"
	public final void mT__116() throws RecognitionException {
		try {
			int _type = T__116;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:58:8: ( '|=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:58:10: '|='
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
	// $ANTLR end "T__116"

	// $ANTLR start "T__117"
	public final void mT__117() throws RecognitionException {
		try {
			int _type = T__117;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:59:8: ( '||' )
			// D:\\JAVA\\first\\src\\core\\ast.g:59:10: '||'
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
	// $ANTLR end "T__117"

	// $ANTLR start "T__118"
	public final void mT__118() throws RecognitionException {
		try {
			int _type = T__118;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:60:8: ( '}' )
			// D:\\JAVA\\first\\src\\core\\ast.g:60:10: '}'
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
	// $ANTLR end "T__118"

	// $ANTLR start "T__119"
	public final void mT__119() throws RecognitionException {
		try {
			int _type = T__119;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:61:8: ( '~' )
			// D:\\JAVA\\first\\src\\core\\ast.g:61:10: '~'
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
	// $ANTLR end "T__119"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			int _type = Dec;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:241:5: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:242:2: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:242:6: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// D:\\JAVA\\first\\src\\core\\ast.g:242:16: ( '0' .. '9' )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:
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
			// D:\\JAVA\\first\\src\\core\\ast.g:245:5: ( ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+ )
			// D:\\JAVA\\first\\src\\core\\ast.g:246:2: ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
			{
			// D:\\JAVA\\first\\src\\core\\ast.g:246:2: ( '0x' | '0X' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:246:3: '0x'
					{
					match("0x"); 

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:246:8: '0X'
					{
					match("0X"); 

					}
					break;

			}

			// D:\\JAVA\\first\\src\\core\\ast.g:246:13: ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' )+
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
					// D:\\JAVA\\first\\src\\core\\ast.g:
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
			// D:\\JAVA\\first\\src\\core\\ast.g:248:5: ( '0' ( '0' .. '7' )+ )
			// D:\\JAVA\\first\\src\\core\\ast.g:249:2: '0' ( '0' .. '7' )+
			{
			match('0'); 
			// D:\\JAVA\\first\\src\\core\\ast.g:249:5: ( '0' .. '7' )+
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
					// D:\\JAVA\\first\\src\\core\\ast.g:
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
			// D:\\JAVA\\first\\src\\core\\ast.g:259:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )* )
			// D:\\JAVA\\first\\src\\core\\ast.g:259:3: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\JAVA\\first\\src\\core\\ast.g:259:32: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' | '0' .. '9' )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='$'||(LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:
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
			// D:\\JAVA\\first\\src\\core\\ast.g:274:2: ( '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// D:\\JAVA\\first\\src\\core\\ast.g:276:2: '\\'' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// D:\\JAVA\\first\\src\\core\\ast.g:276:6: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\'' | '\\\\' ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:276:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					{
					// D:\\JAVA\\first\\src\\core\\ast.g:276:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
					// D:\\JAVA\\first\\src\\core\\ast.g:276:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:276:54: ~ ( '\\'' | '\\\\' )
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
			// D:\\JAVA\\first\\src\\core\\ast.g:284:2: ( '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' ) '\\'' | '\\'' '\\\\' ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) '\\'' )
			int alt10=3;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\"') ) {
				alt10=1;
			}
			else if ( (LA10_0=='\'') ) {
				int LA10_2 = input.LA(2);
				if ( (LA10_2=='\\') ) {
					int LA10_3 = input.LA(3);
					if ( (LA10_3=='0') ) {
						int LA10_4 = input.LA(4);
						if ( ((LA10_4 >= '0' && LA10_4 <= '7')) ) {
							alt10=2;
						}
						else if ( (LA10_4=='X'||LA10_4=='x') ) {
							alt10=3;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA10_3 >= '1' && LA10_3 <= '7')) ) {
						alt10=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:284:6: '\\\"' ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )* '\\\"'
					{
					match('\"'); 
					// D:\\JAVA\\first\\src\\core\\ast.g:284:11: ( ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) ) |~ ( '\\\\' | '\\\"' ) )*
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
							// D:\\JAVA\\first\\src\\core\\ast.g:284:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
							{
							// D:\\JAVA\\first\\src\\core\\ast.g:284:13: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
							// D:\\JAVA\\first\\src\\core\\ast.g:284:14: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
							// D:\\JAVA\\first\\src\\core\\ast.g:284:59: ~ ( '\\\\' | '\\\"' )
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
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:285:3: '\\'' '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' ) '\\''
					{
					match('\''); 
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					match('\''); 
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\ast.g:286:2: '\\'' '\\\\' ( '0x' | '0X' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) ( '0' .. '9' | 'A' .. 'F' | 'a' .. 'f' ) '\\''
					{
					match('\''); 
					match('\\'); 
					// D:\\JAVA\\first\\src\\core\\ast.g:286:12: ( '0x' | '0X' )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0=='0') ) {
						int LA9_1 = input.LA(2);
						if ( (LA9_1=='x') ) {
							alt9=1;
						}
						else if ( (LA9_1=='X') ) {
							alt9=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 9, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:286:13: '0x'
							{
							match("0x"); 

							}
							break;
						case 2 :
							// D:\\JAVA\\first\\src\\core\\ast.g:286:20: '0X'
							{
							match("0X"); 

							}
							break;

					}

					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					match('\''); 
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
	// $ANTLR end "Nice_string"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\JAVA\\first\\src\\core\\ast.g:290:6: ( '/*' ( . )* '*/' )
			// D:\\JAVA\\first\\src\\core\\ast.g:290:10: '/*' ( . )* '*/'
			{
			match("/*"); 

			// D:\\JAVA\\first\\src\\core\\ast.g:290:15: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='*') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='/') ) {
						alt11=2;
					}
					else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:290:15: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
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
			// D:\\JAVA\\first\\src\\core\\ast.g:294:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:294:6: '//' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' )
			{
			match("//"); 

			// D:\\JAVA\\first\\src\\core\\ast.g:294:11: (~ ( '\\n' | '\\r' ) )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '\u0000' && LA12_0 <= '\t')||(LA12_0 >= '\u000B' && LA12_0 <= '\f')||(LA12_0 >= '\u000E' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:
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

			// D:\\JAVA\\first\\src\\core\\ast.g:294:29: ( '\\n' | '\\r' | '\\r\\n' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:294:30: '\\n'
					{
					match('\n'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:294:37: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\ast.g:294:44: '\\r\\n'
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
			// D:\\JAVA\\first\\src\\core\\ast.g:298:2: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:298:6: '#' (~ ( '\\n' | '\\r' ) )* ( '\\n' | '\\r' | '\\r\\n' )
			{
			match('#'); 
			// D:\\JAVA\\first\\src\\core\\ast.g:298:10: (~ ( '\\n' | '\\r' ) )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\t')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:
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
					break loop14;
				}
			}

			// D:\\JAVA\\first\\src\\core\\ast.g:298:28: ( '\\n' | '\\r' | '\\r\\n' )
			int alt15=3;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\n') ) {
				alt15=1;
			}
			else if ( (LA15_0=='\r') ) {
				int LA15_2 = input.LA(2);
				if ( (LA15_2=='\n') ) {
					alt15=3;
				}

				else {
					alt15=2;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:298:29: '\\n'
					{
					match('\n'); 
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:298:36: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\ast.g:298:43: '\\r\\n'
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
			// D:\\JAVA\\first\\src\\core\\ast.g:302:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// D:\\JAVA\\first\\src\\core\\ast.g:302:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// D:\\JAVA\\first\\src\\core\\ast.g:302:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\t' && LA16_0 <= '\n')||LA16_0=='\r'||LA16_0==' ') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:
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
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
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
		// D:\\JAVA\\first\\src\\core\\ast.g:1:8: ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | Dec | Hex | Oct | Nice_identifier | Nice_character_constant | Nice_string | COMMENT | LINE_COMMENT | Header | WS )
		int alt17=66;
		alt17 = dfa17.predict(input);
		switch (alt17) {
			case 1 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:10: T__64
				{
				mT__64(); 

				}
				break;
			case 2 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:16: T__65
				{
				mT__65(); 

				}
				break;
			case 3 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:22: T__66
				{
				mT__66(); 

				}
				break;
			case 4 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:28: T__67
				{
				mT__67(); 

				}
				break;
			case 5 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:34: T__68
				{
				mT__68(); 

				}
				break;
			case 6 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:40: T__69
				{
				mT__69(); 

				}
				break;
			case 7 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:46: T__70
				{
				mT__70(); 

				}
				break;
			case 8 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:52: T__71
				{
				mT__71(); 

				}
				break;
			case 9 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:58: T__72
				{
				mT__72(); 

				}
				break;
			case 10 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:64: T__73
				{
				mT__73(); 

				}
				break;
			case 11 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:70: T__74
				{
				mT__74(); 

				}
				break;
			case 12 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:76: T__75
				{
				mT__75(); 

				}
				break;
			case 13 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:82: T__76
				{
				mT__76(); 

				}
				break;
			case 14 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:88: T__77
				{
				mT__77(); 

				}
				break;
			case 15 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:94: T__78
				{
				mT__78(); 

				}
				break;
			case 16 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:100: T__79
				{
				mT__79(); 

				}
				break;
			case 17 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:106: T__80
				{
				mT__80(); 

				}
				break;
			case 18 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:112: T__81
				{
				mT__81(); 

				}
				break;
			case 19 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:118: T__82
				{
				mT__82(); 

				}
				break;
			case 20 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:124: T__83
				{
				mT__83(); 

				}
				break;
			case 21 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:130: T__84
				{
				mT__84(); 

				}
				break;
			case 22 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:136: T__85
				{
				mT__85(); 

				}
				break;
			case 23 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:142: T__86
				{
				mT__86(); 

				}
				break;
			case 24 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:148: T__87
				{
				mT__87(); 

				}
				break;
			case 25 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:154: T__88
				{
				mT__88(); 

				}
				break;
			case 26 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:160: T__89
				{
				mT__89(); 

				}
				break;
			case 27 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:166: T__90
				{
				mT__90(); 

				}
				break;
			case 28 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:172: T__91
				{
				mT__91(); 

				}
				break;
			case 29 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:178: T__92
				{
				mT__92(); 

				}
				break;
			case 30 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:184: T__93
				{
				mT__93(); 

				}
				break;
			case 31 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:190: T__94
				{
				mT__94(); 

				}
				break;
			case 32 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:196: T__95
				{
				mT__95(); 

				}
				break;
			case 33 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:202: T__96
				{
				mT__96(); 

				}
				break;
			case 34 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:208: T__97
				{
				mT__97(); 

				}
				break;
			case 35 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:214: T__98
				{
				mT__98(); 

				}
				break;
			case 36 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:220: T__99
				{
				mT__99(); 

				}
				break;
			case 37 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:226: T__100
				{
				mT__100(); 

				}
				break;
			case 38 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:233: T__101
				{
				mT__101(); 

				}
				break;
			case 39 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:240: T__102
				{
				mT__102(); 

				}
				break;
			case 40 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:247: T__103
				{
				mT__103(); 

				}
				break;
			case 41 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:254: T__104
				{
				mT__104(); 

				}
				break;
			case 42 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:261: T__105
				{
				mT__105(); 

				}
				break;
			case 43 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:268: T__106
				{
				mT__106(); 

				}
				break;
			case 44 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:275: T__107
				{
				mT__107(); 

				}
				break;
			case 45 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:282: T__108
				{
				mT__108(); 

				}
				break;
			case 46 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:289: T__109
				{
				mT__109(); 

				}
				break;
			case 47 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:296: T__110
				{
				mT__110(); 

				}
				break;
			case 48 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:303: T__111
				{
				mT__111(); 

				}
				break;
			case 49 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:310: T__112
				{
				mT__112(); 

				}
				break;
			case 50 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:317: T__113
				{
				mT__113(); 

				}
				break;
			case 51 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:324: T__114
				{
				mT__114(); 

				}
				break;
			case 52 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:331: T__115
				{
				mT__115(); 

				}
				break;
			case 53 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:338: T__116
				{
				mT__116(); 

				}
				break;
			case 54 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:345: T__117
				{
				mT__117(); 

				}
				break;
			case 55 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:352: T__118
				{
				mT__118(); 

				}
				break;
			case 56 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:359: T__119
				{
				mT__119(); 

				}
				break;
			case 57 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:366: Dec
				{
				mDec(); 

				}
				break;
			case 58 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:370: Hex
				{
				mHex(); 

				}
				break;
			case 59 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:374: Oct
				{
				mOct(); 

				}
				break;
			case 60 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:378: Nice_identifier
				{
				mNice_identifier(); 

				}
				break;
			case 61 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:394: Nice_character_constant
				{
				mNice_character_constant(); 

				}
				break;
			case 62 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:418: Nice_string
				{
				mNice_string(); 

				}
				break;
			case 63 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:430: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 64 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:438: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 65 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:451: Header
				{
				mHeader(); 

				}
				break;
			case 66 :
				// D:\\JAVA\\first\\src\\core\\ast.g:1:458: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA17 dfa17 = new DFA17(this);
	static final String DFA17_eotS =
		"\1\uffff\1\51\1\53\1\56\2\uffff\1\60\1\63\1\uffff\1\67\1\uffff\1\73\1"+
		"\uffff\1\76\1\100\1\103\2\uffff\1\105\12\43\1\uffff\1\125\2\uffff\1\42"+
		"\32\uffff\1\133\5\uffff\1\135\3\uffff\5\43\1\143\7\43\13\uffff\4\43\1"+
		"\157\1\uffff\1\160\7\43\1\170\1\43\1\172\2\uffff\4\43\1\177\1\43\1\u0081"+
		"\1\uffff\1\43\1\uffff\3\43\1\u0086\1\uffff\1\u0087\1\uffff\1\43\1\u0089"+
		"\1\u008a\1\u008b\2\uffff\1\43\3\uffff\1\u008d\1\uffff";
	static final String DFA17_eofS =
		"\u008e\uffff";
	static final String DFA17_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\uffff\1\52\1\uffff\1"+
		"\74\2\75\2\uffff\1\75\1\162\1\150\1\154\1\157\1\146\1\145\1\151\1\156"+
		"\1\157\1\150\1\uffff\1\75\2\uffff\1\60\2\uffff\1\0\27\uffff\1\75\5\uffff"+
		"\1\75\3\uffff\1\145\1\141\1\156\1\163\1\162\1\44\2\164\1\172\1\162\3\151"+
		"\5\uffff\1\42\5\uffff\1\141\1\162\1\164\1\145\1\44\1\uffff\1\44\1\165"+
		"\1\145\1\165\1\157\1\144\1\154\1\153\1\44\1\151\1\44\2\uffff\1\162\1\157"+
		"\1\143\1\156\1\44\1\145\1\44\1\uffff\1\156\1\uffff\1\156\1\146\1\164\1"+
		"\44\1\uffff\1\44\1\uffff\1\165\3\44\2\uffff\1\145\3\uffff\1\44\1\uffff";
	static final String DFA17_maxS =
		"\1\176\3\75\2\uffff\2\75\1\uffff\1\76\1\uffff\1\75\1\uffff\2\75\1\76\2"+
		"\uffff\1\75\1\162\1\157\1\154\1\157\1\156\1\145\1\164\1\156\1\157\1\150"+
		"\1\uffff\1\174\2\uffff\1\170\2\uffff\1\uffff\27\uffff\1\75\5\uffff\1\75"+
		"\3\uffff\1\145\1\141\1\156\1\163\1\162\1\172\2\164\1\172\1\162\3\151\5"+
		"\uffff\1\164\5\uffff\1\141\1\162\1\164\1\145\1\172\1\uffff\1\172\1\165"+
		"\1\145\1\165\1\157\1\144\1\154\1\153\1\172\1\151\1\172\2\uffff\1\162\1"+
		"\157\1\143\1\156\1\172\1\145\1\172\1\uffff\1\156\1\uffff\1\156\1\146\1"+
		"\164\1\172\1\uffff\1\172\1\uffff\1\165\3\172\2\uffff\1\145\3\uffff\1\172"+
		"\1\uffff";
	static final String DFA17_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\1\uffff\1\24\1\uffff\1\27\3\uffff\1\42"+
		"\1\43\13\uffff\1\63\1\uffff\1\67\1\70\1\uffff\1\71\1\74\1\uffff\1\76\1"+
		"\101\1\102\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1\16\1\14\1\21\1"+
		"\22\1\23\1\20\1\26\1\77\1\100\1\25\1\uffff\1\33\1\30\1\35\1\34\1\37\1"+
		"\uffff\1\36\1\45\1\44\15\uffff\1\65\1\66\1\64\1\72\1\73\1\uffff\1\75\1"+
		"\32\1\31\1\41\1\40\5\uffff\1\53\13\uffff\1\52\1\54\7\uffff\1\47\1\uffff"+
		"\1\51\4\uffff\1\61\1\uffff\1\46\4\uffff\1\60\1\62\1\uffff\1\55\1\56\1"+
		"\57\1\uffff\1\50";
	static final String DFA17_specialS =
		"\44\uffff\1\0\151\uffff}>";
	static final String[] DFA17_transitionS = {
			"\2\47\2\uffff\1\47\22\uffff\1\47\1\1\1\45\1\46\1\43\1\2\1\3\1\44\1\4"+
			"\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\41\11\42\1\uffff\1\14\1\15\1\16\1"+
			"\17\2\uffff\32\43\1\20\1\uffff\1\21\1\22\1\43\1\uffff\1\43\1\23\1\24"+
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
			"\1\64\17\uffff\1\65\1\66",
			"",
			"\1\71\4\uffff\1\72\15\uffff\1\70",
			"",
			"\1\74\1\75",
			"\1\77",
			"\1\101\1\102",
			"",
			"",
			"\1\104",
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
			"\47\131\1\uffff\64\131\1\130\uffa3\131",
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
			"",
			"\1\132",
			"",
			"",
			"",
			"",
			"",
			"\1\134",
			"",
			"",
			"",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"",
			"",
			"",
			"",
			"",
			"\1\131\4\uffff\1\131\10\uffff\10\45\44\uffff\1\131\5\uffff\1\131\3\uffff"+
			"\1\131\7\uffff\1\131\3\uffff\1\131\1\uffff\1\131",
			"",
			"",
			"",
			"",
			"",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\171",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0080",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0082",
			"",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\u0088",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\1\u008c",
			"",
			"",
			"",
			"\1\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			""
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | Dec | Hex | Oct | Nice_identifier | Nice_character_constant | Nice_string | COMMENT | LINE_COMMENT | Header | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA17_36 = input.LA(1);
						s = -1;
						if ( (LA17_36=='\\') ) {s = 88;}
						else if ( ((LA17_36 >= '\u0000' && LA17_36 <= '&')||(LA17_36 >= '(' && LA17_36 <= '[')||(LA17_36 >= ']' && LA17_36 <= '\uFFFF')) ) {s = 89;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 17, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
