grammar first;


options{ 
	//greedy = false;
	output = AST ;
	ASTLabelType = CommonTree ;
	backtrack = true;
} 

tokens {  
    // imaginary tokens  
    VAR_DECL;  
    FUNC_DECL;
    TYPE_DECL;  
    INDEX;
    ARGUMENT;
    POSTUNDERLINE;
    PREUNDERLINE;
    PREADD;
    POSTADD;
    METHOD;
    POINTER;
    
}  

prog:  program EOF!  ;

program : 
	 ( declaration | function_definition)+;

declaration: type_specifier init_declarators? ';' -> ^(VAR_DECL ^(TYPE_DECL type_specifier) init_declarators?);
 
function_definition: type_specifier plain_declarator '(' parameters? ')' compound_statement -> ^(FUNC_DECL ^(TYPE_DECL type_specifier ) plain_declarator  parameters?  compound_statement);

parameters: plain_declaration (','! plain_declaration)* ;
 
declarators: declarator (','! declarator)*;
 
init_declarators: init_declarator (','! init_declarator)*;
 
init_declarator: declarator ('='^ initializer)?;
 
initializer: assignment_expression
            | '{'! initializer (','! initializer)* '}'!;
 
type_specifier: 'void' | 'char' | 'int' 
               | struct_or_union identifier? '{' (type_specifier declarators ';')+ '}' -> ^(struct_or_union identifier?  (^(TYPE_DECL type_specifier ) declarators)+)
               | struct_or_union^ identifier ;
 
struct_or_union: 'struct' | 'union';
 
plain_declaration: type_specifier declarator -> ^(TYPE_DECL type_specifier) declarator;
 
declarator: plain_declarator '('! parameters? ')'! 
 		| plain_declarator ('['! constant_expression ']'!)*;
 
plain_declarator: '*'^ plain_declarator
		| identifier ;




statement: expression_statement
          | compound_statement
          | selection_statement
          | iteration_statement
          | jump_statement;
 
 expression_statement: expression? ';'!;
 
 compound_statement: '{'! declaration* statement* '}'!;
 
 selection_statement: 'if'! '('! expression ')'! statement ('else' statement)?;
 
 iteration_statement: 'while'! '('! expression ')'! statement
                    | 'for'! '('! expression? ';'! expression? ';'! expression? ')'! statement;
 
 jump_statement: 'continue' ';'!
               | 'break' ';'!
               | 'return' expression? ';'!;

 expression: assignment_expression (','! assignment_expression)*;
 
 assignment_expression: 
                      unary_expression assignment_operator^ assignment_expression
                      | logical_or_expression
                      ;
 
 assignment_operator: '=' | '*=' | '/=' | '%=' | '+=' | '_=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
 
 constant_expression: logical_or_expression;
 
 logical_or_expression: logical_and_expression ('||'^ logical_and_expression)*;
 
 logical_and_expression: inclusive_or_expression ('&&'^ inclusive_or_expression)*;
 
 inclusive_or_expression: exclusive_or_expression ('|'^ exclusive_or_expression)*;
 
 exclusive_or_expression: and_expression ('^'^ and_expression)*;
 
 and_expression: equality_expression ('&'^ equality_expression)*;
 
 equality_expression: relational_expression (equality_operator^ relational_expression)*;
 
 equality_operator: '==' | '!=';
 
 relational_expression: shift_expression (relational_operator^ shift_expression)*;
 
 relational_operator: '<' | '>' | '<=' | '>=';
 
 shift_expression: additive_expression (shift_operator^ additive_expression)*;
 
 shift_operator: '<<' | '>>';
 
 additive_expression: multiplicative_expression (additive_operator^ multiplicative_expression)*;
 
additive_operator: '+' | '_';
 
multiplicative_expression: cast_expression (multiplicative_operator^ cast_expression)*;
 
multiplicative_operator: '*' | '/' | '%';
 
cast_expression: unary_expression
                | '('! type_name ')'! cast_expression;
 
type_name: type_specifier^ '*'* ;
 
unary_expression: postfix_expression
                 | '++' unary_expression -> ^(PREADD unary_expression)
                 | '__' unary_expression -> ^(PREUNDERLINE unary_expression)
                 | unary_operator^ cast_expression
                 | 'sizeof'^ unary_expression
                 | 'sizeof'^ '('! type_name ')'!;
 
unary_operator: '&' | '*' | '+' | '_' | '~' | '!';
 
postfix_expression: primary_expression postfix^*;
 
postfix: '[' expression ']' -> ^(INDEX expression)
        | '(' arguments? ')' -> ^(ARGUMENT arguments?)
        | '.' identifier -> ^(METHOD identifier)
        | '_>' identifier -> ^(POINTER identifier)
        | '++' -> POSTADD
        | '__' -> POSTUNDERLINE
        ;
 
arguments: 
 	assignment_expression (','! assignment_expression)*
 	;
 
 primary_expression: identifier
                   | constant
                   | string
                   | '('! expression ')'!
                   ;
                   
integer_constant
	: Dec
	| Oct
	| Hex
	;

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
	Nice_identifier
	;
	
Nice_identifier
	:('a'..'z'|'A'..'Z'|'_'|'$')  ('a'..'z'|'A'..'Z'|'_'|'$'|'0'..'9')*
	;

 
constant: integer_constant
         | character_constant;


         
character_constant:
	Nice_character_constant
	;
	
Nice_character_constant
	:	
	//identifier |
	'\''( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\''|'\\') ) '\''
	;
	
string	:
	Nice_string
	;
	
Nice_string
	:   '\"' ( ('\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')) | ~('\\'|'\"') )* '\"'
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