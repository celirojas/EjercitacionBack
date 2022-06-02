package test;

import com.company.dao.IDAO;
import com.company.dao.impl.EstudianteDAOH2;
import com.company.model.Estudiante;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;


import java.util.List;

class EstudianteDAOH2Test {

    private static IDAO<Estudiante> estudianteDao = new EstudianteDAOH2(); //Para testear DAOH2 necesito instanciar un repositorio de ese tipo.

    @BeforeClass
    //Cargar estudiantes para tener con que testear
    public static void cargarEstudiantes(){
        estudianteDao.guardar(new Estudiante(2L, "Pedro", "Ramon"));
        estudianteDao.guardar(new Estudiante(3L, "Laura", "Adradas"));
        estudianteDao.guardar(new Estudiante(4L, "Victor", "Rojas"));
        estudianteDao.guardar(new Estudiante(5L, "Adrian", "Gomez"));
    }

    @Test
    public void guardarYBuscarEstudiantesTest(){
        estudianteDao.guardar(new Estudiante(6L, "Mar", "Popradolce"));
        Estudiante estudiante = estudianteDao.buscar(6L);
        Assert.assertNotNull(estudiante);
        Assert.assertEquals(estudiante.getNombre(), "Mar");
    }

    @Test
    public  void traerTodosLosEstudiantesTest() {
        List<Estudiante> estudiantes = estudianteDao.buscarTodos();
        Assert.assertTrue(estudiantes.size() > 0);
    }
    @Test
    public void eliminarEstudiantesTest() {
        estudianteDao.eliminar(6L);
        Assert.assertEquals(estudianteDao.buscar(6L),null);
    }

}