grammar ast;



options{ 
	//greedy = false;
	output = AST ;
	ASTLabelType = CommonTree ;
	backtrack = true;
} 

tokens {  
    // imaginary tokens  
    	LEGEND_program;
	LEGEND_declaration;
	LEGEND_function_definition;
	LEGEND_parameters;
	LEGEND_declarators;
	LEGEND_init_declarators;
	LEGEND_init_declarator;
	LEGEND_initializer;
	LEGEND_type_specifier;
	LEGEND_struct_or_union;
	LEGEND_plain_declaration;
	LEGEND_declarator;
	LEGEND_plain_declarator;
	LEGEND_statement;
	LEGEND_expression_statement;
	LEGEND_compound_statement;
	LEGEND_selection_statement;
	LEGEND_iteration_statement;
	LEGEND_jump_statement;
	LEGEND_expression;
	LEGEND_assignment_expression;
	LEGEND_assignment_operator;
	LEGEND_constant_expression;
	LEGEND_logical_or_expression;//'||'
	LEGEND_logical_and_expression;//'&&'
	LEGEND_inclusive_or_expression;//'|';
	LEGEND_exclusive_or_expression;//'^';
	LEGEND_and_expression;//'&';
	LEGEND_equality_expression;
	LEGEND_relational_expression;
	LEGEND_shift_expression;
	LEGEND_additive_expression;
	LEGEND_multiplicative_expression;
	LEGEND_cast_expression;
	LEGEND_type_name;
	LEGEND_unary_expression;
	LEGEND_unary_operator;
	LEGEND_postfix_expression;
	LEGEND_postfix;
	LEGEND_arguments;
	LEGEND_primary_expression;
	LEGEND_constant;
	LEGEND_integer_constant;
	LEGEND_string;
	LEGEND_character_constant;
	LEGEND_identifier;
	LEGEND_expr1;
	LEGEND_expr2;
	LEGEND_expr3;
	FUCK;
	
    
}  

@lexer::header{
package core;
}

@parser::header {  
package core;
} 


program : prog EOF -> ^(LEGEND_program prog);

prog : ( declaration | function_definition)+;catch[RecognitionException e] {throw e;}

declaration: type_specifier init_declarators? ';' -> ^(LEGEND_declaration type_specifier init_declarators?);catch[RecognitionException e] {throw e;}
 
function_definition: type_specifier plain_declarator '(' parameters? ')' compound_statement -> ^(LEGEND_function_definition type_specifier plain_declarator parameters? compound_statement);catch[RecognitionException e] {throw e;}

parameters: plain_declaration (',' plain_declaration)* -> ^(LEGEND_parameters plain_declaration (plain_declaration)*);catch[RecognitionException e] {throw e;}
 
declarators: declarator (',' declarator)* -> ^(LEGEND_declarators declarator+);catch[RecognitionException e] {throw e;}
 
init_declarators: init_declarator (',' init_declarator)* -> ^(LEGEND_init_declarators init_declarator ( init_declarator)*);catch[RecognitionException e] {throw e;}
 
init_declarator: declarator ('=' initializer)? -> ^(LEGEND_init_declarator declarator initializer?);catch[RecognitionException e] {throw e;}
 
initializer: assignment_expression -> ^(LEGEND_initializer assignment_expression)
            | '{' initializer (',' initializer)* '}' -> ^(LEGEND_initializer initializer ( initializer)*);catch[RecognitionException e] {throw e;}
 
type_specifier: 'void' -> ^(LEGEND_type_specifier 'void')
	       | 'char' -> ^(LEGEND_type_specifier 'char')
	       | 'int' -> ^(LEGEND_type_specifier 'int')
               | struct_or_union identifier? '{' (type_specifier declarators ';')+ '}' -> ^(LEGEND_type_specifier struct_or_union identifier? (type_specifier declarators)+ )
               | struct_or_union identifier -> ^(LEGEND_type_specifier struct_or_union identifier);catch[RecognitionException e] {throw e;}
 
struct_or_union: 'struct'
		| 'union'
		;
 
plain_declaration: type_specifier declarator -> ^(LEGEND_plain_declaration type_specifier declarator);catch[RecognitionException e] {throw e;}
 
declarator: plain_declarator '(' parameters? ')' -> ^(LEGEND_declarator plain_declarator parameters?)
 		| plain_declarator ('[' constant_expression ']')* -> ^(LEGEND_declarator plain_declarator ( constant_expression )*);catch[RecognitionException e] {throw e;}
 
