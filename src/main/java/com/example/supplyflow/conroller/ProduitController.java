package com.example.supplyflow.conroller;

import com.example.supplyflow.model.Produit;
import com.example.supplyflow.repository.ProduitRepository;
import com.example.supplyflow.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/produits")
public class ProduitController {
    @Autowired
    private ProduitService produitService;

    @GetMapping
    public String listProducts(Model model) {
            model.addAttribute("produits", produitService.getListProduit());
        return "produit-list";
    }

    @GetMapping("/ajoute")
    public String ajouterProduitForm(Model model) {
    model.addAttribute("produit", new Produit());
    return "produit-form";
    }

    @PostMapping("/sauvegarde")
    public String ajouterProduit(@ModelAttribute Produit produit) {
        produitService.ajouterProduit(produit);
        return "redirect:/produits";
    }

    @GetMapping("/modifie/{id}")
    public String modifierProduitForm(@PathVariable("id") int id, Model model) {
Produit produit = produitService.findProduitById(id);
model.addAttribute("produit", produit);
return "produit-form";
    }

    @GetMapping("/supprime/{id}")
    public String supprimerProduit(@PathVariable("id") int id) {
        produitService.supprimerProduit(id);
        return "redirect:/produits";
    }
}
