package com.company;

import java.util.HashMap;

public class CancionFactory {
        private static final HashMap<String, Cancion> listaReproduccion = new HashMap<>(); //Se carga en memoria y queda guardado en cache

        public static Cancion obtenerCancion(String nombre, String artista, String genero){
            Cancion cancion = listaReproduccion.get(nombre); //Le consulto a la lista si tiene la canción con el nombre que recibo por parametro.
            if(cancion == null){
                cancion = new Cancion(nombre, artista, genero); //Si la canción no existe, la creo.
                listaReproduccion.put(nombre, cancion); //Le tengo que pasar la clave y el valor.
                System.out.println("Se creó la canción: " + nombre + ". Artista: " + artista + ". Genero " + genero);
            }
            return cancion;
        }
        public static void mostrarLista(){
                System.out.println(listaReproduccion.values());
        }


        public static void quitarCancion(String nombre){
            listaReproduccion.remove(nombre);
        } //Quito la canción de la lista de reproducción.

}
