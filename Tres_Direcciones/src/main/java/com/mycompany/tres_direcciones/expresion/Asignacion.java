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
public class Asignacion extends Expresion{
    
    private String id;
    private Expresion expresion;

    public Asignacion(String id, Expresion expresion, int fila, int columna) {
        super(fila, columna);
        this.id = id;
        this.expresion = expresion;
    }

    @Override
    public Object interpretar(Tabla tabla, Arbol arbol) {
        
        String cadenaI = (String)this.expresion.interpretar(tabla, arbol);
        Principal.CONTADOR++;
        String cadena = "\n"+ id+" = "+cadenaI+"\n\n";
        
        Principal.lstCode.add(cadena);
        cadena = "";
        for (int i = 0; i < cadena.length(); i++) {
            cadena +="_";
            
        }
        //System.out.println(Principal.CODE);
        Principal.lstCode.add(cadena);
        Principal.CONTADOR = 0;
        
        return "";
    }

    @Override
    public Nodo getNodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
