
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.mycompany.tres_direcciones.analizador;

import com.mycompany.tres_direcciones.abs.Instruccion;
import com.mycompany.tres_direcciones.expresion.Asignacion;
import com.mycompany.tres_direcciones.expresion.Division;
import com.mycompany.tres_direcciones.expresion.Expresion;
import com.mycompany.tres_direcciones.expresion.Identificador;
import com.mycompany.tres_direcciones.expresion.Multiplicacion;
import com.mycompany.tres_direcciones.expresion.Primitivo;
import com.mycompany.tres_direcciones.expresion.Resta;
import com.mycompany.tres_direcciones.expresion.Suma;
import com.mycompany.tres_direcciones.expresion.UMenos;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\017\000\002\002\004\000\002\002\003\000\002\003" +
    "\004\000\002\003\003\000\002\004\004\000\002\005\005" +
    "\000\002\006\004\000\002\006\005\000\002\006\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\003\000\002" +
    "\006\005\000\002\006\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\004\011\004\001\002\000\004\012\014\001" +
    "\002\000\006\002\000\011\004\001\002\000\006\002\ufffe" +
    "\011\ufffe\001\002\000\004\002\012\001\002\000\004\015" +
    "\011\001\002\000\006\002\ufffd\011\ufffd\001\002\000\004" +
    "\002\001\001\002\000\006\002\uffff\011\uffff\001\002\000" +
    "\012\004\016\006\020\011\015\013\017\001\002\000\016" +
    "\005\ufff6\006\ufff6\007\ufff6\010\ufff6\014\ufff6\015\ufff6\001" +
    "\002\000\016\005\ufff3\006\ufff3\007\ufff3\010\ufff3\014\ufff3" +
    "\015\ufff3\001\002\000\012\004\016\006\020\011\015\013" +
    "\017\001\002\000\012\004\016\006\020\011\015\013\017" +
    "\001\002\000\016\005\ufff4\006\ufff4\007\ufff4\010\ufff4\014" +
    "\ufff4\015\ufff4\001\002\000\014\005\024\006\025\007\023" +
    "\010\026\015\ufffc\001\002\000\012\004\016\006\020\011" +
    "\015\013\017\001\002\000\012\004\016\006\020\011\015" +
    "\013\017\001\002\000\012\004\016\006\020\011\015\013" +
    "\017\001\002\000\012\004\016\006\020\011\015\013\017" +
    "\001\002\000\016\005\ufff7\006\ufff7\007\ufff7\010\ufff7\014" +
    "\ufff7\015\ufff7\001\002\000\016\005\ufff8\006\ufff8\007\023" +
    "\010\026\014\ufff8\015\ufff8\001\002\000\016\005\ufffa\006" +
    "\ufffa\007\023\010\026\014\ufffa\015\ufffa\001\002\000\016" +
    "\005\ufff9\006\ufff9\007\ufff9\010\ufff9\014\ufff9\015\ufff9\001" +
    "\002\000\016\005\ufffb\006\ufffb\007\ufffb\010\ufffb\014\ufffb" +
    "\015\ufffb\001\002\000\014\005\024\006\025\007\023\010" +
    "\026\014\035\001\002\000\016\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\014\ufff5\015\ufff5\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\033\000\012\002\006\003\004\004\005\005\007\001" +
    "\001\000\002\001\001\000\006\004\012\005\007\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\006\021\007\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\006\033\007\020\001\001\000\006\006\032" +
    "\007\020\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\031\007\020\001\001\000\006\006\030\007\020" +
    "\001\001\000\006\006\027\007\020\001\001\000\006\006" +
    "\026\007\020\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public void syntax_error(Symbol s) {


  List<Integer> lst = expected_token_ids();
            for (Integer integer : lst) {
                System.out.println("Se esperaba: "+ sym.terminalNames[integer]);
            }
  report_error(s.value+"Error de sintaxis en linea " + s.left+","+s.right, null);
}

public void unrecovered_syntax_error(Symbol s) throws
  java.lang.Exception {
  report_fatal_error("", null);
}
	

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= instrucciones 
            {
              Object RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<Instruccion> i = (List<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = i; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instrucciones ::= instrucciones instruccion 
            {
              List<Instruccion> RESULT =null;
		int lstleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int lstright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Instruccion> lst = (List<Instruccion>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion i = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 lst.add(i); RESULT = lst; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instrucciones ::= instruccion 
            {
              List<Instruccion> RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Instruccion i = (Instruccion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 List<Instruccion> ins = new ArrayList<>(); ins.add(i); RESULT = ins; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instrucciones",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruccion ::= asignacion SEMICOLON 
            {
              Instruccion RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Asignacion a = (Asignacion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = a; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("instruccion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // asignacion ::= ID IGUAL e 
            {
              Asignacion RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion ex = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Asignacion(id,ex,idleft,idright);			 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("asignacion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // e ::= MENOS e 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new UMenos(exp,expleft,expright); 				 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // e ::= e SUMA e 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exp1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion exp1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Suma(exp,exp1,expleft,expright); 		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // e ::= e MULTIPLICACION e 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exp1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion exp1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Multiplicacion(exp,exp1,expleft,expright); 	 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // e ::= e MENOS e 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exp1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion exp1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Resta(exp,exp1,expleft,expright); 		 	 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // e ::= e DIV e 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int exp1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int exp1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expresion exp1 = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Division(exp,exp1,expleft,expright); 		 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // e ::= ID 
            {
              Expresion RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Identificador(id,idleft,idright); 		 	 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // e ::= PAR_A e PAR_C 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expresion exp = (Expresion)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // e ::= f 
            {
              Expresion RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Primitivo exp = (Primitivo)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = exp;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // f ::= NUMERO 
            {
              Primitivo RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new Primitivo(String.valueOf(exp) , expleft,expright);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("f",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
