package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Cancion cancion1 = CancionFactory.obtenerCancion("Born this way", "Lady Gaga", "Pop");
        Cancion cancion2 = CancionFactory.obtenerCancion("Ojos así", "Shakira", "Pop");
        Cancion cancion3 = CancionFactory.obtenerCancion("Dancing queen", "Abba", "Pop");
        Cancion cancion4 = CancionFactory.obtenerCancion("Born this way", "Lady Gaga", "Pop");

        CancionFactory.mostrarLista();
        CancionFactory.quitarCancion("Dancing queen");
        CancionFactory.mostrarLista();
    }
}
