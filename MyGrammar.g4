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
	: [-+]?[0-9]*'.'[0-9]+|[0-9]+
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
	: number 
	| STRING
	| ID 
	| array
	| enteroperations
	;
enteroperations
	: (PRINT | INPUT) '(' value ')';
number
	:INT
	|REAL
	;

array
	: ARRAYS'{' value ( ';' value)*'}'
	;
value
	:number
	|STRING
	|ID
	;
