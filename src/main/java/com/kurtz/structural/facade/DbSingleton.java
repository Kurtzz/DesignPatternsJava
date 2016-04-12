package com.kurtz.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * No idea wheater correct or not.
 */
public class DbSingleton {
    private static DbSingleton instance;
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "database_name";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER_NAME = "username";
    private static final String PASSWORD = "password";

    private DbSingleton() {
        try {
            Class.forName(DRIVER).newInstance();
            connection = DriverManager.getConnection(URL + DB_NAME, USER_NAME, PASSWORD);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
