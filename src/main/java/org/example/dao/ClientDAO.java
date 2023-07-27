package org.example.dao;

import org.example.models.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDAO {

    Client selectById(Integer id) throws SQLException;
    List<Client> selectAll() throws SQLException;

}