plain_declarator: '*'* identifier  ->  ^(LEGEND_plain_declarator '*'* identifier)  ;catch[RecognitionException e] {throw e;}




statement: expression_statement -> ^(LEGEND_statement expression_statement)
          | compound_statement -> ^(LEGEND_statement compound_statement)
          | selection_statement -> ^(LEGEND_statement selection_statement)
          | iteration_statement -> ^(LEGEND_statement iteration_statement) 
          | jump_statement -> ^(LEGEND_statement jump_statement);catch[RecognitionException e] {throw e;}
 
expression_statement: expression? ';' -> ^(LEGEND_expression_statement expression?);catch[RecognitionException e] {throw e;}
 
compound_statement: '{' declaration* statement* '}' -> ^(LEGEND_compound_statement declaration* statement*);catch[RecognitionException e] {throw e;}
 
selection_statement: 'if' '(' e1=expression ')' e2=statement ('else' e3=statement)? -> ^(LEGEND_selection_statement 'if' $e1  $e2 $e3?);catch[RecognitionException e] {throw e;}
 
iteration_statement: 'while' '(' e1=expression ')' e2=statement -> ^(LEGEND_iteration_statement 'while' $e1 $e2)
                    | 'for' '(' e1=expression? ';' e2=expression? ';' e3=expression? ')' e4=statement -> ^(LEGEND_iteration_statement 'for' ^(LEGEND_expr1 $e1?) ^(LEGEND_expr2 $e2?) ^(LEGEND_expr3 $e3?) $e4);catch[RecognitionException e] {throw e;}
 
jump_statement: 'continue' ';' -> ^(LEGEND_jump_statement 'continue')
               | 'break' ';' -> ^(LEGEND_jump_statement 'break')
               | 'return' expression? ';' -> ^(LEGEND_jump_statement 'return' expression?);catch[RecognitionException e] {throw e;}

expression: assignment_expression (',' assignment_expression)* -> ^(LEGEND_expression assignment_expression ( assignment_expression)*);catch[RecognitionException e] {throw e;}
 
assignment_expression: 
                      unary_expression assignment_operator assignment_expression -> ^(LEGEND_assignment_expression unary_expression assignment_operator assignment_expression)
                      | logical_or_expression -> ^(LEGEND_assignment_expression logical_or_expression)
                      ;catch[RecognitionException e] {throw e;}
 
 assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
 
 constant_expression :
	a1=logical_or_expression  ->  ^(LEGEND_constant_expression $a1)  ;
	
logical_or_expression :
	logical_and_expression ('||' logical_and_expression)*  ->  ^(LEGEND_logical_or_expression logical_and_expression+);
	
logical_and_expression :
	inclusive_or_expression ('&&' inclusive_or_expression)*  ->  ^(LEGEND_logical_and_expression inclusive_or_expression+)  ;
 
inclusive_or_expression :
	exclusive_or_expression ('|' exclusive_or_expression)*  ->  ^(LEGEND_inclusive_or_expression exclusive_or_expression+)  ;
 
exclusive_or_expression :
	and_expression ('^' and_expression)*  ->  ^(LEGEND_exclusive_or_expression and_expression+)  ;
 
and_expression :
	equality_expression ('&' equality_expression)*  ->  ^(LEGEND_and_expression equality_expression+)  ;
 
equality_expression :
	relational_expression (equality_operator relational_expression)*  ->  ^(LEGEND_equality_expression relational_expression (equality_operator relational_expression)*) ;
	
equality_operator :
	'==' |
	'!=' ;
	
relational_expression :
	shift_expression (relational_operator shift_expression)*  ->  ^(LEGEND_relational_expression shift_expression (relational_operator shift_expression)*)  ;
	
relational_operator :
	'<' |
	'>' |
	'<=' |
	'>=' ;
	
shift_expression :
	additive_expression (shift_operator additive_expression)*  ->  ^(LEGEND_shift_expression additive_expression (shift_operator additive_expression)*)  ;
	
shift_operator :
	'<<' |
	'>>' ;
	
additive_expression :
	multiplicative_expression (additive_operator multiplicative_expression)*  ->  ^(LEGEND_additive_expression multiplicative_expression (additive_operator multiplicative_expression)*)  ;
	
additive_operator :
	'+' |
	'-'  ;
	
multiplicative_expression :
	cast_expression (multiplicative_operator cast_expression)*  ->  ^(LEGEND_multiplicative_expression cast_expression (multiplicative_operator cast_expression)*)  ;
	
multiplicative_operator :
	'*' |
	'/' |
	 '%' ;
 
