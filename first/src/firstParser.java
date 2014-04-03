// $ANTLR 3.5.1 D:\\JAVA\\first\\src\\first.g 2014-04-03 22:12:53

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGUMENT", "COMMENT", "Dec", 
		"FUNC_DECL", "Header", "Hex", "INDEX", "LINE_COMMENT", "METHOD", "Nice_character_constant", 
		"Nice_identifier", "Nice_string", "Oct", "POINTER", "POSTADD", "POSTUNDERLINE", 
		"PREADD", "PREUNDERLINE", "TYPE_DECL", "VAR_DECL", "WS", "'!'", "'!='", 
		"'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", 
		"'++'", "'+='", "','", "'.'", "'/'", "'/='", "';'", "'<'", "'<<'", "'<<='", 
		"'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'['", "']'", "'^'", 
		"'^='", "'_'", "'_='", "'_>'", "'__'", "'break'", "'char'", "'continue'", 
		"'else'", "'for'", "'if'", "'int'", "'return'", "'sizeof'", "'struct'", 
		"'union'", "'void'", "'while'", "'{'", "'|'", "'|='", "'||'", "'}'", "'~'"
	};
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
	@Override public String getGrammarFileName() { return "D:\\JAVA\\first\\src\\first.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// D:\\JAVA\\first\\src\\first.g:27:1: prog : program EOF !;
	public final firstParser.prog_return prog() throws RecognitionException {
		firstParser.prog_return retval = new firstParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token EOF2=null;
		ParserRuleReturnScope program1 =null;

		CommonTree EOF2_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:27:5: ( program EOF !)
			// D:\\JAVA\\first\\src\\first.g:27:8: program EOF !
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_program_in_prog146);
			program1=program();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, program1.getTree());

			EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog148); if (state.failed) return retval;
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
	// $ANTLR end "prog"


	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// D:\\JAVA\\first\\src\\first.g:29:1: program : ( declaration | function_definition )+ ;
	public final firstParser.program_return program() throws RecognitionException {
		firstParser.program_return retval = new firstParser.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope declaration3 =null;
		ParserRuleReturnScope function_definition4 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:29:9: ( ( declaration | function_definition )+ )
			// D:\\JAVA\\first\\src\\first.g:30:3: ( declaration | function_definition )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\JAVA\\first\\src\\first.g:30:3: ( declaration | function_definition )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=3;
				switch ( input.LA(1) ) {
				case 73:
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
				case 63:
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
				case 68:
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
				case 71:
				case 72:
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
					// D:\\JAVA\\first\\src\\first.g:30:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_program164);
					declaration3=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration3.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:30:19: function_definition
					{
					pushFollow(FOLLOW_function_definition_in_program168);
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


	public static class declaration_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// D:\\JAVA\\first\\src\\first.g:32:1: declaration : type_specifier ( init_declarators )? ';' -> ^( VAR_DECL ^( TYPE_DECL type_specifier ) ( init_declarators )? ) ;
	public final firstParser.declaration_return declaration() throws RecognitionException {
		firstParser.declaration_return retval = new firstParser.declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal7=null;
		ParserRuleReturnScope type_specifier5 =null;
		ParserRuleReturnScope init_declarators6 =null;

		CommonTree char_literal7_tree=null;
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_init_declarators=new RewriteRuleSubtreeStream(adaptor,"rule init_declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\JAVA\\first\\src\\first.g:32:12: ( type_specifier ( init_declarators )? ';' -> ^( VAR_DECL ^( TYPE_DECL type_specifier ) ( init_declarators )? ) )
			// D:\\JAVA\\first\\src\\first.g:32:14: type_specifier ( init_declarators )? ';'
			{
			pushFollow(FOLLOW_type_specifier_in_declaration177);
			type_specifier5=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier5.getTree());
			// D:\\JAVA\\first\\src\\first.g:32:29: ( init_declarators )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Nice_identifier||LA2_0==34) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:32:29: init_declarators
					{
					pushFollow(FOLLOW_init_declarators_in_declaration179);
					init_declarators6=init_declarators();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_init_declarators.add(init_declarators6.getTree());
					}
					break;

			}

			char_literal7=(Token)match(input,43,FOLLOW_43_in_declaration182); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_43.add(char_literal7);

			// AST REWRITE
			// elements: type_specifier, init_declarators
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 32:51: -> ^( VAR_DECL ^( TYPE_DECL type_specifier ) ( init_declarators )? )
			{
				// D:\\JAVA\\first\\src\\first.g:32:54: ^( VAR_DECL ^( TYPE_DECL type_specifier ) ( init_declarators )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				// D:\\JAVA\\first\\src\\first.g:32:65: ^( TYPE_DECL type_specifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_2);
				adaptor.addChild(root_2, stream_type_specifier.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// D:\\JAVA\\first\\src\\first.g:32:93: ( init_declarators )?
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
	// $ANTLR end "declaration"


	public static class function_definition_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "function_definition"
	// D:\\JAVA\\first\\src\\first.g:34:1: function_definition : type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( FUNC_DECL ^( TYPE_DECL type_specifier ) plain_declarator ( parameters )? compound_statement ) ;
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
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleSubtreeStream stream_plain_declarator=new RewriteRuleSubtreeStream(adaptor,"rule plain_declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_parameters=new RewriteRuleSubtreeStream(adaptor,"rule parameters");
		RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");

		try {
			// D:\\JAVA\\first\\src\\first.g:34:20: ( type_specifier plain_declarator '(' ( parameters )? ')' compound_statement -> ^( FUNC_DECL ^( TYPE_DECL type_specifier ) plain_declarator ( parameters )? compound_statement ) )
			// D:\\JAVA\\first\\src\\first.g:34:22: type_specifier plain_declarator '(' ( parameters )? ')' compound_statement
			{
			pushFollow(FOLLOW_type_specifier_in_function_definition205);
			type_specifier8=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier8.getTree());
			pushFollow(FOLLOW_plain_declarator_in_function_definition207);
			plain_declarator9=plain_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_plain_declarator.add(plain_declarator9.getTree());
			char_literal10=(Token)match(input,32,FOLLOW_32_in_function_definition209); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_32.add(char_literal10);

			// D:\\JAVA\\first\\src\\first.g:34:58: ( parameters )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==63||LA3_0==68||(LA3_0 >= 71 && LA3_0 <= 73)) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:34:58: parameters
					{
					pushFollow(FOLLOW_parameters_in_function_definition211);
					parameters11=parameters();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameters.add(parameters11.getTree());
					}
					break;

			}

			char_literal12=(Token)match(input,33,FOLLOW_33_in_function_definition214); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_33.add(char_literal12);

			pushFollow(FOLLOW_compound_statement_in_function_definition216);
			compound_statement13=compound_statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement13.getTree());
			// AST REWRITE
			// elements: parameters, type_specifier, plain_declarator, compound_statement
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 34:93: -> ^( FUNC_DECL ^( TYPE_DECL type_specifier ) plain_declarator ( parameters )? compound_statement )
			{
				// D:\\JAVA\\first\\src\\first.g:34:96: ^( FUNC_DECL ^( TYPE_DECL type_specifier ) plain_declarator ( parameters )? compound_statement )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNC_DECL, "FUNC_DECL"), root_1);
				// D:\\JAVA\\first\\src\\first.g:34:108: ^( TYPE_DECL type_specifier )
				{
				CommonTree root_2 = (CommonTree)adaptor.nil();
				root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_2);
				adaptor.addChild(root_2, stream_type_specifier.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_plain_declarator.nextTree());
				// D:\\JAVA\\first\\src\\first.g:34:155: ( parameters )?
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
	// $ANTLR end "function_definition"


	public static class parameters_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "parameters"
	// D:\\JAVA\\first\\src\\first.g:36:1: parameters : plain_declaration ( ',' ! plain_declaration )* ;
	public final firstParser.parameters_return parameters() throws RecognitionException {
		firstParser.parameters_return retval = new firstParser.parameters_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal15=null;
		ParserRuleReturnScope plain_declaration14 =null;
		ParserRuleReturnScope plain_declaration16 =null;

		CommonTree char_literal15_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:36:11: ( plain_declaration ( ',' ! plain_declaration )* )
			// D:\\JAVA\\first\\src\\first.g:36:13: plain_declaration ( ',' ! plain_declaration )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_plain_declaration_in_parameters245);
			plain_declaration14=plain_declaration();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, plain_declaration14.getTree());

			// D:\\JAVA\\first\\src\\first.g:36:31: ( ',' ! plain_declaration )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==39) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:36:32: ',' ! plain_declaration
					{
					char_literal15=(Token)match(input,39,FOLLOW_39_in_parameters248); if (state.failed) return retval;
					pushFollow(FOLLOW_plain_declaration_in_parameters251);
					plain_declaration16=plain_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, plain_declaration16.getTree());

					}
					break;

				default :
					break loop4;
				}
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
	// $ANTLR end "parameters"


	public static class declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarators"
	// D:\\JAVA\\first\\src\\first.g:38:1: declarators : declarator ( ',' ! declarator )* ;
	public final firstParser.declarators_return declarators() throws RecognitionException {
		firstParser.declarators_return retval = new firstParser.declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal18=null;
		ParserRuleReturnScope declarator17 =null;
		ParserRuleReturnScope declarator19 =null;

		CommonTree char_literal18_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:38:12: ( declarator ( ',' ! declarator )* )
			// D:\\JAVA\\first\\src\\first.g:38:14: declarator ( ',' ! declarator )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_declarator_in_declarators262);
			declarator17=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator17.getTree());

			// D:\\JAVA\\first\\src\\first.g:38:25: ( ',' ! declarator )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==39) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:38:26: ',' ! declarator
					{
					char_literal18=(Token)match(input,39,FOLLOW_39_in_declarators265); if (state.failed) return retval;
					pushFollow(FOLLOW_declarator_in_declarators268);
					declarator19=declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator19.getTree());

					}
					break;

				default :
					break loop5;
				}
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
	// $ANTLR end "declarators"


	public static class init_declarators_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarators"
	// D:\\JAVA\\first\\src\\first.g:40:1: init_declarators : init_declarator ( ',' ! init_declarator )* ;
	public final firstParser.init_declarators_return init_declarators() throws RecognitionException {
		firstParser.init_declarators_return retval = new firstParser.init_declarators_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal21=null;
		ParserRuleReturnScope init_declarator20 =null;
		ParserRuleReturnScope init_declarator22 =null;

		CommonTree char_literal21_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:40:17: ( init_declarator ( ',' ! init_declarator )* )
			// D:\\JAVA\\first\\src\\first.g:40:19: init_declarator ( ',' ! init_declarator )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_init_declarator_in_init_declarators278);
			init_declarator20=init_declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, init_declarator20.getTree());

			// D:\\JAVA\\first\\src\\first.g:40:35: ( ',' ! init_declarator )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==39) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:40:36: ',' ! init_declarator
					{
					char_literal21=(Token)match(input,39,FOLLOW_39_in_init_declarators281); if (state.failed) return retval;
					pushFollow(FOLLOW_init_declarator_in_init_declarators284);
					init_declarator22=init_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, init_declarator22.getTree());

					}
					break;

				default :
					break loop6;
				}
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
	// $ANTLR end "init_declarators"


	public static class init_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init_declarator"
	// D:\\JAVA\\first\\src\\first.g:42:1: init_declarator : declarator ( '=' ^ initializer )? ;
	public final firstParser.init_declarator_return init_declarator() throws RecognitionException {
		firstParser.init_declarator_return retval = new firstParser.init_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal24=null;
		ParserRuleReturnScope declarator23 =null;
		ParserRuleReturnScope initializer25 =null;

		CommonTree char_literal24_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:42:16: ( declarator ( '=' ^ initializer )? )
			// D:\\JAVA\\first\\src\\first.g:42:18: declarator ( '=' ^ initializer )?
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_declarator_in_init_declarator294);
			declarator23=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, declarator23.getTree());

			// D:\\JAVA\\first\\src\\first.g:42:29: ( '=' ^ initializer )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==48) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:42:30: '=' ^ initializer
					{
					char_literal24=(Token)match(input,48,FOLLOW_48_in_init_declarator297); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal24_tree, root_0);
					}

					pushFollow(FOLLOW_initializer_in_init_declarator300);
					initializer25=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer25.getTree());

					}
					break;

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
	// $ANTLR end "init_declarator"


	public static class initializer_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "initializer"
	// D:\\JAVA\\first\\src\\first.g:44:1: initializer : ( assignment_expression | '{' ! initializer ( ',' ! initializer )* '}' !);
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

		try {
			// D:\\JAVA\\first\\src\\first.g:44:12: ( assignment_expression | '{' ! initializer ( ',' ! initializer )* '}' !)
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Dec||LA9_0==Hex||(LA9_0 >= Nice_character_constant && LA9_0 <= Oct)||LA9_0==25||LA9_0==30||LA9_0==32||LA9_0==34||(LA9_0 >= 36 && LA9_0 <= 37)||LA9_0==58||LA9_0==61||LA9_0==70||LA9_0==80) ) {
				alt9=1;
			}
			else if ( (LA9_0==75) ) {
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
					// D:\\JAVA\\first\\src\\first.g:44:14: assignment_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_assignment_expression_in_initializer310);
					assignment_expression26=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression26.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:45:15: '{' ! initializer ( ',' ! initializer )* '}' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal27=(Token)match(input,75,FOLLOW_75_in_initializer326); if (state.failed) return retval;
					pushFollow(FOLLOW_initializer_in_initializer329);
					initializer28=initializer();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer28.getTree());

					// D:\\JAVA\\first\\src\\first.g:45:32: ( ',' ! initializer )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==39) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:45:33: ',' ! initializer
							{
							char_literal29=(Token)match(input,39,FOLLOW_39_in_initializer332); if (state.failed) return retval;
							pushFollow(FOLLOW_initializer_in_initializer335);
							initializer30=initializer();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, initializer30.getTree());

							}
							break;

						default :
							break loop8;
						}
					}

					char_literal31=(Token)match(input,79,FOLLOW_79_in_initializer339); if (state.failed) return retval;
					}
					break;

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
	// $ANTLR end "initializer"


	public static class type_specifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_specifier"
	// D:\\JAVA\\first\\src\\first.g:47:1: type_specifier : ( 'void' | 'char' | 'int' | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( struct_or_union ( identifier )? ( ^( TYPE_DECL type_specifier ) declarators )+ ) | struct_or_union ^ identifier );
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
		RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
		RewriteRuleSubtreeStream stream_declarators=new RewriteRuleSubtreeStream(adaptor,"rule declarators");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_struct_or_union=new RewriteRuleSubtreeStream(adaptor,"rule struct_or_union");

		try {
			// D:\\JAVA\\first\\src\\first.g:47:15: ( 'void' | 'char' | 'int' | struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}' -> ^( struct_or_union ( identifier )? ( ^( TYPE_DECL type_specifier ) declarators )+ ) | struct_or_union ^ identifier )
			int alt12=5;
			switch ( input.LA(1) ) {
			case 73:
				{
				alt12=1;
				}
				break;
			case 63:
				{
				alt12=2;
				}
				break;
			case 68:
				{
				alt12=3;
				}
				break;
			case 71:
			case 72:
				{
				int LA12_4 = input.LA(2);
				if ( (LA12_4==Nice_identifier) ) {
					int LA12_5 = input.LA(3);
					if ( (LA12_5==75) ) {
						alt12=4;
					}
					else if ( (LA12_5==Nice_identifier||(LA12_5 >= 33 && LA12_5 <= 34)||LA12_5==43) ) {
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
				else if ( (LA12_4==75) ) {
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
					// D:\\JAVA\\first\\src\\first.g:47:17: 'void'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal32=(Token)match(input,73,FOLLOW_73_in_type_specifier348); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal32_tree = (CommonTree)adaptor.create(string_literal32);
					adaptor.addChild(root_0, string_literal32_tree);
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:47:26: 'char'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal33=(Token)match(input,63,FOLLOW_63_in_type_specifier352); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal33_tree = (CommonTree)adaptor.create(string_literal33);
					adaptor.addChild(root_0, string_literal33_tree);
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:47:35: 'int'
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal34=(Token)match(input,68,FOLLOW_68_in_type_specifier356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal34_tree = (CommonTree)adaptor.create(string_literal34);
					adaptor.addChild(root_0, string_literal34_tree);
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\first.g:48:18: struct_or_union ( identifier )? '{' ( type_specifier declarators ';' )+ '}'
					{
					pushFollow(FOLLOW_struct_or_union_in_type_specifier376);
					struct_or_union35=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_struct_or_union.add(struct_or_union35.getTree());
					// D:\\JAVA\\first\\src\\first.g:48:34: ( identifier )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==Nice_identifier) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:48:34: identifier
							{
							pushFollow(FOLLOW_identifier_in_type_specifier378);
							identifier36=identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier36.getTree());
							}
							break;

					}

					char_literal37=(Token)match(input,75,FOLLOW_75_in_type_specifier381); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_75.add(char_literal37);

					// D:\\JAVA\\first\\src\\first.g:48:50: ( type_specifier declarators ';' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==63||LA11_0==68||(LA11_0 >= 71 && LA11_0 <= 73)) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:48:51: type_specifier declarators ';'
							{
							pushFollow(FOLLOW_type_specifier_in_type_specifier384);
							type_specifier38=type_specifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier38.getTree());
							pushFollow(FOLLOW_declarators_in_type_specifier386);
							declarators39=declarators();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_declarators.add(declarators39.getTree());
							char_literal40=(Token)match(input,43,FOLLOW_43_in_type_specifier388); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_43.add(char_literal40);

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

					char_literal41=(Token)match(input,79,FOLLOW_79_in_type_specifier392); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_79.add(char_literal41);

					// AST REWRITE
					// elements: type_specifier, struct_or_union, declarators, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 48:88: -> ^( struct_or_union ( identifier )? ( ^( TYPE_DECL type_specifier ) declarators )+ )
					{
						// D:\\JAVA\\first\\src\\first.g:48:91: ^( struct_or_union ( identifier )? ( ^( TYPE_DECL type_specifier ) declarators )+ )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot(stream_struct_or_union.nextNode(), root_1);
						// D:\\JAVA\\first\\src\\first.g:48:109: ( identifier )?
						if ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_1, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						if ( !(stream_type_specifier.hasNext()||stream_declarators.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_type_specifier.hasNext()||stream_declarators.hasNext() ) {
							// D:\\JAVA\\first\\src\\first.g:48:123: ^( TYPE_DECL type_specifier )
							{
							CommonTree root_2 = (CommonTree)adaptor.nil();
							root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_2);
							adaptor.addChild(root_2, stream_type_specifier.nextTree());
							adaptor.addChild(root_1, root_2);
							}

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
					// D:\\JAVA\\first\\src\\first.g:49:18: struct_or_union ^ identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_struct_or_union_in_type_specifier433);
					struct_or_union42=struct_or_union();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(struct_or_union42.getTree(), root_0);
					pushFollow(FOLLOW_identifier_in_type_specifier436);
					identifier43=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier43.getTree());

					}
					break;

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
	// $ANTLR end "type_specifier"


	public static class struct_or_union_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "struct_or_union"
	// D:\\JAVA\\first\\src\\first.g:51:1: struct_or_union : ( 'struct' | 'union' );
	public final firstParser.struct_or_union_return struct_or_union() throws RecognitionException {
		firstParser.struct_or_union_return retval = new firstParser.struct_or_union_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set44=null;

		CommonTree set44_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:51:16: ( 'struct' | 'union' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set44=input.LT(1);
			if ( (input.LA(1) >= 71 && input.LA(1) <= 72) ) {
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
	// D:\\JAVA\\first\\src\\first.g:53:1: plain_declaration : type_specifier declarator -> ^( TYPE_DECL type_specifier ) declarator ;
	public final firstParser.plain_declaration_return plain_declaration() throws RecognitionException {
		firstParser.plain_declaration_return retval = new firstParser.plain_declaration_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope type_specifier45 =null;
		ParserRuleReturnScope declarator46 =null;

		RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
		RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");

		try {
			// D:\\JAVA\\first\\src\\first.g:53:18: ( type_specifier declarator -> ^( TYPE_DECL type_specifier ) declarator )
			// D:\\JAVA\\first\\src\\first.g:53:20: type_specifier declarator
			{
			pushFollow(FOLLOW_type_specifier_in_plain_declaration457);
			type_specifier45=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier45.getTree());
			pushFollow(FOLLOW_declarator_in_plain_declaration459);
			declarator46=declarator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_declarator.add(declarator46.getTree());
			// AST REWRITE
			// elements: declarator, type_specifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 53:46: -> ^( TYPE_DECL type_specifier ) declarator
			{
				// D:\\JAVA\\first\\src\\first.g:53:49: ^( TYPE_DECL type_specifier )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);
				adaptor.addChild(root_1, stream_type_specifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

				adaptor.addChild(root_0, stream_declarator.nextTree());
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
	// $ANTLR end "plain_declaration"


	public static class declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "declarator"
	// D:\\JAVA\\first\\src\\first.g:55:1: declarator : ( plain_declarator '(' ! ( parameters )? ')' !| plain_declarator ( '[' ! constant_expression ']' !)* );
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

		try {
			// D:\\JAVA\\first\\src\\first.g:55:11: ( plain_declarator '(' ! ( parameters )? ')' !| plain_declarator ( '[' ! constant_expression ']' !)* )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==34) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred19_first()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

			}
			else if ( (LA15_0==Nice_identifier) ) {
				int LA15_2 = input.LA(2);
				if ( (synpred19_first()) ) {
					alt15=1;
				}
				else if ( (true) ) {
					alt15=2;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:55:13: plain_declarator '(' ! ( parameters )? ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_plain_declarator_in_declarator477);
					plain_declarator47=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, plain_declarator47.getTree());

					char_literal48=(Token)match(input,32,FOLLOW_32_in_declarator479); if (state.failed) return retval;
					// D:\\JAVA\\first\\src\\first.g:55:35: ( parameters )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==63||LA13_0==68||(LA13_0 >= 71 && LA13_0 <= 73)) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:55:35: parameters
							{
							pushFollow(FOLLOW_parameters_in_declarator482);
							parameters49=parameters();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, parameters49.getTree());

							}
							break;

					}

					char_literal50=(Token)match(input,33,FOLLOW_33_in_declarator485); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:56:6: plain_declarator ( '[' ! constant_expression ']' !)*
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_plain_declarator_in_declarator494);
					plain_declarator51=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, plain_declarator51.getTree());

					// D:\\JAVA\\first\\src\\first.g:56:23: ( '[' ! constant_expression ']' !)*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==54) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:56:24: '[' ! constant_expression ']' !
							{
							char_literal52=(Token)match(input,54,FOLLOW_54_in_declarator497); if (state.failed) return retval;
							pushFollow(FOLLOW_constant_expression_in_declarator500);
							constant_expression53=constant_expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, constant_expression53.getTree());

							char_literal54=(Token)match(input,55,FOLLOW_55_in_declarator502); if (state.failed) return retval;
							}
							break;

						default :
							break loop14;
						}
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
	// $ANTLR end "declarator"


	public static class plain_declarator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "plain_declarator"
	// D:\\JAVA\\first\\src\\first.g:58:1: plain_declarator : ( '*' ^ plain_declarator | identifier );
	public final firstParser.plain_declarator_return plain_declarator() throws RecognitionException {
		firstParser.plain_declarator_return retval = new firstParser.plain_declarator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal55=null;
		ParserRuleReturnScope plain_declarator56 =null;
		ParserRuleReturnScope identifier57 =null;

		CommonTree char_literal55_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:58:17: ( '*' ^ plain_declarator | identifier )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==34) ) {
				alt16=1;
			}
			else if ( (LA16_0==Nice_identifier) ) {
				alt16=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:58:19: '*' ^ plain_declarator
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal55=(Token)match(input,34,FOLLOW_34_in_plain_declarator513); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal55_tree = (CommonTree)adaptor.create(char_literal55);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal55_tree, root_0);
					}

					pushFollow(FOLLOW_plain_declarator_in_plain_declarator516);
					plain_declarator56=plain_declarator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, plain_declarator56.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:59:5: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_plain_declarator522);
					identifier57=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier57.getTree());

					}
					break;

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
	// $ANTLR end "plain_declarator"


	public static class statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// D:\\JAVA\\first\\src\\first.g:64:1: statement : ( expression_statement | compound_statement | selection_statement | iteration_statement | jump_statement );
	public final firstParser.statement_return statement() throws RecognitionException {
		firstParser.statement_return retval = new firstParser.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope expression_statement58 =null;
		ParserRuleReturnScope compound_statement59 =null;
		ParserRuleReturnScope selection_statement60 =null;
		ParserRuleReturnScope iteration_statement61 =null;
		ParserRuleReturnScope jump_statement62 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:64:10: ( expression_statement | compound_statement | selection_statement | iteration_statement | jump_statement )
			int alt17=5;
			switch ( input.LA(1) ) {
			case Dec:
			case Hex:
			case Nice_character_constant:
			case Nice_identifier:
			case Nice_string:
			case Oct:
			case 25:
			case 30:
			case 32:
			case 34:
			case 36:
			case 37:
			case 43:
			case 58:
			case 61:
			case 70:
			case 80:
				{
				alt17=1;
				}
				break;
			case 75:
				{
				alt17=2;
				}
				break;
			case 67:
				{
				alt17=3;
				}
				break;
			case 66:
			case 74:
				{
				alt17=4;
				}
				break;
			case 62:
			case 64:
			case 69:
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
					// D:\\JAVA\\first\\src\\first.g:64:12: expression_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_expression_statement_in_statement533);
					expression_statement58=expression_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression_statement58.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:65:13: compound_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_compound_statement_in_statement547);
					compound_statement59=compound_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement59.getTree());

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:66:13: selection_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_selection_statement_in_statement561);
					selection_statement60=selection_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, selection_statement60.getTree());

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\first.g:67:13: iteration_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_iteration_statement_in_statement575);
					iteration_statement61=iteration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, iteration_statement61.getTree());

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\first.g:68:13: jump_statement
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_jump_statement_in_statement589);
					jump_statement62=jump_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, jump_statement62.getTree());

					}
					break;

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
	// $ANTLR end "statement"


	public static class expression_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression_statement"
	// D:\\JAVA\\first\\src\\first.g:70:2: expression_statement : ( expression )? ';' !;
	public final firstParser.expression_statement_return expression_statement() throws RecognitionException {
		firstParser.expression_statement_return retval = new firstParser.expression_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal64=null;
		ParserRuleReturnScope expression63 =null;

		CommonTree char_literal64_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:70:22: ( ( expression )? ';' !)
			// D:\\JAVA\\first\\src\\first.g:70:24: ( expression )? ';' !
			{
			root_0 = (CommonTree)adaptor.nil();


			// D:\\JAVA\\first\\src\\first.g:70:24: ( expression )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==Dec||LA18_0==Hex||(LA18_0 >= Nice_character_constant && LA18_0 <= Oct)||LA18_0==25||LA18_0==30||LA18_0==32||LA18_0==34||(LA18_0 >= 36 && LA18_0 <= 37)||LA18_0==58||LA18_0==61||LA18_0==70||LA18_0==80) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:70:24: expression
					{
					pushFollow(FOLLOW_expression_in_expression_statement598);
					expression63=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression63.getTree());

					}
					break;

			}

			char_literal64=(Token)match(input,43,FOLLOW_43_in_expression_statement601); if (state.failed) return retval;
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
	// $ANTLR end "expression_statement"


	public static class compound_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "compound_statement"
	// D:\\JAVA\\first\\src\\first.g:72:2: compound_statement : '{' ! ( declaration )* ( statement )* '}' !;
	public final firstParser.compound_statement_return compound_statement() throws RecognitionException {
		firstParser.compound_statement_return retval = new firstParser.compound_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal65=null;
		Token char_literal68=null;
		ParserRuleReturnScope declaration66 =null;
		ParserRuleReturnScope statement67 =null;

		CommonTree char_literal65_tree=null;
		CommonTree char_literal68_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:72:20: ( '{' ! ( declaration )* ( statement )* '}' !)
			// D:\\JAVA\\first\\src\\first.g:72:22: '{' ! ( declaration )* ( statement )* '}' !
			{
			root_0 = (CommonTree)adaptor.nil();


			char_literal65=(Token)match(input,75,FOLLOW_75_in_compound_statement611); if (state.failed) return retval;
			// D:\\JAVA\\first\\src\\first.g:72:27: ( declaration )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==63||LA19_0==68||(LA19_0 >= 71 && LA19_0 <= 73)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:72:27: declaration
					{
					pushFollow(FOLLOW_declaration_in_compound_statement614);
					declaration66=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, declaration66.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			// D:\\JAVA\\first\\src\\first.g:72:40: ( statement )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==Dec||LA20_0==Hex||(LA20_0 >= Nice_character_constant && LA20_0 <= Oct)||LA20_0==25||LA20_0==30||LA20_0==32||LA20_0==34||(LA20_0 >= 36 && LA20_0 <= 37)||LA20_0==43||LA20_0==58||(LA20_0 >= 61 && LA20_0 <= 62)||LA20_0==64||(LA20_0 >= 66 && LA20_0 <= 67)||(LA20_0 >= 69 && LA20_0 <= 70)||(LA20_0 >= 74 && LA20_0 <= 75)||LA20_0==80) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:72:40: statement
					{
					pushFollow(FOLLOW_statement_in_compound_statement617);
					statement67=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement67.getTree());

					}
					break;

				default :
					break loop20;
				}
			}

			char_literal68=(Token)match(input,79,FOLLOW_79_in_compound_statement620); if (state.failed) return retval;
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
	// $ANTLR end "compound_statement"


	public static class selection_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "selection_statement"
	// D:\\JAVA\\first\\src\\first.g:74:2: selection_statement : 'if' ! '(' ! expression ')' ! statement ( 'else' statement )? ;
	public final firstParser.selection_statement_return selection_statement() throws RecognitionException {
		firstParser.selection_statement_return retval = new firstParser.selection_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal69=null;
		Token char_literal70=null;
		Token char_literal72=null;
		Token string_literal74=null;
		ParserRuleReturnScope expression71 =null;
		ParserRuleReturnScope statement73 =null;
		ParserRuleReturnScope statement75 =null;

		CommonTree string_literal69_tree=null;
		CommonTree char_literal70_tree=null;
		CommonTree char_literal72_tree=null;
		CommonTree string_literal74_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:74:21: ( 'if' ! '(' ! expression ')' ! statement ( 'else' statement )? )
			// D:\\JAVA\\first\\src\\first.g:74:23: 'if' ! '(' ! expression ')' ! statement ( 'else' statement )?
			{
			root_0 = (CommonTree)adaptor.nil();


			string_literal69=(Token)match(input,67,FOLLOW_67_in_selection_statement630); if (state.failed) return retval;
			char_literal70=(Token)match(input,32,FOLLOW_32_in_selection_statement633); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_selection_statement636);
			expression71=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression71.getTree());

			char_literal72=(Token)match(input,33,FOLLOW_33_in_selection_statement638); if (state.failed) return retval;
			pushFollow(FOLLOW_statement_in_selection_statement641);
			statement73=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement73.getTree());

			// D:\\JAVA\\first\\src\\first.g:74:60: ( 'else' statement )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==65) ) {
				int LA21_1 = input.LA(2);
				if ( (synpred29_first()) ) {
					alt21=1;
				}
			}
			switch (alt21) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:74:61: 'else' statement
					{
					string_literal74=(Token)match(input,65,FOLLOW_65_in_selection_statement644); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal74_tree = (CommonTree)adaptor.create(string_literal74);
					adaptor.addChild(root_0, string_literal74_tree);
					}

					pushFollow(FOLLOW_statement_in_selection_statement646);
					statement75=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement75.getTree());

					}
					break;

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
	// $ANTLR end "selection_statement"


	public static class iteration_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iteration_statement"
	// D:\\JAVA\\first\\src\\first.g:76:2: iteration_statement : ( 'while' ! '(' ! expression ')' ! statement | 'for' ! '(' ! ( expression )? ';' ! ( expression )? ';' ! ( expression )? ')' ! statement );
	public final firstParser.iteration_statement_return iteration_statement() throws RecognitionException {
		firstParser.iteration_statement_return retval = new firstParser.iteration_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal76=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token string_literal81=null;
		Token char_literal82=null;
		Token char_literal84=null;
		Token char_literal86=null;
		Token char_literal88=null;
		ParserRuleReturnScope expression78 =null;
		ParserRuleReturnScope statement80 =null;
		ParserRuleReturnScope expression83 =null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope expression87 =null;
		ParserRuleReturnScope statement89 =null;

		CommonTree string_literal76_tree=null;
		CommonTree char_literal77_tree=null;
		CommonTree char_literal79_tree=null;
		CommonTree string_literal81_tree=null;
		CommonTree char_literal82_tree=null;
		CommonTree char_literal84_tree=null;
		CommonTree char_literal86_tree=null;
		CommonTree char_literal88_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:76:21: ( 'while' ! '(' ! expression ')' ! statement | 'for' ! '(' ! ( expression )? ';' ! ( expression )? ';' ! ( expression )? ')' ! statement )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==74) ) {
				alt25=1;
			}
			else if ( (LA25_0==66) ) {
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
					// D:\\JAVA\\first\\src\\first.g:76:23: 'while' ! '(' ! expression ')' ! statement
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal76=(Token)match(input,74,FOLLOW_74_in_iteration_statement657); if (state.failed) return retval;
					char_literal77=(Token)match(input,32,FOLLOW_32_in_iteration_statement660); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_iteration_statement663);
					expression78=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression78.getTree());

					char_literal79=(Token)match(input,33,FOLLOW_33_in_iteration_statement665); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_iteration_statement668);
					statement80=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement80.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:77:23: 'for' ! '(' ! ( expression )? ';' ! ( expression )? ';' ! ( expression )? ')' ! statement
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal81=(Token)match(input,66,FOLLOW_66_in_iteration_statement692); if (state.failed) return retval;
					char_literal82=(Token)match(input,32,FOLLOW_32_in_iteration_statement695); if (state.failed) return retval;
					// D:\\JAVA\\first\\src\\first.g:77:35: ( expression )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==Dec||LA22_0==Hex||(LA22_0 >= Nice_character_constant && LA22_0 <= Oct)||LA22_0==25||LA22_0==30||LA22_0==32||LA22_0==34||(LA22_0 >= 36 && LA22_0 <= 37)||LA22_0==58||LA22_0==61||LA22_0==70||LA22_0==80) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:77:35: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement698);
							expression83=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression83.getTree());

							}
							break;

					}

					char_literal84=(Token)match(input,43,FOLLOW_43_in_iteration_statement701); if (state.failed) return retval;
					// D:\\JAVA\\first\\src\\first.g:77:52: ( expression )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==Dec||LA23_0==Hex||(LA23_0 >= Nice_character_constant && LA23_0 <= Oct)||LA23_0==25||LA23_0==30||LA23_0==32||LA23_0==34||(LA23_0 >= 36 && LA23_0 <= 37)||LA23_0==58||LA23_0==61||LA23_0==70||LA23_0==80) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:77:52: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement704);
							expression85=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression85.getTree());

							}
							break;

					}

					char_literal86=(Token)match(input,43,FOLLOW_43_in_iteration_statement707); if (state.failed) return retval;
					// D:\\JAVA\\first\\src\\first.g:77:69: ( expression )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==Dec||LA24_0==Hex||(LA24_0 >= Nice_character_constant && LA24_0 <= Oct)||LA24_0==25||LA24_0==30||LA24_0==32||LA24_0==34||(LA24_0 >= 36 && LA24_0 <= 37)||LA24_0==58||LA24_0==61||LA24_0==70||LA24_0==80) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:77:69: expression
							{
							pushFollow(FOLLOW_expression_in_iteration_statement710);
							expression87=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression87.getTree());

							}
							break;

					}

					char_literal88=(Token)match(input,33,FOLLOW_33_in_iteration_statement713); if (state.failed) return retval;
					pushFollow(FOLLOW_statement_in_iteration_statement716);
					statement89=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement89.getTree());

					}
					break;

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
	// $ANTLR end "iteration_statement"


	public static class jump_statement_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "jump_statement"
	// D:\\JAVA\\first\\src\\first.g:79:2: jump_statement : ( 'continue' ';' !| 'break' ';' !| 'return' ( expression )? ';' !);
	public final firstParser.jump_statement_return jump_statement() throws RecognitionException {
		firstParser.jump_statement_return retval = new firstParser.jump_statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal90=null;
		Token char_literal91=null;
		Token string_literal92=null;
		Token char_literal93=null;
		Token string_literal94=null;
		Token char_literal96=null;
		ParserRuleReturnScope expression95 =null;

		CommonTree string_literal90_tree=null;
		CommonTree char_literal91_tree=null;
		CommonTree string_literal92_tree=null;
		CommonTree char_literal93_tree=null;
		CommonTree string_literal94_tree=null;
		CommonTree char_literal96_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:79:16: ( 'continue' ';' !| 'break' ';' !| 'return' ( expression )? ';' !)
			int alt27=3;
			switch ( input.LA(1) ) {
			case 64:
				{
				alt27=1;
				}
				break;
			case 62:
				{
				alt27=2;
				}
				break;
			case 69:
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
					// D:\\JAVA\\first\\src\\first.g:79:18: 'continue' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal90=(Token)match(input,64,FOLLOW_64_in_jump_statement725); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal90_tree = (CommonTree)adaptor.create(string_literal90);
					adaptor.addChild(root_0, string_literal90_tree);
					}

					char_literal91=(Token)match(input,43,FOLLOW_43_in_jump_statement727); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:80:18: 'break' ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal92=(Token)match(input,62,FOLLOW_62_in_jump_statement747); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal92_tree = (CommonTree)adaptor.create(string_literal92);
					adaptor.addChild(root_0, string_literal92_tree);
					}

					char_literal93=(Token)match(input,43,FOLLOW_43_in_jump_statement749); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:81:18: 'return' ( expression )? ';' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal94=(Token)match(input,69,FOLLOW_69_in_jump_statement769); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal94_tree = (CommonTree)adaptor.create(string_literal94);
					adaptor.addChild(root_0, string_literal94_tree);
					}

					// D:\\JAVA\\first\\src\\first.g:81:27: ( expression )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==Dec||LA26_0==Hex||(LA26_0 >= Nice_character_constant && LA26_0 <= Oct)||LA26_0==25||LA26_0==30||LA26_0==32||LA26_0==34||(LA26_0 >= 36 && LA26_0 <= 37)||LA26_0==58||LA26_0==61||LA26_0==70||LA26_0==80) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:81:27: expression
							{
							pushFollow(FOLLOW_expression_in_jump_statement771);
							expression95=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression95.getTree());

							}
							break;

					}

					char_literal96=(Token)match(input,43,FOLLOW_43_in_jump_statement774); if (state.failed) return retval;
					}
					break;

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
	// $ANTLR end "jump_statement"


	public static class expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// D:\\JAVA\\first\\src\\first.g:83:2: expression : assignment_expression ( ',' ! assignment_expression )* ;
	public final firstParser.expression_return expression() throws RecognitionException {
		firstParser.expression_return retval = new firstParser.expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal98=null;
		ParserRuleReturnScope assignment_expression97 =null;
		ParserRuleReturnScope assignment_expression99 =null;

		CommonTree char_literal98_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:83:12: ( assignment_expression ( ',' ! assignment_expression )* )
			// D:\\JAVA\\first\\src\\first.g:83:14: assignment_expression ( ',' ! assignment_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_expression_in_expression783);
			assignment_expression97=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression97.getTree());

			// D:\\JAVA\\first\\src\\first.g:83:36: ( ',' ! assignment_expression )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==39) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:83:37: ',' ! assignment_expression
					{
					char_literal98=(Token)match(input,39,FOLLOW_39_in_expression786); if (state.failed) return retval;
					pushFollow(FOLLOW_assignment_expression_in_expression789);
					assignment_expression99=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression99.getTree());

					}
					break;

				default :
					break loop28;
				}
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
	// $ANTLR end "expression"


	public static class assignment_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_expression"
	// D:\\JAVA\\first\\src\\first.g:85:2: assignment_expression : ( unary_expression assignment_operator ^ assignment_expression | logical_or_expression );
	public final firstParser.assignment_expression_return assignment_expression() throws RecognitionException {
		firstParser.assignment_expression_return retval = new firstParser.assignment_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope unary_expression100 =null;
		ParserRuleReturnScope assignment_operator101 =null;
		ParserRuleReturnScope assignment_expression102 =null;
		ParserRuleReturnScope logical_or_expression103 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:85:23: ( unary_expression assignment_operator ^ assignment_expression | logical_or_expression )
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
			case Hex:
			case Oct:
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
			case Nice_character_constant:
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
			case Nice_string:
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
			case 32:
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
			case 37:
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
			case 61:
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
			case 25:
			case 30:
			case 34:
			case 36:
			case 58:
			case 80:
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
			case 70:
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
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:86:23: unary_expression assignment_operator ^ assignment_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unary_expression_in_assignment_expression823);
					unary_expression100=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression100.getTree());

					pushFollow(FOLLOW_assignment_operator_in_assignment_expression825);
					assignment_operator101=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(assignment_operator101.getTree(), root_0);
					pushFollow(FOLLOW_assignment_expression_in_assignment_expression828);
					assignment_expression102=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression102.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:87:25: logical_or_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_logical_or_expression_in_assignment_expression854);
					logical_or_expression103=logical_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression103.getTree());

					}
					break;

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
	// $ANTLR end "assignment_expression"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// D:\\JAVA\\first\\src\\first.g:90:2: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '_=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
	public final firstParser.assignment_operator_return assignment_operator() throws RecognitionException {
		firstParser.assignment_operator_return retval = new firstParser.assignment_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set104=null;

		CommonTree set104_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:90:21: ( '=' | '*=' | '/=' | '%=' | '+=' | '_=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set104=input.LT(1);
			if ( input.LA(1)==28||input.LA(1)==31||input.LA(1)==35||input.LA(1)==38||input.LA(1)==42||input.LA(1)==46||input.LA(1)==48||input.LA(1)==53||input.LA(1)==57||input.LA(1)==59||input.LA(1)==77 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set104));
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
	// D:\\JAVA\\first\\src\\first.g:92:2: constant_expression : logical_or_expression ;
	public final firstParser.constant_expression_return constant_expression() throws RecognitionException {
		firstParser.constant_expression_return retval = new firstParser.constant_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope logical_or_expression105 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:92:21: ( logical_or_expression )
			// D:\\JAVA\\first\\src\\first.g:92:23: logical_or_expression
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logical_or_expression_in_constant_expression935);
			logical_or_expression105=logical_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_or_expression105.getTree());

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
	// D:\\JAVA\\first\\src\\first.g:94:2: logical_or_expression : logical_and_expression ( '||' ^ logical_and_expression )* ;
	public final firstParser.logical_or_expression_return logical_or_expression() throws RecognitionException {
		firstParser.logical_or_expression_return retval = new firstParser.logical_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal107=null;
		ParserRuleReturnScope logical_and_expression106 =null;
		ParserRuleReturnScope logical_and_expression108 =null;

		CommonTree string_literal107_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:94:23: ( logical_and_expression ( '||' ^ logical_and_expression )* )
			// D:\\JAVA\\first\\src\\first.g:94:25: logical_and_expression ( '||' ^ logical_and_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression944);
			logical_and_expression106=logical_and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression106.getTree());

			// D:\\JAVA\\first\\src\\first.g:94:48: ( '||' ^ logical_and_expression )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==78) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:94:49: '||' ^ logical_and_expression
					{
					string_literal107=(Token)match(input,78,FOLLOW_78_in_logical_or_expression947); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal107_tree = (CommonTree)adaptor.create(string_literal107);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal107_tree, root_0);
					}

					pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression950);
					logical_and_expression108=logical_and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, logical_and_expression108.getTree());

					}
					break;

				default :
					break loop30;
				}
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
	// D:\\JAVA\\first\\src\\first.g:96:2: logical_and_expression : inclusive_or_expression ( '&&' ^ inclusive_or_expression )* ;
	public final firstParser.logical_and_expression_return logical_and_expression() throws RecognitionException {
		firstParser.logical_and_expression_return retval = new firstParser.logical_and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal110=null;
		ParserRuleReturnScope inclusive_or_expression109 =null;
		ParserRuleReturnScope inclusive_or_expression111 =null;

		CommonTree string_literal110_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:96:24: ( inclusive_or_expression ( '&&' ^ inclusive_or_expression )* )
			// D:\\JAVA\\first\\src\\first.g:96:26: inclusive_or_expression ( '&&' ^ inclusive_or_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression961);
			inclusive_or_expression109=inclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression109.getTree());

			// D:\\JAVA\\first\\src\\first.g:96:50: ( '&&' ^ inclusive_or_expression )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==29) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:96:51: '&&' ^ inclusive_or_expression
					{
					string_literal110=(Token)match(input,29,FOLLOW_29_in_logical_and_expression964); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal110_tree = (CommonTree)adaptor.create(string_literal110);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal110_tree, root_0);
					}

					pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression967);
					inclusive_or_expression111=inclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusive_or_expression111.getTree());

					}
					break;

				default :
					break loop31;
				}
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
	// D:\\JAVA\\first\\src\\first.g:98:2: inclusive_or_expression : exclusive_or_expression ( '|' ^ exclusive_or_expression )* ;
	public final firstParser.inclusive_or_expression_return inclusive_or_expression() throws RecognitionException {
		firstParser.inclusive_or_expression_return retval = new firstParser.inclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal113=null;
		ParserRuleReturnScope exclusive_or_expression112 =null;
		ParserRuleReturnScope exclusive_or_expression114 =null;

		CommonTree char_literal113_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:98:25: ( exclusive_or_expression ( '|' ^ exclusive_or_expression )* )
			// D:\\JAVA\\first\\src\\first.g:98:27: exclusive_or_expression ( '|' ^ exclusive_or_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression978);
			exclusive_or_expression112=exclusive_or_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression112.getTree());

			// D:\\JAVA\\first\\src\\first.g:98:51: ( '|' ^ exclusive_or_expression )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==76) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:98:52: '|' ^ exclusive_or_expression
					{
					char_literal113=(Token)match(input,76,FOLLOW_76_in_inclusive_or_expression981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal113_tree = (CommonTree)adaptor.create(char_literal113);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal113_tree, root_0);
					}

					pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression984);
					exclusive_or_expression114=exclusive_or_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusive_or_expression114.getTree());

					}
					break;

				default :
					break loop32;
				}
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
	// D:\\JAVA\\first\\src\\first.g:100:2: exclusive_or_expression : and_expression ( '^' ^ and_expression )* ;
	public final firstParser.exclusive_or_expression_return exclusive_or_expression() throws RecognitionException {
		firstParser.exclusive_or_expression_return retval = new firstParser.exclusive_or_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal116=null;
		ParserRuleReturnScope and_expression115 =null;
		ParserRuleReturnScope and_expression117 =null;

		CommonTree char_literal116_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:100:25: ( and_expression ( '^' ^ and_expression )* )
			// D:\\JAVA\\first\\src\\first.g:100:27: and_expression ( '^' ^ and_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_and_expression_in_exclusive_or_expression995);
			and_expression115=and_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression115.getTree());

			// D:\\JAVA\\first\\src\\first.g:100:42: ( '^' ^ and_expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==56) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:100:43: '^' ^ and_expression
					{
					char_literal116=(Token)match(input,56,FOLLOW_56_in_exclusive_or_expression998); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal116_tree = (CommonTree)adaptor.create(char_literal116);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal116_tree, root_0);
					}

					pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1001);
					and_expression117=and_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, and_expression117.getTree());

					}
					break;

				default :
					break loop33;
				}
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
	// D:\\JAVA\\first\\src\\first.g:102:2: and_expression : equality_expression ( '&' ^ equality_expression )* ;
	public final firstParser.and_expression_return and_expression() throws RecognitionException {
		firstParser.and_expression_return retval = new firstParser.and_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal119=null;
		ParserRuleReturnScope equality_expression118 =null;
		ParserRuleReturnScope equality_expression120 =null;

		CommonTree char_literal119_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:102:16: ( equality_expression ( '&' ^ equality_expression )* )
			// D:\\JAVA\\first\\src\\first.g:102:18: equality_expression ( '&' ^ equality_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_equality_expression_in_and_expression1012);
			equality_expression118=equality_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression118.getTree());

			// D:\\JAVA\\first\\src\\first.g:102:38: ( '&' ^ equality_expression )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==30) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:102:39: '&' ^ equality_expression
					{
					char_literal119=(Token)match(input,30,FOLLOW_30_in_and_expression1015); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal119_tree = (CommonTree)adaptor.create(char_literal119);
					root_0 = (CommonTree)adaptor.becomeRoot(char_literal119_tree, root_0);
					}

					pushFollow(FOLLOW_equality_expression_in_and_expression1018);
					equality_expression120=equality_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, equality_expression120.getTree());

					}
					break;

				default :
					break loop34;
				}
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
	// D:\\JAVA\\first\\src\\first.g:104:2: equality_expression : relational_expression ( equality_operator ^ relational_expression )* ;
	public final firstParser.equality_expression_return equality_expression() throws RecognitionException {
		firstParser.equality_expression_return retval = new firstParser.equality_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope relational_expression121 =null;
		ParserRuleReturnScope equality_operator122 =null;
		ParserRuleReturnScope relational_expression123 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:104:21: ( relational_expression ( equality_operator ^ relational_expression )* )
			// D:\\JAVA\\first\\src\\first.g:104:23: relational_expression ( equality_operator ^ relational_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_relational_expression_in_equality_expression1029);
			relational_expression121=relational_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression121.getTree());

			// D:\\JAVA\\first\\src\\first.g:104:45: ( equality_operator ^ relational_expression )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==26||LA35_0==49) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:104:46: equality_operator ^ relational_expression
					{
					pushFollow(FOLLOW_equality_operator_in_equality_expression1032);
					equality_operator122=equality_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(equality_operator122.getTree(), root_0);
					pushFollow(FOLLOW_relational_expression_in_equality_expression1035);
					relational_expression123=relational_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression123.getTree());

					}
					break;

				default :
					break loop35;
				}
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
	// D:\\JAVA\\first\\src\\first.g:106:2: equality_operator : ( '==' | '!=' );
	public final firstParser.equality_operator_return equality_operator() throws RecognitionException {
		firstParser.equality_operator_return retval = new firstParser.equality_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set124=null;

		CommonTree set124_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:106:19: ( '==' | '!=' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set124=input.LT(1);
			if ( input.LA(1)==26||input.LA(1)==49 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set124));
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
	// D:\\JAVA\\first\\src\\first.g:108:2: relational_expression : shift_expression ( relational_operator ^ shift_expression )* ;
	public final firstParser.relational_expression_return relational_expression() throws RecognitionException {
		firstParser.relational_expression_return retval = new firstParser.relational_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope shift_expression125 =null;
		ParserRuleReturnScope relational_operator126 =null;
		ParserRuleReturnScope shift_expression127 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:108:23: ( shift_expression ( relational_operator ^ shift_expression )* )
			// D:\\JAVA\\first\\src\\first.g:108:25: shift_expression ( relational_operator ^ shift_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_shift_expression_in_relational_expression1059);
			shift_expression125=shift_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression125.getTree());

			// D:\\JAVA\\first\\src\\first.g:108:42: ( relational_operator ^ shift_expression )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==44||LA36_0==47||(LA36_0 >= 50 && LA36_0 <= 51)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:108:43: relational_operator ^ shift_expression
					{
					pushFollow(FOLLOW_relational_operator_in_relational_expression1062);
					relational_operator126=relational_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relational_operator126.getTree(), root_0);
					pushFollow(FOLLOW_shift_expression_in_relational_expression1065);
					shift_expression127=shift_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, shift_expression127.getTree());

					}
					break;

				default :
					break loop36;
				}
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
	// D:\\JAVA\\first\\src\\first.g:110:2: relational_operator : ( '<' | '>' | '<=' | '>=' );
	public final firstParser.relational_operator_return relational_operator() throws RecognitionException {
		firstParser.relational_operator_return retval = new firstParser.relational_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set128=null;

		CommonTree set128_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:110:21: ( '<' | '>' | '<=' | '>=' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set128=input.LT(1);
			if ( input.LA(1)==44||input.LA(1)==47||(input.LA(1) >= 50 && input.LA(1) <= 51) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set128));
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
	// D:\\JAVA\\first\\src\\first.g:112:2: shift_expression : additive_expression ( shift_operator ^ additive_expression )* ;
	public final firstParser.shift_expression_return shift_expression() throws RecognitionException {
		firstParser.shift_expression_return retval = new firstParser.shift_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope additive_expression129 =null;
		ParserRuleReturnScope shift_operator130 =null;
		ParserRuleReturnScope additive_expression131 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:112:18: ( additive_expression ( shift_operator ^ additive_expression )* )
			// D:\\JAVA\\first\\src\\first.g:112:20: additive_expression ( shift_operator ^ additive_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_additive_expression_in_shift_expression1097);
			additive_expression129=additive_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression129.getTree());

			// D:\\JAVA\\first\\src\\first.g:112:40: ( shift_operator ^ additive_expression )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==45||LA37_0==52) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:112:41: shift_operator ^ additive_expression
					{
					pushFollow(FOLLOW_shift_operator_in_shift_expression1100);
					shift_operator130=shift_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(shift_operator130.getTree(), root_0);
					pushFollow(FOLLOW_additive_expression_in_shift_expression1103);
					additive_expression131=additive_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression131.getTree());

					}
					break;

				default :
					break loop37;
				}
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
	// D:\\JAVA\\first\\src\\first.g:114:2: shift_operator : ( '<<' | '>>' );
	public final firstParser.shift_operator_return shift_operator() throws RecognitionException {
		firstParser.shift_operator_return retval = new firstParser.shift_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set132=null;

		CommonTree set132_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:114:16: ( '<<' | '>>' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set132=input.LT(1);
			if ( input.LA(1)==45||input.LA(1)==52 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set132));
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
	// D:\\JAVA\\first\\src\\first.g:116:2: additive_expression : multiplicative_expression ( additive_operator ^ multiplicative_expression )* ;
	public final firstParser.additive_expression_return additive_expression() throws RecognitionException {
		firstParser.additive_expression_return retval = new firstParser.additive_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope multiplicative_expression133 =null;
		ParserRuleReturnScope additive_operator134 =null;
		ParserRuleReturnScope multiplicative_expression135 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:116:21: ( multiplicative_expression ( additive_operator ^ multiplicative_expression )* )
			// D:\\JAVA\\first\\src\\first.g:116:23: multiplicative_expression ( additive_operator ^ multiplicative_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1127);
			multiplicative_expression133=multiplicative_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression133.getTree());

			// D:\\JAVA\\first\\src\\first.g:116:49: ( additive_operator ^ multiplicative_expression )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==36||LA38_0==58) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:116:50: additive_operator ^ multiplicative_expression
					{
					pushFollow(FOLLOW_additive_operator_in_additive_expression1130);
					additive_operator134=additive_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(additive_operator134.getTree(), root_0);
					pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1133);
					multiplicative_expression135=multiplicative_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression135.getTree());

					}
					break;

				default :
					break loop38;
				}
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
	// D:\\JAVA\\first\\src\\first.g:118:1: additive_operator : ( '+' | '_' );
	public final firstParser.additive_operator_return additive_operator() throws RecognitionException {
		firstParser.additive_operator_return retval = new firstParser.additive_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set136=null;

		CommonTree set136_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:118:18: ( '+' | '_' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set136=input.LT(1);
			if ( input.LA(1)==36||input.LA(1)==58 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set136));
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
	// D:\\JAVA\\first\\src\\first.g:120:1: multiplicative_expression : cast_expression ( multiplicative_operator ^ cast_expression )* ;
	public final firstParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
		firstParser.multiplicative_expression_return retval = new firstParser.multiplicative_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope cast_expression137 =null;
		ParserRuleReturnScope multiplicative_operator138 =null;
		ParserRuleReturnScope cast_expression139 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:120:26: ( cast_expression ( multiplicative_operator ^ cast_expression )* )
			// D:\\JAVA\\first\\src\\first.g:120:28: cast_expression ( multiplicative_operator ^ cast_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1155);
			cast_expression137=cast_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression137.getTree());

			// D:\\JAVA\\first\\src\\first.g:120:44: ( multiplicative_operator ^ cast_expression )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==27||LA39_0==34||LA39_0==41) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:120:45: multiplicative_operator ^ cast_expression
					{
					pushFollow(FOLLOW_multiplicative_operator_in_multiplicative_expression1158);
					multiplicative_operator138=multiplicative_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(multiplicative_operator138.getTree(), root_0);
					pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1161);
					cast_expression139=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression139.getTree());

					}
					break;

				default :
					break loop39;
				}
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
	// D:\\JAVA\\first\\src\\first.g:122:1: multiplicative_operator : ( '*' | '/' | '%' );
	public final firstParser.multiplicative_operator_return multiplicative_operator() throws RecognitionException {
		firstParser.multiplicative_operator_return retval = new firstParser.multiplicative_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set140=null;

		CommonTree set140_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:122:24: ( '*' | '/' | '%' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set140=input.LT(1);
			if ( input.LA(1)==27||input.LA(1)==34||input.LA(1)==41 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set140));
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
	// D:\\JAVA\\first\\src\\first.g:124:1: cast_expression : ( unary_expression | '(' ! type_name ')' ! cast_expression );
	public final firstParser.cast_expression_return cast_expression() throws RecognitionException {
		firstParser.cast_expression_return retval = new firstParser.cast_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal142=null;
		Token char_literal144=null;
		ParserRuleReturnScope unary_expression141 =null;
		ParserRuleReturnScope type_name143 =null;
		ParserRuleReturnScope cast_expression145 =null;

		CommonTree char_literal142_tree=null;
		CommonTree char_literal144_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:124:16: ( unary_expression | '(' ! type_name ')' ! cast_expression )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Dec||LA40_0==Hex||(LA40_0 >= Nice_character_constant && LA40_0 <= Oct)||LA40_0==25||LA40_0==30||LA40_0==34||(LA40_0 >= 36 && LA40_0 <= 37)||LA40_0==58||LA40_0==61||LA40_0==70||LA40_0==80) ) {
				alt40=1;
			}
			else if ( (LA40_0==32) ) {
				int LA40_2 = input.LA(2);
				if ( (LA40_2==Dec||LA40_2==Hex||(LA40_2 >= Nice_character_constant && LA40_2 <= Oct)||LA40_2==25||LA40_2==30||LA40_2==32||LA40_2==34||(LA40_2 >= 36 && LA40_2 <= 37)||LA40_2==58||LA40_2==61||LA40_2==70||LA40_2==80) ) {
					alt40=1;
				}
				else if ( (LA40_2==63||LA40_2==68||(LA40_2 >= 71 && LA40_2 <= 73)) ) {
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
					// D:\\JAVA\\first\\src\\first.g:124:18: unary_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unary_expression_in_cast_expression1187);
					unary_expression141=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression141.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:125:19: '(' ! type_name ')' ! cast_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal142=(Token)match(input,32,FOLLOW_32_in_cast_expression1207); if (state.failed) return retval;
					pushFollow(FOLLOW_type_name_in_cast_expression1210);
					type_name143=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name143.getTree());

					char_literal144=(Token)match(input,33,FOLLOW_33_in_cast_expression1212); if (state.failed) return retval;
					pushFollow(FOLLOW_cast_expression_in_cast_expression1215);
					cast_expression145=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression145.getTree());

					}
					break;

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
	// $ANTLR end "cast_expression"


	public static class type_name_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type_name"
	// D:\\JAVA\\first\\src\\first.g:127:1: type_name : type_specifier ^ ( '*' )* ;
	public final firstParser.type_name_return type_name() throws RecognitionException {
		firstParser.type_name_return retval = new firstParser.type_name_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal147=null;
		ParserRuleReturnScope type_specifier146 =null;

		CommonTree char_literal147_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:127:10: ( type_specifier ^ ( '*' )* )
			// D:\\JAVA\\first\\src\\first.g:127:12: type_specifier ^ ( '*' )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_type_specifier_in_type_name1223);
			type_specifier146=type_specifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(type_specifier146.getTree(), root_0);
			// D:\\JAVA\\first\\src\\first.g:127:28: ( '*' )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==34) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:127:28: '*'
					{
					char_literal147=(Token)match(input,34,FOLLOW_34_in_type_name1226); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal147_tree = (CommonTree)adaptor.create(char_literal147);
					adaptor.addChild(root_0, char_literal147_tree);
					}

					}
					break;

				default :
					break loop41;
				}
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
	// $ANTLR end "type_name"


	public static class unary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_expression"
	// D:\\JAVA\\first\\src\\first.g:129:1: unary_expression : ( postfix_expression | '++' unary_expression -> ^( PREADD unary_expression ) | '__' unary_expression -> ^( PREUNDERLINE unary_expression ) | unary_operator ^ cast_expression | 'sizeof' ^ unary_expression | 'sizeof' ^ '(' ! type_name ')' !);
	public final firstParser.unary_expression_return unary_expression() throws RecognitionException {
		firstParser.unary_expression_return retval = new firstParser.unary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token string_literal149=null;
		Token string_literal151=null;
		Token string_literal155=null;
		Token string_literal157=null;
		Token char_literal158=null;
		Token char_literal160=null;
		ParserRuleReturnScope postfix_expression148 =null;
		ParserRuleReturnScope unary_expression150 =null;
		ParserRuleReturnScope unary_expression152 =null;
		ParserRuleReturnScope unary_operator153 =null;
		ParserRuleReturnScope cast_expression154 =null;
		ParserRuleReturnScope unary_expression156 =null;
		ParserRuleReturnScope type_name159 =null;

		CommonTree string_literal149_tree=null;
		CommonTree string_literal151_tree=null;
		CommonTree string_literal155_tree=null;
		CommonTree string_literal157_tree=null;
		CommonTree char_literal158_tree=null;
		CommonTree char_literal160_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_unary_expression=new RewriteRuleSubtreeStream(adaptor,"rule unary_expression");

		try {
			// D:\\JAVA\\first\\src\\first.g:129:17: ( postfix_expression | '++' unary_expression -> ^( PREADD unary_expression ) | '__' unary_expression -> ^( PREUNDERLINE unary_expression ) | unary_operator ^ cast_expression | 'sizeof' ^ unary_expression | 'sizeof' ^ '(' ! type_name ')' !)
			int alt42=6;
			switch ( input.LA(1) ) {
			case Dec:
			case Hex:
			case Nice_character_constant:
			case Nice_identifier:
			case Nice_string:
			case Oct:
			case 32:
				{
				alt42=1;
				}
				break;
			case 37:
				{
				alt42=2;
				}
				break;
			case 61:
				{
				alt42=3;
				}
				break;
			case 25:
			case 30:
			case 34:
			case 36:
			case 58:
			case 80:
				{
				alt42=4;
				}
				break;
			case 70:
				{
				int LA42_5 = input.LA(2);
				if ( (LA42_5==32) ) {
					int LA42_6 = input.LA(3);
					if ( (LA42_6==63||LA42_6==68||(LA42_6 >= 71 && LA42_6 <= 73)) ) {
						alt42=6;
					}
					else if ( (LA42_6==Dec||LA42_6==Hex||(LA42_6 >= Nice_character_constant && LA42_6 <= Oct)||LA42_6==25||LA42_6==30||LA42_6==32||LA42_6==34||(LA42_6 >= 36 && LA42_6 <= 37)||LA42_6==58||LA42_6==61||LA42_6==70||LA42_6==80) ) {
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
				else if ( (LA42_5==Dec||LA42_5==Hex||(LA42_5 >= Nice_character_constant && LA42_5 <= Oct)||LA42_5==25||LA42_5==30||LA42_5==34||(LA42_5 >= 36 && LA42_5 <= 37)||LA42_5==58||LA42_5==61||LA42_5==70||LA42_5==80) ) {
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
					// D:\\JAVA\\first\\src\\first.g:129:19: postfix_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_postfix_expression_in_unary_expression1236);
					postfix_expression148=postfix_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression148.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:130:20: '++' unary_expression
					{
					string_literal149=(Token)match(input,37,FOLLOW_37_in_unary_expression1257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(string_literal149);

					pushFollow(FOLLOW_unary_expression_in_unary_expression1259);
					unary_expression150=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression150.getTree());
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
					// 130:42: -> ^( PREADD unary_expression )
					{
						// D:\\JAVA\\first\\src\\first.g:130:45: ^( PREADD unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREADD, "PREADD"), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:131:20: '__' unary_expression
					{
					string_literal151=(Token)match(input,61,FOLLOW_61_in_unary_expression1288); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_61.add(string_literal151);

					pushFollow(FOLLOW_unary_expression_in_unary_expression1290);
					unary_expression152=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expression.add(unary_expression152.getTree());
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
					// 131:42: -> ^( PREUNDERLINE unary_expression )
					{
						// D:\\JAVA\\first\\src\\first.g:131:45: ^( PREUNDERLINE unary_expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PREUNDERLINE, "PREUNDERLINE"), root_1);
						adaptor.addChild(root_1, stream_unary_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\first.g:132:20: unary_operator ^ cast_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_unary_operator_in_unary_expression1319);
					unary_operator153=unary_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(unary_operator153.getTree(), root_0);
					pushFollow(FOLLOW_cast_expression_in_unary_expression1322);
					cast_expression154=cast_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_expression154.getTree());

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\first.g:133:20: 'sizeof' ^ unary_expression
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal155=(Token)match(input,70,FOLLOW_70_in_unary_expression1343); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal155_tree = (CommonTree)adaptor.create(string_literal155);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal155_tree, root_0);
					}

					pushFollow(FOLLOW_unary_expression_in_unary_expression1346);
					unary_expression156=unary_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expression156.getTree());

					}
					break;
				case 6 :
					// D:\\JAVA\\first\\src\\first.g:134:20: 'sizeof' ^ '(' ! type_name ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					string_literal157=(Token)match(input,70,FOLLOW_70_in_unary_expression1367); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal157_tree = (CommonTree)adaptor.create(string_literal157);
					root_0 = (CommonTree)adaptor.becomeRoot(string_literal157_tree, root_0);
					}

					char_literal158=(Token)match(input,32,FOLLOW_32_in_unary_expression1370); if (state.failed) return retval;
					pushFollow(FOLLOW_type_name_in_unary_expression1373);
					type_name159=type_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, type_name159.getTree());

					char_literal160=(Token)match(input,33,FOLLOW_33_in_unary_expression1375); if (state.failed) return retval;
					}
					break;

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
	// $ANTLR end "unary_expression"


	public static class unary_operator_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary_operator"
	// D:\\JAVA\\first\\src\\first.g:136:1: unary_operator : ( '&' | '*' | '+' | '_' | '~' | '!' );
	public final firstParser.unary_operator_return unary_operator() throws RecognitionException {
		firstParser.unary_operator_return retval = new firstParser.unary_operator_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set161=null;

		CommonTree set161_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:136:15: ( '&' | '*' | '+' | '_' | '~' | '!' )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set161=input.LT(1);
			if ( input.LA(1)==25||input.LA(1)==30||input.LA(1)==34||input.LA(1)==36||input.LA(1)==58||input.LA(1)==80 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set161));
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
	// D:\\JAVA\\first\\src\\first.g:138:1: postfix_expression : primary_expression ( postfix ^)* ;
	public final firstParser.postfix_expression_return postfix_expression() throws RecognitionException {
		firstParser.postfix_expression_return retval = new firstParser.postfix_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope primary_expression162 =null;
		ParserRuleReturnScope postfix163 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:138:19: ( primary_expression ( postfix ^)* )
			// D:\\JAVA\\first\\src\\first.g:138:21: primary_expression ( postfix ^)*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_primary_expression_in_postfix_expression1412);
			primary_expression162=primary_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, primary_expression162.getTree());

			// D:\\JAVA\\first\\src\\first.g:138:47: ( postfix ^)*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==32||LA43_0==37||LA43_0==40||LA43_0==54||(LA43_0 >= 60 && LA43_0 <= 61)) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:138:47: postfix ^
					{
					pushFollow(FOLLOW_postfix_in_postfix_expression1414);
					postfix163=postfix();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(postfix163.getTree(), root_0);
					}
					break;

				default :
					break loop43;
				}
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
	// $ANTLR end "postfix_expression"


	public static class postfix_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "postfix"
	// D:\\JAVA\\first\\src\\first.g:140:1: postfix : ( '[' expression ']' -> ^( INDEX expression ) | '(' ( arguments )? ')' -> ^( ARGUMENT ( arguments )? ) | '.' identifier -> ^( METHOD identifier ) | '_>' identifier -> ^( POINTER identifier ) | '++' -> POSTADD | '__' -> POSTUNDERLINE );
	public final firstParser.postfix_return postfix() throws RecognitionException {
		firstParser.postfix_return retval = new firstParser.postfix_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal164=null;
		Token char_literal166=null;
		Token char_literal167=null;
		Token char_literal169=null;
		Token char_literal170=null;
		Token string_literal172=null;
		Token string_literal174=null;
		Token string_literal175=null;
		ParserRuleReturnScope expression165 =null;
		ParserRuleReturnScope arguments168 =null;
		ParserRuleReturnScope identifier171 =null;
		ParserRuleReturnScope identifier173 =null;

		CommonTree char_literal164_tree=null;
		CommonTree char_literal166_tree=null;
		CommonTree char_literal167_tree=null;
		CommonTree char_literal169_tree=null;
		CommonTree char_literal170_tree=null;
		CommonTree string_literal172_tree=null;
		CommonTree string_literal174_tree=null;
		CommonTree string_literal175_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		try {
			// D:\\JAVA\\first\\src\\first.g:140:8: ( '[' expression ']' -> ^( INDEX expression ) | '(' ( arguments )? ')' -> ^( ARGUMENT ( arguments )? ) | '.' identifier -> ^( METHOD identifier ) | '_>' identifier -> ^( POINTER identifier ) | '++' -> POSTADD | '__' -> POSTUNDERLINE )
			int alt45=6;
			switch ( input.LA(1) ) {
			case 54:
				{
				alt45=1;
				}
				break;
			case 32:
				{
				alt45=2;
				}
				break;
			case 40:
				{
				alt45=3;
				}
				break;
			case 60:
				{
				alt45=4;
				}
				break;
			case 37:
				{
				alt45=5;
				}
				break;
			case 61:
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
					// D:\\JAVA\\first\\src\\first.g:140:10: '[' expression ']'
					{
					char_literal164=(Token)match(input,54,FOLLOW_54_in_postfix1424); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_54.add(char_literal164);

					pushFollow(FOLLOW_expression_in_postfix1426);
					expression165=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression165.getTree());
					char_literal166=(Token)match(input,55,FOLLOW_55_in_postfix1428); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_55.add(char_literal166);

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
					// 140:29: -> ^( INDEX expression )
					{
						// D:\\JAVA\\first\\src\\first.g:140:32: ^( INDEX expression )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INDEX, "INDEX"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:141:11: '(' ( arguments )? ')'
					{
					char_literal167=(Token)match(input,32,FOLLOW_32_in_postfix1448); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_32.add(char_literal167);

					// D:\\JAVA\\first\\src\\first.g:141:15: ( arguments )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==Dec||LA44_0==Hex||(LA44_0 >= Nice_character_constant && LA44_0 <= Oct)||LA44_0==25||LA44_0==30||LA44_0==32||LA44_0==34||(LA44_0 >= 36 && LA44_0 <= 37)||LA44_0==58||LA44_0==61||LA44_0==70||LA44_0==80) ) {
						alt44=1;
					}
					switch (alt44) {
						case 1 :
							// D:\\JAVA\\first\\src\\first.g:141:15: arguments
							{
							pushFollow(FOLLOW_arguments_in_postfix1450);
							arguments168=arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arguments.add(arguments168.getTree());
							}
							break;

					}

					char_literal169=(Token)match(input,33,FOLLOW_33_in_postfix1453); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_33.add(char_literal169);

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
					// 141:30: -> ^( ARGUMENT ( arguments )? )
					{
						// D:\\JAVA\\first\\src\\first.g:141:33: ^( ARGUMENT ( arguments )? )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);
						// D:\\JAVA\\first\\src\\first.g:141:44: ( arguments )?
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
					// D:\\JAVA\\first\\src\\first.g:142:11: '.' identifier
					{
					char_literal170=(Token)match(input,40,FOLLOW_40_in_postfix1474); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_40.add(char_literal170);

					pushFollow(FOLLOW_identifier_in_postfix1476);
					identifier171=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier171.getTree());
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
					// 142:26: -> ^( METHOD identifier )
					{
						// D:\\JAVA\\first\\src\\first.g:142:29: ^( METHOD identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(METHOD, "METHOD"), root_1);
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\first.g:143:11: '_>' identifier
					{
					string_literal172=(Token)match(input,60,FOLLOW_60_in_postfix1496); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_60.add(string_literal172);

					pushFollow(FOLLOW_identifier_in_postfix1498);
					identifier173=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier173.getTree());
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
					// 143:27: -> ^( POINTER identifier )
					{
						// D:\\JAVA\\first\\src\\first.g:143:30: ^( POINTER identifier )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(POINTER, "POINTER"), root_1);
						adaptor.addChild(root_1, stream_identifier.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// D:\\JAVA\\first\\src\\first.g:144:11: '++'
					{
					string_literal174=(Token)match(input,37,FOLLOW_37_in_postfix1518); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_37.add(string_literal174);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 144:16: -> POSTADD
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(POSTADD, "POSTADD"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// D:\\JAVA\\first\\src\\first.g:145:11: '__'
					{
					string_literal175=(Token)match(input,61,FOLLOW_61_in_postfix1534); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_61.add(string_literal175);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 145:16: -> POSTUNDERLINE
					{
						adaptor.addChild(root_0, (CommonTree)adaptor.create(POSTUNDERLINE, "POSTUNDERLINE"));
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
	// $ANTLR end "postfix"


	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arguments"
	// D:\\JAVA\\first\\src\\first.g:148:1: arguments : assignment_expression ( ',' ! assignment_expression )* ;
	public final firstParser.arguments_return arguments() throws RecognitionException {
		firstParser.arguments_return retval = new firstParser.arguments_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal177=null;
		ParserRuleReturnScope assignment_expression176 =null;
		ParserRuleReturnScope assignment_expression178 =null;

		CommonTree char_literal177_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:148:10: ( assignment_expression ( ',' ! assignment_expression )* )
			// D:\\JAVA\\first\\src\\first.g:149:3: assignment_expression ( ',' ! assignment_expression )*
			{
			root_0 = (CommonTree)adaptor.nil();


			pushFollow(FOLLOW_assignment_expression_in_arguments1558);
			assignment_expression176=assignment_expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression176.getTree());

			// D:\\JAVA\\first\\src\\first.g:149:25: ( ',' ! assignment_expression )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==39) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:149:26: ',' ! assignment_expression
					{
					char_literal177=(Token)match(input,39,FOLLOW_39_in_arguments1561); if (state.failed) return retval;
					pushFollow(FOLLOW_assignment_expression_in_arguments1564);
					assignment_expression178=assignment_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment_expression178.getTree());

					}
					break;

				default :
					break loop46;
				}
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
	// $ANTLR end "arguments"


	public static class primary_expression_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "primary_expression"
	// D:\\JAVA\\first\\src\\first.g:152:2: primary_expression : ( identifier | constant | string | '(' ! expression ')' !);
	public final firstParser.primary_expression_return primary_expression() throws RecognitionException {
		firstParser.primary_expression_return retval = new firstParser.primary_expression_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token char_literal182=null;
		Token char_literal184=null;
		ParserRuleReturnScope identifier179 =null;
		ParserRuleReturnScope constant180 =null;
		ParserRuleReturnScope string181 =null;
		ParserRuleReturnScope expression183 =null;

		CommonTree char_literal182_tree=null;
		CommonTree char_literal184_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:152:20: ( identifier | constant | string | '(' ! expression ')' !)
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
			case 32:
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
					// D:\\JAVA\\first\\src\\first.g:152:22: identifier
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_identifier_in_primary_expression1578);
					identifier179=identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier179.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:153:22: constant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_constant_in_primary_expression1601);
					constant180=constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, constant180.getTree());

					}
					break;
				case 3 :
					// D:\\JAVA\\first\\src\\first.g:154:22: string
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_string_in_primary_expression1624);
					string181=string();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, string181.getTree());

					}
					break;
				case 4 :
					// D:\\JAVA\\first\\src\\first.g:155:22: '(' ! expression ')' !
					{
					root_0 = (CommonTree)adaptor.nil();


					char_literal182=(Token)match(input,32,FOLLOW_32_in_primary_expression1647); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_primary_expression1650);
					expression183=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression183.getTree());

					char_literal184=(Token)match(input,33,FOLLOW_33_in_primary_expression1652); if (state.failed) return retval;
					}
					break;

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
	// $ANTLR end "primary_expression"


	public static class integer_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "integer_constant"
	// D:\\JAVA\\first\\src\\first.g:158:1: integer_constant : ( Dec | Oct | Hex );
	public final firstParser.integer_constant_return integer_constant() throws RecognitionException {
		firstParser.integer_constant_return retval = new firstParser.integer_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set185=null;

		CommonTree set185_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:159:2: ( Dec | Oct | Hex )
			// D:\\JAVA\\first\\src\\first.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			set185=input.LT(1);
			if ( input.LA(1)==Dec||input.LA(1)==Hex||input.LA(1)==Oct ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set185));
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
	// $ANTLR end "integer_constant"


	public static class identifier_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "identifier"
	// D:\\JAVA\\first\\src\\first.g:177:1: identifier : Nice_identifier ;
	public final firstParser.identifier_return identifier() throws RecognitionException {
		firstParser.identifier_return retval = new firstParser.identifier_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_identifier186=null;

		CommonTree Nice_identifier186_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:177:11: ( Nice_identifier )
			// D:\\JAVA\\first\\src\\first.g:178:2: Nice_identifier
			{
			root_0 = (CommonTree)adaptor.nil();


			Nice_identifier186=(Token)match(input,Nice_identifier,FOLLOW_Nice_identifier_in_identifier1791); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Nice_identifier186_tree = (CommonTree)adaptor.create(Nice_identifier186);
			adaptor.addChild(root_0, Nice_identifier186_tree);
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
	// $ANTLR end "identifier"


	public static class constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// D:\\JAVA\\first\\src\\first.g:186:1: constant : ( integer_constant | character_constant );
	public final firstParser.constant_return constant() throws RecognitionException {
		firstParser.constant_return retval = new firstParser.constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope integer_constant187 =null;
		ParserRuleReturnScope character_constant188 =null;


		try {
			// D:\\JAVA\\first\\src\\first.g:186:9: ( integer_constant | character_constant )
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==Dec||LA48_0==Hex||LA48_0==Oct) ) {
				alt48=1;
			}
			else if ( (LA48_0==Nice_character_constant) ) {
				alt48=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// D:\\JAVA\\first\\src\\first.g:186:11: integer_constant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_integer_constant_in_constant1845);
					integer_constant187=integer_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, integer_constant187.getTree());

					}
					break;
				case 2 :
					// D:\\JAVA\\first\\src\\first.g:187:12: character_constant
					{
					root_0 = (CommonTree)adaptor.nil();


					pushFollow(FOLLOW_character_constant_in_constant1858);
					character_constant188=character_constant();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, character_constant188.getTree());

					}
					break;

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
	// $ANTLR end "constant"


	public static class character_constant_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "character_constant"
	// D:\\JAVA\\first\\src\\first.g:191:1: character_constant : Nice_character_constant ;
	public final firstParser.character_constant_return character_constant() throws RecognitionException {
		firstParser.character_constant_return retval = new firstParser.character_constant_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_character_constant189=null;

		CommonTree Nice_character_constant189_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:191:19: ( Nice_character_constant )
			// D:\\JAVA\\first\\src\\first.g:192:2: Nice_character_constant
			{
			root_0 = (CommonTree)adaptor.nil();


			Nice_character_constant189=(Token)match(input,Nice_character_constant,FOLLOW_Nice_character_constant_in_character_constant1877); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Nice_character_constant189_tree = (CommonTree)adaptor.create(Nice_character_constant189);
			adaptor.addChild(root_0, Nice_character_constant189_tree);
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
	// $ANTLR end "character_constant"


	public static class string_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "string"
	// D:\\JAVA\\first\\src\\first.g:201:1: string : Nice_string ;
	public final firstParser.string_return string() throws RecognitionException {
		firstParser.string_return retval = new firstParser.string_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token Nice_string190=null;

		CommonTree Nice_string190_tree=null;

		try {
			// D:\\JAVA\\first\\src\\first.g:201:8: ( Nice_string )
			// D:\\JAVA\\first\\src\\first.g:202:2: Nice_string
			{
			root_0 = (CommonTree)adaptor.nil();


			Nice_string190=(Token)match(input,Nice_string,FOLLOW_Nice_string_in_string1941); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Nice_string190_tree = (CommonTree)adaptor.create(Nice_string190);
			adaptor.addChild(root_0, Nice_string190_tree);
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
	// $ANTLR end "string"

	// $ANTLR start synpred1_first
	public final void synpred1_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:30:5: ( declaration )
		// D:\\JAVA\\first\\src\\first.g:30:5: declaration
		{
		pushFollow(FOLLOW_declaration_in_synpred1_first164);
		declaration();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_first

	// $ANTLR start synpred2_first
	public final void synpred2_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:30:19: ( function_definition )
		// D:\\JAVA\\first\\src\\first.g:30:19: function_definition
		{
		pushFollow(FOLLOW_function_definition_in_synpred2_first168);
		function_definition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_first

	// $ANTLR start synpred19_first
	public final void synpred19_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:55:13: ( plain_declarator '(' ( parameters )? ')' )
		// D:\\JAVA\\first\\src\\first.g:55:13: plain_declarator '(' ( parameters )? ')'
		{
		pushFollow(FOLLOW_plain_declarator_in_synpred19_first477);
		plain_declarator();
		state._fsp--;
		if (state.failed) return;

		match(input,32,FOLLOW_32_in_synpred19_first479); if (state.failed) return;

		// D:\\JAVA\\first\\src\\first.g:55:35: ( parameters )?
		int alt51=2;
		int LA51_0 = input.LA(1);
		if ( (LA51_0==63||LA51_0==68||(LA51_0 >= 71 && LA51_0 <= 73)) ) {
			alt51=1;
		}
		switch (alt51) {
			case 1 :
				// D:\\JAVA\\first\\src\\first.g:55:35: parameters
				{
				pushFollow(FOLLOW_parameters_in_synpred19_first482);
				parameters();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,33,FOLLOW_33_in_synpred19_first485); if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_first

	// $ANTLR start synpred29_first
	public final void synpred29_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:74:61: ( 'else' statement )
		// D:\\JAVA\\first\\src\\first.g:74:61: 'else' statement
		{
		match(input,65,FOLLOW_65_in_synpred29_first644); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred29_first646);
		statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred29_first

	// $ANTLR start synpred38_first
	public final void synpred38_first_fragment() throws RecognitionException {
		// D:\\JAVA\\first\\src\\first.g:86:23: ( unary_expression assignment_operator assignment_expression )
		// D:\\JAVA\\first\\src\\first.g:86:23: unary_expression assignment_operator assignment_expression
		{
		pushFollow(FOLLOW_unary_expression_in_synpred38_first823);
		unary_expression();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_operator_in_synpred38_first825);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_assignment_expression_in_synpred38_first828);
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
	public final boolean synpred19_first() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_first_fragment(); // can never throw exception
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



	public static final BitSet FOLLOW_program_in_prog146 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_prog148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_program164 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000390L});
	public static final BitSet FOLLOW_function_definition_in_program168 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000390L});
	public static final BitSet FOLLOW_type_specifier_in_declaration177 = new BitSet(new long[]{0x0000080400004000L});
	public static final BitSet FOLLOW_init_declarators_in_declaration179 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_declaration182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_function_definition205 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_plain_declarator_in_function_definition207 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_function_definition209 = new BitSet(new long[]{0x8000000200000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_parameters_in_function_definition211 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_function_definition214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_compound_statement_in_function_definition216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters245 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_parameters248 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_plain_declaration_in_parameters251 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_declarator_in_declarators262 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_declarators265 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_declarator_in_declarators268 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators278 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_init_declarators281 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_init_declarator_in_init_declarators284 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_declarator_in_init_declarator294 = new BitSet(new long[]{0x0001000000000002L});
	public static final BitSet FOLLOW_48_in_init_declarator297 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010840L});
	public static final BitSet FOLLOW_initializer_in_init_declarator300 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_initializer310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_initializer326 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010840L});
	public static final BitSet FOLLOW_initializer_in_initializer329 = new BitSet(new long[]{0x0000008000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_39_in_initializer332 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010840L});
	public static final BitSet FOLLOW_initializer_in_initializer335 = new BitSet(new long[]{0x0000008000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_79_in_initializer339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_73_in_type_specifier348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_type_specifier352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_68_in_type_specifier356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier376 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000800L});
	public static final BitSet FOLLOW_identifier_in_type_specifier378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_75_in_type_specifier381 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_type_specifier_in_type_specifier384 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_declarators_in_type_specifier386 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_type_specifier388 = new BitSet(new long[]{0x8000000000000000L,0x0000000000008390L});
	public static final BitSet FOLLOW_79_in_type_specifier392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_struct_or_union_in_type_specifier433 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identifier_in_type_specifier436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_plain_declaration457 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_declarator_in_plain_declaration459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator477 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_declarator479 = new BitSet(new long[]{0x8000000200000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_parameters_in_declarator482 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_declarator485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_declarator494 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_54_in_declarator497 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_constant_expression_in_declarator500 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_declarator502 = new BitSet(new long[]{0x0040000000000002L});
	public static final BitSet FOLLOW_34_in_plain_declarator513 = new BitSet(new long[]{0x0000000400004000L});
	public static final BitSet FOLLOW_plain_declarator_in_plain_declarator516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_plain_declarator522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_statement_in_statement533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_statement_in_statement547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selection_statement_in_statement561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iteration_statement_in_statement575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_jump_statement_in_statement589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expression_statement598 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_expression_statement601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_75_in_compound_statement611 = new BitSet(new long[]{0xE40008354201E240L,0x0000000000018FFDL});
	public static final BitSet FOLLOW_declaration_in_compound_statement614 = new BitSet(new long[]{0xE40008354201E240L,0x0000000000018FFDL});
	public static final BitSet FOLLOW_statement_in_compound_statement617 = new BitSet(new long[]{0x640008354201E240L,0x0000000000018C6DL});
	public static final BitSet FOLLOW_79_in_compound_statement620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_67_in_selection_statement630 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_selection_statement633 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_selection_statement636 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_selection_statement638 = new BitSet(new long[]{0x640008354201E240L,0x0000000000010C6DL});
	public static final BitSet FOLLOW_statement_in_selection_statement641 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_selection_statement644 = new BitSet(new long[]{0x640008354201E240L,0x0000000000010C6DL});
	public static final BitSet FOLLOW_statement_in_selection_statement646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_74_in_iteration_statement657 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_iteration_statement660 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_iteration_statement663 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_iteration_statement665 = new BitSet(new long[]{0x640008354201E240L,0x0000000000010C6DL});
	public static final BitSet FOLLOW_statement_in_iteration_statement668 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_66_in_iteration_statement692 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_iteration_statement695 = new BitSet(new long[]{0x240008354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_iteration_statement698 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_iteration_statement701 = new BitSet(new long[]{0x240008354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_iteration_statement704 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_iteration_statement707 = new BitSet(new long[]{0x240000374201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_iteration_statement710 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_iteration_statement713 = new BitSet(new long[]{0x640008354201E240L,0x0000000000010C6DL});
	public static final BitSet FOLLOW_statement_in_iteration_statement716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_64_in_jump_statement725 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_jump_statement727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_jump_statement747 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_jump_statement749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_69_in_jump_statement769 = new BitSet(new long[]{0x240008354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_jump_statement771 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_jump_statement774 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_expression783 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_expression786 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_assignment_expression_in_expression789 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_unary_expression_in_assignment_expression823 = new BitSet(new long[]{0x0A21444890000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expression825 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_assignment_expression_in_assignment_expression828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_assignment_expression854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_or_expression_in_constant_expression935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_78_in_logical_or_expression947 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression961 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_logical_and_expression964 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression967 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_76_in_inclusive_or_expression981 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression984 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression995 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_56_in_exclusive_or_expression998 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1001 = new BitSet(new long[]{0x0100000000000002L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1012 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_30_in_and_expression1015 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_equality_expression_in_and_expression1018 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1029 = new BitSet(new long[]{0x0002000004000002L});
	public static final BitSet FOLLOW_equality_operator_in_equality_expression1032 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_relational_expression_in_equality_expression1035 = new BitSet(new long[]{0x0002000004000002L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1059 = new BitSet(new long[]{0x000C900000000002L});
	public static final BitSet FOLLOW_relational_operator_in_relational_expression1062 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_shift_expression_in_relational_expression1065 = new BitSet(new long[]{0x000C900000000002L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1097 = new BitSet(new long[]{0x0010200000000002L});
	public static final BitSet FOLLOW_shift_operator_in_shift_expression1100 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_additive_expression_in_shift_expression1103 = new BitSet(new long[]{0x0010200000000002L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1127 = new BitSet(new long[]{0x0400001000000002L});
	public static final BitSet FOLLOW_additive_operator_in_additive_expression1130 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1133 = new BitSet(new long[]{0x0400001000000002L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1155 = new BitSet(new long[]{0x0000020408000002L});
	public static final BitSet FOLLOW_multiplicative_operator_in_multiplicative_expression1158 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1161 = new BitSet(new long[]{0x0000020408000002L});
	public static final BitSet FOLLOW_unary_expression_in_cast_expression1187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_cast_expression1207 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_type_name_in_cast_expression1210 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_cast_expression1212 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_cast_expression_in_cast_expression1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_specifier_in_type_name1223 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_type_name1226 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_postfix_expression_in_unary_expression1236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_unary_expression1257 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_unary_expression1288 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_operator_in_unary_expression1319 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_cast_expression_in_unary_expression1322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_unary_expression1343 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_unary_expression_in_unary_expression1346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_70_in_unary_expression1367 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_unary_expression1370 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_type_name_in_unary_expression1373 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_unary_expression1375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primary_expression_in_postfix_expression1412 = new BitSet(new long[]{0x3040012100000002L});
	public static final BitSet FOLLOW_postfix_in_postfix_expression1414 = new BitSet(new long[]{0x3040012100000002L});
	public static final BitSet FOLLOW_54_in_postfix1424 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_postfix1426 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_55_in_postfix1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_postfix1448 = new BitSet(new long[]{0x240000374201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_arguments_in_postfix1450 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_postfix1453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_postfix1474 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identifier_in_postfix1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_postfix1496 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_identifier_in_postfix1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_postfix1518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_postfix1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments1558 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_39_in_arguments1561 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_assignment_expression_in_arguments1564 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_identifier_in_primary_expression1578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_primary_expression1601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_string_in_primary_expression1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_primary_expression1647 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_expression_in_primary_expression1650 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_primary_expression1652 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_identifier_in_identifier1791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_integer_constant_in_constant1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_character_constant_in_constant1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_character_constant_in_character_constant1877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Nice_string_in_string1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_synpred1_first164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_definition_in_synpred2_first168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plain_declarator_in_synpred19_first477 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_synpred19_first479 = new BitSet(new long[]{0x8000000200000000L,0x0000000000000390L});
	public static final BitSet FOLLOW_parameters_in_synpred19_first482 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_synpred19_first485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_65_in_synpred29_first644 = new BitSet(new long[]{0x640008354201E240L,0x0000000000010C6DL});
	public static final BitSet FOLLOW_statement_in_synpred29_first646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_expression_in_synpred38_first823 = new BitSet(new long[]{0x0A21444890000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred38_first825 = new BitSet(new long[]{0x240000354201E240L,0x0000000000010040L});
	public static final BitSet FOLLOW_assignment_expression_in_synpred38_first828 = new BitSet(new long[]{0x0000000000000002L});
}
