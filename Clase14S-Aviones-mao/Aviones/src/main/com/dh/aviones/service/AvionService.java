package main.com.dh.aviones.service;

import main.com.dh.aviones.dao.IDao;
import main.com.dh.aviones.model.Avion;

import java.util.List;

public class AvionService {

    private IDao<Avion> avionIDao;

    //Métodos accespres
    public IDao<Avion> getAvionIDao() {
        return avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    //Delegación de métodos al avionIDao

    public void guardarAvion(Avion avion) {
        avionIDao.guardar(avion);
    }

    public void eliminarAvion(Long id) {
        avionIDao.eliminar(id);
    }

    public Avion buscarAvion(Long id) {
        Avion avion = avionIDao.buscar(id);
        return avion;
    }

    public List<Avion> listarAviones() {
        List<Avion> aviones = avionIDao.buscartodos();
        return aviones;
    }

    public void imprimirListaAviones(List<Avion> lista) {
        System.out.println("Lista de aviones existentes:");
        for (Avion a:lista) {
            System.out.println(a.toString());
        }

    }
}
