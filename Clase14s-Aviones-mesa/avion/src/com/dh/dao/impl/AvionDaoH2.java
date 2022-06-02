package com.dh.dao.impl;

import com.dh.dao.IDao;
import com.dh.entity.Avion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AvionDaoH2 implements IDao<Avion> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver";
    private final static String DB_URL = "jdbc:h2:~/db_test";
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    @Override
    public Avion guardar(Avion avion)  {
        //Pasos para guardar en una base de datos

        //1. Creamos una conexión y un objeto preparedStatement
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //2. Levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //3. Creamos una sentencia
            preparedStatement = connection.prepareStatement("INSERT INTO AVION VALUES (?,?,?,?,?)");
            preparedStatement.setLong(1, avion.getId());
            preparedStatement.setString(2, avion.getMarca());
            preparedStatement.setString(3, avion.getMatricula());
            preparedStatement.setString(4, avion.getModelo());
            preparedStatement.setString(5, avion.getFechaEntrada());


            //4. Ejecutamos sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return avion;

    }

    @Override
    public void eliminar(Long id) {
        //1. Creamos una conexión y un objeto preparedStatement
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //2. Levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //3. Creamos una sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM AVION WHERE id = ?");
            preparedStatement.setLong(1, id);


            //4. Ejecutamos sentencia
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();

        }

    }

    @Override
    public Avion buscar(Long id) {
        //1. Creamos una conexión, un objeto preparedStatement y al avion
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Avion avion = null;

        try {
            //2. Levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //3. Creamos una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM AVION WHERE id = ?");
            preparedStatement.setLong(1, id);


            //4. Ejecutamos sentencia
            ResultSet result = preparedStatement.executeQuery(); //Me devuelve un resultado
            //5. Recorro los registros de ese resultado
            while (result.next()){
                Long idAvion = result.getLong("id");
                String marca = result.getString("marca");
                String matricula = result.getString("matricula");
                String modelo = result.getString("modelo");
                String fechaEntrada = result.getString("fechaEntrada");

                avion = new Avion(); // Si se encuentra el avion lo instanciamos
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setMatricula(matricula);
                avion.setMatricula(modelo);
                avion.setMatricula(fechaEntrada);




            }
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return avion;
    }

    @Override
    public List<Avion> buscarTodos() {
        //1. Creamos una conexión, un objeto preparedStatement y una lista de aviones
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Avion> aviones = new ArrayList<>();

        try {
            //2. Levantar el driver y conectarnos
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //3. Creamos una sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM AVION");



            //4. Ejecutamos sentencia
            ResultSet result = preparedStatement.executeQuery(); //Me devuelve un resultado
            //5. Recorro los registros de ese resultado
            while (result.next()){
                Long idAvion = result.getLong("id");
                String marca = result.getString("marca");
                String matricula = result.getString("matricula");
                String modelo = result.getString("modelo");
                String fechaEntrada = result.getString("fechaEntrada");

               Avion avion = new Avion(); // Si se encuentra el avion lo instanciamos
                avion.setId(idAvion);
                avion.setMarca(marca);
                avion.setMatricula(matricula);
                avion.setMatricula(modelo);
                avion.setMatricula(fechaEntrada);


                aviones.add(avion);


            }
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return aviones;
    }
}
