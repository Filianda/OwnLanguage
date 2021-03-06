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
    : '"'[a-zA-Z]+'"'
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
    | value
    ;
subbody
    : array
    | concat
    | condition
    | arithmetic
    ;
assigment
    : ID '=' (subbody | value) ';'
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
    : '(' arithmetic ')'          #nothing3
    | arithmetic MUL arithmetic     #mul
    | arithmetic DIV arithmetic     #div
    | arithmetic ADD arithmetic     #add
    | arithmetic SUB arithmetic     #sub
    | SUB number                        #nothing
    | number                        #intreal
    ;
concat
    :concat'+'concat
    |STRING
    |ID
    ;
enteroperations
    : PRINT '(' value ')'              #print
    | INPUT TYPEINT ID                 #inputint
    | INPUT TYPEREAL ID                #inputreal
    ;
number
    :REAL
    |INT
    ;
array
    : ARRAYS'{' value ( ';' value)*'}'
    ;
value
    :number
    |STRING
    |ID
    ;
