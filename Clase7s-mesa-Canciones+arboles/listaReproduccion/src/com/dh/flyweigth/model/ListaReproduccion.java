package com.dh.flyweigth.model;

import com.dh.flyweigth.factory.CancionFactory;

import java.util.ArrayList;
import java.util.List;

public class ListaReproduccion {

    private String nombre;

    private List<Cancion> listaCanciones = new ArrayList<>(); //Creamos una lista de canciones.


    //Constructor
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
    }


    //Getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }



    //Método listarCanción. Recorremos la lista de canciones y las imprimimos por consola.
    public void listarCancion(){
        System.out.println("Esta son las canciones");
        for (Cancion cancion: listaCanciones) {
            System.out.println("Cancion:" + cancion.getNombre());
        }
    }
    public void agregarCancion(String nombre){ //Para agergar canciones a la lista utilizamos la Factory(verifica en cache y sino, la crea)
        listaCanciones.add(CancionFactory.obtenerCancion(nombre));
        System.out.println("Agregando la canción:" + nombre);
    }

    public void borrarCancion(String nombre){ //Recorremos la lista de canciones y eliminamos la que se nos pase por parámetro.
        for (Cancion cancion: listaCanciones
             ) {
            if(cancion.getNombre().equals(nombre)){
                listaCanciones.remove(cancion);
                System.out.println("Removiendo la canción:" + cancion);
                break;
            }
        }

    }
}