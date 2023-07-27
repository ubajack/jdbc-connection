package org.example.models;

import java.io.Serializable;

public class Client implements Serializable {

    private Integer idClient;
    private String nom;
    private String email;

    public Client(Integer idClient, String nom, String email) {
        this.idClient = idClient;
        this.nom = nom ;
        this.email = email;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
