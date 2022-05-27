package com.company;

public class Persona {
    String nombre;
    String apellido;
    String email;
    int edad;

    public Persona(String nombre, String apellido, String email, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String mostrarNombre(){
        return apellido + ", " + nombre;
    }

    public Boolean esMayorEdad(){
        return edad > 18;
    }

}
