package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection extends BaseConnection{
    private final String url;

    public PostgresConnection(String dbName, String username, String password) {
        super(dbName, username, password);
        this.url = "jdbc:postgresql://localhost:5432/" + this.dbName;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.username, this.password);
    }
}
