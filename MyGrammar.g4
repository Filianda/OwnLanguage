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
	| number 
	| STRING
	| ID 
	;	
arithmetic
	: arithmetic('+'|'-')arithmetic
	| arithmetic('*'|'/')arithmetic
	| number
	| '-'number
	| '(' arithmetic ')'
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
