package com.dh.aviones.service;

import com.dh.aviones.dao.IDao;
import com.dh.aviones.model.Avion;
//import main.com.dh.charter.dao.IDao;
//import main.com.dh.charter.model.Avion;

import java.util.List;

public class AvionService {

    private IDao<Avion> avionDao;

    public AvionService(IDao<Avion> avionDao) {
        this.avionDao = avionDao;
    }

    public Avion registrarAvion(Avion avion) {
        return avionDao.guardar(avion);
    }
    public Avion buscarAvion(int id){
        return avionDao.buscar(id);
    }
    public List<Avion> buscarTodos(){
        return avionDao.buscarTodos();
    }
    public void eliminar(int id){
        avionDao.eliminar(id);
    }

}
