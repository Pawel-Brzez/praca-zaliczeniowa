package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {
    public static final String Host = "jdbc:postgresql://snuffleupagus.db.elephantsql.com/yysqxhxu";
    public static final String DATABASE = "yysqxhxu";
    public static final String USERNAME = "yysqxhxu";
    public static final String PASS = "iFxeFLRLzPbUuzUlJ7MBR5BtptRj_BUI";


    public Connection connection;

    public void connect(){
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(Host, USERNAME, PASS);
            System.out.println("Opened database successfuly");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void executeInsert(String sql) {
        try {
            Statement stm = this.connection.createStatement();
            stm.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

}