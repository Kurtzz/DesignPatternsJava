package com.kurtz.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {
    private DbSingleton instance;

    public JdbcFacade() {
        instance = DbSingleton.getInstance();
    }

    public int createTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int insertIntoTable() {
        int count = 0;
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();
            count = statement.executeUpdate("INSERT INTO Address (ID, StreetName, City)" +
                    "VALUES (1, '1234 Some street', 'Layton')");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<Address> getAddresses() {
        List<Address> addresses = new ArrayList<>();

        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM Address");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));

                Address address = new Address();
                address.setId(resultSet.getString(1));
                address.setStreetName(resultSet.getString(2));
                address.setCity(resultSet.getString(3));

                addresses.add(address);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return addresses;
    }
}
