package com.example.supplyflow.model;


import jakarta.persistence.*;

@Entity
@Table(name = "fournisseurs")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String ville;
    private String phone;

    public Fournisseur(int id, String name, String city, String phone) {
        this.id = id;
        this.nom = name;
        this.ville = city;
        this.phone = phone;
    }

    public Fournisseur() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String city) {
        this.ville = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
