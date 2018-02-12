/* JFlex MiniJava lexer */
import java_cup.runtime.*;

%%

%class Lexer
%unicode
%cupsym SymTable
%cup
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol symbol(int type) {
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

WhiteSpace = [ \r\n\t\f]
LineBreak = \r|\n|\r\n

Integer = -? 0|[1-9][0-9]*
Identifier = [a-zA-Z_][a-zA-Z0-9_]*
BlockComment = "/*" ([^*] | "*" [^/])* "*/"
LineComment = "//" [^\r\n]* {LineBreak}?
Comment = {BlockComment} | {LineComment}

%%

"(" { return symbol(SymTable.LPAREN); }
")" { return symbol(SymTable.RPAREN); }
"{" { return symbol(SymTable.LBRACE); }
"}" { return symbol(SymTable.RBRACE); }
"[" { return symbol(SymTable.LBRACKET); }
"]" { return symbol(SymTable.RBRACKET); }
"+" { return symbol(SymTable.PLUS); }
"-" { return symbol(SymTable.MINUS); }
"*" { return symbol(SymTable.TIMES); }
"<" { return symbol(SymTable.LESS_THAN); }
"&&" { return symbol(SymTable.AND); }
"!" { return symbol(SymTable.NOT); }
"." { return symbol(SymTable.DOT); }
"," { return symbol(SymTable.COMMA); }
"=" { return symbol(SymTable.ASSIGNMENT); }
"==" { return symbol(SymTable.EQUALITY); }
";" { return symbol(SymTable.SEMI_COLON); }
"if" { return symbol(SymTable.IF); }
"while" { return symbol(SymTable.WHILE); }
"else" { return symbol(SymTable.ELSE); }
"int" { return symbol(SymTable.INT); }
"boolean" { return symbol(SymTable.BOOLEAN); }
"String" { return symbol(SymTable.STRING); }
"return" { return symbol(SymTable.RETURN); }
"true" { return symbol(SymTable.TRUE); }
"false" { return symbol(SymTable.FALSE); }
"class" { return symbol(SymTable.CLASS); }
"public" { return symbol(SymTable.PUBLIC); }
"static" { return symbol(SymTable.STATIC); }
"void" { return symbol(SymTable.VOID); }
"this" { return symbol(SymTable.THIS); }
"new" { return symbol(SymTable.NEW); }
"main" { return symbol(SymTable.MAIN); }
"extends" { return symbol(SymTable.EXTENDS); }
"length" { return symbol(SymTable.LENGTH); }
"System.out.println" { return symbol(SymTable.PRINT); }

{Integer} { return symbol(SymTable.INT_LITERAL, Integer.parseInt(yytext())); }
{Identifier} { return symbol(SymTable.ID, yytext()); }

{WhiteSpace} {}
{Comment} {}

[^] { System.out.printf("Illegal character '%c' at line %d column %d\n",
	yytext().charAt(0), yyline, yycolumn); }