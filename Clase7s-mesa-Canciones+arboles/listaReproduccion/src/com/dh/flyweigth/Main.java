package com.dh.flyweigth;

import com.dh.flyweigth.model.Cancion;
import com.dh.flyweigth.factory.CancionFactory;
import com.dh.flyweigth.model.ListaReproduccion;

public class Main {
    private static final String canciones[]= {"Let it be", "Welcome to the jungle", "Concrete jungle", "Halo"}; //Creando los nombres de las canciones

    public static void main(String[] args) {
        ListaReproduccion lista1 = new ListaReproduccion("listaCeli"); //Instanciamos dos listas de reproducción
        ListaReproduccion lista2 = new ListaReproduccion("listaJuan");

        for (int i = 0; i < canciones.length; i++){ //Las recorremos y las agregamos a la lista1
            //En esta primera instancia las crea a todas porque no estaban en chaché.
            lista1.agregarCancion(canciones[i]);
        }

        System.out.println("***********************LISTA1***************************");

        lista1.listarCancion();
        lista1.borrarCancion("Let it be");
        lista1.listarCancion();

        System.out.println("***********************LISTA2***************************");

        //Hacemos lo mismo con la lista 2, para comprobar que está recuperando las canciones.
        for (int i = 0; i < canciones.length; i++){
            lista2.agregarCancion(canciones[i]); //Recupera las cancioes.
        }
        lista2.listarCancion();
        lista2.borrarCancion("Let it be");
        lista2.listarCancion();
    }

}
