 
package com.mycompany.tres_direcciones.analizador;

import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.*;
import java.io.Reader;
import com.mycompany.tres_direcciones.ts.GrammarException;

%%
%public
%class Lexer
%cup
%unicode
%line
%column




SALTO_LINEA = [ \r\t\b\f\n]

NUMERO = [0-9]+("."[  |0-9]+)?
ID = [:jletter:][:jletterdigit:]*


%{
	private List<GrammarException> err;
%}


%init{
    err = new ArrayList<>();
%init}

%{

public List<GrammarException> getListaErroresLexicos(){
	return this.err;
	}
%}


%%

{NUMERO} {return new Symbol(sym.NUMERO, yyline+1,yycolumn+1,(yytext())); }

"+" 	  {return new Symbol(sym.SUMA,yyline+1, yycolumn+1,(yytext()));}
"-" 	  {return new Symbol(sym.MENOS,yyline+1, yycolumn+1,(yytext()));}
"/" 	  {return new Symbol(sym.DIV,yyline+1, yycolumn+1,(yytext()));}
"*" 	  {return new Symbol(sym.MULTIPLICACION,yyline+1, yycolumn+1,(yytext()));}
"=" 	  {return new Symbol(sym.IGUAL,yyline+1, yycolumn+1,(yytext()));}
"(" 	  {return new Symbol(sym.PAR_A,yyline+1, yycolumn+1,(yytext()));}
")" 	  {return new Symbol(sym.PAR_C,yyline+1, yycolumn+1,(yytext()));}
 ";" 	  {return new Symbol(sym.SEMICOLON,yyline+1, yycolumn+1,(yytext()));}

{ID}+     {return new Symbol(sym.ID, yyline+1,yycolumn+1,(yytext())); }
{SALTO_LINEA} {/*IGNORAR	*/}

[^] {}

<<EOF>>             { return new Symbol(sym.EOF); }

