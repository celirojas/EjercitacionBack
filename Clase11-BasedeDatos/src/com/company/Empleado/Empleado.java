package com.company.Empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

public class Empleado {
    public static void main(String[] args) throws Exception {
        // write your code here
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:"+
                "~/test", "sa", "");
        Statement stmt = con.createStatement();

        //Código para crear una tabla. Elimina la tabla si esta ya existe y la
        //vuelve a crear
        String createSql = "DROP TABLE IF EXISTS EMPLEADOS;\n" +
                "CREATE TABLE EMPLEADOS(ID INT PRIMARY KEY, NAME VARCHAR(255), EDAD INT, EMPRESA VARCHAR(255), FECHA DATE);\n" +
                "INSERT INTO EMPLEADOS VALUES(1, 'Celina', 31, 'Google', '2022-05-21');\n" +
                "INSERT INTO EMPLEADOS VALUES(2, 'Laura', 65, 'Digital', '2022-05-25');\n" +
                "INSERT INTO EMPLEADOS VALUES(3, 'Mar', 26, 'Facebook', '2022-05-22');\n";
        stmt.execute(createSql); //De deste stmt ejecuta tal query

        //Codigo para consultar todos los registros de la tabla TEST
        String sql = "select * from EMPLEADOS";
        ResultSet rd = stmt.executeQuery(sql); //Lo que me devuelve la query, una lista de filas y col. El resultSet tiene metodos

        //Código para recorrer el resultado de la consulta
        while(rd.next()) { //el next es para saber si hay más filas
            System.out.println(rd.getInt(1) + rd.getString(2) + rd.getInt(3) + rd.getString(4) + rd.getDate(5));
        }
    }
}
