package com.dh.flyweigth.model;

public enum TipoArbol {
    ORNAMENTALES("verde",400.0 ,200.0 ),
    FRUTALES("rojo", 300.0, 500.0);


    private String color; //Incluimos los atributos de cada tipo de arbol.
    private Double ancho;
    private Double alto;


    //Constructor
    TipoArbol(String color, Double ancho, Double largo) {
        this.color = color;
        this.ancho = ancho;
        this.alto = largo;
    }

    //Getters y setters
    public String getColor() {
        return color;
    }

    public Double getAncho() {
        return ancho;
    }

    public Double getLargo() {
        return alto;
    }
}
