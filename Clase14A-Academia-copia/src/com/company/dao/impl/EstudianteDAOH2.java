package com.company.dao.impl;

import com.company.dao.IDAO;
import com.company.model.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOH2 implements IDAO<Estudiante> { //Recordar pasarle el parametro que vamos a utilizar

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    public EstudianteDAOH2() {
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        //Crear una conexión.
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        //1-Levantar el driver y conectarnos.
        try{

          Class.forName(DB_JDBC_DRIVER);
          connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

          //2- Crear una sentencia
            preparedStatement = connection.prepareStatement("INSERT INTO estudiantes VALUES(?,?,?)"); //Pasarle por parámetro las partes dinamicas del query, más simple y limpio.
            preparedStatement.setLong(1,estudiante.getId());
            preparedStatement.setString(2,estudiante.getNombre());
            preparedStatement.setString(3, estudiante.getApellido());


            //3-Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return estudiante;
    }


    @Override
    public void eliminar(Long id) {
        //Crear una conexión.
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        //1-Levantar el driver y conectarnos.
        try{

            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2- Crear una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM estudiantes WHERE id=?"); //Pasarle por parámetro las partes dinamicas del query, más simple y limpio.
            preparedStatement.setLong(1, id); //Es el id que nos viene por parámetro.


            //3-Ejecutar la sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

    @Override
    public Estudiante buscar(Long id) { //Sí nos devuelve registros
        //Crear una conexión.
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Estudiante estudiante = null; //Este método me devuelve un solo estudiante.


        //1-Levantar el driver y conectarnos.
        try{

            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2- Crear una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes WHERE id=?"); //Pasarle por parámetro las partes dinamicas del query, más simple y limpio.
            preparedStatement.setLong(1, id); //Es el id que nos viene por parámetro.


            //3-Ejecutar la sentencia
            ResultSet resultados = preparedStatement.executeQuery(); //Como nos va a devolver registros, los tenemos que guardar en un ResultSet

            //4- Evaluar los resultados
            while(resultados.next()){ //Mientras haya registros
                Long idEstudiante = resultados.getLong("id"); //Seleccionar stringColumn
                String nombre = resultados.getString("Nombre");
                String apellido = resultados.getString("Apellido");
                estudiante = new Estudiante(idEstudiante, nombre, apellido);
            }


            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() { //Sí nos devuelve registros, los vamos a guardar en un ArrayList y lo vamos a devolver
        //Crear una conexión.
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Estudiante>estudiantes = new ArrayList();


        //1-Levantar el driver y conectarnos.
        try{

            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

            //2- Crear una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM estudiantes"); //Pasarle por parámetro las partes dinamicas del query, más simple y limpio.


            //3-Ejecutar la sentencia
            ResultSet resultados = preparedStatement.executeQuery(); //Como nos va a devolver registros, los tenemos que guardar en un ResultSet

            //4- Evaluar los resultados
            while(resultados.next()){ //Mientras haya registros
                Long idEstudiante = resultados.getLong("id"); //Seleccionar stringColumn
                String nombre = resultados.getString("Nombre");
                String apellido = resultados.getString("Apellido");
                Estudiante estudiante = new Estudiante(idEstudiante, nombre, apellido);

                //Los guardamos cada uno de los estudiantes en el arrayList
                estudiantes.add(estudiante);
            }


            preparedStatement.close();

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return estudiantes;
    }
}
