package com.example.supplyflow.service;

import com.example.supplyflow.model.Fournisseur;
import com.example.supplyflow.repository.FournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseurService {
    @Autowired
    private FournisseurRepository fournisseurRepository;

    public void ajoutrFournissuer(Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }

    public List<Fournisseur> getListFournisseur(){
        return fournisseurRepository.findAll();
    }
}
