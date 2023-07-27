package org.example.connection;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class BaseConnection {

    protected String dbName;
    protected String username;
    protected String password;

    public BaseConnection(String dbName, String username, String password) {
        this.dbName = dbName;
        this.username = username;
        this.password = password;
    }

    abstract Connection getConnection() throws SQLException;

}
