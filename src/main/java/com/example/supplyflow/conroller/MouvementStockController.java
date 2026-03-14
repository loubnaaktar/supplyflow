package com.example.supplyflow.conroller;


import com.example.supplyflow.model.MouvementStock;
import com.example.supplyflow.service.MouvementStockService;
import com.example.supplyflow.service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/movements")
public class MouvementStockController {

    @Autowired
    private MouvementStockService mouvementStockService;

    @Autowired
    private ProduitService produitService;

    @GetMapping
    public String mouvementsList(Model model) {
        model.addAttribute("movements",mouvementStockService.getListMouvementStock());
        return "movement-list";
    }

    @GetMapping("/ajouter")
    public String ajouterMouvementStock(Model model) {
        model.addAttribute("produits",produitService.getListProduit());
        return "movement-form";
    }

    @PostMapping("/sauvegarder")
public String sauvegarderMouvementStock(@RequestParam int productId, @RequestParam int quantite,@RequestParam String type, Model model) {
        try {
            mouvementStockService.enregistrerMouvementStock(productId, quantite, type);
            return "redirect:/movements";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("produits", produitService.getListProduit());
            return "movement-form";
        }
    }

}
