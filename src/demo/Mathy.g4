grammar Mathy;

block
    : statement* EOF
    ;

statement
    : initializer ID '=' expr ';'
    ;

expr
    : '(' expr ')'
    | ID '(' ID? (',' ID)* ')'
    | expr ('*' | '/') expr
    | expr ('+' | '-') expr
    | literal
    ;

initializer
    : 'var'
    | 'val'
    | 'let'
    | 'def'
    //pretty excited for http://openjdk.java.net/jeps/286
    ;

literal
    : DECIMAL
    | STRING
    | 'null'
    ;

STRING
    : '"' .*? '"'
    ;

DECIMAL
    : DIGIT+ ('.' DIGIT+)?
    ;

ID
    :
    ( 'A'..'Z'
    | 'a'..'z'
    | '_'
    )+
    ;

DIGIT
    : '0'..'9'
    ;

WHITESPACE
    : [ \r\n]+ -> skip
    ;

COMMENT
    : '//' .*? '\r'? '\n' -> skip
    ;

