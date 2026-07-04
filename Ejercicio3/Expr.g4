grammar Expr;
// Devil may cry 962210_291125

root: EOF;


CADENA: '"' ~["\r\n]* '"';
NUMBER: [0-9]+;
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

IDT: [a-zA-Z]+ [0-9a-zA-Z]*;

PAR_1: '(';
PAR_2: ')';
COR_1: '[';
COR_2: ']';
LLA_1: '{';
LLA_2: '}';
DOS_PUNTOS: ':';
COMA: ',';

WS: [ \t\r\n]+ -> skip;
