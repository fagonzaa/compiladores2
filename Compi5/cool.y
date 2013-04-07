%{
package coolc.parser;

%}

%output  "Parser.java"
%language "Java"


%define parser_class_name "Parser"
%define public

%code {

    public static String getTokenName(int t) {
        return yytname_[t-255];
    }

}

%token T_UNKNOWN
%token T_COMMENTS;

%token  T_INT "Int"
%token  T_STRING "String"
%token  T_OBJECT "Object"
%token  T_BOOL "Bool"

%token  T_LPAREN "(" T_RPAREN ")"
%token  T_LBRACE  "[" T_RBRACE "]"
%token  T_SEMICOLON ";"
%token  T_TWO_POINT ":"
%token  T_POINT "."
%token  T_COMMA ","
%token  T_LKEY "{" T_RKEY "}"

%token T_ASSIGN "<-"
%token T_PLUS "+"
%token T_MINUS "-"
%token T_MULT "*"
%token T_DIV "/"

%token T_LESS_EQUAL "<="
%token T_LESS "<"
%token T_SNOT "~"
%token T_EQUAL "="

%token T_CLASS "class"
%token T_INHERITS "inherits"
%token T_IF "if"
%token T_THEN "then"
%token T_ELSE "else"
%token T_FI "fi"
%token T_WHILE "while"
%token T_LOOP "loop"
%token T_POOL "pool"
%token T_LET "let"
%token T_IN "in"
%token T_NEW "new"
%token T_ISVOID "isvoid"
%token T_NOT "not"
%token T_TRUE "true"
%token T_FALSE "false"

%token <String> ID
%token <String> TYPEID
%token <String> TYPE_STRING
%token <Int> INT


%%

expr
    : INT
    | expr "+" expr
    | ID "(" param_list ")"
    | "[" matrix "]"
    | ID
    ;

param_list
    : /* empty */ 
    | param_list "," expr
    ;

matrix
    : vector
    | matrix ";" vector
    ;

vector
    : expr
    | vector "," expr
    ;

%%