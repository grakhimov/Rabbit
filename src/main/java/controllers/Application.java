package controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.boot.SpringApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rabbits",
                    "postgres", "123");
            System.out.println("Database Connected ..");
            statement = connection.createStatement();
            String createTable = "Create Table if not exists cages(id int primary key, name varchar, address text)";
            statement.executeUpdate(createTable);
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        SpringApplication.run(Application.class, args);
    }
}