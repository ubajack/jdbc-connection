package org.example.dao;

import org.example.connection.ConnectionProvider;
import org.example.db.DbType;
import org.example.models.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAOImpl implements ClientDAO {

    private DbType dbType;

    public ClientDAOImpl(DbType dbType) {
        this.dbType = dbType;
    }

    private Connection getConnection() throws SQLException {
        return ConnectionProvider.getConnection(dbType);
    }

    private Client buildClient(ResultSet rs) throws SQLException {
        int idClient = rs.getInt("idClient");
        String nom = rs.getString("nom");
        String email = rs.getString("email");
        return new Client(idClient, nom, email);
    }

    @Override
    public Client selectById(Integer id) throws SQLException {
        PreparedStatement pstmt = this.getConnection().prepareStatement("SELECT * FROM  clients where idClient=?");
        pstmt.setInt(1, id);
        ResultSet rs = pstmt.executeQuery();

        if (!rs.next()) {
            return null;
        }

        return this.buildClient(rs);
    }

    @Override
    public List<Client> selectAll() throws SQLException {
        Statement stmt = this.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM clients");

        List<Client> clients = new ArrayList<>();

        while (rs.next()) {
            clients.add(this.buildClient(rs));
        }

        return clients;
    }
}
