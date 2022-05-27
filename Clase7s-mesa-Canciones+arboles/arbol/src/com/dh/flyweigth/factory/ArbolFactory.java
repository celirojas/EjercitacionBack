package com.dh.flyweigth.factory;

import com.dh.flyweigth.model.Arbol;
import com.dh.flyweigth.model.TipoArbol;

import java.util.HashMap;

public class ArbolFactory {

    private static final HashMap<TipoArbol, Arbol> ARBOL_MAP = new HashMap<>(); //Creamos nuestro map de árboles.

    public static Arbol obtenerArbol(TipoArbol tipoArbol){
        Arbol arbol =  ARBOL_MAP.get(tipoArbol); //Intentamos recuperar del map un arbol
        if (arbol == null){
            arbol = new Arbol(tipoArbol); //Si no existe lo crea
            ARBOL_MAP.put(tipoArbol, arbol); //Lo agregamos al map
            System.out.println("Creando arbol del tipo:" + tipoArbol);
            return arbol;
        }
        System.out.println("Recuperando arbol del tipo: " + tipoArbol); //Si no existe, lo recupera y me lo retorna de la memoria cache
        return arbol;
    }

}
