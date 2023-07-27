package org.example;

import org.example.db.DbType;
import org.example.connection.ConnectionProvider;
import org.example.models.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection = ConnectionProvider.getConnection(DbType.MYSQL);
            System.out.println("Connected!");

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM clients");

            List<Client> clients = new ArrayList<>();

            while (rs.next()) {
                int idClient = rs.getInt("idClient");
                String nom = rs.getString("nom");
                String email = rs.getString("email");
                clients.add(new Client(idClient, nom, email));
            }

            System.out.println(clients);

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}