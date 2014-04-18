// $ANTLR 3.5.1 D:\\JAVA\\first\\src\\core\\first.g 2014-04-18 17:08:48
  
package core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class firstParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "Dec", "FUCK", "Header", 
		"Hex", "LEGEND_additive_expression", "LEGEND_and_expression", "LEGEND_arguments", 
		"LEGEND_assignment_expression", "LEGEND_assignment_operator", "LEGEND_cast_expression", 
		"LEGEND_character_constant", "LEGEND_compound_statement", "LEGEND_constant", 
		"LEGEND_constant_expression", "LEGEND_declaration", "LEGEND_declarator", 
		"LEGEND_declarators", "LEGEND_equality_expression", "LEGEND_exclusive_or_expression", 
		"LEGEND_expr1", "LEGEND_expr2", "LEGEND_expr3", "LEGEND_expression", "LEGEND_expression_statement", 
		"LEGEND_function_definition", "LEGEND_identifier", "LEGEND_inclusive_or_expression", 
		"LEGEND_init_declarator", "LEGEND_init_declarators", "LEGEND_initializer", 
		"LEGEND_integer_constant", "LEGEND_iteration_statement", "LEGEND_jump_statement", 
		"LEGEND_logical_and_expression", "LEGEND_logical_or_expression", "LEGEND_multiplicative_expression", 
		"LEGEND_parameters", "LEGEND_plain_declaration", "LEGEND_plain_declarator", 
		"LEGEND_postfix", "LEGEND_postfix_expression", "LEGEND_primary_expression", 
		"LEGEND_program", "LEGEND_relational_expression", "LEGEND_selection_statement", 
		"LEGEND_shift_expression", "LEGEND_statement", "LEGEND_string", "LEGEND_struct_or_union", 
		"LEGEND_type_name", "LEGEND_type_specifier", "LEGEND_unary_expression", 
		"LEGEND_unary_operator", "LINE_COMMENT", "Nice_character_constant", "Nice_identifier", 
		"Nice_string", "Oct", "WS", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", 
		"'&='", "'('", "')'", "'*'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", 
		"'--'", "'-='", "'->'", "'.'", "'/'", "'/='", "';'", "'<'", "'<<'", "'<<='", 
		"'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'['", "']'", "'^'", 
		"'^='", "'break'", "'char'", "'continue'", "'else'", "'for'", "'if'", 
		"'int'", "'return'", "'sizeof'", "'struct'", "'union'", "'void'", "'while'", 
		"'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public firstParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public firstParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return firstParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\JAVA\\first\\src\\core\\first.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\JAVA\\first\\src\\core\\first.g:77:1: program : prog EOF -> ^( LEGEND_program prog ) ;
	public final firstParser.program_return program() throws RecognitionException {
		firstParser.program_return retval = new firstParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope prog1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_prog=new RewriteRuleSubtreeStream(adaptor,"rule prog");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:77:9: ( prog EOF -> ^( LEGEND_program prog ) )
			// D:\\JAVA\\first\\src\\core\\first.g:77:11: prog EOF
			{
			pushFollow(FOLLOW_prog_in_program291);
			prog1=prog();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_prog.add(prog1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program293); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF2);

			// AST REWRITE
			// elements: prog
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 77:20: -> ^( LEGEND_program prog )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:77:23: ^( LEGEND_program prog )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_program, "LEGEND_program"), root_1);
				adaptor.addChild(root_1, stream_prog.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\JAVA\\first\\src\\core\\first.g:79:1: prog : ( declaration | function_definition )+ ;
	public final firstParser.prog_return prog() throws RecognitionException {
		firstParser.prog_return retval = new firstParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope function_definition4 =null;


		try {
			// D:\\JAVA\\first\\src\\core\\first.g:79:6: ( ( declaration | function_definition )+ )
			// D:\\JAVA\\first\\src\\core\\first.g:79:8: ( declaration | function_definition )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\JAVA\\first\\src\\core\\first.g:79:8: ( declaration | function_definition )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				switch ( input.LA(1) ) {
				case 112:
					{
					int LA1_2 = input.LA(2);
					if ( (synpred1_first()) ) {
						alt1=1;
					}
					else if ( (synpred2_first()) ) {
						alt1=2;
					}

					}
					break;
				case 102:
					{
					int LA1_3 = input.LA(2);
					if ( (synpred1_first()) ) {
						alt1=1;
					}
					else if ( (synpred2_first()) ) {
						alt1=2;
					}

					}
					break;
				case 107:
					{
					int LA1_4 = input.LA(2);
					if ( (synpred1_first()) ) {
						alt1=1;
					}
					else if ( (synpred2_first()) ) {
						alt1=2;
					}

					}
					break;
				case 110:
				case 111:
					{
					int LA1_5 = input.LA(2);
					if ( (synpred1_first()) ) {
						alt1=1;
					}
					else if ( (synpred2_first()) ) {
						alt1=2;
					}

					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:79:10: declaration
					{
					pushFollow(FOLLOW_declaration_in_prog311);
					declaration3=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:79:24: function_definition
					{
					pushFollow(FOLLOW_function_definition_in_prog315);
					function_definition4=function_definition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_definition4.getTree());

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prog"


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// D:\\JAVA\\first\\src\\core\\first.g:81:1: declaration : type_specifier ( init_declarators )? ';' -> ^( LEGEND_declaration type_specifier ( init_declarators )? ) ;
	public final firstParser.declaration_return declaration() throws RecognitionException {
		firstParser.declaration_return retval = new firstParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal7=null;
		ParserRuleReturnScope type_specifier5 =null;
		ParserRuleReturnScope init_declarators6 =null;

		CommonTree char_literal7_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_init_declarators=new RewriteRuleSubtreeStream(adaptor,"rule init_declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:81:12: ( type_specifier ( init_declarators )? ';' -> ^( LEGEND_declaration type_specifier ( init_declarators )? ) )
			// D:\\JAVA\\first\\src\\core\\first.g:81:14: type_specifier ( init_declarators )? ';'
			{
			pushFollow(FOLLOW_type_specifier_in_declaration328);
			type_specifier5=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier5.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:81:29: ( init_declarators )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Nice_identifier||LA2_0==73) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:81:29: init_declarators
					{
					pushFollow(FOLLOW_init_declarators_in_declaration330);
					init_declarators6=init_declarators();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarators.add(init_declarators6.getTree());
					}
					break;

			}

			char_literal7=(Token)match(input,86,FOLLOW_86_in_declaration333); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal7);

			// AST REWRITE
			// elements: init_declarators, type_specifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 81:51: -> ^( LEGEND_declaration type_specifier ( init_declarators )? )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:81:54: ^( LEGEND_declaration type_specifier ( init_declarators )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declaration, "LEGEND_declaration"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:81:90: ( init_declarators )?
				if ( stream_init_declarators.hasNext() ) {
					adaptor.addChild(root_1, stream_init_declarators.nextTree());
				}
				stream_init_declarators.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class function_definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_definition"
	// D:\\JAVA\\first\\src\\core\\first.g:83:1: function_definition : type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement ) ;
	public final firstParser.function_definition_return function_definition() throws RecognitionException {
		firstParser.function_definition_return retval = new firstParser.function_definition_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal10=null;
		Token char_literal12=null;
		ParserRuleReturnScope type_specifier8 =null;
		ParserRuleReturnScope plain_declarator9 =null;
		ParserRuleReturnScope parameters11 =null;
		ParserRuleReturnScope compound_statement13 =null;

		CommonTree char_literal10_tree=null;
		CommonTree char_literal12_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
		RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:83:20: ( type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement ) )
			// D:\\JAVA\\first\\src\\core\\first.g:83:22: type_specifier plain_declarator '(' ( parameters )? ')' compound_statement
			{
			pushFollow(FOLLOW_type_specifier_in_function_definition356);
			type_specifier8=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier8.getTree());
			pushFollow(FOLLOW_plain_declarator_in_function_definition358);
			plain_declarator9=plain_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator9.getTree());
			char_literal10=(Token)match(input,71,FOLLOW_71_in_function_definition360); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal10);

			// D:\\JAVA\\first\\src\\core\\first.g:83:58: ( parameters )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==102||LA3_0==107||(LA3_0 >= 110 && LA3_0 <= 112)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:83:58: parameters
					{
					pushFollow(FOLLOW_parameters_in_function_definition362);
					parameters11=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters11.getTree());
					}
					break;

			}

			char_literal12=(Token)match(input,72,FOLLOW_72_in_function_definition365); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal12);

			pushFollow(FOLLOW_compound_statement_in_function_definition367);
			compound_statement13=compound_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement13.getTree());
			// AST REWRITE
			// elements: parameters, type_specifier, compound_statement, plain_declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 83:93: -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:83:96: ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_function_definition, "LEGEND_function_definition"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				adaptor.addChild(root_1, stream_plain_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:83:157: ( parameters )?
				if ( stream_parameters.hasNext() ) {
					adaptor.addChild(root_1, stream_parameters.nextTree());
				}
				stream_parameters.reset();

				adaptor.addChild(root_1, stream_compound_statement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_definition"


	public static class parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// D:\\JAVA\\first\\src\\core\\first.g:85:1: parameters : plain_declaration ( ',' plain_declaration )* -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* ) ;
	public final firstParser.parameters_return parameters() throws RecognitionException {
		firstParser.parameters_return retval = new firstParser.parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope plain_declaration14 =null;
		ParserRuleReturnScope plain_declaration16 =null;

		CommonTree char_literal15_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_plain_declaration=new RewriteRuleSubtreeStream(adaptor,"rule plain_declaration");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:85:11: ( plain_declaration ( ',' plain_declaration )* -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:85:13: plain_declaration ( ',' plain_declaration )*
			{
			pushFollow(FOLLOW_plain_declaration_in_parameters393);
			plain_declaration14=plain_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declaration.add(plain_declaration14.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:85:31: ( ',' plain_declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==78) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:85:32: ',' plain_declaration
					{
					char_literal15=(Token)match(input,78,FOLLOW_78_in_parameters396); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal15);

					pushFollow(FOLLOW_plain_declaration_in_parameters398);
					plain_declaration16=plain_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declaration.add(plain_declaration16.getTree());
					}
					break;

				default :
					break loop4;
				}
			}

			// AST REWRITE
			// elements: plain_declaration, plain_declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 85:56: -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:85:59: ^( LEGEND_parameters plain_declaration ( plain_declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_parameters, "LEGEND_parameters"), root_1);
				adaptor.addChild(root_1, stream_plain_declaration.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:85:97: ( plain_declaration )*
				while ( stream_plain_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_plain_declaration.nextTree());
				}
				stream_plain_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameters"


	public static class declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarators"
	// D:\\JAVA\\first\\src\\core\\first.g:87:1: declarators : declarator ( ',' declarator )* -> ^( LEGEND_declarators ( declarator )+ ) ;
	public final firstParser.declarators_return declarators() throws RecognitionException {
		firstParser.declarators_return retval = new firstParser.declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope declarator17 =null;
		ParserRuleReturnScope declarator19 =null;

		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:87:12: ( declarator ( ',' declarator )* -> ^( LEGEND_declarators ( declarator )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:87:14: declarator ( ',' declarator )*
			{
			pushFollow(FOLLOW_declarator_in_declarators425);
			declarator17=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator17.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:87:25: ( ',' declarator )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==78) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:87:26: ',' declarator
					{
					char_literal18=(Token)match(input,78,FOLLOW_78_in_declarators428); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal18);

					pushFollow(FOLLOW_declarator_in_declarators430);
					declarator19=declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarator.add(declarator19.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 87:43: -> ^( LEGEND_declarators ( declarator )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:87:46: ^( LEGEND_declarators ( declarator )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declarators, "LEGEND_declarators"), root_1);
				if ( !(stream_declarator.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declarator.hasNext() ) {
					adaptor.addChild(root_1, stream_declarator.nextTree());
				}
				stream_declarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarators"


	public static class init_declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarators"
	// D:\\JAVA\\first\\src\\core\\first.g:89:1: init_declarators : init_declarator ( ',' init_declarator )* -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* ) ;
	public final firstParser.init_declarators_return init_declarators() throws RecognitionException {
		firstParser.init_declarators_return retval = new firstParser.init_declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope init_declarator20 =null;
		ParserRuleReturnScope init_declarator22 =null;

		CommonTree char_literal21_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:89:17: ( init_declarator ( ',' init_declarator )* -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:89:19: init_declarator ( ',' init_declarator )*
			{
			pushFollow(FOLLOW_init_declarator_in_init_declarators453);
			init_declarator20=init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator20.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:89:35: ( ',' init_declarator )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==78) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:89:36: ',' init_declarator
					{
					char_literal21=(Token)match(input,78,FOLLOW_78_in_init_declarators456); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal21);

					pushFollow(FOLLOW_init_declarator_in_init_declarators458);
					init_declarator22=init_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator22.getTree());
					}
					break;

				default :
					break loop6;
				}
			}

			// AST REWRITE
			// elements: init_declarator, init_declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 89:58: -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:89:61: ^( LEGEND_init_declarators init_declarator ( init_declarator )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_init_declarators, "LEGEND_init_declarators"), root_1);
				adaptor.addChild(root_1, stream_init_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:89:103: ( init_declarator )*
				while ( stream_init_declarator.hasNext() ) {
					adaptor.addChild(root_1, stream_init_declarator.nextTree());
				}
				stream_init_declarator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init_declarators"


	public static class init_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarator"
	// D:\\JAVA\\first\\src\\core\\first.g:91:1: init_declarator : declarator ( '=' initializer )? -> ^( LEGEND_init_declarator declarator ( initializer )? ) ;
	public final firstParser.init_declarator_return init_declarator() throws RecognitionException {
		firstParser.init_declarator_return retval = new firstParser.init_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal24=null;
		ParserRuleReturnScope declarator23 =null;
		ParserRuleReturnScope initializer25 =null;

		CommonTree char_literal24_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:91:16: ( declarator ( '=' initializer )? -> ^( LEGEND_init_declarator declarator ( initializer )? ) )
			// D:\\JAVA\\first\\src\\core\\first.g:91:18: declarator ( '=' initializer )?
			{
			pushFollow(FOLLOW_declarator_in_init_declarator486);
			declarator23=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator23.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:91:29: ( '=' initializer )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==91) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:91:30: '=' initializer
					{
					char_literal24=(Token)match(input,91,FOLLOW_91_in_init_declarator489); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(char_literal24);

					pushFollow(FOLLOW_initializer_in_init_declarator491);
					initializer25=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(initializer25.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: declarator, initializer
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 91:48: -> ^( LEGEND_init_declarator declarator ( initializer )? )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:91:51: ^( LEGEND_init_declarator declarator ( initializer )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_init_declarator, "LEGEND_init_declarator"), root_1);
				adaptor.addChild(root_1, stream_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:91:87: ( initializer )?
				if ( stream_initializer.hasNext() ) {
					adaptor.addChild(root_1, stream_initializer.nextTree());
				}
				stream_initializer.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "init_declarator"


	public static class initializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initializer"
	// D:\\JAVA\\first\\src\\core\\first.g:93:1: initializer : ( assignment_expression -> ^( LEGEND_initializer assignment_expression ) | '{' initializer ( ',' initializer )* '}' -> ^( LEGEND_initializer initializer ( initializer )* ) );
	public final firstParser.initializer_return initializer() throws RecognitionException {
		firstParser.initializer_return retval = new firstParser.initializer_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal27=null;
		Token char_literal29=null;
		Token char_literal31=null;
		ParserRuleReturnScope assignment_expression26 =null;
		ParserRuleReturnScope initializer28 =null;
		ParserRuleReturnScope initializer30 =null;

		CommonTree char_literal27_tree=null;
		CommonTree char_literal29_tree=null;
		CommonTree char_literal31_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
		RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:93:12: ( assignment_expression -> ^( LEGEND_initializer assignment_expression ) | '{' initializer ( ',' initializer )* '}' -> ^( LEGEND_initializer initializer ( initializer )* ) )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Dec||LA9_0==Hex||(LA9_0 >= Nice_character_constant && LA9_0 <= Oct)||LA9_0==64||LA9_0==69||LA9_0==71||LA9_0==73||(LA9_0 >= 75 && LA9_0 <= 76)||(LA9_0 >= 79 && LA9_0 <= 80)||LA9_0==109||LA9_0==119) ) {
				alt9=1;
			}
			else if ( (LA9_0==114) ) {
				alt9=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:93:14: assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_initializer516);
					assignment_expression26=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression26.getTree());
					// AST REWRITE
					// elements: assignment_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 93:36: -> ^( LEGEND_initializer assignment_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:93:39: ^( LEGEND_initializer assignment_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_initializer, "LEGEND_initializer"), root_1);
						adaptor.addChild(root_1, stream_assignment_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:94:15: '{' initializer ( ',' initializer )* '}'
					{
					char_literal27=(Token)match(input,114,FOLLOW_114_in_initializer540); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(char_literal27);

					pushFollow(FOLLOW_initializer_in_initializer542);
					initializer28=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(initializer28.getTree());
					// D:\\JAVA\\first\\src\\core\\first.g:94:31: ( ',' initializer )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==78) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:94:32: ',' initializer
							{
							char_literal29=(Token)match(input,78,FOLLOW_78_in_initializer545); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_78.add(char_literal29);

							pushFollow(FOLLOW_initializer_in_initializer547);
							initializer30=initializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_initializer.add(initializer30.getTree());
							}
							break;

						default :
							break loop8;
						}
					}

					char_literal31=(Token)match(input,118,FOLLOW_118_in_initializer551); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_118.add(char_literal31);

					// AST REWRITE
					// elements: initializer, initializer
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 94:54: -> ^( LEGEND_initializer initializer ( initializer )* )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:94:57: ^( LEGEND_initializer initializer ( initializer )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_initializer, "LEGEND_initializer"), root_1);
						adaptor.addChild(root_1, stream_initializer.nextTree());
						// D:\\JAVA\\first\\src\\core\\first.g:94:90: ( initializer )*
						while ( stream_initializer.hasNext() ) {
							adaptor.addChild(root_1, stream_initializer.nextTree());
						}
						stream_initializer.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "initializer"


	public static class type_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_specifier"
	// D:\\JAVA\\first\\src\\core\\first.g:96:1: type_specifier : ( 'void' -> ^( LEGEND_type_specifier 'void' ) | 'char' -> ^( LEGEND_type_specifier 'char' ) | 'int' -> ^( LEGEND_type_specifier 'int' ) | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ ) | struct_or_union identifier -> ^( LEGEND_type_specifier struct_or_union identifier ) );
	public final firstParser.type_specifier_return type_specifier() throws RecognitionException {
		firstParser.type_specifier_return retval = new firstParser.type_specifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal32=null;
		Token string_literal33=null;
		Token string_literal34=null;
		Token char_literal37=null;
		Token char_literal40=null;
		Token char_literal41=null;
		ParserRuleReturnScope struct_or_union35 =null;
		ParserRuleReturnScope identifier36 =null;
		ParserRuleReturnScope type_specifier38 =null;
		ParserRuleReturnScope declarators39 =null;
		ParserRuleReturnScope struct_or_union42 =null;
		ParserRuleReturnScope identifier43 =null;

		CommonTree string_literal32_tree=null;
		CommonTree string_literal33_tree=null;
		CommonTree string_literal34_tree=null;
		CommonTree char_literal37_tree=null;
		CommonTree char_literal40_tree=null;
		CommonTree char_literal41_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
		RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_declarators=new RewriteRuleSubtreeStream(adaptor,"rule declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:96:15: ( 'void' -> ^( LEGEND_type_specifier 'void' ) | 'char' -> ^( LEGEND_type_specifier 'char' ) | 'int' -> ^( LEGEND_type_specifier 'int' ) | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ ) | struct_or_union identifier -> ^( LEGEND_type_specifier struct_or_union identifier ) )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 112:
				{
				alt12=1;
				}
				break;
			case 102:
				{
				alt12=2;
				}
				break;
			case 107:
				{
				alt12=3;
				}
				break;
			case 110:
			case 111:
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4==Nice_identifier) ) {
					int LA12_5 = input.LA(3);
					if ( (LA12_5==114) ) {
						alt12=4;
					}
					else if ( (LA12_5==Nice_identifier||(LA12_5 >= 72 && LA12_5 <= 73)||LA12_5==86) ) {
						alt12=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA12_4==114) ) {
					alt12=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:96:17: 'void'
					{
					string_literal32=(Token)match(input,112,FOLLOW_112_in_type_specifier577); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_112.add(string_literal32);

					// AST REWRITE
					// elements: 112
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 96:24: -> ^( LEGEND_type_specifier 'void' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:96:27: ^( LEGEND_type_specifier 'void' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_112.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:97:11: 'char'
					{
					string_literal33=(Token)match(input,102,FOLLOW_102_in_type_specifier597); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_102.add(string_literal33);

					// AST REWRITE
					// elements: 102
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 97:18: -> ^( LEGEND_type_specifier 'char' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:97:21: ^( LEGEND_type_specifier 'char' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_102.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:98:11: 'int'
					{
					string_literal34=(Token)match(input,107,FOLLOW_107_in_type_specifier617); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_107.add(string_literal34);

					// AST REWRITE
					// elements: 107
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 98:17: -> ^( LEGEND_type_specifier 'int' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:98:20: ^( LEGEND_type_specifier 'int' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_107.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\core\\first.g:99:18: struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}'
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier644);
					struct_or_union35=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union35.getTree());
					// D:\\JAVA\\first\\src\\core\\first.g:99:34: ( identifier )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Nice_identifier) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:99:34: identifier
							{
							pushFollow(FOLLOW_identifier_in_type_specifier646);
							identifier36=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());
							}
							break;

					}

					char_literal37=(Token)match(input,114,FOLLOW_114_in_type_specifier649); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(char_literal37);

					// D:\\JAVA\\first\\src\\core\\first.g:99:50: ( type_specifier declarators ';' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==102||LA11_0==107||(LA11_0 >= 110 && LA11_0 <= 112)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:99:51: type_specifier declarators ';'
							{
							pushFollow(FOLLOW_type_specifier_in_type_specifier652);
							type_specifier38=type_specifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier38.getTree());
							pushFollow(FOLLOW_declarators_in_type_specifier654);
							declarators39=declarators();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_declarators.add(declarators39.getTree());
							char_literal40=(Token)match(input,86,FOLLOW_86_in_type_specifier656); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_86.add(char_literal40);

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					char_literal41=(Token)match(input,118,FOLLOW_118_in_type_specifier660); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_118.add(char_literal41);

					// AST REWRITE
					// elements: struct_or_union, declarators, type_specifier, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 99:88: -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:99:91: ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_struct_or_union.nextTree());
						// D:\\JAVA\\first\\src\\core\\first.g:99:131: ( identifier )?
						if ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_1, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						if ( !(stream_declarators.hasNext()||stream_type_specifier.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_declarators.hasNext()||stream_type_specifier.hasNext() ) {
							adaptor.addChild(root_1, stream_type_specifier.nextTree());
							adaptor.addChild(root_1, stream_declarators.nextTree());
						}
						stream_declarators.reset();
						stream_type_specifier.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\core\\first.g:100:18: struct_or_union identifier
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier698);
					struct_or_union42=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union42.getTree());
					pushFollow(FOLLOW_identifier_in_type_specifier700);
					identifier43=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier43.getTree());
					// AST REWRITE
					// elements: identifier, struct_or_union
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:45: -> ^( LEGEND_type_specifier struct_or_union identifier )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:100:48: ^( LEGEND_type_specifier struct_or_union identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_struct_or_union.nextTree());
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_specifier"


	public static class struct_or_union_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "struct_or_union"
	// D:\\JAVA\\first\\src\\core\\first.g:102:1: struct_or_union : ( 'struct' | 'union' );
	public final firstParser.struct_or_union_return struct_or_union() throws RecognitionException {
		firstParser.struct_or_union_return retval = new firstParser.struct_or_union_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set44=null;

		CommonTree set44_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:102:16: ( 'struct' | 'union' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set44=input.LT(1);
			if ( (input.LA(1) >= 110 && input.LA(1) <= 111) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set44));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "struct_or_union"


	public static class plain_declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "plain_declaration"
	// D:\\JAVA\\first\\src\\core\\first.g:106:1: plain_declaration : type_specifier declarator -> ^( LEGEND_plain_declaration type_specifier declarator ) ;
	public final firstParser.plain_declaration_return plain_declaration() throws RecognitionException {
		firstParser.plain_declaration_return retval = new firstParser.plain_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope type_specifier45 =null;
		ParserRuleReturnScope declarator46 =null;

		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:106:18: ( type_specifier declarator -> ^( LEGEND_plain_declaration type_specifier declarator ) )
			// D:\\JAVA\\first\\src\\core\\first.g:106:20: type_specifier declarator
			{
			pushFollow(FOLLOW_type_specifier_in_plain_declaration739);
			type_specifier45=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier45.getTree());
			pushFollow(FOLLOW_declarator_in_plain_declaration741);
			declarator46=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator46.getTree());
			// AST REWRITE
			// elements: type_specifier, declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 106:46: -> ^( LEGEND_plain_declaration type_specifier declarator )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:106:49: ^( LEGEND_plain_declaration type_specifier declarator )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_plain_declaration, "LEGEND_plain_declaration"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				adaptor.addChild(root_1, stream_declarator.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_declaration"


	public static class declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarator"
	// D:\\JAVA\\first\\src\\core\\first.g:108:1: declarator : ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) );
	public final firstParser.declarator_return declarator() throws RecognitionException {
		firstParser.declarator_return retval = new firstParser.declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal48=null;
		Token char_literal50=null;
		Token char_literal52=null;
		Token char_literal54=null;
		ParserRuleReturnScope plain_declarator47 =null;
		ParserRuleReturnScope parameters49 =null;
		ParserRuleReturnScope plain_declarator51 =null;
		ParserRuleReturnScope constant_expression53 =null;

		CommonTree char_literal48_tree=null;
		CommonTree char_literal50_tree=null;
		CommonTree char_literal52_tree=null;
		CommonTree char_literal54_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_constant_expression=new RewriteRuleSubtreeStream(adaptor,"rule constant_expression");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:108:11: ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) )
			int alt15=2;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:108:13: plain_declarator '(' ( parameters )? ')'
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator763);
					plain_declarator47=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator47.getTree());
					char_literal48=(Token)match(input,71,FOLLOW_71_in_declarator765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal48);

					// D:\\JAVA\\first\\src\\core\\first.g:108:34: ( parameters )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==102||LA13_0==107||(LA13_0 >= 110 && LA13_0 <= 112)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:108:34: parameters
							{
							pushFollow(FOLLOW_parameters_in_declarator767);
							parameters49=parameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameters.add(parameters49.getTree());
							}
							break;

					}

					char_literal50=(Token)match(input,72,FOLLOW_72_in_declarator770); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal50);

					// AST REWRITE
					// elements: parameters, plain_declarator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 108:50: -> ^( LEGEND_declarator plain_declarator ( parameters )? )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:108:53: ^( LEGEND_declarator plain_declarator ( parameters )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declarator, "LEGEND_declarator"), root_1);
						adaptor.addChild(root_1, stream_plain_declarator.nextTree());
						// D:\\JAVA\\first\\src\\core\\first.g:108:90: ( parameters )?
						if ( stream_parameters.hasNext() ) {
							adaptor.addChild(root_1, stream_parameters.nextTree());
						}
						stream_parameters.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:109:6: plain_declarator ( '[' constant_expression ']' )*
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator788);
					plain_declarator51=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator51.getTree());
					// D:\\JAVA\\first\\src\\core\\first.g:109:23: ( '[' constant_expression ']' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==97) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:109:24: '[' constant_expression ']'
							{
							char_literal52=(Token)match(input,97,FOLLOW_97_in_declarator791); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_97.add(char_literal52);

							pushFollow(FOLLOW_constant_expression_in_declarator793);
							constant_expression53=constant_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression53.getTree());
							char_literal54=(Token)match(input,98,FOLLOW_98_in_declarator795); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_98.add(char_literal54);

							}
							break;

						default :
							break loop14;
						}
					}

					// AST REWRITE
					// elements: plain_declarator, constant_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:54: -> ^( LEGEND_declarator plain_declarator ( constant_expression )* )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:109:57: ^( LEGEND_declarator plain_declarator ( constant_expression )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declarator, "LEGEND_declarator"), root_1);
						adaptor.addChild(root_1, stream_plain_declarator.nextTree());
						// D:\\JAVA\\first\\src\\core\\first.g:109:94: ( constant_expression )*
						while ( stream_constant_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_constant_expression.nextTree());
						}
						stream_constant_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarator"


	public static class plain_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "plain_declarator"
	// D:\\JAVA\\first\\src\\core\\first.g:111:1: plain_declarator : ( '*' )* identifier -> ^( LEGEND_plain_declarator ( '*' )* identifier ) ;
	public final firstParser.plain_declarator_return plain_declarator() throws RecognitionException {
		firstParser.plain_declarator_return retval = new firstParser.plain_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		ParserRuleReturnScope identifier56 =null;

		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:111:17: ( ( '*' )* identifier -> ^( LEGEND_plain_declarator ( '*' )* identifier ) )
			// D:\\JAVA\\first\\src\\core\\first.g:111:19: ( '*' )* identifier
			{
			// D:\\JAVA\\first\\src\\core\\first.g:111:19: ( '*' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==73) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:111:19: '*'
					{
					char_literal55=(Token)match(input,73,FOLLOW_73_in_plain_declarator824); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal55);

					}
					break;

				default :
					break loop16;
				}
			}

			pushFollow(FOLLOW_identifier_in_plain_declarator827);
			identifier56=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier56.getTree());
			// AST REWRITE
			// elements: identifier, 73
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 111:36: -> ^( LEGEND_plain_declarator ( '*' )* identifier )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:111:40: ^( LEGEND_plain_declarator ( '*' )* identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_plain_declarator, "LEGEND_plain_declarator"), root_1);
				// D:\\JAVA\\first\\src\\core\\first.g:111:66: ( '*' )*
				while ( stream_73.hasNext() ) {
					adaptor.addChild(root_1, stream_73.nextNode());
				}
				stream_73.reset();

				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plain_declarator"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\JAVA\\first\\src\\core\\first.g:116:1: statement : ( expression_statement -> ^( LEGEND_statement expression_statement ) | compound_statement -> ^( LEGEND_statement compound_statement ) | selection_statement -> ^( LEGEND_statement selection_statement ) | iteration_statement -> ^( LEGEND_statement iteration_statement ) | jump_statement -> ^( LEGEND_statement jump_statement ) );
	public final firstParser.statement_return statement() throws RecognitionException {
		firstParser.statement_return retval = new firstParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression_statement57 =null;
		ParserRuleReturnScope compound_statement58 =null;
		ParserRuleReturnScope selection_statement59 =null;
		ParserRuleReturnScope iteration_statement60 =null;
		ParserRuleReturnScope jump_statement61 =null;

		RewriteRuleSubtreeStream stream_selection_statement=new RewriteRuleSubtreeStream(adaptor,"rule selection_statement");
		RewriteRuleSubtreeStream stream_expression_statement=new RewriteRuleSubtreeStream(adaptor,"rule expression_statement");
		RewriteRuleSubtreeStream stream_iteration_statement=new RewriteRuleSubtreeStream(adaptor,"rule iteration_statement");
		RewriteRuleSubtreeStream stream_jump_statement=new RewriteRuleSubtreeStream(adaptor,"rule jump_statement");
		RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:116:10: ( expression_statement -> ^( LEGEND_statement expression_statement ) | compound_statement -> ^( LEGEND_statement compound_statement ) | selection_statement -> ^( LEGEND_statement selection_statement ) | iteration_statement -> ^( LEGEND_statement iteration_statement ) | jump_statement -> ^( LEGEND_statement jump_statement ) )
			int alt17=5;
			switch ( input.LA(1) ) {
			case Dec:
			case Hex:
			case Nice_character_constant:
			case Nice_identifier:
			case Nice_string:
			case Oct:
			case 64:
			case 69:
			case 71:
			case 73:
			case 75:
			case 76:
			case 79:
			case 80:
			case 86:
			case 109:
			case 119:
				{
				alt17=1;
				}
				break;
			case 114:
				{
				alt17=2;
				}
				break;
			case 106:
				{
				alt17=3;
				}
				break;
			case 105:
			case 113:
				{
				alt17=4;
				}
				break;
			case 101:
			case 103:
			case 108:
				{
				alt17=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:116:12: expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement856);
					expression_statement57=expression_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression_statement.add(expression_statement57.getTree());
					// AST REWRITE
					// elements: expression_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 116:33: -> ^( LEGEND_statement expression_statement )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:116:36: ^( LEGEND_statement expression_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_statement, "LEGEND_statement"), root_1);
						adaptor.addChild(root_1, stream_expression_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:117:13: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement878);
					compound_statement58=compound_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement58.getTree());
					// AST REWRITE
					// elements: compound_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 117:32: -> ^( LEGEND_statement compound_statement )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:117:35: ^( LEGEND_statement compound_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_statement, "LEGEND_statement"), root_1);
						adaptor.addChild(root_1, stream_compound_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:118:13: selection_statement
					{
					pushFollow(FOLLOW_selection_statement_in_statement900);
					selection_statement59=selection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selection_statement.add(selection_statement59.getTree());
					// AST REWRITE
					// elements: selection_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 118:33: -> ^( LEGEND_statement selection_statement )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:118:36: ^( LEGEND_statement selection_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_statement, "LEGEND_statement"), root_1);
						adaptor.addChild(root_1, stream_selection_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\core\\first.g:119:13: iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement922);
					iteration_statement60=iteration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_iteration_statement.add(iteration_statement60.getTree());
					// AST REWRITE
					// elements: iteration_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 119:33: -> ^( LEGEND_statement iteration_statement )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:119:36: ^( LEGEND_statement iteration_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_statement, "LEGEND_statement"), root_1);
						adaptor.addChild(root_1, stream_iteration_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\core\\first.g:120:13: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement945);
					jump_statement61=jump_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_jump_statement.add(jump_statement61.getTree());
					// AST REWRITE
					// elements: jump_statement
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 120:28: -> ^( LEGEND_statement jump_statement )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:120:31: ^( LEGEND_statement jump_statement )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_statement, "LEGEND_statement"), root_1);
						adaptor.addChild(root_1, stream_jump_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class expression_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_statement"
	// D:\\JAVA\\first\\src\\core\\first.g:122:1: expression_statement : ( expression )? ';' -> ^( LEGEND_expression_statement ( expression )? ) ;
	public final firstParser.expression_statement_return expression_statement() throws RecognitionException {
		firstParser.expression_statement_return retval = new firstParser.expression_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal63=null;
		ParserRuleReturnScope expression62 =null;

		CommonTree char_literal63_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:122:21: ( ( expression )? ';' -> ^( LEGEND_expression_statement ( expression )? ) )
			// D:\\JAVA\\first\\src\\core\\first.g:122:23: ( expression )? ';'
			{
			// D:\\JAVA\\first\\src\\core\\first.g:122:23: ( expression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Dec||LA18_0==Hex||(LA18_0 >= Nice_character_constant && LA18_0 <= Oct)||LA18_0==64||LA18_0==69||LA18_0==71||LA18_0==73||(LA18_0 >= 75 && LA18_0 <= 76)||(LA18_0 >= 79 && LA18_0 <= 80)||LA18_0==109||LA18_0==119) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:122:23: expression
					{
					pushFollow(FOLLOW_expression_in_expression_statement965);
					expression62=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression62.getTree());
					}
					break;

			}

			char_literal63=(Token)match(input,86,FOLLOW_86_in_expression_statement968); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_86.add(char_literal63);

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 122:39: -> ^( LEGEND_expression_statement ( expression )? )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:122:42: ^( LEGEND_expression_statement ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expression_statement, "LEGEND_expression_statement"), root_1);
				// D:\\JAVA\\first\\src\\core\\first.g:122:72: ( expression )?
				if ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression_statement"


	public static class compound_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compound_statement"
	// D:\\JAVA\\first\\src\\core\\first.g:124:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( LEGEND_compound_statement ( declaration )* ( statement )* ) ;
	public final firstParser.compound_statement_return compound_statement() throws RecognitionException {
		firstParser.compound_statement_return retval = new firstParser.compound_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal64=null;
		Token char_literal67=null;
		ParserRuleReturnScope declaration65 =null;
		ParserRuleReturnScope statement66 =null;

		CommonTree char_literal64_tree=null;
		CommonTree char_literal67_tree=null;
		RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
		RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:124:19: ( '{' ( declaration )* ( statement )* '}' -> ^( LEGEND_compound_statement ( declaration )* ( statement )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:124:21: '{' ( declaration )* ( statement )* '}'
			{
			char_literal64=(Token)match(input,114,FOLLOW_114_in_compound_statement989); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_114.add(char_literal64);

			// D:\\JAVA\\first\\src\\core\\first.g:124:25: ( declaration )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==102||LA19_0==107||(LA19_0 >= 110 && LA19_0 <= 112)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:124:25: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement991);
					declaration65=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration65.getTree());
					}
					break;

				default :
					break loop19;
				}
			}

			// D:\\JAVA\\first\\src\\core\\first.g:124:38: ( statement )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Dec||LA20_0==Hex||(LA20_0 >= Nice_character_constant && LA20_0 <= Oct)||LA20_0==64||LA20_0==69||LA20_0==71||LA20_0==73||(LA20_0 >= 75 && LA20_0 <= 76)||(LA20_0 >= 79 && LA20_0 <= 80)||LA20_0==86||LA20_0==101||LA20_0==103||(LA20_0 >= 105 && LA20_0 <= 106)||(LA20_0 >= 108 && LA20_0 <= 109)||(LA20_0 >= 113 && LA20_0 <= 114)||LA20_0==119) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:124:38: statement
					{
					pushFollow(FOLLOW_statement_in_compound_statement994);
					statement66=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement66.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			char_literal67=(Token)match(input,118,FOLLOW_118_in_compound_statement997); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_118.add(char_literal67);

			// AST REWRITE
			// elements: declaration, statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 124:53: -> ^( LEGEND_compound_statement ( declaration )* ( statement )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:124:56: ^( LEGEND_compound_statement ( declaration )* ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_compound_statement, "LEGEND_compound_statement"), root_1);
				// D:\\JAVA\\first\\src\\core\\first.g:124:84: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				// D:\\JAVA\\first\\src\\core\\first.g:124:97: ( statement )*
				while ( stream_statement.hasNext() ) {
					adaptor.addChild(root_1, stream_statement.nextTree());
				}
				stream_statement.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_statement"


	public static class selection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selection_statement"
	// D:\\JAVA\\first\\src\\core\\first.g:126:1: selection_statement : 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )? -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? ) ;
	public final firstParser.selection_statement_return selection_statement() throws RecognitionException {
		firstParser.selection_statement_return retval = new firstParser.selection_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal68=null;
		Token char_literal69=null;
		Token char_literal70=null;
		Token string_literal71=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;

		CommonTree string_literal68_tree=null;
		CommonTree char_literal69_tree=null;
		CommonTree char_literal70_tree=null;
		CommonTree string_literal71_tree=null;
		RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:126:20: ( 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )? -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? ) )
			// D:\\JAVA\\first\\src\\core\\first.g:126:22: 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )?
			{
			string_literal68=(Token)match(input,106,FOLLOW_106_in_selection_statement1021); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_106.add(string_literal68);

			char_literal69=(Token)match(input,71,FOLLOW_71_in_selection_statement1023); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal69);

			pushFollow(FOLLOW_expression_in_selection_statement1027);
			e1=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
			char_literal70=(Token)match(input,72,FOLLOW_72_in_selection_statement1029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal70);

			pushFollow(FOLLOW_statement_in_selection_statement1033);
			e2=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(e2.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:126:62: ( 'else' e3= statement )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==104) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred29_first()) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:126:63: 'else' e3= statement
					{
					string_literal71=(Token)match(input,104,FOLLOW_104_in_selection_statement1036); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_104.add(string_literal71);

					pushFollow(FOLLOW_statement_in_selection_statement1040);
					e3=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(e3.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: e3, e2, 106, e1
			// token labels: 
			// rule labels: e3, retval, e1, e2
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 126:85: -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:126:88: ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_selection_statement, "LEGEND_selection_statement"), root_1);
				adaptor.addChild(root_1, stream_106.nextNode());
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1, stream_e2.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:126:132: ( $e3)?
				if ( stream_e3.hasNext() ) {
					adaptor.addChild(root_1, stream_e3.nextTree());
				}
				stream_e3.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "selection_statement"


	public static class iteration_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iteration_statement"
	// D:\\JAVA\\first\\src\\core\\first.g:128:1: iteration_statement : ( 'while' '(' e1= expression ')' e2= statement -> ^( LEGEND_iteration_statement 'while' $e1 $e2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4) );
	public final firstParser.iteration_statement_return iteration_statement() throws RecognitionException {
		firstParser.iteration_statement_return retval = new firstParser.iteration_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal72=null;
		Token char_literal73=null;
		Token char_literal74=null;
		Token string_literal75=null;
		Token char_literal76=null;
		Token char_literal77=null;
		Token char_literal78=null;
		Token char_literal79=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;
		ParserRuleReturnScope e4 =null;

		CommonTree string_literal72_tree=null;
		CommonTree char_literal73_tree=null;
		CommonTree char_literal74_tree=null;
		CommonTree string_literal75_tree=null;
		CommonTree char_literal76_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree char_literal78_tree=null;
		CommonTree char_literal79_tree=null;
		RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
		RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:128:20: ( 'while' '(' e1= expression ')' e2= statement -> ^( LEGEND_iteration_statement 'while' $e1 $e2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==113) ) {
				alt25=1;
			}
			else if ( (LA25_0==105) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:128:22: 'while' '(' e1= expression ')' e2= statement
					{
					string_literal72=(Token)match(input,113,FOLLOW_113_in_iteration_statement1073); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_113.add(string_literal72);

					char_literal73=(Token)match(input,71,FOLLOW_71_in_iteration_statement1075); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal73);

					pushFollow(FOLLOW_expression_in_iteration_statement1079);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
					char_literal74=(Token)match(input,72,FOLLOW_72_in_iteration_statement1081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal74);

					pushFollow(FOLLOW_statement_in_iteration_statement1085);
					e2=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(e2.getTree());
					// AST REWRITE
					// elements: e1, e2, 113
					// token labels: 
					// rule labels: retval, e1, e2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 128:65: -> ^( LEGEND_iteration_statement 'while' $e1 $e2)
					{
						// D:\\JAVA\\first\\src\\core\\first.g:128:68: ^( LEGEND_iteration_statement 'while' $e1 $e2)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_iteration_statement, "LEGEND_iteration_statement"), root_1);
						adaptor.addChild(root_1, stream_113.nextNode());
						adaptor.addChild(root_1, stream_e1.nextTree());
						adaptor.addChild(root_1, stream_e2.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:129:23: 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement
					{
					string_literal75=(Token)match(input,105,FOLLOW_105_in_iteration_statement1123); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal75);

					char_literal76=(Token)match(input,71,FOLLOW_71_in_iteration_statement1125); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal76);

					// D:\\JAVA\\first\\src\\core\\first.g:129:35: (e1= expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Dec||LA22_0==Hex||(LA22_0 >= Nice_character_constant && LA22_0 <= Oct)||LA22_0==64||LA22_0==69||LA22_0==71||LA22_0==73||(LA22_0 >= 75 && LA22_0 <= 76)||(LA22_0 >= 79 && LA22_0 <= 80)||LA22_0==109||LA22_0==119) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:129:35: e1= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1129);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
							}
							break;

					}

					char_literal77=(Token)match(input,86,FOLLOW_86_in_iteration_statement1132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal77);

					// D:\\JAVA\\first\\src\\core\\first.g:129:54: (e2= expression )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Dec||LA23_0==Hex||(LA23_0 >= Nice_character_constant && LA23_0 <= Oct)||LA23_0==64||LA23_0==69||LA23_0==71||LA23_0==73||(LA23_0 >= 75 && LA23_0 <= 76)||(LA23_0 >= 79 && LA23_0 <= 80)||LA23_0==109||LA23_0==119) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:129:54: e2= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1136);
							e2=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e2.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,86,FOLLOW_86_in_iteration_statement1139); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal78);

					// D:\\JAVA\\first\\src\\core\\first.g:129:73: (e3= expression )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Dec||LA24_0==Hex||(LA24_0 >= Nice_character_constant && LA24_0 <= Oct)||LA24_0==64||LA24_0==69||LA24_0==71||LA24_0==73||(LA24_0 >= 75 && LA24_0 <= 76)||(LA24_0 >= 79 && LA24_0 <= 80)||LA24_0==109||LA24_0==119) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:129:73: e3= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1143);
							e3=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e3.getTree());
							}
							break;

					}

					char_literal79=(Token)match(input,72,FOLLOW_72_in_iteration_statement1146); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal79);

					pushFollow(FOLLOW_statement_in_iteration_statement1150);
					e4=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(e4.getTree());
					// AST REWRITE
					// elements: e4, e1, e3, 105, e2
					// token labels: 
					// rule labels: e3, e4, retval, e1, e2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
					RewriteRuleSubtreeStream stream_e4=new RewriteRuleSubtreeStream(adaptor,"rule e4",e4!=null?e4.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 129:103: -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4)
					{
						// D:\\JAVA\\first\\src\\core\\first.g:129:106: ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_iteration_statement, "LEGEND_iteration_statement"), root_1);
						adaptor.addChild(root_1, stream_105.nextNode());
						// D:\\JAVA\\first\\src\\core\\first.g:129:141: ^( LEGEND_expr1 ( $e1)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr1, "LEGEND_expr1"), root_2);
						// D:\\JAVA\\first\\src\\core\\first.g:129:157: ( $e1)?
						if ( stream_e1.hasNext() ) {
							adaptor.addChild(root_2, stream_e1.nextTree());
						}
						stream_e1.reset();

						adaptor.addChild(root_1, root_2);
						}

						// D:\\JAVA\\first\\src\\core\\first.g:129:162: ^( LEGEND_expr2 ( $e2)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr2, "LEGEND_expr2"), root_2);
						// D:\\JAVA\\first\\src\\core\\first.g:129:178: ( $e2)?
						if ( stream_e2.hasNext() ) {
							adaptor.addChild(root_2, stream_e2.nextTree());
						}
						stream_e2.reset();

						adaptor.addChild(root_1, root_2);
						}

						// D:\\JAVA\\first\\src\\core\\first.g:129:183: ^( LEGEND_expr3 ( $e3)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr3, "LEGEND_expr3"), root_2);
						// D:\\JAVA\\first\\src\\core\\first.g:129:199: ( $e3)?
						if ( stream_e3.hasNext() ) {
							adaptor.addChild(root_2, stream_e3.nextTree());
						}
						stream_e3.reset();

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_e4.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iteration_statement"


	public static class jump_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "jump_statement"
	// D:\\JAVA\\first\\src\\core\\first.g:131:1: jump_statement : ( 'continue' ';' -> ^( LEGEND_jump_statement 'continue' ) | 'break' ';' -> ^( LEGEND_jump_statement 'break' ) | 'return' ( expression )? ';' -> ^( LEGEND_jump_statement 'return' ( expression )? ) );
	public final firstParser.jump_statement_return jump_statement() throws RecognitionException {
		firstParser.jump_statement_return retval = new firstParser.jump_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal80=null;
		Token char_literal81=null;
		Token string_literal82=null;
		Token char_literal83=null;
		Token string_literal84=null;
		Token char_literal86=null;
		ParserRuleReturnScope expression85 =null;

		CommonTree string_literal80_tree=null;
		CommonTree char_literal81_tree=null;
		CommonTree string_literal82_tree=null;
		CommonTree char_literal83_tree=null;
		CommonTree string_literal84_tree=null;
		CommonTree char_literal86_tree=null;
		RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
		RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:131:15: ( 'continue' ';' -> ^( LEGEND_jump_statement 'continue' ) | 'break' ';' -> ^( LEGEND_jump_statement 'break' ) | 'return' ( expression )? ';' -> ^( LEGEND_jump_statement 'return' ( expression )? ) )
			int alt27=3;
			switch ( input.LA(1) ) {
			case 103:
				{
				alt27=1;
				}
				break;
			case 101:
				{
				alt27=2;
				}
				break;
			case 108:
				{
				alt27=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:131:17: 'continue' ';'
					{
					string_literal80=(Token)match(input,103,FOLLOW_103_in_jump_statement1197); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_103.add(string_literal80);

					char_literal81=(Token)match(input,86,FOLLOW_86_in_jump_statement1199); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal81);

					// AST REWRITE
					// elements: 103
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 131:32: -> ^( LEGEND_jump_statement 'continue' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:131:35: ^( LEGEND_jump_statement 'continue' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_jump_statement, "LEGEND_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_103.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:132:18: 'break' ';'
					{
					string_literal82=(Token)match(input,101,FOLLOW_101_in_jump_statement1226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(string_literal82);

					char_literal83=(Token)match(input,86,FOLLOW_86_in_jump_statement1228); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal83);

					// AST REWRITE
					// elements: 101
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 132:30: -> ^( LEGEND_jump_statement 'break' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:132:33: ^( LEGEND_jump_statement 'break' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_jump_statement, "LEGEND_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_101.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:133:18: 'return' ( expression )? ';'
					{
					string_literal84=(Token)match(input,108,FOLLOW_108_in_jump_statement1255); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal84);

					// D:\\JAVA\\first\\src\\core\\first.g:133:27: ( expression )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Dec||LA26_0==Hex||(LA26_0 >= Nice_character_constant && LA26_0 <= Oct)||LA26_0==64||LA26_0==69||LA26_0==71||LA26_0==73||(LA26_0 >= 75 && LA26_0 <= 76)||(LA26_0 >= 79 && LA26_0 <= 80)||LA26_0==109||LA26_0==119) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:133:27: expression
							{
							pushFollow(FOLLOW_expression_in_jump_statement1257);
							expression85=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
							}
							break;

					}

					char_literal86=(Token)match(input,86,FOLLOW_86_in_jump_statement1260); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal86);

					// AST REWRITE
					// elements: expression, 108
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 133:43: -> ^( LEGEND_jump_statement 'return' ( expression )? )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:133:46: ^( LEGEND_jump_statement 'return' ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_jump_statement, "LEGEND_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_108.nextNode());
						// D:\\JAVA\\first\\src\\core\\first.g:133:79: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "jump_statement"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\JAVA\\first\\src\\core\\first.g:135:1: expression : assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_expression assignment_expression ( assignment_expression )* ) ;
	public final firstParser.expression_return expression() throws RecognitionException {
		firstParser.expression_return retval = new firstParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal88=null;
		ParserRuleReturnScope assignment_expression87 =null;
		ParserRuleReturnScope assignment_expression89 =null;

		CommonTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:135:11: ( assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_expression assignment_expression ( assignment_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:135:13: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression1282);
			assignment_expression87=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression87.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:135:35: ( ',' assignment_expression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==78) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:135:36: ',' assignment_expression
					{
					char_literal88=(Token)match(input,78,FOLLOW_78_in_expression1285); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal88);

					pushFollow(FOLLOW_assignment_expression_in_expression1287);
					assignment_expression89=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression89.getTree());
					}
					break;

				default :
					break loop28;
				}
			}

			// AST REWRITE
			// elements: assignment_expression, assignment_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 135:64: -> ^( LEGEND_expression assignment_expression ( assignment_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:135:67: ^( LEGEND_expression assignment_expression ( assignment_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expression, "LEGEND_expression"), root_1);
				adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:135:109: ( assignment_expression )*
				while ( stream_assignment_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				}
				stream_assignment_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class assignment_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:137:1: assignment_expression : ( unary_expression assignment_operator assignment_expression -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression ) | logical_or_expression -> ^( LEGEND_assignment_expression logical_or_expression ) );
	public final firstParser.assignment_expression_return assignment_expression() throws RecognitionException {
		firstParser.assignment_expression_return retval = new firstParser.assignment_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope unary_expression90 =null;
		ParserRuleReturnScope assignment_operator91 =null;
		ParserRuleReturnScope assignment_expression92 =null;
		ParserRuleReturnScope logical_or_expression93 =null;

		RewriteRuleSubtreeStream stream_assignment_operator=new RewriteRuleSubtreeStream(adaptor,"rule assignment_operator");
		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:137:22: ( unary_expression assignment_operator assignment_expression -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression ) | logical_or_expression -> ^( LEGEND_assignment_expression logical_or_expression ) )
			int alt29=2;
			switch ( input.LA(1) ) {
			case Nice_identifier:
				{
				int LA29_1 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Dec:
				{
				int LA29_2 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Oct:
				{
				int LA29_3 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Hex:
				{
				int LA29_4 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Nice_character_constant:
				{
				int LA29_5 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case Nice_string:
				{
				int LA29_6 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 71:
				{
				int LA29_7 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 76:
				{
				int LA29_8 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 80:
				{
				int LA29_9 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 64:
			case 69:
			case 73:
			case 75:
			case 79:
			case 119:
				{
				int LA29_10 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			case 109:
				{
				int LA29_11 = input.LA(2);
				if ( (synpred38_first()) ) {
					alt29=1;
				}
				else if ( (true) ) {
					alt29=2;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:138:23: unary_expression assignment_operator assignment_expression
					{
					pushFollow(FOLLOW_unary_expression_in_assignment_expression1338);
					unary_expression90=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression90.getTree());
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1340);
					assignment_operator91=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator91.getTree());
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1342);
					assignment_expression92=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression92.getTree());
					// AST REWRITE
					// elements: assignment_expression, assignment_operator, unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 138:82: -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:138:85: ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_assignment_expression, "LEGEND_assignment_expression"), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_1, stream_assignment_operator.nextTree());
						adaptor.addChild(root_1, stream_assignment_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:139:25: logical_or_expression
					{
					pushFollow(FOLLOW_logical_or_expression_in_assignment_expression1380);
					logical_or_expression93=logical_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_or_expression.add(logical_or_expression93.getTree());
					// AST REWRITE
					// elements: logical_or_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 139:47: -> ^( LEGEND_assignment_expression logical_or_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:139:50: ^( LEGEND_assignment_expression logical_or_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_assignment_expression, "LEGEND_assignment_expression"), root_1);
						adaptor.addChild(root_1, stream_logical_or_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expression"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:142:2: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final firstParser.assignment_operator_return assignment_operator() throws RecognitionException {
		firstParser.assignment_operator_return retval = new firstParser.assignment_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set94=null;

		CommonTree set94_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:142:21: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set94=input.LT(1);
			if ( input.LA(1)==67||input.LA(1)==70||input.LA(1)==74||input.LA(1)==77||input.LA(1)==81||input.LA(1)==85||input.LA(1)==89||input.LA(1)==91||input.LA(1)==96||input.LA(1)==100||input.LA(1)==116 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set94));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_operator"


	public static class constant_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:144:2: constant_expression : a1= logical_or_expression -> ^( LEGEND_constant_expression $a1) ;
	public final firstParser.constant_expression_return constant_expression() throws RecognitionException {
		firstParser.constant_expression_return retval = new firstParser.constant_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:144:22: (a1= logical_or_expression -> ^( LEGEND_constant_expression $a1) )
			// D:\\JAVA\\first\\src\\core\\first.g:145:2: a1= logical_or_expression
			{
			pushFollow(FOLLOW_logical_or_expression_in_constant_expression1477);
			a1=logical_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_or_expression.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: retval, a1
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 145:28: -> ^( LEGEND_constant_expression $a1)
			{
				// D:\\JAVA\\first\\src\\core\\first.g:145:32: ^( LEGEND_constant_expression $a1)
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_constant_expression, "LEGEND_constant_expression"), root_1);
				adaptor.addChild(root_1, stream_a1.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant_expression"


	public static class logical_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:147:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* -> ^( LEGEND_logical_or_expression ( logical_and_expression )+ ) ;
	public final firstParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		firstParser.logical_or_expression_return retval = new firstParser.logical_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal96=null;
		ParserRuleReturnScope logical_and_expression95 =null;
		ParserRuleReturnScope logical_and_expression97 =null;

		CommonTree string_literal96_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:147:23: ( logical_and_expression ( '||' logical_and_expression )* -> ^( LEGEND_logical_or_expression ( logical_and_expression )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:148:2: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1500);
			logical_and_expression95=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression95.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:148:25: ( '||' logical_and_expression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==117) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:148:26: '||' logical_and_expression
					{
					string_literal96=(Token)match(input,117,FOLLOW_117_in_logical_or_expression1503); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal96);

					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1505);
					logical_and_expression97=logical_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression97.getTree());
					}
					break;

				default :
					break loop30;
				}
			}

			// AST REWRITE
			// elements: logical_and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 148:57: -> ^( LEGEND_logical_or_expression ( logical_and_expression )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:148:61: ^( LEGEND_logical_or_expression ( logical_and_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_logical_or_expression, "LEGEND_logical_or_expression"), root_1);
				if ( !(stream_logical_and_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_logical_and_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_logical_and_expression.nextTree());
				}
				stream_logical_and_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expression"


	public static class logical_and_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:150:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( LEGEND_logical_and_expression ( inclusive_or_expression )+ ) ;
	public final firstParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		firstParser.logical_and_expression_return retval = new firstParser.logical_and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal99=null;
		ParserRuleReturnScope inclusive_or_expression98 =null;
		ParserRuleReturnScope inclusive_or_expression100 =null;

		CommonTree string_literal99_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:150:24: ( inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( LEGEND_logical_and_expression ( inclusive_or_expression )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:151:2: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1528);
			inclusive_or_expression98=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression98.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:151:26: ( '&&' inclusive_or_expression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==68) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:151:27: '&&' inclusive_or_expression
					{
					string_literal99=(Token)match(input,68,FOLLOW_68_in_logical_and_expression1531); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(string_literal99);

					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1533);
					inclusive_or_expression100=inclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression100.getTree());
					}
					break;

				default :
					break loop31;
				}
			}

			// AST REWRITE
			// elements: inclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 151:59: -> ^( LEGEND_logical_and_expression ( inclusive_or_expression )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:151:63: ^( LEGEND_logical_and_expression ( inclusive_or_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_logical_and_expression, "LEGEND_logical_and_expression"), root_1);
				if ( !(stream_inclusive_or_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_inclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_inclusive_or_expression.nextTree());
				}
				stream_inclusive_or_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expression"


	public static class inclusive_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "inclusive_or_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:153:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( LEGEND_inclusive_or_expression ( exclusive_or_expression )+ ) ;
	public final firstParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		firstParser.inclusive_or_expression_return retval = new firstParser.inclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal102=null;
		ParserRuleReturnScope exclusive_or_expression101 =null;
		ParserRuleReturnScope exclusive_or_expression103 =null;

		CommonTree char_literal102_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:153:25: ( exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( LEGEND_inclusive_or_expression ( exclusive_or_expression )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:154:2: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1558);
			exclusive_or_expression101=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression101.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:154:26: ( '|' exclusive_or_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==115) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:154:27: '|' exclusive_or_expression
					{
					char_literal102=(Token)match(input,115,FOLLOW_115_in_inclusive_or_expression1561); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(char_literal102);

					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1563);
					exclusive_or_expression103=exclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression103.getTree());
					}
					break;

				default :
					break loop32;
				}
			}

			// AST REWRITE
			// elements: exclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 154:58: -> ^( LEGEND_inclusive_or_expression ( exclusive_or_expression )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:154:62: ^( LEGEND_inclusive_or_expression ( exclusive_or_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_inclusive_or_expression, "LEGEND_inclusive_or_expression"), root_1);
				if ( !(stream_exclusive_or_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_exclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_exclusive_or_expression.nextTree());
				}
				stream_exclusive_or_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inclusive_or_expression"


	public static class exclusive_or_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "exclusive_or_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:156:1: exclusive_or_expression : and_expression ( '^' and_expression )* -> ^( LEGEND_exclusive_or_expression ( and_expression )+ ) ;
	public final firstParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		firstParser.exclusive_or_expression_return retval = new firstParser.exclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal105=null;
		ParserRuleReturnScope and_expression104 =null;
		ParserRuleReturnScope and_expression106 =null;

		CommonTree char_literal105_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:156:25: ( and_expression ( '^' and_expression )* -> ^( LEGEND_exclusive_or_expression ( and_expression )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:157:2: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1588);
			and_expression104=and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_and_expression.add(and_expression104.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:157:17: ( '^' and_expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==99) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:157:18: '^' and_expression
					{
					char_literal105=(Token)match(input,99,FOLLOW_99_in_exclusive_or_expression1591); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_99.add(char_literal105);

					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1593);
					and_expression106=and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_and_expression.add(and_expression106.getTree());
					}
					break;

				default :
					break loop33;
				}
			}

			// AST REWRITE
			// elements: and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 157:40: -> ^( LEGEND_exclusive_or_expression ( and_expression )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:157:44: ^( LEGEND_exclusive_or_expression ( and_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_exclusive_or_expression, "LEGEND_exclusive_or_expression"), root_1);
				if ( !(stream_and_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_and_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_and_expression.nextTree());
				}
				stream_and_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exclusive_or_expression"


	public static class and_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "and_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:159:1: and_expression : equality_expression ( '&' equality_expression )* -> ^( LEGEND_and_expression ( equality_expression )+ ) ;
	public final firstParser.and_expression_return and_expression() throws RecognitionException {
		firstParser.and_expression_return retval = new firstParser.and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal108=null;
		ParserRuleReturnScope equality_expression107 =null;
		ParserRuleReturnScope equality_expression109 =null;

		CommonTree char_literal108_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:159:16: ( equality_expression ( '&' equality_expression )* -> ^( LEGEND_and_expression ( equality_expression )+ ) )
			// D:\\JAVA\\first\\src\\core\\first.g:160:2: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression1618);
			equality_expression107=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression107.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:160:22: ( '&' equality_expression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==69) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:160:23: '&' equality_expression
					{
					char_literal108=(Token)match(input,69,FOLLOW_69_in_and_expression1621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal108);

					pushFollow(FOLLOW_equality_expression_in_and_expression1623);
					equality_expression109=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression109.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// AST REWRITE
			// elements: equality_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 160:50: -> ^( LEGEND_and_expression ( equality_expression )+ )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:160:54: ^( LEGEND_and_expression ( equality_expression )+ )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_and_expression, "LEGEND_and_expression"), root_1);
				if ( !(stream_equality_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_equality_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_equality_expression.nextTree());
				}
				stream_equality_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "and_expression"


	public static class equality_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:162:1: equality_expression : relational_expression ( equality_operator relational_expression )* -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* ) ;
	public final firstParser.equality_expression_return equality_expression() throws RecognitionException {
		firstParser.equality_expression_return retval = new firstParser.equality_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope relational_expression110 =null;
		ParserRuleReturnScope equality_operator111 =null;
		ParserRuleReturnScope relational_expression112 =null;

		RewriteRuleSubtreeStream stream_equality_operator=new RewriteRuleSubtreeStream(adaptor,"rule equality_operator");
		RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:162:21: ( relational_expression ( equality_operator relational_expression )* -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:163:2: relational_expression ( equality_operator relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression1648);
			relational_expression110=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression110.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:163:24: ( equality_operator relational_expression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==65||LA35_0==92) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:163:25: equality_operator relational_expression
					{
					pushFollow(FOLLOW_equality_operator_in_equality_expression1651);
					equality_operator111=equality_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_operator.add(equality_operator111.getTree());
					pushFollow(FOLLOW_relational_expression_in_equality_expression1653);
					relational_expression112=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression112.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// AST REWRITE
			// elements: relational_expression, relational_expression, equality_operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 163:68: -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:163:72: ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_equality_expression, "LEGEND_equality_expression"), root_1);
				adaptor.addChild(root_1, stream_relational_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:163:123: ( equality_operator relational_expression )*
				while ( stream_relational_expression.hasNext()||stream_equality_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_equality_operator.nextTree());
					adaptor.addChild(root_1, stream_relational_expression.nextTree());
				}
				stream_relational_expression.reset();
				stream_equality_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_expression"


	public static class equality_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "equality_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:165:1: equality_operator : ( '==' | '!=' );
	public final firstParser.equality_operator_return equality_operator() throws RecognitionException {
		firstParser.equality_operator_return retval = new firstParser.equality_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set113=null;

		CommonTree set113_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:165:19: ( '==' | '!=' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set113=input.LT(1);
			if ( input.LA(1)==65||input.LA(1)==92 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set113));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_operator"


	public static class relational_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:169:1: relational_expression : shift_expression ( relational_operator shift_expression )* -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* ) ;
	public final firstParser.relational_expression_return relational_expression() throws RecognitionException {
		firstParser.relational_expression_return retval = new firstParser.relational_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope shift_expression114 =null;
		ParserRuleReturnScope relational_operator115 =null;
		ParserRuleReturnScope shift_expression116 =null;

		RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");
		RewriteRuleSubtreeStream stream_relational_operator=new RewriteRuleSubtreeStream(adaptor,"rule relational_operator");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:169:23: ( shift_expression ( relational_operator shift_expression )* -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:170:2: shift_expression ( relational_operator shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression1699);
			shift_expression114=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression114.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:170:19: ( relational_operator shift_expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==87||LA36_0==90||(LA36_0 >= 93 && LA36_0 <= 94)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:170:20: relational_operator shift_expression
					{
					pushFollow(FOLLOW_relational_operator_in_relational_expression1702);
					relational_operator115=relational_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_operator.add(relational_operator115.getTree());
					pushFollow(FOLLOW_shift_expression_in_relational_expression1704);
					shift_expression116=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression116.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			// AST REWRITE
			// elements: shift_expression, shift_expression, relational_operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 170:60: -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:170:64: ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_relational_expression, "LEGEND_relational_expression"), root_1);
				adaptor.addChild(root_1, stream_shift_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:170:112: ( relational_operator shift_expression )*
				while ( stream_shift_expression.hasNext()||stream_relational_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_relational_operator.nextTree());
					adaptor.addChild(root_1, stream_shift_expression.nextTree());
				}
				stream_shift_expression.reset();
				stream_relational_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_expression"


	public static class relational_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relational_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:172:1: relational_operator : ( '<' | '>' | '<=' | '>=' );
	public final firstParser.relational_operator_return relational_operator() throws RecognitionException {
		firstParser.relational_operator_return retval = new firstParser.relational_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set117=null;

		CommonTree set117_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:172:21: ( '<' | '>' | '<=' | '>=' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set117=input.LT(1);
			if ( input.LA(1)==87||input.LA(1)==90||(input.LA(1) >= 93 && input.LA(1) <= 94) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set117));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_operator"


	public static class shift_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "shift_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:178:1: shift_expression : additive_expression ( shift_operator additive_expression )* -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* ) ;
	public final firstParser.shift_expression_return shift_expression() throws RecognitionException {
		firstParser.shift_expression_return retval = new firstParser.shift_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope additive_expression118 =null;
		ParserRuleReturnScope shift_operator119 =null;
		ParserRuleReturnScope additive_expression120 =null;

		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
		RewriteRuleSubtreeStream stream_shift_operator=new RewriteRuleSubtreeStream(adaptor,"rule shift_operator");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:178:18: ( additive_expression ( shift_operator additive_expression )* -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:179:2: additive_expression ( shift_operator additive_expression )*
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression1761);
			additive_expression118=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression118.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:179:22: ( shift_operator additive_expression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==88||LA37_0==95) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:179:23: shift_operator additive_expression
					{
					pushFollow(FOLLOW_shift_operator_in_shift_expression1764);
					shift_operator119=shift_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_operator.add(shift_operator119.getTree());
					pushFollow(FOLLOW_additive_expression_in_shift_expression1766);
					additive_expression120=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression120.getTree());
					}
					break;

				default :
					break loop37;
				}
			}

			// AST REWRITE
			// elements: additive_expression, shift_operator, additive_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 179:61: -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:179:65: ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_shift_expression, "LEGEND_shift_expression"), root_1);
				adaptor.addChild(root_1, stream_additive_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:179:111: ( shift_operator additive_expression )*
				while ( stream_additive_expression.hasNext()||stream_shift_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_shift_operator.nextTree());
					adaptor.addChild(root_1, stream_additive_expression.nextTree());
				}
				stream_additive_expression.reset();
				stream_shift_operator.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_expression"


	public static class shift_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "shift_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:181:1: shift_operator : ( '<<' | '>>' );
	public final firstParser.shift_operator_return shift_operator() throws RecognitionException {
		firstParser.shift_operator_return retval = new firstParser.shift_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set121=null;

		CommonTree set121_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:181:16: ( '<<' | '>>' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set121=input.LT(1);
			if ( input.LA(1)==88||input.LA(1)==95 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set121));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_operator"


	public static class additive_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:185:1: additive_expression : multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) ;
	public final firstParser.additive_expression_return additive_expression() throws RecognitionException {
		firstParser.additive_expression_return retval = new firstParser.additive_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope multiplicative_expression122 =null;
		ParserRuleReturnScope additive_operator123 =null;
		ParserRuleReturnScope multiplicative_expression124 =null;

		RewriteRuleSubtreeStream stream_additive_operator=new RewriteRuleSubtreeStream(adaptor,"rule additive_operator");
		RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:185:21: ( multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:186:2: multiplicative_expression ( additive_operator multiplicative_expression )*
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1813);
			multiplicative_expression122=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression122.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:186:28: ( additive_operator multiplicative_expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==75||LA38_0==79) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:186:29: additive_operator multiplicative_expression
					{
					pushFollow(FOLLOW_additive_operator_in_additive_expression1816);
					additive_operator123=additive_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_operator.add(additive_operator123.getTree());
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1818);
					multiplicative_expression124=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression124.getTree());
					}
					break;

				default :
					break loop38;
				}
			}

			// AST REWRITE
			// elements: multiplicative_expression, additive_operator, multiplicative_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 186:76: -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:186:80: ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_additive_expression, "LEGEND_additive_expression"), root_1);
				adaptor.addChild(root_1, stream_multiplicative_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:186:135: ( additive_operator multiplicative_expression )*
				while ( stream_additive_operator.hasNext()||stream_multiplicative_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_additive_operator.nextTree());
					adaptor.addChild(root_1, stream_multiplicative_expression.nextTree());
				}
				stream_additive_operator.reset();
				stream_multiplicative_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expression"


	public static class additive_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "additive_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:188:1: additive_operator : ( '+' | '-' );
	public final firstParser.additive_operator_return additive_operator() throws RecognitionException {
		firstParser.additive_operator_return retval = new firstParser.additive_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set125=null;

		CommonTree set125_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:188:19: ( '+' | '-' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set125=input.LT(1);
			if ( input.LA(1)==75||input.LA(1)==79 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set125));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_operator"


	public static class multiplicative_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:192:1: multiplicative_expression : cast_expression ( multiplicative_operator cast_expression )* -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) ;
	public final firstParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		firstParser.multiplicative_expression_return retval = new firstParser.multiplicative_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope cast_expression126 =null;
		ParserRuleReturnScope multiplicative_operator127 =null;
		ParserRuleReturnScope cast_expression128 =null;

		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_multiplicative_operator=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_operator");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:192:27: ( cast_expression ( multiplicative_operator cast_expression )* -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:193:2: cast_expression ( multiplicative_operator cast_expression )*
			{
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1866);
			cast_expression126=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression126.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:193:18: ( multiplicative_operator cast_expression )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==66||LA39_0==73||LA39_0==84) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:193:19: multiplicative_operator cast_expression
					{
					pushFollow(FOLLOW_multiplicative_operator_in_multiplicative_expression1869);
					multiplicative_operator127=multiplicative_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_operator.add(multiplicative_operator127.getTree());
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1871);
					cast_expression128=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression128.getTree());
					}
					break;

				default :
					break loop39;
				}
			}

			// AST REWRITE
			// elements: multiplicative_operator, cast_expression, cast_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 193:62: -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:193:66: ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_multiplicative_expression, "LEGEND_multiplicative_expression"), root_1);
				adaptor.addChild(root_1, stream_cast_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:193:117: ( multiplicative_operator cast_expression )*
				while ( stream_multiplicative_operator.hasNext()||stream_cast_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_multiplicative_operator.nextTree());
					adaptor.addChild(root_1, stream_cast_expression.nextTree());
				}
				stream_multiplicative_operator.reset();
				stream_cast_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expression"


	public static class multiplicative_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:195:1: multiplicative_operator : ( '*' | '/' | '%' );
	public final firstParser.multiplicative_operator_return multiplicative_operator() throws RecognitionException {
		firstParser.multiplicative_operator_return retval = new firstParser.multiplicative_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set129=null;

		CommonTree set129_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:195:25: ( '*' | '/' | '%' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set129=input.LT(1);
			if ( input.LA(1)==66||input.LA(1)==73||input.LA(1)==84 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set129));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_operator"


	public static class cast_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "cast_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:200:1: cast_expression : ( unary_expression -> ^( LEGEND_cast_expression unary_expression ) | '(' type_name ')' cast_expression -> ^( LEGEND_cast_expression type_name cast_expression ) );
	public final firstParser.cast_expression_return cast_expression() throws RecognitionException {
		firstParser.cast_expression_return retval = new firstParser.cast_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal131=null;
		Token char_literal133=null;
		ParserRuleReturnScope unary_expression130 =null;
		ParserRuleReturnScope type_name132 =null;
		ParserRuleReturnScope cast_expression134 =null;

		CommonTree char_literal131_tree=null;
		CommonTree char_literal133_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
		RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:200:16: ( unary_expression -> ^( LEGEND_cast_expression unary_expression ) | '(' type_name ')' cast_expression -> ^( LEGEND_cast_expression type_name cast_expression ) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Dec||LA40_0==Hex||(LA40_0 >= Nice_character_constant && LA40_0 <= Oct)||LA40_0==64||LA40_0==69||LA40_0==73||(LA40_0 >= 75 && LA40_0 <= 76)||(LA40_0 >= 79 && LA40_0 <= 80)||LA40_0==109||LA40_0==119) ) {
				alt40=1;
			}
			else if ( (LA40_0==71) ) {
				int LA40_2 = input.LA(2);
				if ( (LA40_2==Dec||LA40_2==Hex||(LA40_2 >= Nice_character_constant && LA40_2 <= Oct)||LA40_2==64||LA40_2==69||LA40_2==71||LA40_2==73||(LA40_2 >= 75 && LA40_2 <= 76)||(LA40_2 >= 79 && LA40_2 <= 80)||LA40_2==109||LA40_2==119) ) {
					alt40=1;
				}
				else if ( (LA40_2==102||LA40_2==107||(LA40_2 >= 110 && LA40_2 <= 112)) ) {
					alt40=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:200:18: unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_cast_expression1922);
					unary_expression130=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression130.getTree());
					// AST REWRITE
					// elements: unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 200:35: -> ^( LEGEND_cast_expression unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:200:38: ^( LEGEND_cast_expression unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_cast_expression, "LEGEND_cast_expression"), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:201:19: '(' type_name ')' cast_expression
					{
					char_literal131=(Token)match(input,71,FOLLOW_71_in_cast_expression1950); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal131);

					pushFollow(FOLLOW_type_name_in_cast_expression1952);
					type_name132=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name132.getTree());
					char_literal133=(Token)match(input,72,FOLLOW_72_in_cast_expression1954); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal133);

					pushFollow(FOLLOW_cast_expression_in_cast_expression1956);
					cast_expression134=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression134.getTree());
					// AST REWRITE
					// elements: cast_expression, type_name
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 201:53: -> ^( LEGEND_cast_expression type_name cast_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:201:56: ^( LEGEND_cast_expression type_name cast_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_cast_expression, "LEGEND_cast_expression"), root_1);
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_1, stream_cast_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_expression"


	public static class type_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_name"
	// D:\\JAVA\\first\\src\\core\\first.g:203:1: type_name : type_specifier ( '*' )* -> ^( LEGEND_type_name type_specifier ( '*' )* ) ;
	public final firstParser.type_name_return type_name() throws RecognitionException {
		firstParser.type_name_return retval = new firstParser.type_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal136=null;
		ParserRuleReturnScope type_specifier135 =null;

		CommonTree char_literal136_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:203:10: ( type_specifier ( '*' )* -> ^( LEGEND_type_name type_specifier ( '*' )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:203:12: type_specifier ( '*' )*
			{
			pushFollow(FOLLOW_type_specifier_in_type_name1978);
			type_specifier135=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier135.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:203:27: ( '*' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==73) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:203:27: '*'
					{
					char_literal136=(Token)match(input,73,FOLLOW_73_in_type_name1980); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal136);

					}
					break;

				default :
					break loop41;
				}
			}

			// AST REWRITE
			// elements: 73, type_specifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 203:32: -> ^( LEGEND_type_name type_specifier ( '*' )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:203:35: ^( LEGEND_type_name type_specifier ( '*' )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_name, "LEGEND_type_name"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:203:69: ( '*' )*
				while ( stream_73.hasNext() ) {
					adaptor.addChild(root_1, stream_73.nextNode());
				}
				stream_73.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type_name"


	public static class unary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:205:1: unary_expression : ( postfix_expression -> ^( LEGEND_unary_expression postfix_expression ) | '++' unary_expression -> ^( LEGEND_unary_expression '++' unary_expression ) | '--' unary_expression -> ^( LEGEND_unary_expression '--' unary_expression ) | unary_operator cast_expression -> ^( LEGEND_unary_expression unary_operator cast_expression ) | 'sizeof' unary_expression -> ^( LEGEND_unary_expression 'sizeof' unary_expression ) | 'sizeof' '(' type_name ')' -> ^( LEGEND_unary_expression 'sizeof' type_name ) );
	public final firstParser.unary_expression_return unary_expression() throws RecognitionException {
		firstParser.unary_expression_return retval = new firstParser.unary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal138=null;
		Token string_literal140=null;
		Token string_literal144=null;
		Token string_literal146=null;
		Token char_literal147=null;
		Token char_literal149=null;
		ParserRuleReturnScope postfix_expression137 =null;
		ParserRuleReturnScope unary_expression139 =null;
		ParserRuleReturnScope unary_expression141 =null;
		ParserRuleReturnScope unary_operator142 =null;
		ParserRuleReturnScope cast_expression143 =null;
		ParserRuleReturnScope unary_expression145 =null;
		ParserRuleReturnScope type_name148 =null;

		CommonTree string_literal138_tree=null;
		CommonTree string_literal140_tree=null;
		CommonTree string_literal144_tree=null;
		CommonTree string_literal146_tree=null;
		CommonTree char_literal147_tree=null;
		CommonTree char_literal149_tree=null;
		RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");
		RewriteRuleSubtreeStream stream_unary_operator=new RewriteRuleSubtreeStream(adaptor,"rule unary_operator");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");
		RewriteRuleSubtreeStream stream_type_name=new RewriteRuleSubtreeStream(adaptor,"rule type_name");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:205:17: ( postfix_expression -> ^( LEGEND_unary_expression postfix_expression ) | '++' unary_expression -> ^( LEGEND_unary_expression '++' unary_expression ) | '--' unary_expression -> ^( LEGEND_unary_expression '--' unary_expression ) | unary_operator cast_expression -> ^( LEGEND_unary_expression unary_operator cast_expression ) | 'sizeof' unary_expression -> ^( LEGEND_unary_expression 'sizeof' unary_expression ) | 'sizeof' '(' type_name ')' -> ^( LEGEND_unary_expression 'sizeof' type_name ) )
			int alt42=6;
			switch ( input.LA(1) ) {
			case Dec:
			case Hex:
			case Nice_character_constant:
			case Nice_identifier:
			case Nice_string:
			case Oct:
			case 71:
				{
				alt42=1;
				}
				break;
			case 76:
				{
				alt42=2;
				}
				break;
			case 80:
				{
				alt42=3;
				}
				break;
			case 64:
			case 69:
			case 73:
			case 75:
			case 79:
			case 119:
				{
				alt42=4;
				}
				break;
			case 109:
				{
				int LA42_5 = input.LA(2);
				if ( (LA42_5==71) ) {
					int LA42_6 = input.LA(3);
					if ( (LA42_6==102||LA42_6==107||(LA42_6 >= 110 && LA42_6 <= 112)) ) {
						alt42=6;
					}
					else if ( (LA42_6==Dec||LA42_6==Hex||(LA42_6 >= Nice_character_constant && LA42_6 <= Oct)||LA42_6==64||LA42_6==69||LA42_6==71||LA42_6==73||(LA42_6 >= 75 && LA42_6 <= 76)||(LA42_6 >= 79 && LA42_6 <= 80)||LA42_6==109||LA42_6==119) ) {
						alt42=5;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 42, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA42_5==Dec||LA42_5==Hex||(LA42_5 >= Nice_character_constant && LA42_5 <= Oct)||LA42_5==64||LA42_5==69||LA42_5==73||(LA42_5 >= 75 && LA42_5 <= 76)||(LA42_5 >= 79 && LA42_5 <= 80)||LA42_5==109||LA42_5==119) ) {
					alt42=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:205:19: postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression2004);
					postfix_expression137=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression137.getTree());
					// AST REWRITE
					// elements: postfix_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 205:38: -> ^( LEGEND_unary_expression postfix_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:205:41: ^( LEGEND_unary_expression postfix_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_postfix_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:206:20: '++' unary_expression
					{
					string_literal138=(Token)match(input,76,FOLLOW_76_in_unary_expression2033); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(string_literal138);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2035);
					unary_expression139=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression139.getTree());
					// AST REWRITE
					// elements: unary_expression, 76
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 206:42: -> ^( LEGEND_unary_expression '++' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:206:45: ^( LEGEND_unary_expression '++' unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_76.nextNode());
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:207:20: '--' unary_expression
					{
					string_literal140=(Token)match(input,80,FOLLOW_80_in_unary_expression2066); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(string_literal140);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2068);
					unary_expression141=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression141.getTree());
					// AST REWRITE
					// elements: 80, unary_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 207:42: -> ^( LEGEND_unary_expression '--' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:207:45: ^( LEGEND_unary_expression '--' unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_80.nextNode());
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\core\\first.g:208:20: unary_operator cast_expression
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression2099);
					unary_operator142=unary_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_operator.add(unary_operator142.getTree());
					pushFollow(FOLLOW_cast_expression_in_unary_expression2101);
					cast_expression143=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression143.getTree());
					// AST REWRITE
					// elements: unary_operator, cast_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 208:51: -> ^( LEGEND_unary_expression unary_operator cast_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:208:54: ^( LEGEND_unary_expression unary_operator cast_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_unary_operator.nextTree());
						adaptor.addChild(root_1, stream_cast_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\core\\first.g:209:20: 'sizeof' unary_expression
					{
					string_literal144=(Token)match(input,109,FOLLOW_109_in_unary_expression2132); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_109.add(string_literal144);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2134);
					unary_expression145=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression145.getTree());
					// AST REWRITE
					// elements: unary_expression, 109
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 209:46: -> ^( LEGEND_unary_expression 'sizeof' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:209:49: ^( LEGEND_unary_expression 'sizeof' unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_109.nextNode());
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\JAVA\\first\\src\\core\\first.g:210:20: 'sizeof' '(' type_name ')'
					{
					string_literal146=(Token)match(input,109,FOLLOW_109_in_unary_expression2165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_109.add(string_literal146);

					char_literal147=(Token)match(input,71,FOLLOW_71_in_unary_expression2167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal147);

					pushFollow(FOLLOW_type_name_in_unary_expression2169);
					type_name148=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name148.getTree());
					char_literal149=(Token)match(input,72,FOLLOW_72_in_unary_expression2171); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal149);

					// AST REWRITE
					// elements: type_name, 109
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 210:47: -> ^( LEGEND_unary_expression 'sizeof' type_name )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:210:50: ^( LEGEND_unary_expression 'sizeof' type_name )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_unary_expression, "LEGEND_unary_expression"), root_1);
						adaptor.addChild(root_1, stream_109.nextNode());
						adaptor.addChild(root_1, stream_type_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expression"


	public static class unary_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_operator"
	// D:\\JAVA\\first\\src\\core\\first.g:212:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final firstParser.unary_operator_return unary_operator() throws RecognitionException {
		firstParser.unary_operator_return retval = new firstParser.unary_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set150=null;

		CommonTree set150_tree=null;

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:212:15: ( '&' | '*' | '+' | '-' | '~' | '!' )
			// D:\\JAVA\\first\\src\\core\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set150=input.LT(1);
			if ( input.LA(1)==64||input.LA(1)==69||input.LA(1)==73||input.LA(1)==75||input.LA(1)==79||input.LA(1)==119 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set150));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_operator"


	public static class postfix_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfix_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:214:1: postfix_expression : primary_expression ( postfix )* -> ^( LEGEND_postfix_expression primary_expression ( postfix )* ) ;
	public final firstParser.postfix_expression_return postfix_expression() throws RecognitionException {
		firstParser.postfix_expression_return retval = new firstParser.postfix_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope primary_expression151 =null;
		ParserRuleReturnScope postfix152 =null;

		RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
		RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:214:19: ( primary_expression ( postfix )* -> ^( LEGEND_postfix_expression primary_expression ( postfix )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:214:21: primary_expression ( postfix )*
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression2222);
			primary_expression151=primary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression151.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:214:40: ( postfix )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==71||LA43_0==76||LA43_0==80||(LA43_0 >= 82 && LA43_0 <= 83)||LA43_0==97) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:214:40: postfix
					{
					pushFollow(FOLLOW_postfix_in_postfix_expression2224);
					postfix152=postfix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_postfix.add(postfix152.getTree());
					}
					break;

				default :
					break loop43;
				}
			}

			// AST REWRITE
			// elements: postfix, primary_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 214:49: -> ^( LEGEND_postfix_expression primary_expression ( postfix )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:214:52: ^( LEGEND_postfix_expression primary_expression ( postfix )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix_expression, "LEGEND_postfix_expression"), root_1);
				adaptor.addChild(root_1, stream_primary_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:214:99: ( postfix )*
				while ( stream_postfix.hasNext() ) {
					adaptor.addChild(root_1, stream_postfix.nextTree());
				}
				stream_postfix.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfix_expression"


	public static class postfix_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfix"
	// D:\\JAVA\\first\\src\\core\\first.g:216:1: postfix : ( '[' expression ']' -> ^( LEGEND_postfix '[' expression ']' ) | '(' ( arguments )? ')' -> ^( LEGEND_postfix FUCK ( arguments )? ) | '.' identifier -> ^( LEGEND_postfix '.' identifier ) | '->' identifier -> ^( LEGEND_postfix '->' identifier ) | '++' -> ^( LEGEND_postfix '++' ) | '--' -> ^( LEGEND_postfix '--' ) );
	public final firstParser.postfix_return postfix() throws RecognitionException {
		firstParser.postfix_return retval = new firstParser.postfix_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal153=null;
		Token char_literal155=null;
		Token char_literal156=null;
		Token char_literal158=null;
		Token char_literal159=null;
		Token string_literal161=null;
		Token string_literal163=null;
		Token string_literal164=null;
		ParserRuleReturnScope expression154 =null;
		ParserRuleReturnScope arguments157 =null;
		ParserRuleReturnScope identifier160 =null;
		ParserRuleReturnScope identifier162 =null;

		CommonTree char_literal153_tree=null;
		CommonTree char_literal155_tree=null;
		CommonTree char_literal156_tree=null;
		CommonTree char_literal158_tree=null;
		CommonTree char_literal159_tree=null;
		CommonTree string_literal161_tree=null;
		CommonTree string_literal163_tree=null;
		CommonTree string_literal164_tree=null;
		RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
		RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
		RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
		RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
		RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:216:8: ( '[' expression ']' -> ^( LEGEND_postfix '[' expression ']' ) | '(' ( arguments )? ')' -> ^( LEGEND_postfix FUCK ( arguments )? ) | '.' identifier -> ^( LEGEND_postfix '.' identifier ) | '->' identifier -> ^( LEGEND_postfix '->' identifier ) | '++' -> ^( LEGEND_postfix '++' ) | '--' -> ^( LEGEND_postfix '--' ) )
			int alt45=6;
			switch ( input.LA(1) ) {
			case 97:
				{
				alt45=1;
				}
				break;
			case 71:
				{
				alt45=2;
				}
				break;
			case 83:
				{
				alt45=3;
				}
				break;
			case 82:
				{
				alt45=4;
				}
				break;
			case 76:
				{
				alt45=5;
				}
				break;
			case 80:
				{
				alt45=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:216:10: '[' expression ']'
					{
					char_literal153=(Token)match(input,97,FOLLOW_97_in_postfix2248); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(char_literal153);

					pushFollow(FOLLOW_expression_in_postfix2250);
					expression154=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression154.getTree());
					char_literal155=(Token)match(input,98,FOLLOW_98_in_postfix2252); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal155);

					// AST REWRITE
					// elements: 97, expression, 98
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 216:29: -> ^( LEGEND_postfix '[' expression ']' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:216:32: ^( LEGEND_postfix '[' expression ']' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, stream_97.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_1, stream_98.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:217:11: '(' ( arguments )? ')'
					{
					char_literal156=(Token)match(input,71,FOLLOW_71_in_postfix2276); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal156);

					// D:\\JAVA\\first\\src\\core\\first.g:217:15: ( arguments )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==Dec||LA44_0==Hex||(LA44_0 >= Nice_character_constant && LA44_0 <= Oct)||LA44_0==64||LA44_0==69||LA44_0==71||LA44_0==73||(LA44_0 >= 75 && LA44_0 <= 76)||(LA44_0 >= 79 && LA44_0 <= 80)||LA44_0==109||LA44_0==119) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\first.g:217:15: arguments
							{
							pushFollow(FOLLOW_arguments_in_postfix2278);
							arguments157=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments157.getTree());
							}
							break;

					}

					char_literal158=(Token)match(input,72,FOLLOW_72_in_postfix2281); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal158);

					// AST REWRITE
					// elements: arguments
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 217:30: -> ^( LEGEND_postfix FUCK ( arguments )? )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:217:33: ^( LEGEND_postfix FUCK ( arguments )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(FUCK, "FUCK"));
						// D:\\JAVA\\first\\src\\core\\first.g:217:55: ( arguments )?
						if ( stream_arguments.hasNext() ) {
							adaptor.addChild(root_1, stream_arguments.nextTree());
						}
						stream_arguments.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:218:11: '.' identifier
					{
					char_literal159=(Token)match(input,83,FOLLOW_83_in_postfix2304); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(char_literal159);

					pushFollow(FOLLOW_identifier_in_postfix2306);
					identifier160=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier160.getTree());
					// AST REWRITE
					// elements: identifier, 83
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 218:26: -> ^( LEGEND_postfix '.' identifier )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:218:29: ^( LEGEND_postfix '.' identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, stream_83.nextNode());
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\core\\first.g:219:11: '->' identifier
					{
					string_literal161=(Token)match(input,82,FOLLOW_82_in_postfix2328); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(string_literal161);

					pushFollow(FOLLOW_identifier_in_postfix2330);
					identifier162=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier162.getTree());
					// AST REWRITE
					// elements: identifier, 82
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 219:27: -> ^( LEGEND_postfix '->' identifier )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:219:30: ^( LEGEND_postfix '->' identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, stream_82.nextNode());
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\core\\first.g:220:11: '++'
					{
					string_literal163=(Token)match(input,76,FOLLOW_76_in_postfix2352); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(string_literal163);

					// AST REWRITE
					// elements: 76
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 220:16: -> ^( LEGEND_postfix '++' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:220:19: ^( LEGEND_postfix '++' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, stream_76.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\JAVA\\first\\src\\core\\first.g:221:11: '--'
					{
					string_literal164=(Token)match(input,80,FOLLOW_80_in_postfix2372); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(string_literal164);

					// AST REWRITE
					// elements: 80
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 221:16: -> ^( LEGEND_postfix '--' )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:221:19: ^( LEGEND_postfix '--' )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, stream_80.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "postfix"


	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// D:\\JAVA\\first\\src\\core\\first.g:224:1: arguments : assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* ) ;
	public final firstParser.arguments_return arguments() throws RecognitionException {
		firstParser.arguments_return retval = new firstParser.arguments_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal166=null;
		ParserRuleReturnScope assignment_expression165 =null;
		ParserRuleReturnScope assignment_expression167 =null;

		CommonTree char_literal166_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:224:10: ( assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\first.g:225:3: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_arguments2404);
			assignment_expression165=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression165.getTree());
			// D:\\JAVA\\first\\src\\core\\first.g:225:25: ( ',' assignment_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==78) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:225:26: ',' assignment_expression
					{
					char_literal166=(Token)match(input,78,FOLLOW_78_in_arguments2407); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal166);

					pushFollow(FOLLOW_assignment_expression_in_arguments2409);
					assignment_expression167=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression167.getTree());
					}
					break;

				default :
					break loop46;
				}
			}

			// AST REWRITE
			// elements: assignment_expression, assignment_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 225:54: -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:225:57: ^( LEGEND_arguments assignment_expression ( assignment_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_arguments, "LEGEND_arguments"), root_1);
				adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\first.g:225:98: ( assignment_expression )*
				while ( stream_assignment_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				}
				stream_assignment_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arguments"


	public static class primary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// D:\\JAVA\\first\\src\\core\\first.g:228:1: primary_expression : ( identifier -> ^( LEGEND_primary_expression identifier ) | constant -> ^( LEGEND_primary_expression constant ) | string -> ^( LEGEND_primary_expression string ) | '(' expression ')' -> ^( LEGEND_primary_expression expression ) );
	public final firstParser.primary_expression_return primary_expression() throws RecognitionException {
		firstParser.primary_expression_return retval = new firstParser.primary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal171=null;
		Token char_literal173=null;
		ParserRuleReturnScope identifier168 =null;
		ParserRuleReturnScope constant169 =null;
		ParserRuleReturnScope string170 =null;
		ParserRuleReturnScope expression172 =null;

		CommonTree char_literal171_tree=null;
		CommonTree char_literal173_tree=null;
		RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
		RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
		RewriteRuleSubtreeStream stream_string=new RewriteRuleSubtreeStream(adaptor,"rule string");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:228:19: ( identifier -> ^( LEGEND_primary_expression identifier ) | constant -> ^( LEGEND_primary_expression constant ) | string -> ^( LEGEND_primary_expression string ) | '(' expression ')' -> ^( LEGEND_primary_expression expression ) )
			int alt47=4;
			switch ( input.LA(1) ) {
			case Nice_identifier:
				{
				alt47=1;
				}
				break;
			case Dec:
			case Hex:
			case Nice_character_constant:
			case Oct:
				{
				alt47=2;
				}
				break;
			case Nice_string:
				{
				alt47=3;
				}
				break;
			case 71:
				{
				alt47=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:228:21: identifier
					{
					pushFollow(FOLLOW_identifier_in_primary_expression2440);
					identifier168=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier168.getTree());
					// AST REWRITE
					// elements: identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 228:32: -> ^( LEGEND_primary_expression identifier )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:228:35: ^( LEGEND_primary_expression identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_primary_expression, "LEGEND_primary_expression"), root_1);
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:229:22: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression2471);
					constant169=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_constant.add(constant169.getTree());
					// AST REWRITE
					// elements: constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 229:31: -> ^( LEGEND_primary_expression constant )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:229:34: ^( LEGEND_primary_expression constant )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_primary_expression, "LEGEND_primary_expression"), root_1);
						adaptor.addChild(root_1, stream_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:230:22: string
					{
					pushFollow(FOLLOW_string_in_primary_expression2502);
					string170=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_string.add(string170.getTree());
					// AST REWRITE
					// elements: string
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 230:29: -> ^( LEGEND_primary_expression string )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:230:32: ^( LEGEND_primary_expression string )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_primary_expression, "LEGEND_primary_expression"), root_1);
						adaptor.addChild(root_1, stream_string.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\core\\first.g:231:22: '(' expression ')'
					{
					char_literal171=(Token)match(input,71,FOLLOW_71_in_primary_expression2534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal171);

					pushFollow(FOLLOW_expression_in_primary_expression2536);
					expression172=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression172.getTree());
					char_literal173=(Token)match(input,72,FOLLOW_72_in_primary_expression2538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal173);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 231:41: -> ^( LEGEND_primary_expression expression )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:231:44: ^( LEGEND_primary_expression expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_primary_expression, "LEGEND_primary_expression"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primary_expression"


	public static class integer_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer_constant"
	// D:\\JAVA\\first\\src\\core\\first.g:234:1: integer_constant : ( Dec -> ^( LEGEND_integer_constant Dec ) | Oct -> ^( LEGEND_integer_constant Oct ) | Hex -> ^( LEGEND_integer_constant Hex ) );
	public final firstParser.integer_constant_return integer_constant() throws RecognitionException {
		firstParser.integer_constant_return retval = new firstParser.integer_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Dec174=null;
		Token Oct175=null;
		Token Hex176=null;

		CommonTree Dec174_tree=null;
		CommonTree Oct175_tree=null;
		CommonTree Hex176_tree=null;
		RewriteRuleTokenStream stream_Hex=new RewriteRuleTokenStream(adaptor,"token Hex");
		RewriteRuleTokenStream stream_Oct=new RewriteRuleTokenStream(adaptor,"token Oct");
		RewriteRuleTokenStream stream_Dec=new RewriteRuleTokenStream(adaptor,"token Dec");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:235:2: ( Dec -> ^( LEGEND_integer_constant Dec ) | Oct -> ^( LEGEND_integer_constant Oct ) | Hex -> ^( LEGEND_integer_constant Hex ) )
			int alt48=3;
			switch ( input.LA(1) ) {
			case Dec:
				{
				alt48=1;
				}
				break;
			case Oct:
				{
				alt48=2;
				}
				break;
			case Hex:
				{
				alt48=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:235:4: Dec
					{
					Dec174=(Token)match(input,Dec,FOLLOW_Dec_in_integer_constant2599); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Dec.add(Dec174);

					// AST REWRITE
					// elements: Dec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 235:8: -> ^( LEGEND_integer_constant Dec )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:235:11: ^( LEGEND_integer_constant Dec )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_integer_constant, "LEGEND_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Dec.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:236:4: Oct
					{
					Oct175=(Token)match(input,Oct,FOLLOW_Oct_in_integer_constant2612); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Oct.add(Oct175);

					// AST REWRITE
					// elements: Oct
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 236:8: -> ^( LEGEND_integer_constant Oct )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:236:11: ^( LEGEND_integer_constant Oct )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_integer_constant, "LEGEND_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Oct.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\core\\first.g:237:4: Hex
					{
					Hex176=(Token)match(input,Hex,FOLLOW_Hex_in_integer_constant2625); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Hex.add(Hex176);

					// AST REWRITE
					// elements: Hex
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 237:8: -> ^( LEGEND_integer_constant Hex )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:237:11: ^( LEGEND_integer_constant Hex )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_integer_constant, "LEGEND_integer_constant"), root_1);
						adaptor.addChild(root_1, stream_Hex.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "integer_constant"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// D:\\JAVA\\first\\src\\core\\first.g:253:1: identifier : Nice_identifier -> ^( LEGEND_identifier Nice_identifier ) ;
	public final firstParser.identifier_return identifier() throws RecognitionException {
		firstParser.identifier_return retval = new firstParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_identifier177=null;

		CommonTree Nice_identifier177_tree=null;
		RewriteRuleTokenStream stream_Nice_identifier=new RewriteRuleTokenStream(adaptor,"token Nice_identifier");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:253:11: ( Nice_identifier -> ^( LEGEND_identifier Nice_identifier ) )
			// D:\\JAVA\\first\\src\\core\\first.g:254:2: Nice_identifier
			{
			Nice_identifier177=(Token)match(input,Nice_identifier,FOLLOW_Nice_identifier_in_identifier2717); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Nice_identifier.add(Nice_identifier177);

			// AST REWRITE
			// elements: Nice_identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 254:18: -> ^( LEGEND_identifier Nice_identifier )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:254:21: ^( LEGEND_identifier Nice_identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_identifier, "LEGEND_identifier"), root_1);
				adaptor.addChild(root_1, stream_Nice_identifier.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifier"


	public static class constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// D:\\JAVA\\first\\src\\core\\first.g:262:1: constant : ( integer_constant -> ^( LEGEND_constant integer_constant ) | character_constant -> ^( LEGEND_constant character_constant ) );
	public final firstParser.constant_return constant() throws RecognitionException {
		firstParser.constant_return retval = new firstParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope integer_constant178 =null;
		ParserRuleReturnScope character_constant179 =null;

		RewriteRuleSubtreeStream stream_character_constant=new RewriteRuleSubtreeStream(adaptor,"rule character_constant");
		RewriteRuleSubtreeStream stream_integer_constant=new RewriteRuleSubtreeStream(adaptor,"rule integer_constant");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:262:9: ( integer_constant -> ^( LEGEND_constant integer_constant ) | character_constant -> ^( LEGEND_constant character_constant ) )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Dec||LA49_0==Hex||LA49_0==Oct) ) {
				alt49=1;
			}
			else if ( (LA49_0==Nice_character_constant) ) {
				alt49=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\first.g:262:11: integer_constant
					{
					pushFollow(FOLLOW_integer_constant_in_constant2783);
					integer_constant178=integer_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_integer_constant.add(integer_constant178.getTree());
					// AST REWRITE
					// elements: integer_constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 262:28: -> ^( LEGEND_constant integer_constant )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:262:31: ^( LEGEND_constant integer_constant )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_constant, "LEGEND_constant"), root_1);
						adaptor.addChild(root_1, stream_integer_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\first.g:263:12: character_constant
					{
					pushFollow(FOLLOW_character_constant_in_constant2805);
					character_constant179=character_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_character_constant.add(character_constant179.getTree());
					// AST REWRITE
					// elements: character_constant
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 263:31: -> ^( LEGEND_constant character_constant )
					{
						// D:\\JAVA\\first\\src\\core\\first.g:263:34: ^( LEGEND_constant character_constant )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_constant, "LEGEND_constant"), root_1);
						adaptor.addChild(root_1, stream_character_constant.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class character_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "character_constant"
	// D:\\JAVA\\first\\src\\core\\first.g:268:1: character_constant : Nice_character_constant -> ^( LEGEND_character_constant Nice_character_constant ) ;
	public final firstParser.character_constant_return character_constant() throws RecognitionException {
		firstParser.character_constant_return retval = new firstParser.character_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_character_constant180=null;

		CommonTree Nice_character_constant180_tree=null;
		RewriteRuleTokenStream stream_Nice_character_constant=new RewriteRuleTokenStream(adaptor,"token Nice_character_constant");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:268:19: ( Nice_character_constant -> ^( LEGEND_character_constant Nice_character_constant ) )
			// D:\\JAVA\\first\\src\\core\\first.g:269:2: Nice_character_constant
			{
			Nice_character_constant180=(Token)match(input,Nice_character_constant,FOLLOW_Nice_character_constant_in_character_constant2847); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Nice_character_constant.add(Nice_character_constant180);

			// AST REWRITE
			// elements: Nice_character_constant
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 269:26: -> ^( LEGEND_character_constant Nice_character_constant )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:269:29: ^( LEGEND_character_constant Nice_character_constant )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_character_constant, "LEGEND_character_constant"), root_1);
				adaptor.addChild(root_1, stream_Nice_character_constant.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "character_constant"


	public static class string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// D:\\JAVA\\first\\src\\core\\first.g:278:1: string : Nice_string -> ^( LEGEND_string Nice_string ) ;
	public final firstParser.string_return string() throws RecognitionException {
		firstParser.string_return retval = new firstParser.string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_string181=null;

		CommonTree Nice_string181_tree=null;
		RewriteRuleTokenStream stream_Nice_string=new RewriteRuleTokenStream(adaptor,"token Nice_string");

		try {
			// D:\\JAVA\\first\\src\\core\\first.g:278:8: ( Nice_string -> ^( LEGEND_string Nice_string ) )
			// D:\\JAVA\\first\\src\\core\\first.g:279:2: Nice_string
			{
			Nice_string181=(Token)match(input,Nice_string,FOLLOW_Nice_string_in_string2923); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Nice_string.add(Nice_string181);

			// AST REWRITE
			// elements: Nice_string
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 279:14: -> ^( LEGEND_string Nice_string )
			{
				// D:\\JAVA\\first\\src\\core\\first.g:279:17: ^( LEGEND_string Nice_string )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_string, "LEGEND_string"), root_1);
				adaptor.addChild(root_1, stream_Nice_string.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException e) {
			throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "string"

	// $ANTLR start synpred1_first
	public final void synpred1_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\first.g:79:10: ( declaration )
		// D:\\JAVA\\first\\src\\core\\first.g:79:10: declaration
		{
		pushFollow(FOLLOW_declaration_in_synpred1_first311);
		declaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_first

	// $ANTLR start synpred2_first
	public final void synpred2_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\first.g:79:24: ( function_definition )
		// D:\\JAVA\\first\\src\\core\\first.g:79:24: function_definition
		{
		pushFollow(FOLLOW_function_definition_in_synpred2_first315);
		function_definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_first

	// $ANTLR start synpred29_first
	public final void synpred29_first_fragment() throws RecognitionException {
		ParserRuleReturnScope e3 =null;


		// D:\\JAVA\\first\\src\\core\\first.g:126:63: ( 'else' e3= statement )
		// D:\\JAVA\\first\\src\\core\\first.g:126:63: 'else' e3= statement
		{
		match(input,104,FOLLOW_104_in_synpred29_first1036); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred29_first1040);
		e3=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred29_first

	// $ANTLR start synpred38_first
	public final void synpred38_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\first.g:138:23: ( unary_expression assignment_operator assignment_expression )
		// D:\\JAVA\\first\\src\\core\\first.g:138:23: unary_expression assignment_operator assignment_expression
		{
		pushFollow(FOLLOW_unary_expression_in_synpred38_first1338);
		unary_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_operator_in_synpred38_first1340);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_expression_in_synpred38_first1342);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_first

	// Delegated rules

	public final boolean synpred29_first() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_first_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_first() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_first_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_first() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_first_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_first() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_first_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA15 dfa15 = new DFA15(this);
	static final String DFA15_eotS =
		"\5\uffff";
	static final String DFA15_eofS =
		"\2\uffff\1\4\2\uffff";
	static final String DFA15_minS =
		"\2\74\1\107\2\uffff";
	static final String DFA15_maxS =
		"\2\111\1\141\2\uffff";
	static final String DFA15_acceptS =
		"\3\uffff\1\1\1\2";
	static final String DFA15_specialS =
		"\5\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\2\14\uffff\1\1",
			"\1\2\14\uffff\1\1",
			"\1\3\1\4\5\uffff\1\4\7\uffff\1\4\4\uffff\1\4\5\uffff\1\4",
			"",
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
			return "108:1: declarator : ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) );";
		}
	}

	public static final BitSet FOLLOW_prog_in_program291 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_prog311 = new BitSet(new long[]{0x0000000000000002L,0x0001C84000000000L});
	public static final BitSet FOLLOW_function_definition_in_prog315 = new BitSet(new long[]{0x0000000000000002L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_specifier_in_declaration328 = new BitSet(new long[]{0x1000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_init_declarators_in_declaration330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_declaration333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_function_definition356 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_plain_declarator_in_function_definition358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_function_definition360 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000100L});
	public static final BitSet FOLLOW_parameters_in_function_definition362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_function_definition365 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters393 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_parameters396 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters398 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_declarators425 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_declarators428 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarator_in_declarators430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_init_declarators456 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_init_declarator486 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_init_declarator489 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_init_declarator491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_initializer540 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_initializer542 = new BitSet(new long[]{0x0000000000000000L,0x0040000000004000L});
	public static final BitSet FOLLOW_78_in_initializer545 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_initializer547 = new BitSet(new long[]{0x0000000000000000L,0x0040000000004000L});
	public static final BitSet FOLLOW_118_in_initializer551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_type_specifier577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_type_specifier597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_type_specifier617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier644 = new BitSet(new long[]{0x1000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier646 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_type_specifier649 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_specifier_in_type_specifier652 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarators_in_type_specifier654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_type_specifier656 = new BitSet(new long[]{0x0000000000000000L,0x0041C84000000000L});
	public static final BitSet FOLLOW_118_in_type_specifier660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier698 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_plain_declaration739 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarator_in_plain_declaration741 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_declarator765 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000100L});
	public static final BitSet FOLLOW_parameters_in_declarator767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_declarator770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator788 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_declarator791 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_constant_expression_in_declarator793 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_declarator795 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_73_in_plain_declarator824 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_plain_declarator827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expression_statement968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_compound_statement989 = new BitSet(new long[]{0x7800000000000120L,0x00C7FEE000419AA1L});
	public static final BitSet FOLLOW_declaration_in_compound_statement991 = new BitSet(new long[]{0x7800000000000120L,0x00C7FEE000419AA1L});
	public static final BitSet FOLLOW_statement_in_compound_statement994 = new BitSet(new long[]{0x7800000000000120L,0x00C636A000419AA1L});
	public static final BitSet FOLLOW_118_in_compound_statement997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_selection_statement1021 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_selection_statement1023 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_selection_statement1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_selection_statement1029 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_selection_statement1033 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_selection_statement1036 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_selection_statement1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_iteration_statement1073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_iteration_statement1075 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1081 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_iteration_statement1123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_iteration_statement1125 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_iteration_statement1132 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_iteration_statement1139 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019BA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1146 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_jump_statement1197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_jump_statement1226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_jump_statement1255 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_jump_statement1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_expression1285 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1287 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_unary_expression_in_assignment_expression1338 = new BitSet(new long[]{0x0000000000000000L,0x001000110A222448L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1340 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_constant_expression1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1500 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_logical_or_expression1503 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1505 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1528 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_logical_and_expression1531 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1533 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1558 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_inclusive_or_expression1561 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1563 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1588 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_exclusive_or_expression1591 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1593 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1618 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_and_expression1621 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1648 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000002L});
	public static final BitSet FOLLOW_equality_operator_in_equality_expression1651 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1653 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1699 = new BitSet(new long[]{0x0000000000000002L,0x0000000064800000L});
	public static final BitSet FOLLOW_relational_operator_in_relational_expression1702 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1704 = new BitSet(new long[]{0x0000000000000002L,0x0000000064800000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1761 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
	public static final BitSet FOLLOW_shift_operator_in_shift_expression1764 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1766 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1813 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
	public static final BitSet FOLLOW_additive_operator_in_additive_expression1816 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1818 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1866 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100204L});
	public static final BitSet FOLLOW_multiplicative_operator_in_multiplicative_expression1869 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1871 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100204L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression1922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_cast_expression1950 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_name_in_cast_expression1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_cast_expression1954 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression1956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_type_name1978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_type_name1980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_unary_expression2033 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression2066 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression2099 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression2101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_unary_expression2132 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_unary_expression2165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_unary_expression2167 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_name_in_unary_expression2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unary_expression2171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression2222 = new BitSet(new long[]{0x0000000000000002L,0x00000002000D1080L});
	public static final BitSet FOLLOW_postfix_in_postfix_expression2224 = new BitSet(new long[]{0x0000000000000002L,0x00000002000D1080L});
	public static final BitSet FOLLOW_97_in_postfix2248 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_postfix2250 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_postfix2252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_postfix2276 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019BA1L});
	public static final BitSet FOLLOW_arguments_in_postfix2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_postfix2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_postfix2304 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_postfix2328 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_postfix2352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_postfix2372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2404 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_arguments2407 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2409 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_identifier_in_primary_expression2440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_primary_expression2502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_primary_expression2534 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_primary_expression2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_primary_expression2538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dec_in_integer_constant2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Oct_in_integer_constant2612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hex_in_integer_constant2625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_identifier_in_identifier2717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_constant_in_constant2783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_constant_in_constant2805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_character_constant_in_character_constant2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_string_in_string2923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_synpred1_first311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_synpred2_first315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_synpred29_first1036 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_synpred29_first1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_synpred38_first1338 = new BitSet(new long[]{0x0000000000000000L,0x001000110A222448L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred38_first1340 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred38_first1342 = new BitSet(new long[]{0x0000000000000002L});
}
