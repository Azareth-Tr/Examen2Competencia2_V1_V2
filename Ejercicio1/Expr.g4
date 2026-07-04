grammar Expr;

root: EOF;

expr: NUM | IDT | TEXTO;


PUBLIC: 'public'; 
STATIC: 'static';
VOID: 'void';
CLASS: 'class';
SYSTEM: 'System';
OUT: 'out';
PRINTLN: 'println';
BREAK: 'break';
DEFAULT: 'default';
THIS: 'this';
RETURN: 'return';

FOR: 'for';
WHILE: 'while';
DO: 'do';
SWITCH: 'switch';

STRING: 'String';
INT: 'int';
DOUBLE: 'double';
CHAR: 'char';

IF: 'if';
ELSE: 'else';
ELSE_IF: 'else if';

TEXTO: '"' ~["\r\n]* '"';
IDT: [a-zA-Z]+ [0-9a-zA-Z]*;
NUM: [0-9]+;
MAS: '+';
MENOS: '-';
POR: '*';
ENTRE: '/';
COMPLEMENTO: '%';
AND: '&&';
OR: '||';
NOT: '!';
MAYOR: '>';
MAYOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
ASIGNACION: '=';
PAR_1: '(';
PAR_2: ')';
COR_1: '[';
COR_2: ']';
LLA_1: '{';
LLA_2: '}';
PUNTO_COMA: ';';
PUNTO: '.';

WS: [ \t\r\n]+ -> skip;