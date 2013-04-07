package coolc.parser;

%%

%{

    private Object yylval;

    public Object getLVal() {
        return yylval;
    }

    public Position getStartPos() {
        return new Position(yyline, yycolumn);
    }

    public Position getEndPos() {
        return new Position(yyline, yycolumn);
    }

    public void yyerror(String msg) {
        //throw new Exception();
    }

%}

%public
%class Lexer
%unicode
%line
%column

%ignorecase

TYPEID     = [A-Z]+ [a-z_A-z0-9]*
ID     = [a-z]+ [a-z_A-z0-9]*
TSTRING = \" [^\"]* \"
TCOMMENTS = "(*" [^"*)"]* "*)"
TCOMMENTS2 = "--" [^"\n"]* \n


%x comment
%x multiline_comment

%implements Parser.Lexer
%int

%%

{TCOMMENTS}   {
     		yylval = yytext();
                return Parser.T_COMMENTS;
     }
     
     {TCOMMENTS2}   {
     		yylval = yytext();
                return Parser.T_COMMENTS;
     }
     
     
	"Int"     { return Parser.T_INT; }
	"String"     { return Parser.T_STRING; }
	"Object"     { return Parser.T_OBJECT; }
	"Bool"     { return Parser.T_BOOL; }

    "("     { return Parser.T_LPAREN; }
    ")"     { return Parser.T_RPAREN; }
    "["     { return Parser.T_LBRACE; }
    "]"     { return Parser.T_RBRACE; }    
    ";"     { return Parser.T_SEMICOLON; }
    ":"     { return Parser.T_TWO_POINT; }
    "."     { return Parser.T_POINT; }
    ","     { return Parser.T_COMMA; }
    "{"     { return Parser.T_LKEY; } 
    "}"     { return Parser.T_RKEY; } 
    
    "<-"     { return Parser.T_ASSIGN; }
    "+"     { return Parser.T_PLUS; }
    "-"     { return Parser.T_MINUS; }
    "*"     { return Parser.T_MULT; }
    "/"     { return Parser.T_DIV; }
    
    "<="     { return Parser.T_LESS_EQUAL; }    
    "<"     { return Parser.T_LESS; }  
    "~"     { return Parser.T_SNOT; }  
    "="     { return Parser.T_EQUAL; } 
    
    "class"     { return Parser.T_CLASS; }
    "inherits"     { return Parser.T_INHERITS; }
    "if"     { return Parser.T_IF; }
    "then"     { return Parser.T_THEN; }
    "else"     { return Parser.T_ELSE; }
    "fi"     { return Parser.T_FI; }
    "while"     { return Parser.T_WHILE; }
    "loop"     { return Parser.T_LOOP; }
    "pool"     { return Parser.T_POOL; }
    "let"     { return Parser.T_LET; }
    "in"     { return Parser.T_IN; }
    "new"     { return Parser.T_NEW; }
    "isvoid"     { return Parser.T_ISVOID; }
    "not"     { return Parser.T_NOT; }
    "true"     { return Parser.T_TRUE; }
    "false"     { return Parser.T_FALSE; }
    
        [0-9]+  {   
                yylval = Integer.parseInt(yytext());
                return Parser.INT;
            }

    {ID}    {
                yylval = yytext();
                return Parser.ID; 
            }
            
     {TYPEID}    {
                yylval = yytext();
                return Parser.TYPEID; 
            }
            
     {TSTRING}   {
     		yylval = yytext();
                return Parser.TYPE_STRING;
     }
     
     
     
     
    
    [ \t\r\n]+  { 
        // ignoramos el espacio en blanco 
    }

    .           { System.out.printf("Unknown character [%s]\n", yytext());
                       return Parser.T_UNKNOWN;    }
    
    <<EOF>> { return Parser.EOF; }