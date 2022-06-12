package com.example.Odontologo22.controller;


import com.example.Odontologo22.domain.Odontologo;
import com.example.Odontologo22.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Decirle a Spring que este es nuestro controller
@RequestMapping("odontologos") //Agregar nuestra URL.

public class OdontologoController {
    //Esta clase hace referencia a service(el modelo) y automaticamente lo transforma en JSON, que sería nuestra vista. Esto pasa dentro de @GetMapping


    private final OdontologoService odontologoService;

    @Autowired //Inyeccion de dependencia. Se trata de la conexión entre el modelo y el controller
    public OdontologoController(OdontologoService odontologoService) {
        this.odontologoService = odontologoService;
    }
    @GetMapping
    public List<Odontologo> getOdontologos(){
        return odontologoService.listaOdontologos();
    }
}
