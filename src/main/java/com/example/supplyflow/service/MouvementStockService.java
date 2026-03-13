package com.example.supplyflow.service;

import com.example.supplyflow.model.MouvementStock;
import com.example.supplyflow.model.Produit;
import com.example.supplyflow.repository.MouvementStockRepository;
import com.example.supplyflow.repository.ProduitRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MouvementStockService {
    @Autowired
    private MouvementStockRepository mouvementStockRepository;
    @Autowired
    private ProduitRepository produitRepository;


    public List<MouvementStock> getListMouvementStock(){
        return mouvementStockRepository.findAll();
    }

@Transactional
    public void enregistrerMouvementStock(int idProduit, int quantite, String type){
        Produit produit = produitRepository.findById(idProduit).orElseThrow(()-> new RuntimeException("Produit non trouvé"));
    }
}
}
