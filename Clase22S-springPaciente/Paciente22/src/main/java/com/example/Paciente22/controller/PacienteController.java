package com.example.Paciente22.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PacienteController {

    @GetMapping("/index")
    public String welcome(Model model){ //Manera para mandar datos del controlador a la vista
        model.addAttribute("nombre", "diez");
        return "index"; //hace mención a la plantilla html
    }
}
