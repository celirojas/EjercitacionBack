package com.company;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private static final Logger logger = Logger.getLogger(Calculadora.class);

    public void calcularPromedio(List<Integer> valores) throws Exception {
        logger.info("Iniciando método calcularPromedio de los siguientes valrores " + valores);
        validarLista(valores);
        Integer sumaTotal = 0;
        for (int valor: valores) {
            sumaTotal += valor;
        }
        logger.info("El promedio de la lista es de: " + sumaTotal/valores.size());
        logger.debug("Se terminó el método calcularPromedio");

    }

    public void validarLista(List<Integer> valores) throws Exception{
        logger.info("Iniciando método validarLista de los siguientes valrores " + valores);
        if(valores.size() > 0){
            if(valores.size() > 5){
                logger.info("La lista es mayor a 5");
            }
            if(valores.size() > 10){
                logger.info("La lista es mayor a 10");
            }
        } else {
            throw new Exception("La lista es igual a 0.");
        }
        logger.debug("Se terminó de validar la lista");
    }

    public void encontrarMinimo(List<Integer> valores) throws Exception {
        logger.info("Iniciando método encontrarMinimo de los siguientes valrores " + valores);
        validarLista(valores);
        int minimo = valores.get(0);
        for (int i = 1; i < valores.size(); i++){
            if(minimo > valores.get(i)){
                minimo = valores.get(i);
            }
        }
        logger.info("El minimo es: " + minimo);
        logger.debug("Se terminó el método encontrarMinimo.");
    }


    public void encontrarMaximo(List<Integer> valores) throws Exception {
        logger.info("Iniciando método encontrarMaximo de los siguientes valrores " + valores);
        validarLista(valores);
        int maximo = valores.get(0);
        for (int i = 1; i < valores.size(); i++){
            if(maximo < valores.get(i)){
                maximo = valores.get(i);
            }
        }
        logger.info("El maximo es: " + maximo);
        logger.debug("Se terminó el método encontrarMaximo.");
    }

}
