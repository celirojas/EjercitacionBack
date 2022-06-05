package com.dh;

import com.dh.dao.impl.PacienteDAOH2;
import com.dh.model.Domicilio;
import com.dh.model.Paciente;
import com.dh.service.PacienteService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            //Nos conectamos al driver y creamos la tabla desde acá con el comando init, la tabla esta seteada en el archivo create.sql
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/db_pacientes;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

        //Servicio
        PacienteService pacienteService = new PacienteService(new PacienteDAOH2());

        //Instanciamos domicilio y paciente
        Domicilio domicilio = new Domicilio("Av Maipu", 1744, "Florida", "Buenos Aires");
        Paciente paciente = new Paciente("Celina", "Rojas", 35334509, LocalDate.of(2022, 06, 1), domicilio);

        //Ahora guardamos el paciente a pacienteService
        pacienteService.guardarPaciente(paciente);
    }
}

