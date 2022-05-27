package com.dh.flyweigth.model;

import com.dh.flyweigth.factory.ArbolFactory;

import java.util.ArrayList;
import java.util.List;

public class Bosque {

    private String nombre;
    private List<Arbol> bosqueArboles = new ArrayList<>(); //Nuestro conjunto de árboles.

    //Constructor
    public Bosque(String nombre) {
        this.nombre = nombre;
    }

    //Getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Arbol> getBosqueArboles() {
        return bosqueArboles;
    }

    public void setBosqueArboles(List<Arbol> bosqueArboles) {
        this.bosqueArboles = bosqueArboles;
    }

    //Métodos
    public void plantarArbol(TipoArbol tipoArbol){ //plantamos árboles utilizando el método obtener árbol de ArbolFactory.
        bosqueArboles.add(ArbolFactory.obtenerArbol(tipoArbol));
        System.out.println("Planteando el arbol:" + tipoArbol);
    }
    public void listarArboles(){ //Inicializamos dos contadores
        int contadorRojo= 0;
        int contadorVerde= 0;

        for (Arbol arbol: bosqueArboles //Recorremos el bosqueArboles
             ) {
            if (arbol.getTipoArbol().getColor().equals("rojo")) { //Si es rojo o verde aumentamos el contador.

                contadorRojo ++ ;
            } else {
                contadorVerde ++;
            }
        }
        System.out.println("La cantidad de arboles rojos es:" + contadorRojo);
        System.out.println("La cantidad de arboles verdes es:" + contadorVerde);
    }
}