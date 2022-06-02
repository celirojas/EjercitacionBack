package com.company.servicios;

import com.company.dao.IDAO;
import com.company.model.Estudiante;

import java.util.List;

public class EstudianteService {

        private IDAO<Estudiante> estudianteIdao; //Acceso a métodos del repositorio a través de la interfaz




        public Estudiante guardarEstudiante(Estudiante e){
            //delegarle la responsabilidad de guardar al DAO
            return estudianteIdao.guardar(e);
        }

        public void eliminarEstudiante(Long id){
            //delegarle la responsabilidad de eliminar al DAO
            estudianteIdao.eliminar(id);
        }

        public Estudiante buscar(Long id){
            //delegarle la responsabilidad de buscar al DAO
            return estudianteIdao.buscar(id);
        }

        public List<Estudiante> buscarTodos(){
            //delegarle la responsabilidad de buscar a todos al DAO
            return estudianteIdao.buscarTodos();
        }





        //Métodos accesores


    public IDAO<Estudiante> getEstudianteIdao() {
        return estudianteIdao;
    }

    public void setEstudianteIdao(IDAO<Estudiante> estudianteIdao) { //Setear el mecanismo de persistencia.
        this.estudianteIdao = estudianteIdao;
    }
}
