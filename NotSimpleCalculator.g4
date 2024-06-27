grammar NotSimpleCalculator;

// Lexer rules
ID : [a-zA-Z] [a-zA-Z0-9_]* ;
NUMBER : [0-9]+ ('.' [0-9]+)? ;
STRING : '"' .*? '"' ;
WS : [ \t\n\r]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
EQUAL: '=';
SEMI: ';';
BEGIN: 'begin';
END: 'end';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
OF: 'of';
TO: 'to';
LOOP: 'loop';
PRINT: 'print';
COLON: ':';
COMMA: ',';
LPAREN: '(';
RPAREN: ')';
NOT: '!';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
EQ: '==';
NEQ: '!=';
POW: '^';

// Parser rules
program : statements ;
statements : statement* ;
statement
    : assign_statement
    | begin_end
    | if_then
    | while_do
    | for_do
    | loop_do
    | print_simple
    | print_literal
    ;

// Expression with separated operators
expr: cumTerm (cumopr cumTerm)*; 
cumTerm: term (additive term)*;
term: factor (multiplicative factor)*;
factor: exponent ('^' exponent)*;
exponent: '(' expr ')' # ParenthesizedExpression
    | ID # Identifier
    | NUMBER # Number
  //  | '-'  expr # UnaryMinus
    ;

assign_statement: ID '=' expr ';';
begin_end: 'begin' statements 'end';
print_simple: 'print' ID ';';
print_literal: 'print' STRING ',' ID ';';
if_then: 'if' expr 'then' statement ('else' statement)?;
while_do: 'while' expr 'do' statement;
for_do: 'for' ID 'of' NUMBER 'to' NUMBER 'do' statement;
loop_do: 'loop' ID ':' NUMBER 'do' statement;

// Operator rules
cumopr : GT | LE | GE | EQ | NEQ | LT ;	
multiplicative : MUL | DIV | '%';
additive : PLUS | MINUS ;