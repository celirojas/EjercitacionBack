//import com.dh.dao.impl.PacienteDAOH2;
//import com.dh.model.Domicilio;
//import com.dh.model.Paciente;
//import com.dh.service.PacienteService;
import dao.impl.PacienteDAOH2;
import model.Domicilio;
import model.Paciente;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.PacienteService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class PacienteServiceTest {
    @BeforeAll //Nos conectamos a la base y ejecutamos el script
    public  static void cargarBaseDeDatos(){
        Connection connection = null;
        try{
            //Nos conectamos al driver y creamos la tabla desde acá con el comando init, la tabla esta seteada en el archivo create.sql
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'", "sa", "");

        }catch (Exception e){
            e.printStackTrace();

        }finally {
            try{
                connection.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    @Test
    public void guardarPaciente(){
        PacienteService pacienteService = new PacienteService(new PacienteDAOH2());
        Domicilio domicilio = new Domicilio("CalleD", 123, "Olivos", "Jujuy");
        Paciente paciente = new Paciente("Kevin", "Rojas", 32456789, LocalDate.of(2022, 06, 1), domicilio);
        Paciente pacienteResultado;
        int resultadoEsperado = 3;

        pacienteService.guardarPaciente(paciente);
        pacienteResultado = pacienteService.buscarPaciente(3);//Estoy esperando que me devuelva el id=3 porque cargue 3 pacientes

        Assert.assertEquals(pacienteResultado.getId(), resultadoEsperado);
    }
}
