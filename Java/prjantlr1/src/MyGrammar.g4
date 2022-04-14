grammar MyGrammar;
START
	: 'start'
	;
STOP
	: 'stop'
	;
ARRAYS
	: 'array'
	;
PRINT
	: 'print'
	;
INPUT
	: 'input'
	;
TYPEINT
	: 'int'
	;
TYPEREAL
	: 'real'
	;
TYPESTRING
    : 'string'
    ;
IF
	:'if'
	;
ELSE
	:'else'
	;
FOR
	:'for'
	;
WHILE
	:'while'
	;
FUNC
	:'func'
	;
CALL
	:'call'
	;
GLOBAL
	:'global'
	;
LOCAL
	:'local'
	;
CLASS
	:'class'
	;
MUL    : '*';
DIV    : '/';
SUB    : '-';
ADD    : '+';



GREATER: '>';
LESS   : '<';
GREATEREQ : '>=';
LESSEQ : '<=';
ISEQ   : '?=';
NOTEQ  : '!=';

ID
	: [a-zA-Z]+[0-9]?'_'?
	;
STRING
	: '"'[0-9]*?[a-zA-Z]+[0-9]*'"'
	;
INT
	: [0-9]+
	;
REAL
	:  [0-9]*'.'[0-9]+
	;
WHITESPACE
	: [ \t]+ -> skip
	;
NEWLINE
	: ('\r''\n'?| '\n') -> skip
	;
main
	: START body* STOP
	;
body
    : enteroperations
    | subbody
    | ifOperation
    | forLoop
    | whileLoop
    | functionDecl
    | functionCall
    | accessrules
    | classDecl
    | classCall
    | assigment
    | declarationArray
    ;
subbody
    : array
    | condition
    | arithmetic
    ;
assigment
    : ID '=' (value | string | arithmetic) ';'
    | ID arrayindex '=' number ';'
    ;
arrayindex
     : '[' INT ']'
     ;
declarationArray
    : ID '='  array ';'
    ;
classDecl
	: CLASS ID '|' value?|array? '|' ':' block
	;
classCall
	: CALL ID '|' value?|array? '|'
	;
accessrules
	: GLOBAL|LOCAL value
	;
functionDecl
	: FUNC ID '(' value?|array? '):' block
	;
functionCall
	: CALL ID '(' value?|array? ')'
	;
forLoop
	: FOR INT '->' INT ':' block
	;
whileLoop
	: WHILE condition ':' block
	;
ifOperation
	: IF  condition ':' block  (ELSE ':' block)? ;
condition
	: value(LESS|GREATER)value
	| value(LESSEQ|GREATEREQ)value
	| value(ISEQ|NOTEQ)value
	;
block
	: '{' body* '}'
	;
arithmetic
    : '(' arithmetic ')'            #nothing1
    | arithmetic MUL arithmetic     #mul
    | arithmetic DIV arithmetic     #div
    | arithmetic ADD arithmetic     #add
    | arithmetic SUB arithmetic     #sub
    | SUB number                    #nothing2
    | number                        #nothing3
    ;


enteroperations
	: PRINT '(' value ')'              #print
	| INPUT TYPEINT ID                 #inputint
	| INPUT TYPEREAL ID                #inputreal
	| INPUT TYPESTRING ID             #inputstring
	;
number
	:REAL
	|INT
	;

array
	: TYPEINT '[' INT ']'
	| TYPEREAL'[' INT ']'
	| TYPESTRING '[' INT ']'
	;
value
	:number
	|ID
	;

string:
    |STRING
    ;
