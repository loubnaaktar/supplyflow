package com.example.supplyflow.service;

import com.example.supplyflow.model.Produit;
import com.example.supplyflow.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
@Autowired
    private ProduitRepository produitRepository;

public void ajouterProduit(Produit produit){
    produitRepository.save(produit);
}

public List<Produit> getListProduit(){
    return produitRepository.findAll();
}

public Produit findProduitById(int id){
    return produitRepository.findById(id).orElse(null);
}

public void supprimerProduit(int id){
    produitRepository.deleteById(id);
}
}
