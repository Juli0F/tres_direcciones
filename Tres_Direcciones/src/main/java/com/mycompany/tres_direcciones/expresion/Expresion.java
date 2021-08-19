/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tres_direcciones.expresion;

import com.mycompany.tres_direcciones.abs.Instruccion;
import com.mycompany.tres_direcciones.abs.Nodo;
import com.mycompany.tres_direcciones.ts.Arbol;
import com.mycompany.tres_direcciones.ts.Tabla;

/**
 *
 * @author julio
 */
public abstract class Expresion extends Instruccion {

    public Expresion(int fila, int columna) {
        super(fila, columna);
    }

    
}
