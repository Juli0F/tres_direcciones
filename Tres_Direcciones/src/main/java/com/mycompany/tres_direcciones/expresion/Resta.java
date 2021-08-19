/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tres_direcciones.expresion;

import com.mycompany.tres_direcciones.abs.Nodo;
import com.mycompany.tres_direcciones.principal.Principal;
import com.mycompany.tres_direcciones.ts.Arbol;
import com.mycompany.tres_direcciones.ts.Tabla;

/**
 *
 * @author julio
 */
public class Resta extends Expresion{

   private Expresion expLeft;
   private Expresion expRight;

    public Resta(Expresion expLeft, Expresion expRight, int fila, int columna) {
        super(fila, columna);
        this.expLeft = expLeft;
        this.expRight = expRight;
    }

    @Override
    public Object interpretar(Tabla tabla, Arbol arbol) {
        Principal.CODE += "\n";
        Principal.CODE += "t"+Principal.CONTADOR+ " = " + this.expLeft.interpretar(tabla, arbol) +" - " + this.expRight.interpretar(tabla, arbol);
        Principal.CONTADOR++;
        return "t"+(Principal.CONTADOR-1);
    }

    @Override
    public Nodo getNodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}
