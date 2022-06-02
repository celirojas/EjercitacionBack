package com.company;


import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
	// write your code here

        Calculadora calculadora = new Calculadora();
        List<Integer> valores = List.of(10,20,15,40,50,60);
        List<Integer> masDeDiezValores = List.of(3, 11, 35, 6, 10, 8, 22, 100, 9, 56, 21, 47, 15, 18);
        List<Integer> valoresVacio = new ArrayList<>();



        calculadora.encontrarMinimo(masDeDiezValores);
        calculadora.encontrarMaximo(masDeDiezValores);



    }
}
