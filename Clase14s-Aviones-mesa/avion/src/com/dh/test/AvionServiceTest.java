package com.dh.test;
import com.dh.dao.IDao;
import com.dh.dao.impl.AvionDaoH2;
import com.dh.entity.Avion;
import com.dh.service.AvionService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//FIJARME ESTO!!!!!!!!!!!!!!!
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;

public class AvionServiceTest {
    private static AvionService avionService = new AvionService(new AvionDaoH2());

    @BeforeClass
    public static void cargarDataAviones() {
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();

        avion1.setId(5L); //La L es de long
        avion1.setMarca("marca");
        avion1.setMatricula("M1234");
        avion1.setFechaEntrada("31/05/2022");
        avion1.setModelo("modelo");
        avionService.guardarAvion(avion1);

        avion2.setId(3L); //La L es de long
        avion2.setMarca("marca1");
        avion2.setMatricula("M1267");
        avion2.setFechaEntrada("31/06/2022");
        avion2.setModelo("modelo1");
        avionService.guardarAvion(avion2);
    }

    @Test
    public void buscarAvion() {
        Assert.assertTrue(avionService.buscarAvion(3L) != null);
    }
}
//
//        @Test
//    public void eliminarAviones(){
//        avionService.eliminarAvion(5L);
//        Assert.assertTrue(avionService.buscarAvion(5L) == null);
//    }
//
//    @Test
//    public void listarTodosLosAviones(){
//        List<Avion>aviones = avionService.buscarTodosLosAviones();
//        Assert.assertTrue(!aviones.isEmpty()); //Negamos que la lista este vacia, probamos que tenga algo.
//        Assert.assertTrue(aviones.size()>0);
//    }
//
//
//}
