package com.company;

public class Usuario {
    private int id;
    private String tipo;

    public Usuario(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    //Getters y setters

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
