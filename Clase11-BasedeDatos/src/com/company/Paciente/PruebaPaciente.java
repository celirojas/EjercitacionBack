package com.company.Paciente;

import java.sql.*;

public class PruebaPaciente {

    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS PACIENTE; CREATE TABLE PACIENTE"
            + "("
            + "ID INT PRIMARY KEY,"
            + "NOMBRE varchar(100) NOT NULL,"
            + "APELLIDO varchar(100) NOT NULL,"
            + "DOMICILIO varchar(255) NOT NULL,"
            + "DNI varchar(100) NOT NULL,"
            + "FECHAALTA varchar(100) NOT NULL,"
            + "USUARIO varchar(100) NOT NULL,"
            + "PASSWORD varchar(100) NOT NULL"
            + ")";

    private static final String SQL_INSERT = "INSERT INTO PACIENTE (ID, NOMBRE, APELLIDO, DOMICILIO, DNI, FECHAALTA, USUARIO, PASSWORD) VALUES (?,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE PACIENTE SET PASSWORD=? WHERE NOMBRE=?";

    public static void main(String[] args) throws Exception{
        Paciente paciente1 = new Paciente("Mar", "Opradolce","AvMaipu","39558146","28-05-2022","maropra", "123456");

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_TABLE_CREATE);

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            //Empiezo a insertar en la BD

            psInsert.setInt(1,1);
            psInsert.setString(2,paciente1.getNombre());
            psInsert.setString(3,paciente1.getApellido());
            psInsert.setString(4,paciente1.getDomicilio());
            psInsert.setString(5,paciente1.getDni());
            psInsert.setString(6,paciente1.getFechaAlta());
            psInsert.setString(7,paciente1.getUsuario());
            psInsert.setString(8,paciente1.getPassword());

            psInsert.execute();

            //Empiezo la transacción
            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1,paciente1.setPassword("789"));
            psUpdate.setString(2,paciente1.getNombre());
            psUpdate.execute();
            int a = 4/0;

            connection.commit();

            connection.setAutoCommit(true); //es una buena practica

            String sql = "SELECT * FROM PACIENTE";
            Statement stmt = connection.createStatement();
            ResultSet rd = stmt.executeQuery(sql);
            while(rd.next()){
                System.out.println(rd.getInt(1) + rd.getString(2) + rd.getString(3) + rd.getString(4) + rd.getString(5) + rd.getString(6) + rd.getString(7) + rd.getString(8));
            }

        } catch(Exception e){
            e.printStackTrace();
            connection.rollback(); //Volver atrás los valores que cambiamos.
        } finally {
            connection.close();
        }

        Connection connection1 = getConnection();
        String sql = "SELECT * FROM PACIENTE";
        Statement stmt = connection1.createStatement();
        ResultSet rd = stmt.executeQuery(sql);
        while(rd.next()){
            System.out.println(rd.getInt(1) + rd.getString(2) + rd.getString(3) + rd.getString(4) + rd.getString(5) + rd.getString(6) + rd.getString(7) + rd.getString(8));
        }
    }




    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:" + "~/test", "sa", "");
    }
}
