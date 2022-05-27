package com.dh.flyweigth.factory;

import com.dh.flyweigth.model.Cancion;

import java.util.HashMap;

public class CancionFactory {

    private static final HashMap<String, Cancion> CANCION_MAP = new HashMap<>(); //Creando mapa de canciones que tiene como key: nombre. Se carga en memoria y queda guardado en cache

    public static Cancion obtenerCancion(String nombre){//Método obtener canción
        Cancion cancion =  CANCION_MAP.get(nombre); //Obtener la canción con el nombre que le pasamos por parámetro
        if (cancion == null){ //Evalúa si la canción es nula, entonces que cree la canción con ese nombre
            cancion = new Cancion(nombre);
            CANCION_MAP.put(nombre, cancion); //Agregamos la canción al HashMap
            System.out.println("Creando objeto de canción con el nombre:" + nombre);
            return cancion;
        }
        System.out.println("Recuperando Objecto de canción con el nombre: " + nombre);//Si la canción existe ya en caché, que retorne la canción
        return cancion;
    }

}
