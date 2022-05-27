package com.company;

public abstract class Vendedor {
    private String nombre;
    protected int puntos;
    private String categoria;

    public Vendedor(String nombre) { //Constructor
        this.nombre = nombre;
        this.puntos = 0;

    }
    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Métodos abstractos

    public abstract void vender();
    public abstract int calcularPuntos();

    //Metodos

    public void mostrarCategoria(){
        calcularPuntos();
        recategorizar();
        System.out.println("\n\tNombre: " + nombre + "\n\tCategoria:\t" + categoria + "\n\tPuntos:\t" + puntos);
    }

    public void recategorizar(){
        categoria = "Novato";
        if(puntos > 20 && puntos <= 30){
            categoria = "Aprendiz";
        } else if(puntos >= 31 && puntos <= 40){
            categoria = "Bueno";
        } else if(puntos > 40){
            categoria = "Maestro";
        }

    }

}