cast_expression: unary_expression -> ^(LEGEND_cast_expression unary_expression)
                | '(' type_name ')' cast_expression -> ^(LEGEND_cast_expression type_name cast_expression);catch[RecognitionException e] {throw e;}
 
type_name: type_specifier '*'* -> ^(LEGEND_type_name type_specifier '*'*);catch[RecognitionException e] {throw e;}
 
unary_expression: postfix_expression -> ^(LEGEND_unary_expression postfix_expression)
                 | '++' unary_expression -> ^(LEGEND_unary_expression '++' unary_expression)
                 | '--' unary_expression -> ^(LEGEND_unary_expression '--' unary_expression)
                 | unary_operator cast_expression -> ^(LEGEND_unary_expression unary_operator cast_expression)
                 | 'sizeof' unary_expression -> ^(LEGEND_unary_expression 'sizeof' unary_expression)
                 | 'sizeof' '(' type_name ')' -> ^(LEGEND_unary_expression 'sizeof' type_name );catch[RecognitionException e] {throw e;}
 
unary_operator: '&' | '*' | '+' | '-' | '~' | '!';
 
postfix_expression: primary_expression postfix* -> ^(LEGEND_postfix_expression primary_expression postfix*);catch[RecognitionException e] {throw e;}
 
postfix: '[' expression ']' -> ^(LEGEND_postfix '[' expression ']')
        | '(' arguments? ')' -> ^(LEGEND_postfix FUCK arguments?)
        | '.' identifier -> ^(LEGEND_postfix '.' identifier)
        | '->' identifier -> ^(LEGEND_postfix '->' identifier)
        | '++' -> ^(LEGEND_postfix '++')
        | '--' -> ^(LEGEND_postfix '--')
        ;catch[RecognitionException e] {throw e;}
 
arguments: 
 	assignment_expression (',' assignment_expression)* -> ^(LEGEND_arguments assignment_expression ( assignment_expression)*)
 	;catch[RecognitionException e] {throw e;}
 
primary_expression: identifier -> ^(LEGEND_primary_expression identifier)
                   | constant -> ^(LEGEND_primary_expression constant)
                   | string -> ^(LEGEND_primary_expression string )
                   | '(' expression ')' -> ^(LEGEND_primary_expression expression) 
                   ;catch[RecognitionException e] {throw e;}
                   
integer_constant
	: Dec -> ^(LEGEND_integer_constant Dec)
	| Oct -> ^(LEGEND_integer_constant Oct)
	| Hex -> ^(LEGEND_integer_constant Hex)
	;catch[RecognitionException e] {throw e;}

Dec	:
	'0'|('1'..'9')('0'..'9')*
	;

Hex	:
	('0x'|'0X')('0'..'9'|'A'..'F'|'a'..'f')+
	;
Oct	:
	'0'('0'..'7')+
	;



identifier:
	Nice_identifier -> ^(LEGEND_identifier Nice_identifier)
	;catch[RecognitionException e] {throw e;}
	
Nice_identifier
	:('a'..'z'|'A'..'Z'|'_'|'$')  ('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')*
	;

 
constant: integer_constant -> ^(LEGEND_constant integer_constant )
         | character_constant -> ^(LEGEND_constant character_constant )
         ;catch[RecognitionException e] {throw e;}


         
character_constant:
	Nice_character_constant -> ^(LEGEND_character_constant Nice_character_constant)
	;catch[RecognitionException e] {throw e;}
	
Nice_character_constant
	:	
	//identifier |
	'\''( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\''|'\\') ) '\''
	;
	
string	:
	Nice_string -> ^(LEGEND_string Nice_string)
	;catch[RecognitionException e] {throw e;}
	
Nice_string
	:   '\"' ( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\\'|'\"') )* '\"'
	|'\'' '\\' ('0'..'7')('0'..'7')('0'..'7') '\''  |
	'\'' '\\' ('0x' | '0X') ('0'..'9'|'A'..'F'|'a'..'f') ('0'..'9'|'A'..'F'|'a'..'f') '\'' 
	;
	
COMMENT 
    	:   '/*' . * '*/' {skip();}  
    	;
    	
LINE_COMMENT
	:   '//' ~( '\n' | '\r' )* ('\n' | '\r' | '\r\n' ) {skip();}
	;

Header
	:   '#' ~( '\n' | '\r' )* ('\n' | '\r' | '\r\n' ) {skip();} 
	;


WS : ( ' ' |'\t' | '\n' |'\r' )+ {skip();} ;