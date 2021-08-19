/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tres_direcciones.principal;

import com.mycompany.tres_direcciones.abs.Instruccion;
import com.mycompany.tres_direcciones.analizador.Lexer;
import com.mycompany.tres_direcciones.analizador.parser;
import com.mycompany.tres_direcciones.ts.Arbol;
import com.mycompany.tres_direcciones.ts.Tabla;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author julio
 */
public class Principal {
    public static String CODE = " ";
    public static int CONTADOR = 0;
    public static List<String> lstCode;
    
    public void compilar(String cadena){
        lstCode = new ArrayList<>();
        
        try {
            System.out.println("Iniciando ...");
            Lexer lex = new Lexer(new StringReader(cadena));
            parser p = new parser(lex);
            
            var v =  p.parse().value;
            
            Tabla tabla = new Tabla();
            
            Arbol ast = new Arbol((List)v, null, null);
            
            //instruccion.interpretar(tabla, ast);
            for (Instruccion instruccion : ast.getInstruccion()) {
                System.out.println("Instruccion");
                instruccion.interpretar(tabla, ast);
            }
            
           
            


        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
}
