package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseController {
    protected Statement statement;
    protected Connection connection;

    protected void setConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rabbits",
                "postgres", "123");
        System.out.println("Database Connected ..");
        statement = connection.createStatement();
        String createTable = "Create Table if not exists cages(id int primary key, name varchar, address text)";
        statement.executeUpdate(createTable);
        statement.close();
        connection.close();
    }
}
