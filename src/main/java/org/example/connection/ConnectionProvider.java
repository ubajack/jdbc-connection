package org.example.connection;

import org.example.db.DbType;
import org.example.factory.MySQLConnectionFactory;
import org.example.factory.PostgresConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getConnection(DbType type) throws SQLException {
        Connection connection = null;
        switch (type) {
            case POSTGRES -> connection = new PostgresConnectionFactory().getConnection();
            default -> connection = new MySQLConnectionFactory().getConnection();
        }
        return connection;
    }

}
