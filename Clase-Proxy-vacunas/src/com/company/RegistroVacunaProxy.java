package com.company;

import java.util.Date;

public class RegistroVacunaProxy implements Registro{
    private RegistroVacuna registro;


    @Override
    public String vacunar(Persona persona) {
        Date hoy = new Date();
        String mensaje = "Vuelva cuando sea su turno.";
        if(hoy.after(persona.getFechaAsignada())){  //El after da true si la hoy.after es posterior a la fecha que le paso por parametro.
            //tiene que pasar al otro sector de vacunación
            registro = new RegistroVacuna();
            mensaje=registro.vacunar(persona);
        }
        return mensaje;
        }

    }

