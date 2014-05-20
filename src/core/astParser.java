// $ANTLR 3.5.1 D:\\JAVA\\first\\src\\core\\ast.g 2014-05-13 13:34:32
  
package core;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class astParser extends Parser {
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


	public astParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public astParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[144+1];


	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return astParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\JAVA\\first\\src\\core\\ast.g"; }


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\JAVA\\first\\src\\core\\ast.g:78:1: program : prog EOF -> ^( LEGEND_program prog ) ;
	public final astParser.program_return program() throws RecognitionException {
		astParser.program_return retval = new astParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope prog1 =null;

		CommonTree EOF2_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_prog=new RewriteRuleSubtreeStream(adaptor,"rule prog");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:78:9: ( prog EOF -> ^( LEGEND_program prog ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:78:11: prog EOF
			{
			pushFollow(FOLLOW_prog_in_program299);
			prog1=prog();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_prog.add(prog1.getTree());
			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program301); if (state.failed) return retval; 
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
			// 78:20: -> ^( LEGEND_program prog )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:78:23: ^( LEGEND_program prog )
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
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:80:1: prog : ( declaration | function_definition )+ ;
	public final astParser.prog_return prog() throws RecognitionException {
		astParser.prog_return retval = new astParser.prog_return();
		retval.start = input.LT(1);
		int prog_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope function_definition4 =null;


		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:80:6: ( ( declaration | function_definition )+ )
			// D:\\JAVA\\first\\src\\core\\ast.g:80:8: ( declaration | function_definition )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\JAVA\\first\\src\\core\\ast.g:80:8: ( declaration | function_definition )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				switch ( input.LA(1) ) {
				case 112:
					{
					int LA1_2 = input.LA(2);
					if ( (synpred1_ast()) ) {
						alt1=1;
					}
					else if ( (synpred2_ast()) ) {
						alt1=2;
					}

					}
					break;
				case 102:
					{
					int LA1_3 = input.LA(2);
					if ( (synpred1_ast()) ) {
						alt1=1;
					}
					else if ( (synpred2_ast()) ) {
						alt1=2;
					}

					}
					break;
				case 107:
					{
					int LA1_4 = input.LA(2);
					if ( (synpred1_ast()) ) {
						alt1=1;
					}
					else if ( (synpred2_ast()) ) {
						alt1=2;
					}

					}
					break;
				case 110:
				case 111:
					{
					int LA1_5 = input.LA(2);
					if ( (synpred1_ast()) ) {
						alt1=1;
					}
					else if ( (synpred2_ast()) ) {
						alt1=2;
					}

					}
					break;
				}
				switch (alt1) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:80:10: declaration
					{
					pushFollow(FOLLOW_declaration_in_prog319);
					declaration3=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\core\\ast.g:80:24: function_definition
					{
					pushFollow(FOLLOW_function_definition_in_prog323);
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
			if ( state.backtracking>0 ) { memoize(input, 2, prog_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:82:1: declaration : type_specifier ( init_declarators )? ';' -> ^( LEGEND_declaration type_specifier ( init_declarators )? ) ;
	public final astParser.declaration_return declaration() throws RecognitionException {
		astParser.declaration_return retval = new astParser.declaration_return();
		retval.start = input.LT(1);
		int declaration_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal7=null;
		ParserRuleReturnScope type_specifier5 =null;
		ParserRuleReturnScope init_declarators6 =null;

		CommonTree char_literal7_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_init_declarators=new RewriteRuleSubtreeStream(adaptor,"rule init_declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:82:12: ( type_specifier ( init_declarators )? ';' -> ^( LEGEND_declaration type_specifier ( init_declarators )? ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:82:14: type_specifier ( init_declarators )? ';'
			{
			pushFollow(FOLLOW_type_specifier_in_declaration336);
			type_specifier5=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier5.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:82:29: ( init_declarators )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Nice_identifier||LA2_0==73) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:82:29: init_declarators
					{
					pushFollow(FOLLOW_init_declarators_in_declaration338);
					init_declarators6=init_declarators();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarators.add(init_declarators6.getTree());
					}
					break;

			}

			char_literal7=(Token)match(input,86,FOLLOW_86_in_declaration341); if (state.failed) return retval; 
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
			// 82:51: -> ^( LEGEND_declaration type_specifier ( init_declarators )? )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:82:54: ^( LEGEND_declaration type_specifier ( init_declarators )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declaration, "LEGEND_declaration"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:82:90: ( init_declarators )?
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
			if ( state.backtracking>0 ) { memoize(input, 3, declaration_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:84:1: function_definition : type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement ) ;
	public final astParser.function_definition_return function_definition() throws RecognitionException {
		astParser.function_definition_return retval = new astParser.function_definition_return();
		retval.start = input.LT(1);
		int function_definition_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:84:20: ( type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:84:22: type_specifier plain_declarator '(' ( parameters )? ')' compound_statement
			{
			pushFollow(FOLLOW_type_specifier_in_function_definition364);
			type_specifier8=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier8.getTree());
			pushFollow(FOLLOW_plain_declarator_in_function_definition366);
			plain_declarator9=plain_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator9.getTree());
			char_literal10=(Token)match(input,71,FOLLOW_71_in_function_definition368); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal10);

			// D:\\JAVA\\first\\src\\core\\ast.g:84:58: ( parameters )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==102||LA3_0==107||(LA3_0 >= 110 && LA3_0 <= 112)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:84:58: parameters
					{
					pushFollow(FOLLOW_parameters_in_function_definition370);
					parameters11=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters11.getTree());
					}
					break;

			}

			char_literal12=(Token)match(input,72,FOLLOW_72_in_function_definition373); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal12);

			pushFollow(FOLLOW_compound_statement_in_function_definition375);
			compound_statement13=compound_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement13.getTree());
			// AST REWRITE
			// elements: type_specifier, plain_declarator, compound_statement, parameters
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 84:93: -> ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:84:96: ^( LEGEND_function_definition type_specifier plain_declarator ( parameters )? compound_statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_function_definition, "LEGEND_function_definition"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				adaptor.addChild(root_1, stream_plain_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:84:157: ( parameters )?
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
			if ( state.backtracking>0 ) { memoize(input, 4, function_definition_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:86:1: parameters : plain_declaration ( ',' plain_declaration )* -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* ) ;
	public final astParser.parameters_return parameters() throws RecognitionException {
		astParser.parameters_return retval = new astParser.parameters_return();
		retval.start = input.LT(1);
		int parameters_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope plain_declaration14 =null;
		ParserRuleReturnScope plain_declaration16 =null;

		CommonTree char_literal15_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_plain_declaration=new RewriteRuleSubtreeStream(adaptor,"rule plain_declaration");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:86:11: ( plain_declaration ( ',' plain_declaration )* -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:86:13: plain_declaration ( ',' plain_declaration )*
			{
			pushFollow(FOLLOW_plain_declaration_in_parameters401);
			plain_declaration14=plain_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declaration.add(plain_declaration14.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:86:31: ( ',' plain_declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==78) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:86:32: ',' plain_declaration
					{
					char_literal15=(Token)match(input,78,FOLLOW_78_in_parameters404); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal15);

					pushFollow(FOLLOW_plain_declaration_in_parameters406);
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
			// 86:56: -> ^( LEGEND_parameters plain_declaration ( plain_declaration )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:86:59: ^( LEGEND_parameters plain_declaration ( plain_declaration )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_parameters, "LEGEND_parameters"), root_1);
				adaptor.addChild(root_1, stream_plain_declaration.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:86:97: ( plain_declaration )*
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
			if ( state.backtracking>0 ) { memoize(input, 5, parameters_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:88:1: declarators : declarator ( ',' declarator )* -> ^( LEGEND_declarators ( declarator )+ ) ;
	public final astParser.declarators_return declarators() throws RecognitionException {
		astParser.declarators_return retval = new astParser.declarators_return();
		retval.start = input.LT(1);
		int declarators_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope declarator17 =null;
		ParserRuleReturnScope declarator19 =null;

		CommonTree char_literal18_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:88:12: ( declarator ( ',' declarator )* -> ^( LEGEND_declarators ( declarator )+ ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:88:14: declarator ( ',' declarator )*
			{
			pushFollow(FOLLOW_declarator_in_declarators433);
			declarator17=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator17.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:88:25: ( ',' declarator )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==78) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:88:26: ',' declarator
					{
					char_literal18=(Token)match(input,78,FOLLOW_78_in_declarators436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal18);

					pushFollow(FOLLOW_declarator_in_declarators438);
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
			// 88:43: -> ^( LEGEND_declarators ( declarator )+ )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:88:46: ^( LEGEND_declarators ( declarator )+ )
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
			if ( state.backtracking>0 ) { memoize(input, 6, declarators_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:90:1: init_declarators : init_declarator ( ',' init_declarator )* -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* ) ;
	public final astParser.init_declarators_return init_declarators() throws RecognitionException {
		astParser.init_declarators_return retval = new astParser.init_declarators_return();
		retval.start = input.LT(1);
		int init_declarators_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope init_declarator20 =null;
		ParserRuleReturnScope init_declarator22 =null;

		CommonTree char_literal21_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_init_declarator=new RewriteRuleSubtreeStream(adaptor,"rule init_declarator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:90:17: ( init_declarator ( ',' init_declarator )* -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:90:19: init_declarator ( ',' init_declarator )*
			{
			pushFollow(FOLLOW_init_declarator_in_init_declarators461);
			init_declarator20=init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_init_declarator.add(init_declarator20.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:90:35: ( ',' init_declarator )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==78) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:90:36: ',' init_declarator
					{
					char_literal21=(Token)match(input,78,FOLLOW_78_in_init_declarators464); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal21);

					pushFollow(FOLLOW_init_declarator_in_init_declarators466);
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
			// 90:58: -> ^( LEGEND_init_declarators init_declarator ( init_declarator )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:90:61: ^( LEGEND_init_declarators init_declarator ( init_declarator )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_init_declarators, "LEGEND_init_declarators"), root_1);
				adaptor.addChild(root_1, stream_init_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:90:103: ( init_declarator )*
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
			if ( state.backtracking>0 ) { memoize(input, 7, init_declarators_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:92:1: init_declarator : declarator ( '=' initializer )? -> ^( LEGEND_init_declarator declarator ( initializer )? ) ;
	public final astParser.init_declarator_return init_declarator() throws RecognitionException {
		astParser.init_declarator_return retval = new astParser.init_declarator_return();
		retval.start = input.LT(1);
		int init_declarator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal24=null;
		ParserRuleReturnScope declarator23 =null;
		ParserRuleReturnScope initializer25 =null;

		CommonTree char_literal24_tree=null;
		RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:92:16: ( declarator ( '=' initializer )? -> ^( LEGEND_init_declarator declarator ( initializer )? ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:92:18: declarator ( '=' initializer )?
			{
			pushFollow(FOLLOW_declarator_in_init_declarator494);
			declarator23=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator23.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:92:29: ( '=' initializer )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==91) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:92:30: '=' initializer
					{
					char_literal24=(Token)match(input,91,FOLLOW_91_in_init_declarator497); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_91.add(char_literal24);

					pushFollow(FOLLOW_initializer_in_init_declarator499);
					initializer25=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(initializer25.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: initializer, declarator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 92:48: -> ^( LEGEND_init_declarator declarator ( initializer )? )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:92:51: ^( LEGEND_init_declarator declarator ( initializer )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_init_declarator, "LEGEND_init_declarator"), root_1);
				adaptor.addChild(root_1, stream_declarator.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:92:87: ( initializer )?
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
			if ( state.backtracking>0 ) { memoize(input, 8, init_declarator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:94:1: initializer : ( assignment_expression -> ^( LEGEND_initializer assignment_expression ) | '{' initializer ( ',' initializer )* '}' -> ^( LEGEND_initializer initializer ( initializer )* ) );
	public final astParser.initializer_return initializer() throws RecognitionException {
		astParser.initializer_return retval = new astParser.initializer_return();
		retval.start = input.LT(1);
		int initializer_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:94:12: ( assignment_expression -> ^( LEGEND_initializer assignment_expression ) | '{' initializer ( ',' initializer )* '}' -> ^( LEGEND_initializer initializer ( initializer )* ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:94:14: assignment_expression
					{
					pushFollow(FOLLOW_assignment_expression_in_initializer524);
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
					// 94:36: -> ^( LEGEND_initializer assignment_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:94:39: ^( LEGEND_initializer assignment_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:95:15: '{' initializer ( ',' initializer )* '}'
					{
					char_literal27=(Token)match(input,114,FOLLOW_114_in_initializer548); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(char_literal27);

					pushFollow(FOLLOW_initializer_in_initializer550);
					initializer28=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_initializer.add(initializer28.getTree());
					// D:\\JAVA\\first\\src\\core\\ast.g:95:31: ( ',' initializer )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==78) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:95:32: ',' initializer
							{
							char_literal29=(Token)match(input,78,FOLLOW_78_in_initializer553); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_78.add(char_literal29);

							pushFollow(FOLLOW_initializer_in_initializer555);
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

					char_literal31=(Token)match(input,118,FOLLOW_118_in_initializer559); if (state.failed) return retval; 
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
					// 95:54: -> ^( LEGEND_initializer initializer ( initializer )* )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:95:57: ^( LEGEND_initializer initializer ( initializer )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_initializer, "LEGEND_initializer"), root_1);
						adaptor.addChild(root_1, stream_initializer.nextTree());
						// D:\\JAVA\\first\\src\\core\\ast.g:95:90: ( initializer )*
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
			if ( state.backtracking>0 ) { memoize(input, 9, initializer_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:97:1: type_specifier : ( 'void' -> ^( LEGEND_type_specifier 'void' ) | 'char' -> ^( LEGEND_type_specifier 'char' ) | 'int' -> ^( LEGEND_type_specifier 'int' ) | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ ) | struct_or_union identifier -> ^( LEGEND_type_specifier struct_or_union identifier ) );
	public final astParser.type_specifier_return type_specifier() throws RecognitionException {
		astParser.type_specifier_return retval = new astParser.type_specifier_return();
		retval.start = input.LT(1);
		int type_specifier_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:97:15: ( 'void' -> ^( LEGEND_type_specifier 'void' ) | 'char' -> ^( LEGEND_type_specifier 'char' ) | 'int' -> ^( LEGEND_type_specifier 'int' ) | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ ) | struct_or_union identifier -> ^( LEGEND_type_specifier struct_or_union identifier ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:97:17: 'void'
					{
					string_literal32=(Token)match(input,112,FOLLOW_112_in_type_specifier585); if (state.failed) return retval; 
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
					// 97:24: -> ^( LEGEND_type_specifier 'void' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:97:27: ^( LEGEND_type_specifier 'void' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:98:11: 'char'
					{
					string_literal33=(Token)match(input,102,FOLLOW_102_in_type_specifier605); if (state.failed) return retval; 
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
					// 98:18: -> ^( LEGEND_type_specifier 'char' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:98:21: ^( LEGEND_type_specifier 'char' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:99:11: 'int'
					{
					string_literal34=(Token)match(input,107,FOLLOW_107_in_type_specifier625); if (state.failed) return retval; 
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
					// 99:17: -> ^( LEGEND_type_specifier 'int' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:99:20: ^( LEGEND_type_specifier 'int' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:100:18: struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}'
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier652);
					struct_or_union35=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union35.getTree());
					// D:\\JAVA\\first\\src\\core\\ast.g:100:34: ( identifier )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Nice_identifier) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:100:34: identifier
							{
							pushFollow(FOLLOW_identifier_in_type_specifier654);
							identifier36=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());
							}
							break;

					}

					char_literal37=(Token)match(input,114,FOLLOW_114_in_type_specifier657); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_114.add(char_literal37);

					// D:\\JAVA\\first\\src\\core\\ast.g:100:50: ( type_specifier declarators ';' )+
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
							// D:\\JAVA\\first\\src\\core\\ast.g:100:51: type_specifier declarators ';'
							{
							pushFollow(FOLLOW_type_specifier_in_type_specifier660);
							type_specifier38=type_specifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier38.getTree());
							pushFollow(FOLLOW_declarators_in_type_specifier662);
							declarators39=declarators();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_declarators.add(declarators39.getTree());
							char_literal40=(Token)match(input,86,FOLLOW_86_in_type_specifier664); if (state.failed) return retval; 
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

					char_literal41=(Token)match(input,118,FOLLOW_118_in_type_specifier668); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_118.add(char_literal41);

					// AST REWRITE
					// elements: type_specifier, struct_or_union, identifier, declarators
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 100:88: -> ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:100:91: ^( LEGEND_type_specifier struct_or_union ( identifier )? ( type_specifier declarators )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_specifier, "LEGEND_type_specifier"), root_1);
						adaptor.addChild(root_1, stream_struct_or_union.nextTree());
						// D:\\JAVA\\first\\src\\core\\ast.g:100:131: ( identifier )?
						if ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_1, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						if ( !(stream_type_specifier.hasNext()||stream_declarators.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_type_specifier.hasNext()||stream_declarators.hasNext() ) {
							adaptor.addChild(root_1, stream_type_specifier.nextTree());
							adaptor.addChild(root_1, stream_declarators.nextTree());
						}
						stream_type_specifier.reset();
						stream_declarators.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\core\\ast.g:101:18: struct_or_union identifier
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier706);
					struct_or_union42=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union42.getTree());
					pushFollow(FOLLOW_identifier_in_type_specifier708);
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
					// 101:45: -> ^( LEGEND_type_specifier struct_or_union identifier )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:101:48: ^( LEGEND_type_specifier struct_or_union identifier )
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
			if ( state.backtracking>0 ) { memoize(input, 10, type_specifier_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:103:1: struct_or_union : ( 'struct' | 'union' );
	public final astParser.struct_or_union_return struct_or_union() throws RecognitionException {
		astParser.struct_or_union_return retval = new astParser.struct_or_union_return();
		retval.start = input.LT(1);
		int struct_or_union_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set44=null;

		CommonTree set44_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:103:16: ( 'struct' | 'union' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 11, struct_or_union_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:107:1: plain_declaration : type_specifier declarator -> ^( LEGEND_plain_declaration type_specifier declarator ) ;
	public final astParser.plain_declaration_return plain_declaration() throws RecognitionException {
		astParser.plain_declaration_return retval = new astParser.plain_declaration_return();
		retval.start = input.LT(1);
		int plain_declaration_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope type_specifier45 =null;
		ParserRuleReturnScope declarator46 =null;

		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:107:18: ( type_specifier declarator -> ^( LEGEND_plain_declaration type_specifier declarator ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:107:20: type_specifier declarator
			{
			pushFollow(FOLLOW_type_specifier_in_plain_declaration747);
			type_specifier45=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier45.getTree());
			pushFollow(FOLLOW_declarator_in_plain_declaration749);
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
			// 107:46: -> ^( LEGEND_plain_declaration type_specifier declarator )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:107:49: ^( LEGEND_plain_declaration type_specifier declarator )
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
			if ( state.backtracking>0 ) { memoize(input, 12, plain_declaration_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:109:1: declarator : ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) );
	public final astParser.declarator_return declarator() throws RecognitionException {
		astParser.declarator_return retval = new astParser.declarator_return();
		retval.start = input.LT(1);
		int declarator_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:109:11: ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) )
			int alt15=2;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:109:13: plain_declarator '(' ( parameters )? ')'
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator771);
					plain_declarator47=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator47.getTree());
					char_literal48=(Token)match(input,71,FOLLOW_71_in_declarator773); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal48);

					// D:\\JAVA\\first\\src\\core\\ast.g:109:34: ( parameters )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==102||LA13_0==107||(LA13_0 >= 110 && LA13_0 <= 112)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:109:34: parameters
							{
							pushFollow(FOLLOW_parameters_in_declarator775);
							parameters49=parameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameters.add(parameters49.getTree());
							}
							break;

					}

					char_literal50=(Token)match(input,72,FOLLOW_72_in_declarator778); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal50);

					// AST REWRITE
					// elements: plain_declarator, parameters
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 109:50: -> ^( LEGEND_declarator plain_declarator ( parameters )? )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:109:53: ^( LEGEND_declarator plain_declarator ( parameters )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declarator, "LEGEND_declarator"), root_1);
						adaptor.addChild(root_1, stream_plain_declarator.nextTree());
						// D:\\JAVA\\first\\src\\core\\ast.g:109:90: ( parameters )?
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
					// D:\\JAVA\\first\\src\\core\\ast.g:110:6: plain_declarator ( '[' constant_expression ']' )*
					{
					pushFollow(FOLLOW_plain_declarator_in_declarator796);
					plain_declarator51=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator51.getTree());
					// D:\\JAVA\\first\\src\\core\\ast.g:110:23: ( '[' constant_expression ']' )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==97) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:110:24: '[' constant_expression ']'
							{
							char_literal52=(Token)match(input,97,FOLLOW_97_in_declarator799); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_97.add(char_literal52);

							pushFollow(FOLLOW_constant_expression_in_declarator801);
							constant_expression53=constant_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_constant_expression.add(constant_expression53.getTree());
							char_literal54=(Token)match(input,98,FOLLOW_98_in_declarator803); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_98.add(char_literal54);

							}
							break;

						default :
							break loop14;
						}
					}

					// AST REWRITE
					// elements: constant_expression, plain_declarator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 110:54: -> ^( LEGEND_declarator plain_declarator ( constant_expression )* )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:110:57: ^( LEGEND_declarator plain_declarator ( constant_expression )* )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_declarator, "LEGEND_declarator"), root_1);
						adaptor.addChild(root_1, stream_plain_declarator.nextTree());
						// D:\\JAVA\\first\\src\\core\\ast.g:110:94: ( constant_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 13, declarator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:112:1: plain_declarator : ( '*' )* identifier -> ^( LEGEND_plain_declarator ( '*' )* identifier ) ;
	public final astParser.plain_declarator_return plain_declarator() throws RecognitionException {
		astParser.plain_declarator_return retval = new astParser.plain_declarator_return();
		retval.start = input.LT(1);
		int plain_declarator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal55=null;
		ParserRuleReturnScope identifier56 =null;

		CommonTree char_literal55_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:112:17: ( ( '*' )* identifier -> ^( LEGEND_plain_declarator ( '*' )* identifier ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:112:19: ( '*' )* identifier
			{
			// D:\\JAVA\\first\\src\\core\\ast.g:112:19: ( '*' )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==73) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:112:19: '*'
					{
					char_literal55=(Token)match(input,73,FOLLOW_73_in_plain_declarator832); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_73.add(char_literal55);

					}
					break;

				default :
					break loop16;
				}
			}

			pushFollow(FOLLOW_identifier_in_plain_declarator835);
			identifier56=identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier56.getTree());
			// AST REWRITE
			// elements: 73, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 112:36: -> ^( LEGEND_plain_declarator ( '*' )* identifier )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:112:40: ^( LEGEND_plain_declarator ( '*' )* identifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_plain_declarator, "LEGEND_plain_declarator"), root_1);
				// D:\\JAVA\\first\\src\\core\\ast.g:112:66: ( '*' )*
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
			if ( state.backtracking>0 ) { memoize(input, 14, plain_declarator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:117:1: statement : ( expression_statement -> ^( LEGEND_statement expression_statement ) | compound_statement -> ^( LEGEND_statement compound_statement ) | selection_statement -> ^( LEGEND_statement selection_statement ) | iteration_statement -> ^( LEGEND_statement iteration_statement ) | jump_statement -> ^( LEGEND_statement jump_statement ) );
	public final astParser.statement_return statement() throws RecognitionException {
		astParser.statement_return retval = new astParser.statement_return();
		retval.start = input.LT(1);
		int statement_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:117:10: ( expression_statement -> ^( LEGEND_statement expression_statement ) | compound_statement -> ^( LEGEND_statement compound_statement ) | selection_statement -> ^( LEGEND_statement selection_statement ) | iteration_statement -> ^( LEGEND_statement iteration_statement ) | jump_statement -> ^( LEGEND_statement jump_statement ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:117:12: expression_statement
					{
					pushFollow(FOLLOW_expression_statement_in_statement864);
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
					// 117:33: -> ^( LEGEND_statement expression_statement )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:117:36: ^( LEGEND_statement expression_statement )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:118:13: compound_statement
					{
					pushFollow(FOLLOW_compound_statement_in_statement886);
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
					// 118:32: -> ^( LEGEND_statement compound_statement )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:118:35: ^( LEGEND_statement compound_statement )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:119:13: selection_statement
					{
					pushFollow(FOLLOW_selection_statement_in_statement908);
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
					// 119:33: -> ^( LEGEND_statement selection_statement )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:119:36: ^( LEGEND_statement selection_statement )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:120:13: iteration_statement
					{
					pushFollow(FOLLOW_iteration_statement_in_statement930);
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
					// 120:33: -> ^( LEGEND_statement iteration_statement )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:120:36: ^( LEGEND_statement iteration_statement )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:121:13: jump_statement
					{
					pushFollow(FOLLOW_jump_statement_in_statement953);
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
					// 121:28: -> ^( LEGEND_statement jump_statement )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:121:31: ^( LEGEND_statement jump_statement )
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
			if ( state.backtracking>0 ) { memoize(input, 15, statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:123:1: expression_statement : ( expression )? ';' -> ^( LEGEND_expression_statement ( expression )? ) ;
	public final astParser.expression_statement_return expression_statement() throws RecognitionException {
		astParser.expression_statement_return retval = new astParser.expression_statement_return();
		retval.start = input.LT(1);
		int expression_statement_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal63=null;
		ParserRuleReturnScope expression62 =null;

		CommonTree char_literal63_tree=null;
		RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:123:21: ( ( expression )? ';' -> ^( LEGEND_expression_statement ( expression )? ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:123:23: ( expression )? ';'
			{
			// D:\\JAVA\\first\\src\\core\\ast.g:123:23: ( expression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Dec||LA18_0==Hex||(LA18_0 >= Nice_character_constant && LA18_0 <= Oct)||LA18_0==64||LA18_0==69||LA18_0==71||LA18_0==73||(LA18_0 >= 75 && LA18_0 <= 76)||(LA18_0 >= 79 && LA18_0 <= 80)||LA18_0==109||LA18_0==119) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:123:23: expression
					{
					pushFollow(FOLLOW_expression_in_expression_statement973);
					expression62=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression62.getTree());
					}
					break;

			}

			char_literal63=(Token)match(input,86,FOLLOW_86_in_expression_statement976); if (state.failed) return retval; 
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
			// 123:39: -> ^( LEGEND_expression_statement ( expression )? )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:123:42: ^( LEGEND_expression_statement ( expression )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expression_statement, "LEGEND_expression_statement"), root_1);
				// D:\\JAVA\\first\\src\\core\\ast.g:123:72: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 16, expression_statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:125:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( LEGEND_compound_statement ( declaration )* ( statement )* ) ;
	public final astParser.compound_statement_return compound_statement() throws RecognitionException {
		astParser.compound_statement_return retval = new astParser.compound_statement_return();
		retval.start = input.LT(1);
		int compound_statement_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:125:19: ( '{' ( declaration )* ( statement )* '}' -> ^( LEGEND_compound_statement ( declaration )* ( statement )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:125:21: '{' ( declaration )* ( statement )* '}'
			{
			char_literal64=(Token)match(input,114,FOLLOW_114_in_compound_statement997); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_114.add(char_literal64);

			// D:\\JAVA\\first\\src\\core\\ast.g:125:25: ( declaration )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==102||LA19_0==107||(LA19_0 >= 110 && LA19_0 <= 112)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:125:25: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement999);
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

			// D:\\JAVA\\first\\src\\core\\ast.g:125:38: ( statement )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Dec||LA20_0==Hex||(LA20_0 >= Nice_character_constant && LA20_0 <= Oct)||LA20_0==64||LA20_0==69||LA20_0==71||LA20_0==73||(LA20_0 >= 75 && LA20_0 <= 76)||(LA20_0 >= 79 && LA20_0 <= 80)||LA20_0==86||LA20_0==101||LA20_0==103||(LA20_0 >= 105 && LA20_0 <= 106)||(LA20_0 >= 108 && LA20_0 <= 109)||(LA20_0 >= 113 && LA20_0 <= 114)||LA20_0==119) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:125:38: statement
					{
					pushFollow(FOLLOW_statement_in_compound_statement1002);
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

			char_literal67=(Token)match(input,118,FOLLOW_118_in_compound_statement1005); if (state.failed) return retval; 
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
			// 125:53: -> ^( LEGEND_compound_statement ( declaration )* ( statement )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:125:56: ^( LEGEND_compound_statement ( declaration )* ( statement )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_compound_statement, "LEGEND_compound_statement"), root_1);
				// D:\\JAVA\\first\\src\\core\\ast.g:125:84: ( declaration )*
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				// D:\\JAVA\\first\\src\\core\\ast.g:125:97: ( statement )*
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
			if ( state.backtracking>0 ) { memoize(input, 17, compound_statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:127:1: selection_statement : 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )? -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? ) ;
	public final astParser.selection_statement_return selection_statement() throws RecognitionException {
		astParser.selection_statement_return retval = new astParser.selection_statement_return();
		retval.start = input.LT(1);
		int selection_statement_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:127:20: ( 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )? -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:127:22: 'if' '(' e1= expression ')' e2= statement ( 'else' e3= statement )?
			{
			string_literal68=(Token)match(input,106,FOLLOW_106_in_selection_statement1029); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_106.add(string_literal68);

			char_literal69=(Token)match(input,71,FOLLOW_71_in_selection_statement1031); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_71.add(char_literal69);

			pushFollow(FOLLOW_expression_in_selection_statement1035);
			e1=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
			char_literal70=(Token)match(input,72,FOLLOW_72_in_selection_statement1037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_72.add(char_literal70);

			pushFollow(FOLLOW_statement_in_selection_statement1041);
			e2=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_statement.add(e2.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:127:62: ( 'else' e3= statement )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==104) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred29_ast()) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:127:63: 'else' e3= statement
					{
					string_literal71=(Token)match(input,104,FOLLOW_104_in_selection_statement1044); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_104.add(string_literal71);

					pushFollow(FOLLOW_statement_in_selection_statement1048);
					e3=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(e3.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: 106, e1, e2, e3
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
			// 127:85: -> ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:127:88: ^( LEGEND_selection_statement 'if' $e1 $e2 ( $e3)? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_selection_statement, "LEGEND_selection_statement"), root_1);
				adaptor.addChild(root_1, stream_106.nextNode());
				adaptor.addChild(root_1, stream_e1.nextTree());
				adaptor.addChild(root_1, stream_e2.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:127:132: ( $e3)?
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
			if ( state.backtracking>0 ) { memoize(input, 18, selection_statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:129:1: iteration_statement : ( 'while' '(' e1= expression ')' e2= statement -> ^( LEGEND_iteration_statement 'while' $e1 $e2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4) );
	public final astParser.iteration_statement_return iteration_statement() throws RecognitionException {
		astParser.iteration_statement_return retval = new astParser.iteration_statement_return();
		retval.start = input.LT(1);
		int iteration_statement_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:129:20: ( 'while' '(' e1= expression ')' e2= statement -> ^( LEGEND_iteration_statement 'while' $e1 $e2) | 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:129:22: 'while' '(' e1= expression ')' e2= statement
					{
					string_literal72=(Token)match(input,113,FOLLOW_113_in_iteration_statement1081); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_113.add(string_literal72);

					char_literal73=(Token)match(input,71,FOLLOW_71_in_iteration_statement1083); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal73);

					pushFollow(FOLLOW_expression_in_iteration_statement1087);
					e1=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
					char_literal74=(Token)match(input,72,FOLLOW_72_in_iteration_statement1089); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal74);

					pushFollow(FOLLOW_statement_in_iteration_statement1093);
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
					// 129:65: -> ^( LEGEND_iteration_statement 'while' $e1 $e2)
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:129:68: ^( LEGEND_iteration_statement 'while' $e1 $e2)
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
					// D:\\JAVA\\first\\src\\core\\ast.g:130:23: 'for' '(' (e1= expression )? ';' (e2= expression )? ';' (e3= expression )? ')' e4= statement
					{
					string_literal75=(Token)match(input,105,FOLLOW_105_in_iteration_statement1131); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_105.add(string_literal75);

					char_literal76=(Token)match(input,71,FOLLOW_71_in_iteration_statement1133); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal76);

					// D:\\JAVA\\first\\src\\core\\ast.g:130:35: (e1= expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Dec||LA22_0==Hex||(LA22_0 >= Nice_character_constant && LA22_0 <= Oct)||LA22_0==64||LA22_0==69||LA22_0==71||LA22_0==73||(LA22_0 >= 75 && LA22_0 <= 76)||(LA22_0 >= 79 && LA22_0 <= 80)||LA22_0==109||LA22_0==119) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:130:35: e1= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1137);
							e1=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
							}
							break;

					}

					char_literal77=(Token)match(input,86,FOLLOW_86_in_iteration_statement1140); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal77);

					// D:\\JAVA\\first\\src\\core\\ast.g:130:54: (e2= expression )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Dec||LA23_0==Hex||(LA23_0 >= Nice_character_constant && LA23_0 <= Oct)||LA23_0==64||LA23_0==69||LA23_0==71||LA23_0==73||(LA23_0 >= 75 && LA23_0 <= 76)||(LA23_0 >= 79 && LA23_0 <= 80)||LA23_0==109||LA23_0==119) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:130:54: e2= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1144);
							e2=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e2.getTree());
							}
							break;

					}

					char_literal78=(Token)match(input,86,FOLLOW_86_in_iteration_statement1147); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_86.add(char_literal78);

					// D:\\JAVA\\first\\src\\core\\ast.g:130:73: (e3= expression )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Dec||LA24_0==Hex||(LA24_0 >= Nice_character_constant && LA24_0 <= Oct)||LA24_0==64||LA24_0==69||LA24_0==71||LA24_0==73||(LA24_0 >= 75 && LA24_0 <= 76)||(LA24_0 >= 79 && LA24_0 <= 80)||LA24_0==109||LA24_0==119) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:130:73: e3= expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement1151);
							e3=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e3.getTree());
							}
							break;

					}

					char_literal79=(Token)match(input,72,FOLLOW_72_in_iteration_statement1154); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal79);

					pushFollow(FOLLOW_statement_in_iteration_statement1158);
					e4=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(e4.getTree());
					// AST REWRITE
					// elements: 105, e3, e4, e2, e1
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
					// 130:103: -> ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4)
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:130:106: ^( LEGEND_iteration_statement 'for' ^( LEGEND_expr1 ( $e1)? ) ^( LEGEND_expr2 ( $e2)? ) ^( LEGEND_expr3 ( $e3)? ) $e4)
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_iteration_statement, "LEGEND_iteration_statement"), root_1);
						adaptor.addChild(root_1, stream_105.nextNode());
						// D:\\JAVA\\first\\src\\core\\ast.g:130:141: ^( LEGEND_expr1 ( $e1)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr1, "LEGEND_expr1"), root_2);
						// D:\\JAVA\\first\\src\\core\\ast.g:130:157: ( $e1)?
						if ( stream_e1.hasNext() ) {
							adaptor.addChild(root_2, stream_e1.nextTree());
						}
						stream_e1.reset();

						adaptor.addChild(root_1, root_2);
						}

						// D:\\JAVA\\first\\src\\core\\ast.g:130:162: ^( LEGEND_expr2 ( $e2)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr2, "LEGEND_expr2"), root_2);
						// D:\\JAVA\\first\\src\\core\\ast.g:130:178: ( $e2)?
						if ( stream_e2.hasNext() ) {
							adaptor.addChild(root_2, stream_e2.nextTree());
						}
						stream_e2.reset();

						adaptor.addChild(root_1, root_2);
						}

						// D:\\JAVA\\first\\src\\core\\ast.g:130:183: ^( LEGEND_expr3 ( $e3)? )
						{
						CommonTree root_2 = (CommonTree)adaptor.nil();
						root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expr3, "LEGEND_expr3"), root_2);
						// D:\\JAVA\\first\\src\\core\\ast.g:130:199: ( $e3)?
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
			if ( state.backtracking>0 ) { memoize(input, 19, iteration_statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:132:1: jump_statement : ( 'continue' ';' -> ^( LEGEND_jump_statement 'continue' ) | 'break' ';' -> ^( LEGEND_jump_statement 'break' ) | 'return' ( expression )? ';' -> ^( LEGEND_jump_statement 'return' ( expression )? ) );
	public final astParser.jump_statement_return jump_statement() throws RecognitionException {
		astParser.jump_statement_return retval = new astParser.jump_statement_return();
		retval.start = input.LT(1);
		int jump_statement_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:132:15: ( 'continue' ';' -> ^( LEGEND_jump_statement 'continue' ) | 'break' ';' -> ^( LEGEND_jump_statement 'break' ) | 'return' ( expression )? ';' -> ^( LEGEND_jump_statement 'return' ( expression )? ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:132:17: 'continue' ';'
					{
					string_literal80=(Token)match(input,103,FOLLOW_103_in_jump_statement1205); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_103.add(string_literal80);

					char_literal81=(Token)match(input,86,FOLLOW_86_in_jump_statement1207); if (state.failed) return retval; 
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
					// 132:32: -> ^( LEGEND_jump_statement 'continue' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:132:35: ^( LEGEND_jump_statement 'continue' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:133:18: 'break' ';'
					{
					string_literal82=(Token)match(input,101,FOLLOW_101_in_jump_statement1234); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_101.add(string_literal82);

					char_literal83=(Token)match(input,86,FOLLOW_86_in_jump_statement1236); if (state.failed) return retval; 
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
					// 133:30: -> ^( LEGEND_jump_statement 'break' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:133:33: ^( LEGEND_jump_statement 'break' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:134:18: 'return' ( expression )? ';'
					{
					string_literal84=(Token)match(input,108,FOLLOW_108_in_jump_statement1263); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_108.add(string_literal84);

					// D:\\JAVA\\first\\src\\core\\ast.g:134:27: ( expression )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Dec||LA26_0==Hex||(LA26_0 >= Nice_character_constant && LA26_0 <= Oct)||LA26_0==64||LA26_0==69||LA26_0==71||LA26_0==73||(LA26_0 >= 75 && LA26_0 <= 76)||(LA26_0 >= 79 && LA26_0 <= 80)||LA26_0==109||LA26_0==119) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:134:27: expression
							{
							pushFollow(FOLLOW_expression_in_jump_statement1265);
							expression85=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
							}
							break;

					}

					char_literal86=(Token)match(input,86,FOLLOW_86_in_jump_statement1268); if (state.failed) return retval; 
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
					// 134:43: -> ^( LEGEND_jump_statement 'return' ( expression )? )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:134:46: ^( LEGEND_jump_statement 'return' ( expression )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_jump_statement, "LEGEND_jump_statement"), root_1);
						adaptor.addChild(root_1, stream_108.nextNode());
						// D:\\JAVA\\first\\src\\core\\ast.g:134:79: ( expression )?
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
			if ( state.backtracking>0 ) { memoize(input, 20, jump_statement_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:136:1: expression : assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_expression assignment_expression ( assignment_expression )* ) ;
	public final astParser.expression_return expression() throws RecognitionException {
		astParser.expression_return retval = new astParser.expression_return();
		retval.start = input.LT(1);
		int expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal88=null;
		ParserRuleReturnScope assignment_expression87 =null;
		ParserRuleReturnScope assignment_expression89 =null;

		CommonTree char_literal88_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:136:11: ( assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_expression assignment_expression ( assignment_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:136:13: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_expression1290);
			assignment_expression87=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression87.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:136:35: ( ',' assignment_expression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==78) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:136:36: ',' assignment_expression
					{
					char_literal88=(Token)match(input,78,FOLLOW_78_in_expression1293); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal88);

					pushFollow(FOLLOW_assignment_expression_in_expression1295);
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
			// 136:64: -> ^( LEGEND_expression assignment_expression ( assignment_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:136:67: ^( LEGEND_expression assignment_expression ( assignment_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_expression, "LEGEND_expression"), root_1);
				adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:136:109: ( assignment_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 21, expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:138:1: assignment_expression : ( unary_expression assignment_operator assignment_expression -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression ) | logical_or_expression -> ^( LEGEND_assignment_expression logical_or_expression ) );
	public final astParser.assignment_expression_return assignment_expression() throws RecognitionException {
		astParser.assignment_expression_return retval = new astParser.assignment_expression_return();
		retval.start = input.LT(1);
		int assignment_expression_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:138:22: ( unary_expression assignment_operator assignment_expression -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression ) | logical_or_expression -> ^( LEGEND_assignment_expression logical_or_expression ) )
			int alt29=2;
			switch ( input.LA(1) ) {
			case Nice_identifier:
				{
				int LA29_1 = input.LA(2);
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
				if ( (synpred38_ast()) ) {
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
					// D:\\JAVA\\first\\src\\core\\ast.g:139:23: unary_expression assignment_operator assignment_expression
					{
					pushFollow(FOLLOW_unary_expression_in_assignment_expression1346);
					unary_expression90=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression90.getTree());
					pushFollow(FOLLOW_assignment_operator_in_assignment_expression1348);
					assignment_operator91=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_operator.add(assignment_operator91.getTree());
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression1350);
					assignment_expression92=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression92.getTree());
					// AST REWRITE
					// elements: unary_expression, assignment_operator, assignment_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 139:82: -> ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:139:85: ^( LEGEND_assignment_expression unary_expression assignment_operator assignment_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:140:25: logical_or_expression
					{
					pushFollow(FOLLOW_logical_or_expression_in_assignment_expression1388);
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
					// 140:47: -> ^( LEGEND_assignment_expression logical_or_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:140:50: ^( LEGEND_assignment_expression logical_or_expression )
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
			if ( state.backtracking>0 ) { memoize(input, 22, assignment_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:143:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final astParser.assignment_operator_return assignment_operator() throws RecognitionException {
		astParser.assignment_operator_return retval = new astParser.assignment_operator_return();
		retval.start = input.LT(1);
		int assignment_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set94=null;

		CommonTree set94_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:143:20: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 23, assignment_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:145:1: constant_expression : a1= logical_or_expression -> ^( LEGEND_constant_expression $a1) ;
	public final astParser.constant_expression_return constant_expression() throws RecognitionException {
		astParser.constant_expression_return retval = new astParser.constant_expression_return();
		retval.start = input.LT(1);
		int constant_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope a1 =null;

		RewriteRuleSubtreeStream stream_logical_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:145:21: (a1= logical_or_expression -> ^( LEGEND_constant_expression $a1) )
			// D:\\JAVA\\first\\src\\core\\ast.g:146:2: a1= logical_or_expression
			{
			pushFollow(FOLLOW_logical_or_expression_in_constant_expression1483);
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
			// 146:28: -> ^( LEGEND_constant_expression $a1)
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:146:32: ^( LEGEND_constant_expression $a1)
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
			if ( state.backtracking>0 ) { memoize(input, 24, constant_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:148:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* -> ^( LEGEND_logical_or_expression logical_and_expression ( '||' logical_and_expression )* ) ;
	public final astParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		astParser.logical_or_expression_return retval = new astParser.logical_or_expression_return();
		retval.start = input.LT(1);
		int logical_or_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal96=null;
		ParserRuleReturnScope logical_and_expression95 =null;
		ParserRuleReturnScope logical_and_expression97 =null;

		CommonTree string_literal96_tree=null;
		RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
		RewriteRuleSubtreeStream stream_logical_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule logical_and_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:148:23: ( logical_and_expression ( '||' logical_and_expression )* -> ^( LEGEND_logical_or_expression logical_and_expression ( '||' logical_and_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:149:2: logical_and_expression ( '||' logical_and_expression )*
			{
			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1506);
			logical_and_expression95=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_and_expression.add(logical_and_expression95.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:149:25: ( '||' logical_and_expression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==117) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:149:26: '||' logical_and_expression
					{
					string_literal96=(Token)match(input,117,FOLLOW_117_in_logical_or_expression1509); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_117.add(string_literal96);

					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1511);
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
			// elements: logical_and_expression, 117, logical_and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 149:57: -> ^( LEGEND_logical_or_expression logical_and_expression ( '||' logical_and_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:149:61: ^( LEGEND_logical_or_expression logical_and_expression ( '||' logical_and_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_logical_or_expression, "LEGEND_logical_or_expression"), root_1);
				adaptor.addChild(root_1, stream_logical_and_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:149:115: ( '||' logical_and_expression )*
				while ( stream_logical_and_expression.hasNext()||stream_117.hasNext() ) {
					adaptor.addChild(root_1, stream_117.nextNode());
					adaptor.addChild(root_1, stream_logical_and_expression.nextTree());
				}
				stream_logical_and_expression.reset();
				stream_117.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 25, logical_or_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:151:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( LEGEND_logical_and_expression inclusive_or_expression ( '&&' inclusive_or_expression )* ) ;
	public final astParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		astParser.logical_and_expression_return retval = new astParser.logical_and_expression_return();
		retval.start = input.LT(1);
		int logical_and_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token string_literal99=null;
		ParserRuleReturnScope inclusive_or_expression98 =null;
		ParserRuleReturnScope inclusive_or_expression100 =null;

		CommonTree string_literal99_tree=null;
		RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
		RewriteRuleSubtreeStream stream_inclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule inclusive_or_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:151:24: ( inclusive_or_expression ( '&&' inclusive_or_expression )* -> ^( LEGEND_logical_and_expression inclusive_or_expression ( '&&' inclusive_or_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:152:2: inclusive_or_expression ( '&&' inclusive_or_expression )*
			{
			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1540);
			inclusive_or_expression98=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_inclusive_or_expression.add(inclusive_or_expression98.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:152:26: ( '&&' inclusive_or_expression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==68) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:152:27: '&&' inclusive_or_expression
					{
					string_literal99=(Token)match(input,68,FOLLOW_68_in_logical_and_expression1543); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_68.add(string_literal99);

					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1545);
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
			// elements: 68, inclusive_or_expression, inclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 152:59: -> ^( LEGEND_logical_and_expression inclusive_or_expression ( '&&' inclusive_or_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:152:63: ^( LEGEND_logical_and_expression inclusive_or_expression ( '&&' inclusive_or_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_logical_and_expression, "LEGEND_logical_and_expression"), root_1);
				adaptor.addChild(root_1, stream_inclusive_or_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:152:119: ( '&&' inclusive_or_expression )*
				while ( stream_68.hasNext()||stream_inclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_68.nextNode());
					adaptor.addChild(root_1, stream_inclusive_or_expression.nextTree());
				}
				stream_68.reset();
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
			if ( state.backtracking>0 ) { memoize(input, 26, logical_and_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:154:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( LEGEND_inclusive_or_expression exclusive_or_expression ( '|' exclusive_or_expression )* ) ;
	public final astParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		astParser.inclusive_or_expression_return retval = new astParser.inclusive_or_expression_return();
		retval.start = input.LT(1);
		int inclusive_or_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal102=null;
		ParserRuleReturnScope exclusive_or_expression101 =null;
		ParserRuleReturnScope exclusive_or_expression103 =null;

		CommonTree char_literal102_tree=null;
		RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
		RewriteRuleSubtreeStream stream_exclusive_or_expression=new RewriteRuleSubtreeStream(adaptor,"rule exclusive_or_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:154:25: ( exclusive_or_expression ( '|' exclusive_or_expression )* -> ^( LEGEND_inclusive_or_expression exclusive_or_expression ( '|' exclusive_or_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:155:2: exclusive_or_expression ( '|' exclusive_or_expression )*
			{
			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1576);
			exclusive_or_expression101=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_exclusive_or_expression.add(exclusive_or_expression101.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:155:26: ( '|' exclusive_or_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==115) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:155:27: '|' exclusive_or_expression
					{
					char_literal102=(Token)match(input,115,FOLLOW_115_in_inclusive_or_expression1579); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_115.add(char_literal102);

					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1581);
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
			// elements: 115, exclusive_or_expression, exclusive_or_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 155:58: -> ^( LEGEND_inclusive_or_expression exclusive_or_expression ( '|' exclusive_or_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:155:62: ^( LEGEND_inclusive_or_expression exclusive_or_expression ( '|' exclusive_or_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_inclusive_or_expression, "LEGEND_inclusive_or_expression"), root_1);
				adaptor.addChild(root_1, stream_exclusive_or_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:155:119: ( '|' exclusive_or_expression )*
				while ( stream_115.hasNext()||stream_exclusive_or_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_115.nextNode());
					adaptor.addChild(root_1, stream_exclusive_or_expression.nextTree());
				}
				stream_115.reset();
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
			if ( state.backtracking>0 ) { memoize(input, 27, inclusive_or_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:157:1: exclusive_or_expression : and_expression ( '^' and_expression )* -> ^( LEGEND_exclusive_or_expression and_expression ( '^' and_expression )* ) ;
	public final astParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		astParser.exclusive_or_expression_return retval = new astParser.exclusive_or_expression_return();
		retval.start = input.LT(1);
		int exclusive_or_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal105=null;
		ParserRuleReturnScope and_expression104 =null;
		ParserRuleReturnScope and_expression106 =null;

		CommonTree char_literal105_tree=null;
		RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
		RewriteRuleSubtreeStream stream_and_expression=new RewriteRuleSubtreeStream(adaptor,"rule and_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:157:25: ( and_expression ( '^' and_expression )* -> ^( LEGEND_exclusive_or_expression and_expression ( '^' and_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:158:2: and_expression ( '^' and_expression )*
			{
			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1612);
			and_expression104=and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_and_expression.add(and_expression104.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:158:17: ( '^' and_expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==99) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:158:18: '^' and_expression
					{
					char_literal105=(Token)match(input,99,FOLLOW_99_in_exclusive_or_expression1615); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_99.add(char_literal105);

					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1617);
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
			// elements: 99, and_expression, and_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 158:40: -> ^( LEGEND_exclusive_or_expression and_expression ( '^' and_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:158:44: ^( LEGEND_exclusive_or_expression and_expression ( '^' and_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_exclusive_or_expression, "LEGEND_exclusive_or_expression"), root_1);
				adaptor.addChild(root_1, stream_and_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:158:92: ( '^' and_expression )*
				while ( stream_99.hasNext()||stream_and_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_99.nextNode());
					adaptor.addChild(root_1, stream_and_expression.nextTree());
				}
				stream_99.reset();
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
			if ( state.backtracking>0 ) { memoize(input, 28, exclusive_or_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:160:1: and_expression : equality_expression ( '&' equality_expression )* -> ^( LEGEND_and_expression equality_expression ( '&' equality_expression )* ) ;
	public final astParser.and_expression_return and_expression() throws RecognitionException {
		astParser.and_expression_return retval = new astParser.and_expression_return();
		retval.start = input.LT(1);
		int and_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal108=null;
		ParserRuleReturnScope equality_expression107 =null;
		ParserRuleReturnScope equality_expression109 =null;

		CommonTree char_literal108_tree=null;
		RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
		RewriteRuleSubtreeStream stream_equality_expression=new RewriteRuleSubtreeStream(adaptor,"rule equality_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:160:16: ( equality_expression ( '&' equality_expression )* -> ^( LEGEND_and_expression equality_expression ( '&' equality_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:161:2: equality_expression ( '&' equality_expression )*
			{
			pushFollow(FOLLOW_equality_expression_in_and_expression1648);
			equality_expression107=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality_expression.add(equality_expression107.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:161:22: ( '&' equality_expression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==69) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:161:23: '&' equality_expression
					{
					char_literal108=(Token)match(input,69,FOLLOW_69_in_and_expression1651); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_69.add(char_literal108);

					pushFollow(FOLLOW_equality_expression_in_and_expression1653);
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
			// elements: 69, equality_expression, equality_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 161:50: -> ^( LEGEND_and_expression equality_expression ( '&' equality_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:161:54: ^( LEGEND_and_expression equality_expression ( '&' equality_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_and_expression, "LEGEND_and_expression"), root_1);
				adaptor.addChild(root_1, stream_equality_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:161:98: ( '&' equality_expression )*
				while ( stream_69.hasNext()||stream_equality_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_69.nextNode());
					adaptor.addChild(root_1, stream_equality_expression.nextTree());
				}
				stream_69.reset();
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
			if ( state.backtracking>0 ) { memoize(input, 29, and_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:163:1: equality_expression : relational_expression ( equality_operator relational_expression )* -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* ) ;
	public final astParser.equality_expression_return equality_expression() throws RecognitionException {
		astParser.equality_expression_return retval = new astParser.equality_expression_return();
		retval.start = input.LT(1);
		int equality_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope relational_expression110 =null;
		ParserRuleReturnScope equality_operator111 =null;
		ParserRuleReturnScope relational_expression112 =null;

		RewriteRuleSubtreeStream stream_equality_operator=new RewriteRuleSubtreeStream(adaptor,"rule equality_operator");
		RewriteRuleSubtreeStream stream_relational_expression=new RewriteRuleSubtreeStream(adaptor,"rule relational_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:163:21: ( relational_expression ( equality_operator relational_expression )* -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:164:2: relational_expression ( equality_operator relational_expression )*
			{
			pushFollow(FOLLOW_relational_expression_in_equality_expression1684);
			relational_expression110=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational_expression.add(relational_expression110.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:164:24: ( equality_operator relational_expression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==65||LA35_0==92) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:164:25: equality_operator relational_expression
					{
					pushFollow(FOLLOW_equality_operator_in_equality_expression1687);
					equality_operator111=equality_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality_operator.add(equality_operator111.getTree());
					pushFollow(FOLLOW_relational_expression_in_equality_expression1689);
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
			// elements: relational_expression, equality_operator, relational_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 164:68: -> ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:164:72: ^( LEGEND_equality_expression relational_expression ( equality_operator relational_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_equality_expression, "LEGEND_equality_expression"), root_1);
				adaptor.addChild(root_1, stream_relational_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:164:123: ( equality_operator relational_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 30, equality_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:166:1: equality_operator : ( '==' | '!=' );
	public final astParser.equality_operator_return equality_operator() throws RecognitionException {
		astParser.equality_operator_return retval = new astParser.equality_operator_return();
		retval.start = input.LT(1);
		int equality_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set113=null;

		CommonTree set113_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:166:19: ( '==' | '!=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 31, equality_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:170:1: relational_expression : shift_expression ( relational_operator shift_expression )* -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* ) ;
	public final astParser.relational_expression_return relational_expression() throws RecognitionException {
		astParser.relational_expression_return retval = new astParser.relational_expression_return();
		retval.start = input.LT(1);
		int relational_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope shift_expression114 =null;
		ParserRuleReturnScope relational_operator115 =null;
		ParserRuleReturnScope shift_expression116 =null;

		RewriteRuleSubtreeStream stream_shift_expression=new RewriteRuleSubtreeStream(adaptor,"rule shift_expression");
		RewriteRuleSubtreeStream stream_relational_operator=new RewriteRuleSubtreeStream(adaptor,"rule relational_operator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:170:23: ( shift_expression ( relational_operator shift_expression )* -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:171:2: shift_expression ( relational_operator shift_expression )*
			{
			pushFollow(FOLLOW_shift_expression_in_relational_expression1735);
			shift_expression114=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_shift_expression.add(shift_expression114.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:171:19: ( relational_operator shift_expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==87||LA36_0==90||(LA36_0 >= 93 && LA36_0 <= 94)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:171:20: relational_operator shift_expression
					{
					pushFollow(FOLLOW_relational_operator_in_relational_expression1738);
					relational_operator115=relational_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational_operator.add(relational_operator115.getTree());
					pushFollow(FOLLOW_shift_expression_in_relational_expression1740);
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
			// elements: shift_expression, relational_operator, shift_expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 171:60: -> ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:171:64: ^( LEGEND_relational_expression shift_expression ( relational_operator shift_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_relational_expression, "LEGEND_relational_expression"), root_1);
				adaptor.addChild(root_1, stream_shift_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:171:112: ( relational_operator shift_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 32, relational_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:173:1: relational_operator : ( '<' | '>' | '<=' | '>=' );
	public final astParser.relational_operator_return relational_operator() throws RecognitionException {
		astParser.relational_operator_return retval = new astParser.relational_operator_return();
		retval.start = input.LT(1);
		int relational_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set117=null;

		CommonTree set117_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:173:21: ( '<' | '>' | '<=' | '>=' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 33, relational_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:179:1: shift_expression : additive_expression ( shift_operator additive_expression )* -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* ) ;
	public final astParser.shift_expression_return shift_expression() throws RecognitionException {
		astParser.shift_expression_return retval = new astParser.shift_expression_return();
		retval.start = input.LT(1);
		int shift_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope additive_expression118 =null;
		ParserRuleReturnScope shift_operator119 =null;
		ParserRuleReturnScope additive_expression120 =null;

		RewriteRuleSubtreeStream stream_additive_expression=new RewriteRuleSubtreeStream(adaptor,"rule additive_expression");
		RewriteRuleSubtreeStream stream_shift_operator=new RewriteRuleSubtreeStream(adaptor,"rule shift_operator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:179:18: ( additive_expression ( shift_operator additive_expression )* -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:180:2: additive_expression ( shift_operator additive_expression )*
			{
			pushFollow(FOLLOW_additive_expression_in_shift_expression1797);
			additive_expression118=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive_expression.add(additive_expression118.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:180:22: ( shift_operator additive_expression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==88||LA37_0==95) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:180:23: shift_operator additive_expression
					{
					pushFollow(FOLLOW_shift_operator_in_shift_expression1800);
					shift_operator119=shift_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_shift_operator.add(shift_operator119.getTree());
					pushFollow(FOLLOW_additive_expression_in_shift_expression1802);
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
			// 180:61: -> ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:180:65: ^( LEGEND_shift_expression additive_expression ( shift_operator additive_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_shift_expression, "LEGEND_shift_expression"), root_1);
				adaptor.addChild(root_1, stream_additive_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:180:111: ( shift_operator additive_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 34, shift_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:182:1: shift_operator : ( '<<' | '>>' );
	public final astParser.shift_operator_return shift_operator() throws RecognitionException {
		astParser.shift_operator_return retval = new astParser.shift_operator_return();
		retval.start = input.LT(1);
		int shift_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set121=null;

		CommonTree set121_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:182:16: ( '<<' | '>>' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 35, shift_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:186:1: additive_expression : multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) ;
	public final astParser.additive_expression_return additive_expression() throws RecognitionException {
		astParser.additive_expression_return retval = new astParser.additive_expression_return();
		retval.start = input.LT(1);
		int additive_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope multiplicative_expression122 =null;
		ParserRuleReturnScope additive_operator123 =null;
		ParserRuleReturnScope multiplicative_expression124 =null;

		RewriteRuleSubtreeStream stream_additive_operator=new RewriteRuleSubtreeStream(adaptor,"rule additive_operator");
		RewriteRuleSubtreeStream stream_multiplicative_expression=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:186:21: ( multiplicative_expression ( additive_operator multiplicative_expression )* -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:187:2: multiplicative_expression ( additive_operator multiplicative_expression )*
			{
			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1849);
			multiplicative_expression122=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative_expression.add(multiplicative_expression122.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:187:28: ( additive_operator multiplicative_expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==75||LA38_0==79) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:187:29: additive_operator multiplicative_expression
					{
					pushFollow(FOLLOW_additive_operator_in_additive_expression1852);
					additive_operator123=additive_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive_operator.add(additive_operator123.getTree());
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1854);
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
			// 187:76: -> ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:187:80: ^( LEGEND_additive_expression multiplicative_expression ( additive_operator multiplicative_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_additive_expression, "LEGEND_additive_expression"), root_1);
				adaptor.addChild(root_1, stream_multiplicative_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:187:135: ( additive_operator multiplicative_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 36, additive_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:189:1: additive_operator : ( '+' | '-' );
	public final astParser.additive_operator_return additive_operator() throws RecognitionException {
		astParser.additive_operator_return retval = new astParser.additive_operator_return();
		retval.start = input.LT(1);
		int additive_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set125=null;

		CommonTree set125_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:189:19: ( '+' | '-' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 37, additive_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:193:1: multiplicative_expression : cast_expression ( multiplicative_operator cast_expression )* -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) ;
	public final astParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		astParser.multiplicative_expression_return retval = new astParser.multiplicative_expression_return();
		retval.start = input.LT(1);
		int multiplicative_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope cast_expression126 =null;
		ParserRuleReturnScope multiplicative_operator127 =null;
		ParserRuleReturnScope cast_expression128 =null;

		RewriteRuleSubtreeStream stream_cast_expression=new RewriteRuleSubtreeStream(adaptor,"rule cast_expression");
		RewriteRuleSubtreeStream stream_multiplicative_operator=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative_operator");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:193:27: ( cast_expression ( multiplicative_operator cast_expression )* -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:194:2: cast_expression ( multiplicative_operator cast_expression )*
			{
			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1902);
			cast_expression126=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression126.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:194:18: ( multiplicative_operator cast_expression )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==66||LA39_0==73||LA39_0==84) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:194:19: multiplicative_operator cast_expression
					{
					pushFollow(FOLLOW_multiplicative_operator_in_multiplicative_expression1905);
					multiplicative_operator127=multiplicative_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative_operator.add(multiplicative_operator127.getTree());
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1907);
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
			// elements: cast_expression, cast_expression, multiplicative_operator
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 194:62: -> ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:194:66: ^( LEGEND_multiplicative_expression cast_expression ( multiplicative_operator cast_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_multiplicative_expression, "LEGEND_multiplicative_expression"), root_1);
				adaptor.addChild(root_1, stream_cast_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:194:117: ( multiplicative_operator cast_expression )*
				while ( stream_cast_expression.hasNext()||stream_multiplicative_operator.hasNext() ) {
					adaptor.addChild(root_1, stream_multiplicative_operator.nextTree());
					adaptor.addChild(root_1, stream_cast_expression.nextTree());
				}
				stream_cast_expression.reset();
				stream_multiplicative_operator.reset();

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
			if ( state.backtracking>0 ) { memoize(input, 38, multiplicative_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:196:1: multiplicative_operator : ( '*' | '/' | '%' );
	public final astParser.multiplicative_operator_return multiplicative_operator() throws RecognitionException {
		astParser.multiplicative_operator_return retval = new astParser.multiplicative_operator_return();
		retval.start = input.LT(1);
		int multiplicative_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set129=null;

		CommonTree set129_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:196:25: ( '*' | '/' | '%' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 39, multiplicative_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:201:1: cast_expression : ( unary_expression -> ^( LEGEND_cast_expression unary_expression ) | '(' type_name ')' cast_expression -> ^( LEGEND_cast_expression type_name cast_expression ) );
	public final astParser.cast_expression_return cast_expression() throws RecognitionException {
		astParser.cast_expression_return retval = new astParser.cast_expression_return();
		retval.start = input.LT(1);
		int cast_expression_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:201:16: ( unary_expression -> ^( LEGEND_cast_expression unary_expression ) | '(' type_name ')' cast_expression -> ^( LEGEND_cast_expression type_name cast_expression ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:201:18: unary_expression
					{
					pushFollow(FOLLOW_unary_expression_in_cast_expression1958);
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
					// 201:35: -> ^( LEGEND_cast_expression unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:201:38: ^( LEGEND_cast_expression unary_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:202:19: '(' type_name ')' cast_expression
					{
					char_literal131=(Token)match(input,71,FOLLOW_71_in_cast_expression1986); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal131);

					pushFollow(FOLLOW_type_name_in_cast_expression1988);
					type_name132=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name132.getTree());
					char_literal133=(Token)match(input,72,FOLLOW_72_in_cast_expression1990); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_72.add(char_literal133);

					pushFollow(FOLLOW_cast_expression_in_cast_expression1992);
					cast_expression134=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression134.getTree());
					// AST REWRITE
					// elements: type_name, cast_expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 202:53: -> ^( LEGEND_cast_expression type_name cast_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:202:56: ^( LEGEND_cast_expression type_name cast_expression )
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
			if ( state.backtracking>0 ) { memoize(input, 40, cast_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:204:1: type_name : type_specifier ( '*' )* -> ^( LEGEND_type_name type_specifier ( '*' )* ) ;
	public final astParser.type_name_return type_name() throws RecognitionException {
		astParser.type_name_return retval = new astParser.type_name_return();
		retval.start = input.LT(1);
		int type_name_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal136=null;
		ParserRuleReturnScope type_specifier135 =null;

		CommonTree char_literal136_tree=null;
		RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:204:10: ( type_specifier ( '*' )* -> ^( LEGEND_type_name type_specifier ( '*' )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:204:12: type_specifier ( '*' )*
			{
			pushFollow(FOLLOW_type_specifier_in_type_name2014);
			type_specifier135=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier135.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:204:27: ( '*' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==73) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:204:27: '*'
					{
					char_literal136=(Token)match(input,73,FOLLOW_73_in_type_name2016); if (state.failed) return retval; 
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
			// 204:32: -> ^( LEGEND_type_name type_specifier ( '*' )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:204:35: ^( LEGEND_type_name type_specifier ( '*' )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_type_name, "LEGEND_type_name"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:204:69: ( '*' )*
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
			if ( state.backtracking>0 ) { memoize(input, 41, type_name_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:206:1: unary_expression : ( postfix_expression -> ^( LEGEND_unary_expression postfix_expression ) | '++' unary_expression -> ^( LEGEND_unary_expression '++' unary_expression ) | '--' unary_expression -> ^( LEGEND_unary_expression '--' unary_expression ) | unary_operator cast_expression -> ^( LEGEND_unary_expression unary_operator cast_expression ) | 'sizeof' unary_expression -> ^( LEGEND_unary_expression 'sizeof' unary_expression ) | 'sizeof' '(' type_name ')' -> ^( LEGEND_unary_expression 'sizeof' type_name ) );
	public final astParser.unary_expression_return unary_expression() throws RecognitionException {
		astParser.unary_expression_return retval = new astParser.unary_expression_return();
		retval.start = input.LT(1);
		int unary_expression_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:206:17: ( postfix_expression -> ^( LEGEND_unary_expression postfix_expression ) | '++' unary_expression -> ^( LEGEND_unary_expression '++' unary_expression ) | '--' unary_expression -> ^( LEGEND_unary_expression '--' unary_expression ) | unary_operator cast_expression -> ^( LEGEND_unary_expression unary_operator cast_expression ) | 'sizeof' unary_expression -> ^( LEGEND_unary_expression 'sizeof' unary_expression ) | 'sizeof' '(' type_name ')' -> ^( LEGEND_unary_expression 'sizeof' type_name ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:206:19: postfix_expression
					{
					pushFollow(FOLLOW_postfix_expression_in_unary_expression2040);
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
					// 206:38: -> ^( LEGEND_unary_expression postfix_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:206:41: ^( LEGEND_unary_expression postfix_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:207:20: '++' unary_expression
					{
					string_literal138=(Token)match(input,76,FOLLOW_76_in_unary_expression2069); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_76.add(string_literal138);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2071);
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
					// 207:42: -> ^( LEGEND_unary_expression '++' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:207:45: ^( LEGEND_unary_expression '++' unary_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:208:20: '--' unary_expression
					{
					string_literal140=(Token)match(input,80,FOLLOW_80_in_unary_expression2102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_80.add(string_literal140);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2104);
					unary_expression141=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression141.getTree());
					// AST REWRITE
					// elements: unary_expression, 80
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 208:42: -> ^( LEGEND_unary_expression '--' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:208:45: ^( LEGEND_unary_expression '--' unary_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:209:20: unary_operator cast_expression
					{
					pushFollow(FOLLOW_unary_operator_in_unary_expression2135);
					unary_operator142=unary_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_operator.add(unary_operator142.getTree());
					pushFollow(FOLLOW_cast_expression_in_unary_expression2137);
					cast_expression143=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_cast_expression.add(cast_expression143.getTree());
					// AST REWRITE
					// elements: cast_expression, unary_operator
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 209:51: -> ^( LEGEND_unary_expression unary_operator cast_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:209:54: ^( LEGEND_unary_expression unary_operator cast_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:210:20: 'sizeof' unary_expression
					{
					string_literal144=(Token)match(input,109,FOLLOW_109_in_unary_expression2168); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_109.add(string_literal144);

					pushFollow(FOLLOW_unary_expression_in_unary_expression2170);
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
					// 210:46: -> ^( LEGEND_unary_expression 'sizeof' unary_expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:210:49: ^( LEGEND_unary_expression 'sizeof' unary_expression )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:211:20: 'sizeof' '(' type_name ')'
					{
					string_literal146=(Token)match(input,109,FOLLOW_109_in_unary_expression2201); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_109.add(string_literal146);

					char_literal147=(Token)match(input,71,FOLLOW_71_in_unary_expression2203); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal147);

					pushFollow(FOLLOW_type_name_in_unary_expression2205);
					type_name148=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_type_name.add(type_name148.getTree());
					char_literal149=(Token)match(input,72,FOLLOW_72_in_unary_expression2207); if (state.failed) return retval; 
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
					// 211:47: -> ^( LEGEND_unary_expression 'sizeof' type_name )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:211:50: ^( LEGEND_unary_expression 'sizeof' type_name )
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
			if ( state.backtracking>0 ) { memoize(input, 42, unary_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:213:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
	public final astParser.unary_operator_return unary_operator() throws RecognitionException {
		astParser.unary_operator_return retval = new astParser.unary_operator_return();
		retval.start = input.LT(1);
		int unary_operator_StartIndex = input.index();

		CommonTree root_0 = null;

		Token set150=null;

		CommonTree set150_tree=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:213:15: ( '&' | '*' | '+' | '-' | '~' | '!' )
			// D:\\JAVA\\first\\src\\core\\ast.g:
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
			if ( state.backtracking>0 ) { memoize(input, 43, unary_operator_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:215:1: postfix_expression : primary_expression ( postfix )* -> ^( LEGEND_postfix_expression primary_expression ( postfix )* ) ;
	public final astParser.postfix_expression_return postfix_expression() throws RecognitionException {
		astParser.postfix_expression_return retval = new astParser.postfix_expression_return();
		retval.start = input.LT(1);
		int postfix_expression_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope primary_expression151 =null;
		ParserRuleReturnScope postfix152 =null;

		RewriteRuleSubtreeStream stream_postfix=new RewriteRuleSubtreeStream(adaptor,"rule postfix");
		RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:215:19: ( primary_expression ( postfix )* -> ^( LEGEND_postfix_expression primary_expression ( postfix )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:215:21: primary_expression ( postfix )*
			{
			pushFollow(FOLLOW_primary_expression_in_postfix_expression2258);
			primary_expression151=primary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression151.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:215:40: ( postfix )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==71||LA43_0==76||LA43_0==80||(LA43_0 >= 82 && LA43_0 <= 83)||LA43_0==97) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:215:40: postfix
					{
					pushFollow(FOLLOW_postfix_in_postfix_expression2260);
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
			// 215:49: -> ^( LEGEND_postfix_expression primary_expression ( postfix )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:215:52: ^( LEGEND_postfix_expression primary_expression ( postfix )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix_expression, "LEGEND_postfix_expression"), root_1);
				adaptor.addChild(root_1, stream_primary_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:215:99: ( postfix )*
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
			if ( state.backtracking>0 ) { memoize(input, 44, postfix_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:217:1: postfix : ( '[' expression ']' -> ^( LEGEND_postfix '[' expression ']' ) | '(' ( arguments )? ')' -> ^( LEGEND_postfix FUCK ( arguments )? ) | '.' identifier -> ^( LEGEND_postfix '.' identifier ) | '->' identifier -> ^( LEGEND_postfix '->' identifier ) | '++' -> ^( LEGEND_postfix '++' ) | '--' -> ^( LEGEND_postfix '--' ) );
	public final astParser.postfix_return postfix() throws RecognitionException {
		astParser.postfix_return retval = new astParser.postfix_return();
		retval.start = input.LT(1);
		int postfix_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:217:8: ( '[' expression ']' -> ^( LEGEND_postfix '[' expression ']' ) | '(' ( arguments )? ')' -> ^( LEGEND_postfix FUCK ( arguments )? ) | '.' identifier -> ^( LEGEND_postfix '.' identifier ) | '->' identifier -> ^( LEGEND_postfix '->' identifier ) | '++' -> ^( LEGEND_postfix '++' ) | '--' -> ^( LEGEND_postfix '--' ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:217:10: '[' expression ']'
					{
					char_literal153=(Token)match(input,97,FOLLOW_97_in_postfix2284); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_97.add(char_literal153);

					pushFollow(FOLLOW_expression_in_postfix2286);
					expression154=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression154.getTree());
					char_literal155=(Token)match(input,98,FOLLOW_98_in_postfix2288); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_98.add(char_literal155);

					// AST REWRITE
					// elements: expression, 98, 97
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 217:29: -> ^( LEGEND_postfix '[' expression ']' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:217:32: ^( LEGEND_postfix '[' expression ']' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:218:11: '(' ( arguments )? ')'
					{
					char_literal156=(Token)match(input,71,FOLLOW_71_in_postfix2312); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal156);

					// D:\\JAVA\\first\\src\\core\\ast.g:218:15: ( arguments )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==Dec||LA44_0==Hex||(LA44_0 >= Nice_character_constant && LA44_0 <= Oct)||LA44_0==64||LA44_0==69||LA44_0==71||LA44_0==73||(LA44_0 >= 75 && LA44_0 <= 76)||(LA44_0 >= 79 && LA44_0 <= 80)||LA44_0==109||LA44_0==119) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// D:\\JAVA\\first\\src\\core\\ast.g:218:15: arguments
							{
							pushFollow(FOLLOW_arguments_in_postfix2314);
							arguments157=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments157.getTree());
							}
							break;

					}

					char_literal158=(Token)match(input,72,FOLLOW_72_in_postfix2317); if (state.failed) return retval; 
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
					// 218:30: -> ^( LEGEND_postfix FUCK ( arguments )? )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:218:33: ^( LEGEND_postfix FUCK ( arguments )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_postfix, "LEGEND_postfix"), root_1);
						adaptor.addChild(root_1, (CommonTree)adaptor.create(FUCK, "FUCK"));
						// D:\\JAVA\\first\\src\\core\\ast.g:218:55: ( arguments )?
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
					// D:\\JAVA\\first\\src\\core\\ast.g:219:11: '.' identifier
					{
					char_literal159=(Token)match(input,83,FOLLOW_83_in_postfix2340); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_83.add(char_literal159);

					pushFollow(FOLLOW_identifier_in_postfix2342);
					identifier160=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier160.getTree());
					// AST REWRITE
					// elements: 83, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 219:26: -> ^( LEGEND_postfix '.' identifier )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:219:29: ^( LEGEND_postfix '.' identifier )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:220:11: '->' identifier
					{
					string_literal161=(Token)match(input,82,FOLLOW_82_in_postfix2364); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_82.add(string_literal161);

					pushFollow(FOLLOW_identifier_in_postfix2366);
					identifier162=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier162.getTree());
					// AST REWRITE
					// elements: 82, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 220:27: -> ^( LEGEND_postfix '->' identifier )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:220:30: ^( LEGEND_postfix '->' identifier )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:221:11: '++'
					{
					string_literal163=(Token)match(input,76,FOLLOW_76_in_postfix2388); if (state.failed) return retval; 
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
					// 221:16: -> ^( LEGEND_postfix '++' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:221:19: ^( LEGEND_postfix '++' )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:222:11: '--'
					{
					string_literal164=(Token)match(input,80,FOLLOW_80_in_postfix2408); if (state.failed) return retval; 
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
					// 222:16: -> ^( LEGEND_postfix '--' )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:222:19: ^( LEGEND_postfix '--' )
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
			if ( state.backtracking>0 ) { memoize(input, 45, postfix_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:225:1: arguments : assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* ) ;
	public final astParser.arguments_return arguments() throws RecognitionException {
		astParser.arguments_return retval = new astParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();

		CommonTree root_0 = null;

		Token char_literal166=null;
		ParserRuleReturnScope assignment_expression165 =null;
		ParserRuleReturnScope assignment_expression167 =null;

		CommonTree char_literal166_tree=null;
		RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
		RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:225:10: ( assignment_expression ( ',' assignment_expression )* -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:226:3: assignment_expression ( ',' assignment_expression )*
			{
			pushFollow(FOLLOW_assignment_expression_in_arguments2440);
			assignment_expression165=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression165.getTree());
			// D:\\JAVA\\first\\src\\core\\ast.g:226:25: ( ',' assignment_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==78) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\JAVA\\first\\src\\core\\ast.g:226:26: ',' assignment_expression
					{
					char_literal166=(Token)match(input,78,FOLLOW_78_in_arguments2443); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_78.add(char_literal166);

					pushFollow(FOLLOW_assignment_expression_in_arguments2445);
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
			// 226:54: -> ^( LEGEND_arguments assignment_expression ( assignment_expression )* )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:226:57: ^( LEGEND_arguments assignment_expression ( assignment_expression )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LEGEND_arguments, "LEGEND_arguments"), root_1);
				adaptor.addChild(root_1, stream_assignment_expression.nextTree());
				// D:\\JAVA\\first\\src\\core\\ast.g:226:98: ( assignment_expression )*
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
			if ( state.backtracking>0 ) { memoize(input, 46, arguments_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:229:1: primary_expression : ( identifier -> ^( LEGEND_primary_expression identifier ) | constant -> ^( LEGEND_primary_expression constant ) | string -> ^( LEGEND_primary_expression string ) | '(' expression ')' -> ^( LEGEND_primary_expression expression ) );
	public final astParser.primary_expression_return primary_expression() throws RecognitionException {
		astParser.primary_expression_return retval = new astParser.primary_expression_return();
		retval.start = input.LT(1);
		int primary_expression_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:229:19: ( identifier -> ^( LEGEND_primary_expression identifier ) | constant -> ^( LEGEND_primary_expression constant ) | string -> ^( LEGEND_primary_expression string ) | '(' expression ')' -> ^( LEGEND_primary_expression expression ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:229:21: identifier
					{
					pushFollow(FOLLOW_identifier_in_primary_expression2476);
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
					// 229:32: -> ^( LEGEND_primary_expression identifier )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:229:35: ^( LEGEND_primary_expression identifier )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:230:22: constant
					{
					pushFollow(FOLLOW_constant_in_primary_expression2507);
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
					// 230:31: -> ^( LEGEND_primary_expression constant )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:230:34: ^( LEGEND_primary_expression constant )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:231:22: string
					{
					pushFollow(FOLLOW_string_in_primary_expression2538);
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
					// 231:29: -> ^( LEGEND_primary_expression string )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:231:32: ^( LEGEND_primary_expression string )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:232:22: '(' expression ')'
					{
					char_literal171=(Token)match(input,71,FOLLOW_71_in_primary_expression2570); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_71.add(char_literal171);

					pushFollow(FOLLOW_expression_in_primary_expression2572);
					expression172=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression172.getTree());
					char_literal173=(Token)match(input,72,FOLLOW_72_in_primary_expression2574); if (state.failed) return retval; 
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
					// 232:41: -> ^( LEGEND_primary_expression expression )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:232:44: ^( LEGEND_primary_expression expression )
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
			if ( state.backtracking>0 ) { memoize(input, 47, primary_expression_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:235:1: integer_constant : ( Dec -> ^( LEGEND_integer_constant Dec ) | Oct -> ^( LEGEND_integer_constant Oct ) | Hex -> ^( LEGEND_integer_constant Hex ) );
	public final astParser.integer_constant_return integer_constant() throws RecognitionException {
		astParser.integer_constant_return retval = new astParser.integer_constant_return();
		retval.start = input.LT(1);
		int integer_constant_StartIndex = input.index();

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
			if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:236:2: ( Dec -> ^( LEGEND_integer_constant Dec ) | Oct -> ^( LEGEND_integer_constant Oct ) | Hex -> ^( LEGEND_integer_constant Hex ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:236:4: Dec
					{
					Dec174=(Token)match(input,Dec,FOLLOW_Dec_in_integer_constant2635); if (state.failed) return retval; 
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
					// 236:8: -> ^( LEGEND_integer_constant Dec )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:236:11: ^( LEGEND_integer_constant Dec )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:237:4: Oct
					{
					Oct175=(Token)match(input,Oct,FOLLOW_Oct_in_integer_constant2648); if (state.failed) return retval; 
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
					// 237:8: -> ^( LEGEND_integer_constant Oct )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:237:11: ^( LEGEND_integer_constant Oct )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:238:4: Hex
					{
					Hex176=(Token)match(input,Hex,FOLLOW_Hex_in_integer_constant2661); if (state.failed) return retval; 
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
					// 238:8: -> ^( LEGEND_integer_constant Hex )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:238:11: ^( LEGEND_integer_constant Hex )
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
			if ( state.backtracking>0 ) { memoize(input, 48, integer_constant_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:254:1: identifier : Nice_identifier -> ^( LEGEND_identifier Nice_identifier ) ;
	public final astParser.identifier_return identifier() throws RecognitionException {
		astParser.identifier_return retval = new astParser.identifier_return();
		retval.start = input.LT(1);
		int identifier_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Nice_identifier177=null;

		CommonTree Nice_identifier177_tree=null;
		RewriteRuleTokenStream stream_Nice_identifier=new RewriteRuleTokenStream(adaptor,"token Nice_identifier");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:254:11: ( Nice_identifier -> ^( LEGEND_identifier Nice_identifier ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:255:2: Nice_identifier
			{
			Nice_identifier177=(Token)match(input,Nice_identifier,FOLLOW_Nice_identifier_in_identifier2753); if (state.failed) return retval; 
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
			// 255:18: -> ^( LEGEND_identifier Nice_identifier )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:255:21: ^( LEGEND_identifier Nice_identifier )
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
			if ( state.backtracking>0 ) { memoize(input, 49, identifier_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:263:1: constant : ( integer_constant -> ^( LEGEND_constant integer_constant ) | character_constant -> ^( LEGEND_constant character_constant ) );
	public final astParser.constant_return constant() throws RecognitionException {
		astParser.constant_return retval = new astParser.constant_return();
		retval.start = input.LT(1);
		int constant_StartIndex = input.index();

		CommonTree root_0 = null;

		ParserRuleReturnScope integer_constant178 =null;
		ParserRuleReturnScope character_constant179 =null;

		RewriteRuleSubtreeStream stream_character_constant=new RewriteRuleSubtreeStream(adaptor,"rule character_constant");
		RewriteRuleSubtreeStream stream_integer_constant=new RewriteRuleSubtreeStream(adaptor,"rule integer_constant");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:263:9: ( integer_constant -> ^( LEGEND_constant integer_constant ) | character_constant -> ^( LEGEND_constant character_constant ) )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:263:11: integer_constant
					{
					pushFollow(FOLLOW_integer_constant_in_constant2819);
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
					// 263:28: -> ^( LEGEND_constant integer_constant )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:263:31: ^( LEGEND_constant integer_constant )
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
					// D:\\JAVA\\first\\src\\core\\ast.g:264:12: character_constant
					{
					pushFollow(FOLLOW_character_constant_in_constant2841);
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
					// 264:31: -> ^( LEGEND_constant character_constant )
					{
						// D:\\JAVA\\first\\src\\core\\ast.g:264:34: ^( LEGEND_constant character_constant )
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
			if ( state.backtracking>0 ) { memoize(input, 50, constant_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:269:1: character_constant : Nice_character_constant -> ^( LEGEND_character_constant Nice_character_constant ) ;
	public final astParser.character_constant_return character_constant() throws RecognitionException {
		astParser.character_constant_return retval = new astParser.character_constant_return();
		retval.start = input.LT(1);
		int character_constant_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Nice_character_constant180=null;

		CommonTree Nice_character_constant180_tree=null;
		RewriteRuleTokenStream stream_Nice_character_constant=new RewriteRuleTokenStream(adaptor,"token Nice_character_constant");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:269:19: ( Nice_character_constant -> ^( LEGEND_character_constant Nice_character_constant ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:270:2: Nice_character_constant
			{
			Nice_character_constant180=(Token)match(input,Nice_character_constant,FOLLOW_Nice_character_constant_in_character_constant2883); if (state.failed) return retval; 
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
			// 270:26: -> ^( LEGEND_character_constant Nice_character_constant )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:270:29: ^( LEGEND_character_constant Nice_character_constant )
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
			if ( state.backtracking>0 ) { memoize(input, 51, character_constant_StartIndex); }

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
	// D:\\JAVA\\first\\src\\core\\ast.g:281:1: string : Nice_string -> ^( LEGEND_string Nice_string ) ;
	public final astParser.string_return string() throws RecognitionException {
		astParser.string_return retval = new astParser.string_return();
		retval.start = input.LT(1);
		int string_StartIndex = input.index();

		CommonTree root_0 = null;

		Token Nice_string181=null;

		CommonTree Nice_string181_tree=null;
		RewriteRuleTokenStream stream_Nice_string=new RewriteRuleTokenStream(adaptor,"token Nice_string");

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }

			// D:\\JAVA\\first\\src\\core\\ast.g:281:8: ( Nice_string -> ^( LEGEND_string Nice_string ) )
			// D:\\JAVA\\first\\src\\core\\ast.g:282:2: Nice_string
			{
			Nice_string181=(Token)match(input,Nice_string,FOLLOW_Nice_string_in_string3030); if (state.failed) return retval; 
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
			// 282:14: -> ^( LEGEND_string Nice_string )
			{
				// D:\\JAVA\\first\\src\\core\\ast.g:282:17: ^( LEGEND_string Nice_string )
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
			if ( state.backtracking>0 ) { memoize(input, 52, string_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "string"

	// $ANTLR start synpred1_ast
	public final void synpred1_ast_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\ast.g:80:10: ( declaration )
		// D:\\JAVA\\first\\src\\core\\ast.g:80:10: declaration
		{
		pushFollow(FOLLOW_declaration_in_synpred1_ast319);
		declaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_ast

	// $ANTLR start synpred2_ast
	public final void synpred2_ast_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\ast.g:80:24: ( function_definition )
		// D:\\JAVA\\first\\src\\core\\ast.g:80:24: function_definition
		{
		pushFollow(FOLLOW_function_definition_in_synpred2_ast323);
		function_definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_ast

	// $ANTLR start synpred29_ast
	public final void synpred29_ast_fragment() throws RecognitionException {
		ParserRuleReturnScope e3 =null;


		// D:\\JAVA\\first\\src\\core\\ast.g:127:63: ( 'else' e3= statement )
		// D:\\JAVA\\first\\src\\core\\ast.g:127:63: 'else' e3= statement
		{
		match(input,104,FOLLOW_104_in_synpred29_ast1044); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred29_ast1048);
		e3=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred29_ast

	// $ANTLR start synpred38_ast
	public final void synpred38_ast_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\core\\ast.g:139:23: ( unary_expression assignment_operator assignment_expression )
		// D:\\JAVA\\first\\src\\core\\ast.g:139:23: unary_expression assignment_operator assignment_expression
		{
		pushFollow(FOLLOW_unary_expression_in_synpred38_ast1346);
		unary_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_operator_in_synpred38_ast1348);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_expression_in_synpred38_ast1350);
		assignment_expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred38_ast

	// Delegated rules

	public final boolean synpred38_ast() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_ast_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred29_ast() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred29_ast_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_ast() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_ast_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_ast() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_ast_fragment(); // can never throw exception
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
			return "109:1: declarator : ( plain_declarator '(' ( parameters )? ')' -> ^( LEGEND_declarator plain_declarator ( parameters )? ) | plain_declarator ( '[' constant_expression ']' )* -> ^( LEGEND_declarator plain_declarator ( constant_expression )* ) );";
		}
	}

	public static final BitSet FOLLOW_prog_in_program299 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_prog319 = new BitSet(new long[]{0x0000000000000002L,0x0001C84000000000L});
	public static final BitSet FOLLOW_function_definition_in_prog323 = new BitSet(new long[]{0x0000000000000002L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_specifier_in_declaration336 = new BitSet(new long[]{0x1000000000000000L,0x0000000000400200L});
	public static final BitSet FOLLOW_init_declarators_in_declaration338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_declaration341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_function_definition364 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_plain_declarator_in_function_definition366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_function_definition368 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000100L});
	public static final BitSet FOLLOW_parameters_in_function_definition370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_function_definition373 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_parameters404 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters406 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_declarators433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_declarators436 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarator_in_declarators438 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_init_declarators464 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_declarator_in_init_declarator494 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_init_declarator497 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_init_declarator499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_initializer548 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_initializer550 = new BitSet(new long[]{0x0000000000000000L,0x0040000000004000L});
	public static final BitSet FOLLOW_78_in_initializer553 = new BitSet(new long[]{0x7800000000000120L,0x0084200000019AA1L});
	public static final BitSet FOLLOW_initializer_in_initializer555 = new BitSet(new long[]{0x0000000000000000L,0x0040000000004000L});
	public static final BitSet FOLLOW_118_in_initializer559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_112_in_type_specifier585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_102_in_type_specifier605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_107_in_type_specifier625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier652 = new BitSet(new long[]{0x1000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier654 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
	public static final BitSet FOLLOW_114_in_type_specifier657 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_specifier_in_type_specifier660 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarators_in_type_specifier662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_type_specifier664 = new BitSet(new long[]{0x0000000000000000L,0x0041C84000000000L});
	public static final BitSet FOLLOW_118_in_type_specifier668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier706 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_plain_declaration747 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_declarator_in_plain_declaration749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_declarator773 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000100L});
	public static final BitSet FOLLOW_parameters_in_declarator775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_declarator778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator796 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_97_in_declarator799 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_constant_expression_in_declarator801 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_declarator803 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
	public static final BitSet FOLLOW_73_in_plain_declarator832 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_identifier_in_plain_declarator835 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_expression_statement976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_114_in_compound_statement997 = new BitSet(new long[]{0x7800000000000120L,0x00C7FEE000419AA1L});
	public static final BitSet FOLLOW_declaration_in_compound_statement999 = new BitSet(new long[]{0x7800000000000120L,0x00C7FEE000419AA1L});
	public static final BitSet FOLLOW_statement_in_compound_statement1002 = new BitSet(new long[]{0x7800000000000120L,0x00C636A000419AA1L});
	public static final BitSet FOLLOW_118_in_compound_statement1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_106_in_selection_statement1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_selection_statement1031 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_selection_statement1035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_selection_statement1037 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_selection_statement1041 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_104_in_selection_statement1044 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_selection_statement1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_113_in_iteration_statement1081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_iteration_statement1083 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1089 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_105_in_iteration_statement1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_iteration_statement1133 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_iteration_statement1140 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_iteration_statement1147 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019BA1L});
	public static final BitSet FOLLOW_expression_in_iteration_statement1151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_iteration_statement1154 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_iteration_statement1158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_103_in_jump_statement1205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_101_in_jump_statement1234 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_108_in_jump_statement1263 = new BitSet(new long[]{0x7800000000000120L,0x0080200000419AA1L});
	public static final BitSet FOLLOW_expression_in_jump_statement1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_jump_statement1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_expression1293 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_expression1295 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_unary_expression_in_assignment_expression1346 = new BitSet(new long[]{0x0000000000000000L,0x001000110A222448L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1348 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_constant_expression1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1506 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_117_in_logical_or_expression1509 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1511 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1540 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_logical_and_expression1543 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1576 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_115_in_inclusive_or_expression1579 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1581 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1612 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_99_in_exclusive_or_expression1615 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1648 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_69_in_and_expression1651 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000002L});
	public static final BitSet FOLLOW_equality_operator_in_equality_expression1687 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1689 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1735 = new BitSet(new long[]{0x0000000000000002L,0x0000000064800000L});
	public static final BitSet FOLLOW_relational_operator_in_relational_expression1738 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000064800000L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1797 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
	public static final BitSet FOLLOW_shift_operator_in_shift_expression1800 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1802 = new BitSet(new long[]{0x0000000000000002L,0x0000000081000000L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
	public static final BitSet FOLLOW_additive_operator_in_additive_expression1852 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008800L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100204L});
	public static final BitSet FOLLOW_multiplicative_operator_in_multiplicative_expression1905 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1907 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100204L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_cast_expression1986 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_name_in_cast_expression1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_cast_expression1990 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression1992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_type_name2014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_73_in_type_name2016 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression2040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_unary_expression2069 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_unary_expression2102 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression2135 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression2137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_unary_expression2168 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression2170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_109_in_unary_expression2201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_71_in_unary_expression2203 = new BitSet(new long[]{0x0000000000000000L,0x0001C84000000000L});
	public static final BitSet FOLLOW_type_name_in_unary_expression2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_unary_expression2207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression2258 = new BitSet(new long[]{0x0000000000000002L,0x00000002000D1080L});
	public static final BitSet FOLLOW_postfix_in_postfix_expression2260 = new BitSet(new long[]{0x0000000000000002L,0x00000002000D1080L});
	public static final BitSet FOLLOW_97_in_postfix2284 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_postfix2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_98_in_postfix2288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_postfix2312 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019BA1L});
	public static final BitSet FOLLOW_arguments_in_postfix2314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_postfix2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_83_in_postfix2340 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_82_in_postfix2364 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_identifier_in_postfix2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_76_in_postfix2388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_80_in_postfix2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_arguments2443 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments2445 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_identifier_in_primary_expression2476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression2507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_primary_expression2538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_primary_expression2570 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_expression_in_primary_expression2572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_72_in_primary_expression2574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Dec_in_integer_constant2635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Oct_in_integer_constant2648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Hex_in_integer_constant2661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_identifier_in_identifier2753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_constant_in_constant2819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_constant_in_constant2841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_character_constant_in_character_constant2883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_string_in_string3030 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_synpred1_ast319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_synpred2_ast323 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_104_in_synpred29_ast1044 = new BitSet(new long[]{0x7800000000000120L,0x008636A000419AA1L});
	public static final BitSet FOLLOW_statement_in_synpred29_ast1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_synpred38_ast1346 = new BitSet(new long[]{0x0000000000000000L,0x001000110A222448L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred38_ast1348 = new BitSet(new long[]{0x7800000000000120L,0x0080200000019AA1L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred38_ast1350 = new BitSet(new long[]{0x0000000000000002L});
}
