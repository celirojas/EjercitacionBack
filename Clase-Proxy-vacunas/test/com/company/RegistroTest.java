package com.company;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegistroTest {
   @Test
    public void vacunarPersonaCorrecta(){
       //dato
       Persona persona = new Persona("35456","Pedro","Gomez", "AstraZeneca", new Date(2022-1900,5-1,14)); //año mes dia
       Registro registro=new RegistroVacunaProxy();
       String respEsperada="Se ha registrado el DNI35456 como persona vacunada con AstraZeneca";

       //cuando
       String respuesta=registro.vacunar(persona);

       //entonces
       Assertions.assertEquals(respEsperada, respuesta);
   }
}