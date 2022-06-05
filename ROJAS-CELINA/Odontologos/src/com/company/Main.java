package com.company;

import com.company.dao.impl.OdontologoDAOH2;
import com.company.model.Odontologo;
import com.company.service.OdontologoService;

public class Main {

    public static void main(String[] args) {
	// write your code here
        OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

//        odontologoService.guardarOdontologo(new Odontologo(123456,"Pablo", "Opradolce"));
//        odontologoService.guardarOdontologo(new Odontologo(789456,"Silvia", "Lauria"));
        odontologoService.listarTodos();

    }
}
