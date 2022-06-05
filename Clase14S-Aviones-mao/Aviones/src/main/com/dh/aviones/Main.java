package main.com.dh.aviones;

import main.com.dh.aviones.dao.IDao;
import main.com.dh.aviones.dao.impl.AvionDAOH2;
import main.com.dh.aviones.model.Avion;
import main.com.dh.aviones.service.AvionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AvionService avionService = new AvionService();
        IDao daoAvion = new AvionDAOH2();
        avionService.setAvionIDao(daoAvion);
        System.out.println("Probando conexión a base de datos...");

        System.out.println("Mostrando lista de aviones existentes");
        List<Avion> listaAviones = avionService.listarAviones();
        avionService.imprimirListaAviones(listaAviones);

        System.out.println("Eliminando avión existente...");
        avionService.eliminarAvion(1L);

        System.out.println("Mostrando lista de aviones existentes");
        listaAviones = avionService.listarAviones();
        avionService.imprimirListaAviones(listaAviones);

        System.out.println("Creando un nuevo avión...");
        Avion avion1 = new Avion(1L, "Boeing", "747", "FK4700", LocalDate.of(2000,1,1));
        avionService.guardarAvion(avion1);

        System.out.println("Mostrando lista de aviones existentes");
        listaAviones = avionService.listarAviones();
        avionService.imprimirListaAviones(listaAviones);
    }
}
