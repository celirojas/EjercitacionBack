package com.company;

public class Cancion {


    private String nombre;
    private String artista;
    private String genero;

    //Constructor
    public Cancion(String nombre, String artista, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }
    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
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
        return "Nombre: '" + nombre + '\'' + ", Artista: '" + artista + '\'' + ", Genero: '" + genero + '\'' ;
    }
}
