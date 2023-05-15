package com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC",
                "root",
                "WILFREDO1998");

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
