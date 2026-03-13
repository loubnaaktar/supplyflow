package com.example.supplyflow.model;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String category;
    private Double prix;
    private int quantite;

    public Produit(int id, String name, String category, Double price, Integer quantity) {
        this.id = id;
        this.nom = name;
        this.category = category;
        this.prix = price;
        this.quantite = quantity;
    }

    public Produit() {
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double price) {
        this.prix = price;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantity) {
        this.quantite = quantity;
    }
}
