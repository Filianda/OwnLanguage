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
	: [-+]?[0-9]*'.'[0-9]+
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
	: array
	| enteroperations
	| arithmetic
	| concat
	| ifOperation
	| condition
	| forLoop
	| whileLoop
	| functionDecl
	| functionCall
	| accessrules
	| number 
	| STRING
	| ID
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
	: value('<'|'>')value
	| value('<='|'>=')value
	| value('?='|'!=')value
	;
block
	: '{' body* '}'
	;
arithmetic
	: arithmetic('+'|'-')arithmetic
	| arithmetic('*'|'/')arithmetic
	| number
	| '-'number
	| '(' arithmetic ')'
	;
concat
	:concat'+'concat
	|STRING
	|ID
	;

enteroperations
	: (PRINT | INPUT) '(' value ')';
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
