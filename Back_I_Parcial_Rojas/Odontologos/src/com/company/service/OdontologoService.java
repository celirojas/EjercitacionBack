package com.company.service;

import com.company.dao.Idao;
import com.company.model.Odontologo;

import java.util.List;

public class OdontologoService {

    private Idao<Odontologo> odontologoIdao; //Acceso a métodos a través de la interfaz

    //Constructores
    public OdontologoService(Idao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }

    public OdontologoService() {
    }

    //Delegación de responsabilidades

    public Odontologo guardarOdontologo(Odontologo odontologo){ //delegarle la responsabilidad de guardar al DAO
        odontologoIdao.guardar(odontologo);
        return odontologo;
    }

    public List<Odontologo> listarTodos(){
        //delegarle la responsabilidad de listar al DAO
        return odontologoIdao.listarTodos();
    }


    //Métodos accesores

    public Idao<Odontologo> getOdontologoIdao() {
        return odontologoIdao;
    }

    public void setOdontologoIdao(Idao<Odontologo> odontologoIdao) {
        this.odontologoIdao = odontologoIdao;
    }
}
