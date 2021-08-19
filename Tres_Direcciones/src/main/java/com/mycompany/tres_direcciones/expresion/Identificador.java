/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tres_direcciones.expresion;

import com.mycompany.tres_direcciones.abs.Nodo;
import com.mycompany.tres_direcciones.ts.Arbol;
import com.mycompany.tres_direcciones.ts.Tabla;

/**
 *
 * @author julio
 */
public class Identificador extends Expresion{
    
    private String id;

    public Identificador(String id, int fila, int columna) {
        super(fila, columna);
        this.id = id;
    }

    @Override
    public Object interpretar(Tabla tabla, Arbol arbol) {
        return this.id;
    }

    @Override
    public Nodo getNodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
