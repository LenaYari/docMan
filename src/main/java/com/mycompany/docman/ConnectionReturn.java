package com.mycompany.docman;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionReturn {

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/docs)");
            if (con != null) {
                System.out.println("Connection working");
            } else {
                System.out.println("Failed to make connection!");
            }
            return con;
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        return con;

    }
}
