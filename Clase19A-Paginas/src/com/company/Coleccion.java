package com.company;

import java.io.*;
import java.util.ArrayList;

public class Coleccion {
    public static void main(String[] args)  {
        Pagina pagina1 = new Pagina("https://youtube.com.ar", "Youtube");
        Pagina pagina2 = new Pagina("https://google.com.ar", "Google");
        Pagina pagina3 = new Pagina("https://playground.digitalhouse.com", "Playground");
        Pagina pagina4 = new Pagina("https://discord.com", "Discord");
        Pagina pagina5 = new Pagina("https://store.steampowered.com/", "Steam");
        Pagina pagina6 = new Pagina("https://notion.so", "Notion");

        ArrayList<Pagina> coleccion1 = new ArrayList<Pagina>();
        ArrayList<Pagina> coleccion2 = new ArrayList<Pagina>();
        ArrayList<Pagina> coleccion3 = new ArrayList<Pagina>();
        ArrayList<Pagina> coleccion4 = new ArrayList<Pagina>();

        coleccion1.add(pagina1);
        coleccion1.add(pagina3);
        coleccion1.add(pagina5);

        coleccion2.add(pagina2);
        coleccion2.add(pagina4);
        coleccion2.add(pagina6);

        coleccion3.add(pagina1);
        coleccion3.add(pagina2);
        coleccion3.add(pagina3);

        coleccion4.add(pagina6);
        coleccion4.add(pagina5);
        coleccion4.add(pagina4);

        try{
            FileOutputStream fil = new FileOutputStream("paginas.dat");
            //La salida del objeto
            ObjectOutputStream archi = new ObjectOutputStream(fil);

            archi.writeObject(coleccion1);
            archi.writeObject(coleccion2);
            archi.writeObject(coleccion3);
            archi.writeObject(coleccion4);

            archi.close(); //Para cerrar el archivo.

            //Lo abro para poder leerlo y listarlo
            FileInputStream filIn = new FileInputStream("paginas.dat");
            ObjectInputStream archiIn = new ObjectInputStream(filIn);

            ArrayList<Pagina> colecciones;

            for(int i=0; i<4; i++){
                System.out.println("-----------------------------------------------");
                System.out.println("Colección: " + i);

                colecciones = (ArrayList<Pagina>) archiIn.readObject();
                for (Pagina p: colecciones) {
                    System.out.println(p);
                }
            }

            archiIn.close();



        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
