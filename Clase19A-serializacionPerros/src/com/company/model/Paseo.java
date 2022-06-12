package com.company.model;

import java.io.*;
import java.util.ArrayList;

public class Paseo {
    public static void main(String[] args) {

    Perro p1 = new Perro("Luz", "Caniche", 1, "Independencia 1396");
    Perro p2 = new Perro("Luna", "Mestiza", 2, "Beiro 1305");
    Perro p3 = new Perro("Magui", "Ovejero", 3, "AvMaipu 1744");
    Perro p4 = new Perro("Toto", "Dogo", 5, "Urquiza 654");

    ArrayList<Perro> lunes = new ArrayList<Perro>();
    ArrayList<Perro> martes = new ArrayList<Perro>();
    ArrayList<Perro> miercoles = new ArrayList<Perro>();
    ArrayList<Perro> jueves = new ArrayList<Perro>();
    ArrayList<Perro> viernes = new ArrayList<Perro>();

    lunes.add(p1);
    miercoles.add(p1);
    viernes.add(p1);

    lunes.add(p2);
    martes.add(p2);
    miercoles.add(p2);
    jueves.add(p2);

    miercoles.add(p3);
    jueves.add(p3);
    viernes.add(p3);

    lunes.add(p4);
    martes.add(p4);
    miercoles.add(p4);
    jueves.add(p4);
    viernes.add(p4);

//Por parámetro le tengo que decir el nombre que va a tener en el sistema operativo
        try {


            FileOutputStream fil = new FileOutputStream("perros.dat"); //Nombre de archivo de texto.
            //La salida del objeto
            ObjectOutputStream archi = new ObjectOutputStream(fil); //Le paso el stream de salida.

            //Lo escribimos con el método de escritura, le tengo que pasar un object, en este caso, las colecciones de perros.
            archi.writeObject(lunes);
            archi.writeObject(martes);
            archi.writeObject(miercoles);
            archi.writeObject(jueves);
            archi.writeObject(viernes);

            archi.close(); //Para cerrar el archivo.

            //Lo abro para poder leerlo y listarlo - Lectura
            FileInputStream filIn = new FileInputStream("perros.dat");
            ObjectInputStream archiIn = new ObjectInputStream(filIn);

            ArrayList<Perro> dia;

            for(int i=0; i<5; i++){
                System.out.println("-----------------------------------------------");
                System.out.println("Día: " + i);
                System.out.println("-----------------------------------------------");
                dia = (ArrayList<Perro>) archiIn.readObject();  //Leer el objeto. Estoy esperando una lista, pero me pasa un object. Por eso el casteo.
                for (Perro p: dia) { //Muestro la información de recuperación de archivo por consola.
                    System.out.println(p);
                }
            }

            archiIn.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
