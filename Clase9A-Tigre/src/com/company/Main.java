package com.company;

import org.apache.log4j.Logger;

public class Main {

    private final static Logger logger = Logger.getLogger(Main.class); //punto de entrada


    public static void main(String[] args) {
	// write your code here

       try {
           Tigre tigre1 = new Tigre("Tigre1", 5);
           tigre1.correr();
           tigre1.esMayorA10();
       } catch (Exception e) {
           logger.error(e.getMessage());
        }

        try {
            Tigre tigre2 = new Tigre("Tigre2", -1);
            tigre2.correr();
            tigre2.esMayorA10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        try {
            Tigre tigre3 = new Tigre("Tigre3", 11);
            tigre3.correr();
            tigre3.esMayorA10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        try {
            Leon leon1 = new Leon("Leon1", 11, true);
            leon1.correr();
            leon1.esMayorA10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        try {
            Leon leon2 = new Leon("Leon2", -2, true);
            leon2.correr();
            leon2.esMayorA10();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }
}
