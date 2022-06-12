package service;

//import com.dh.dao.IDAO;
//import com.dh.model.Paciente;
import dao.IDAO;
import model.Paciente;

public class PacienteService {
    private IDAO<Paciente> pacienteIDAO;

    public PacienteService(IDAO<Paciente> pacienteIDAO) {
        this.pacienteIDAO = pacienteIDAO;
    }

    //Métodos que delega la responsabilidad de las acciones al Dao
    public void guardarPaciente(Paciente paciente){
        pacienteIDAO.guardar(paciente);
    }


    public Paciente buscarPaciente(int id){
        return pacienteIDAO.buscar(id);
    }
}