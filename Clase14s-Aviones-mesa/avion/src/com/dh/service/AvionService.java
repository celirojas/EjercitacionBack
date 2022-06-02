package com.dh.service;

import com.dh.dao.IDao;
import com.dh.entity.Avion;

import java.util.List;

public class AvionService {
    private IDao<Avion> avionIDao;


    //Constructor
    public AvionService(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    //Métodos accesores

    public IDao<Avion> getAvionIDao() { //Métodos accesores
        return avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    //Métodos que delega la responsabilidad de las acciones al Dao
    public void guardarAvion(Avion a){
        avionIDao.guardar(a);
    }

    public  void eliminarAvion(Long id){
        avionIDao.eliminar(id);
    }

    public Avion buscarAvion(Long id){
        return avionIDao.buscar(id);
    }

    public List<Avion> buscarTodosLosAviones(){
        return avionIDao.buscarTodos();
    }
}