package com.dh.flyweigth.model;

public class Cancion {
    private String nombre;
    private String artista;
    private String genero;

    //Constructor
    public Cancion(String nombre) { //Constructor del atributo compartido
        this.nombre = nombre;
    }

    //Getters & setters
    public String getArtista() { //Métodos accesores de los atributos NO compartidos
        return artista;
    }

    public String getNombre() {
        return nombre;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return this.nombre;
    }
}
