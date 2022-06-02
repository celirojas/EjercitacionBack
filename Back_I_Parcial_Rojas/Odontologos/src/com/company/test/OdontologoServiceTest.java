package com.company.test;

import com.company.dao.impl.OdontologoDAOH2;
import com.company.model.Odontologo;
import com.company.service.OdontologoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {


    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDAOH2());

    @BeforeAll
    public static void cargarOdontologos(){
        odontologoService.guardarOdontologo(new Odontologo(211090, "Laura", "Adradas"));
        odontologoService.guardarOdontologo(new Odontologo(010460, "Mar", "Opradolce"));
    }


    @Test
    void guardarOdontologo() {
        Odontologo odontologo = new Odontologo(240296, "Victor", "Rojas");
        Odontologo odontologoGuardado = odontologoService.guardarOdontologo(odontologo);
        Assert.assertNotNull(odontologoGuardado); //Comprobando que guardarOdontologo me haya devuelto un odontologo y no haya habido un error
        Assert.assertEquals(odontologo, odontologoGuardado);
        Assert.assertTrue(odontologoGuardado.getId() != null);

    }

    @Test
    void listarTodos() {
        List<Odontologo> odontologosList = odontologoService.listarTodos();
        Assert.assertTrue(odontologosList.size() > 0);
    }
}