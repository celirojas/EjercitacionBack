package com.company.models;

public class User {
    private int id; //creo la propiedad id para ser reconocido
    private UserType tipo; //utilizamos un enum para el tipo


    public User(int id, UserType tipo) { //Creo el constructor con las propiedades
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public UserType getTipo() {
        return tipo;
    }

    public void setTipo(UserType tipo) {
        this.tipo = tipo;
    }
}
