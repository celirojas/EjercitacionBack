package com.company;

import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @org.junit.jupiter.api.Test
    void mostrarNombre() {
        Persona persona2 = new Persona("Mar", "Opradolce", "mar@mail.com", 30);

        String nombreCompleto = persona2.mostrarNombre();

        assertEquals("Opradolce, Mar", nombreCompleto);
    }

    @org.junit.jupiter.api.Test
    void esMayorEdad() {
        Persona persona2 = new Persona("Mar", "Opradolce", "mar@mail.com", 30);
        Persona persona3 = new Persona("Pablo", "Opradolce", "pablo@mail.com", 15);

        Boolean mayor = persona2.esMayorEdad();
        Boolean menor = persona3.esMayorEdad();

        assertTrue(mayor);
        assertFalse(menor);

    }
}