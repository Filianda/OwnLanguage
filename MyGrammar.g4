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
	: [-+]?([0-9]*/.[0-9]+|[0-9]+)
	;
VAR 
	: [/w+/d?_?]
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
	: VAR 
	| number 
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
	|VAR
	;
