package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona persona1 = new Persona("Celina", "Rojas", "celina@mail.com", 31);
        System.out.println(persona1.mostrarNombre());
        System.out.println(persona1.esMayorEdad());
    }
}
