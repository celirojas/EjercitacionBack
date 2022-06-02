package com.company;

import com.company.dao.impl.EstudianteDAOH2;
import com.company.model.Estudiante;
import com.company.servicios.EstudianteService;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Estudiante estudiante = new Estudiante(1L, "Javier", "Rabuch"); //Objeto de negocio ya creado

        //Utilizamos el service para guardar
        EstudianteService estudianteService = new EstudianteService();
        //Seteamos una estrategia de persistencia, es decir un DAO
        estudianteService.setEstudianteIdao(new EstudianteDAOH2()); //Para instanciar un service tengo que meterle un repositorio adentro.


        //estudianteService.guardarEstudiante(estudiante);
    }
}