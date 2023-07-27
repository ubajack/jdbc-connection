package org.example.factory;

import org.example.connection.PostgresConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class PostgresConnectionFactory implements ConnectionFactory {
    @Override
    public Connection getConnection() throws SQLException {
        return new PostgresConnection("papeterie", "shopper", "moN3y_moN3y")
                .getConnection();
    }
}
