package com.company;

public class Circulo {
    private String color; //atributo compartido

    private Double radio;

    private String tamanio;

    public Circulo(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public void dibujar(){
        System.out.println("Dibujamos objeto color: " + color);
    }
}
