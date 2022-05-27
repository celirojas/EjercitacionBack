package com.company;

import org.apache.log4j.Logger;

public class Leon extends Felino {

    private boolean esAlfa;


    public Leon(String nombre, int edad, boolean esAlfa) throws Exception {
        super(nombre, edad);
        this.esAlfa = esAlfa;
        logger.debug("Instanciando león " + nombre);
    }

    @Override
    public void correr() {
        logger.info("El leon " + nombre + " está corriendo");
    }

    @Override
    public void esMayorA10() {
        if (this.edad > 10 && esAlfa) {
            logger.info("El león " + nombre + " es el alfa y tiene más de 10 años");
        }
    }
}
