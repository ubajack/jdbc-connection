package org.example.factory;

import org.example.connection.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLConnectionFactory implements ConnectionFactory {
    @Override
    public Connection getConnection() throws SQLException {
        return new MySQLConnection("papeterie", "shopper", "moN3y_moN3y")
                .getConnection();
    }
}
