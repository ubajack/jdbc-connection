package org.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection extends BaseConnection {
    private final String url;

    public MySQLConnection(String dbName, String username, String password) {
        super(dbName, username, password);
        this.url = "jdbc:mysql://localhost:3306/" + dbName;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, username, password);
    }
}
