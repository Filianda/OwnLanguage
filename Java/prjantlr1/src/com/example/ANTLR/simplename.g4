grammar simplename;
program   : 'hi' statement+ 'bye';

statement : assign | print | read | equation | concat | array ;

print     : 'print' (NUMBER | ID | STRING | REAL);
assign    : 'let' ID 'be' (NUMBER | ID) ;
read      : 'read'  (NUMBER | ID) ;
//equation  : 'equ'
//            (NUMBER '+' NUMBER
//          |  NUMBER '-' NUMBER
//          |  NUMBER '*' NUMBER
//          |  NUMBER '/' NUMBER)
//          ;

equation:
           (NUMBER | REAL)
          | (NUMBER | REAL) equation
          | equation(ADD|SUB)equation
          |	equation(MUL|DIV)equation
          |	'(' equation ')'
          ;


concat:	concat('+')concat
	|	STRING
	;
array : 'arr' ID '[' value ( ',' value)* ']' ;

value : array
	| NUMBER
	| REAL
	| STRING
	;

//BEGIN 	: 'hi';
//END		: 'bye';

ID     : [a-z]+ ;
MUL    : '*';
DIV    : '/';
SUB    : '-';
ADD    : '+';
NUMBER : [0-9]+ ;
REAL   : 'R'[-+]?([0-9]*.[0-9]+|[0-9]+);
STRING : '"' [a-zA-Z0-9_]+ '"';
//NEWLINE 	: [\n]+ ;
WS     : [ \n\t\r]+ -> skip;

