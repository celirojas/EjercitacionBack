package com.company;

public class RegistroVacuna implements Registro{


    @Override
    public String vacunar(Persona persona) {
        System.out.println("Verificando la informacion recibida..");
        return "Se ha registrado el DNI" + persona.getDni() + " como persona vacunada con " + persona.getNombreVacuna();
    }
}
