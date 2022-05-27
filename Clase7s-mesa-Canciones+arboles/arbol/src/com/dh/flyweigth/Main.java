package com.dh.flyweigth;

import com.dh.flyweigth.model.Bosque;
import com.dh.flyweigth.model.TipoArbol;

public class Main {

    public static void main(String[] args) {
        Bosque bosque1 = new Bosque("bosqueCeli"); //Creamos un bosque
        for (int i = 0; i < 500000 ; i++){
            bosque1.plantarArbol(TipoArbol.FRUTALES);
            bosque1.plantarArbol(TipoArbol.ORNAMENTALES);
        }
        bosque1.listarArboles();

        System.out.println("****************************MEMORIA************************");
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
        System.out.println("Tamaño del bosque: "+ bosque1.getBosqueArboles().size() +" de árboles");
    }
}
