package test.com.dh.aviones;

import main.com.dh.aviones.dao.IDao;
import main.com.dh.aviones.dao.impl.AvionDAOH2;
import main.com.dh.aviones.model.Avion;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(JUnit4.class)
public class AvionDAOH2Test {

    private static IDao<Avion> avionDao = new AvionDAOH2();
    private static final Logger logger = Logger.getLogger(AvionDAOH2Test.class);

    @Test
    public void guardarYBuscarAvion() {
        Avion avion = new Avion(2L, "Concorde","G-BOAC", "AHK2100", LocalDate.of(2015, 4, 25));
        avionDao.guardar(avion);
        logger.info("Creando un avión " + avion.getMarca() + " " + avion.getModelo());
        Avion avionBuscado = avionDao.buscar(2L);
        Assert.assertNotNull(avion); //Testeamos que haya un resultado
        Assert.assertEquals(avionBuscado.getMarca(), "Concorde"); //Testeamos que la marca del avion buscado coincida con la actual
    }

    @Test
    public void consultarTodosLosAviones() {
        List<Avion> listaAviones = avionDao.buscartodos();
        Assert.assertTrue(listaAviones.size()>0); //Testeamos que haya al menos un elemento en la lista
    }

    @Test
    public void borrarAvion() {
        avionDao.eliminar(2L);
        Assert.assertEquals(avionDao.buscar(2L), null);
    }

}