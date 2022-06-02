package com.company.dao.impl;

import com.company.dao.Idao;
import com.company.model.Odontologo;
import com.company.service.OdontologoService;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OdontologoDAOH2 implements Idao <Odontologo> {

    final static Logger logger = Logger.getLogger(OdontologoDAOH2.class);

    //Variables para iniciar la conexión con la base de datos
    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";




    @Override
    public Odontologo guardar(Odontologo odontologo) {

        //Pasos para guardar en una base de datos
        //1. Creamos una conexión y un objeto preparedStatement nulos
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            //2. Levantar el driver y conectarnos
            connection = getConnection();

            //3. Creamos una sentencia con parámetros dinámicos
            preparedStatement = connection.prepareStatement("INSERT INTO odontologos (matricula, nombre, apellido) VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, odontologo.getMatricula());
            preparedStatement.setString(2, odontologo.getNombre());
            preparedStatement.setString(3,odontologo.getApellido());

            //4. Ejecutar una sentencia SQL
            preparedStatement.executeUpdate();
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if(keys.next()){
                odontologo.setId(keys.getInt(1));
            }

            preparedStatement.close();

        } catch(Exception e){
            logger.error("No se pudo guardar el odontologo.");
            e.printStackTrace();
        }
        finally{
            try{
                connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        //Logueamos la creación de un odontologo
        logger.info("Guardando odontologo: " + odontologo.toString());
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() { //Sí nos devuelve registros, los vamos a guardar en un ArrayList y lo vamos a devolver
        logger.info("Listando odontologos...");

        //1. Creamos una conexión, un objeto preparedStatement y una lista de odontologos
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Odontologo> odontologos = new ArrayList<>();

        try{
            //2. Levantar el driver y conectarnos
            connection = getConnection();

            //3. Crear una sentencia SQL
            preparedStatement = connection.prepareStatement("SELECT *  FROM odontologos");

           //4. Ejecutar sentencia SQL
            ResultSet result = preparedStatement.executeQuery();

            //5.Recorro los datos de ese resultado
            while(result.next()){ //Mientras haya registros
                int id = result.getInt("id");
                int matricula = result.getInt("matricula");
                String nombre = result.getString("nombre");
                String apellido = result.getString("apellido");

                Odontologo odontologo = new Odontologo(matricula,nombre,apellido);
                odontologo.setId(id);

                //Guardamos cada uno de los odontologos en una lista
                odontologos.add(odontologo);
            }

            preparedStatement.close();

        } catch(Exception e){
            logger.error("No se pudo obtener el listado de odontologos.");
            e.printStackTrace();
        }
        finally{
            try{
                connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        logger.info("Odontologos disponibles: " + odontologos);
        return odontologos;
    }


    //Método genérico para iniciar las conexiones a la base de datos
    private static Connection getConnection() throws Exception{
        Class.forName(DB_JDBC_DRIVER).newInstance();
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
    }

}
