grammar MyGrammar;
START 
	: 'start'
	;
STOP 
	: 'stop'
	;
STRING 
	: [a-zA-Z]+
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
	| array
	;
number
	:INT
	|REAL
	;

array
	: 'array''{' value ( ';' value)*'}'
	;
value
	:number
	|STRING
	;
