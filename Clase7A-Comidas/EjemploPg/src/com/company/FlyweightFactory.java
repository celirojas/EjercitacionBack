package com.company;

import java.util.HashMap;

public class FlyweightFactory {

    private static final HashMap<String, Circulo> circuloMap = new HashMap();    //creamos el mapa, aunque sea estatico y final podemos agregar o quitar


    //No necesito instanciar una factory para poder utilizar sus metodos.
    public static Circulo obtenerCirculo(String color){ //fabrica de objeto circulo, que si ya existe no crea, sino lo crea.
        Circulo circulo = circuloMap.get(color);
        if(circulo == null){
            circulo = new Circulo(color);
            circuloMap.put(color, circulo);
            System.out.println("Creo un circulo de color: " + color);
        }
        return circulo;
    }
}
