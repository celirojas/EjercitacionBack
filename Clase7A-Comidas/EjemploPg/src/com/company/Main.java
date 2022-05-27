package com.company;

public class Main {
    private static final String colores[] = {"Rojo", "Azul", "Negro"};

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < 100; i++){
            Circulo circulo = FlyweightFactory.obtenerCirculo(colorAleatorio());
            circulo.setRadio(i + 5.0);
            circulo.setTamanio("Tamanio: " + i * 2);
            circulo.dibujar();
        }



    }
    public static String colorAleatorio(){
        return colores[(int)(Math.random()*colores.length)];
    }
}
