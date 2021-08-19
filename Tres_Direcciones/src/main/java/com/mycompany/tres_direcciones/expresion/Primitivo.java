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
public class Primitivo extends Expresion{

    private Object valor;
    
    public Primitivo(Object valor , int fila, int columna ) {
        super(fila, columna);
        this.valor = valor;
        
    }    

    public Object getValor() {
        return valor;
    }

    
    @Override
    public String toString() {
        return "Primitivo{" + "valor=" + valor + '}';
    }

    
    public Object interpretar(Tabla tabla, Arbol arbol) {
        return this.valor;
    }

    @Override
    public Nodo getNodo() {
        
        //Nodo nodo = new Nodo("Numero");
        Nodo nodo = new Nodo(String.valueOf(valor));
        
        //nodo.addHijo(String.valueOf(valor));
        return nodo;
    }

    
}
