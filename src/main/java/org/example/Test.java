package org.example;

import org.example.dao.ClientDAO;
import org.example.dao.ClientDAOImpl;
import org.example.db.DbType;

import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAOImpl(DbType.MYSQL);

        try {
            System.out.println(clientDAO.selectAll());
            System.out.println(clientDAO.selectById(1));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
