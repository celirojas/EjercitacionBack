package com.company.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Class.forName("org.h2.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:h2:"+
                "~/test", "sa", "");
        Statement stmt = con.createStatement();

        //Código para crear una tabla. Elimina la tabla si esta ya existe y la
        //vuelve a crear
        String createSql = "DROP TABLE IF EXISTS TEST;\n" +
                "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255));\n" +
                "INSERT INTO TEST VALUES(1, 'Hello');\n" +
                "INSERT INTO TEST VALUES(2, 'World');\n";
        stmt.execute(createSql); //De deste stmt ejecuta tal query

        //Codigo para consultar todos los registros de la tabla TEST
        String sql = "select * from TEST";
        ResultSet rd = stmt.executeQuery(sql); //Lo que me devuelve la query, una lista de filas y col. El resultSet tiene metodos

        //Código para recorrer el resultado de la consulta
        while(rd.next()) { //el next es para saber si hay más filas
            System.out.println(rd.getInt(1) + rd.getString(2));
        }
    }
}
