package com.example.supplyflow.conroller;
import com.example.supplyflow.model.Fournisseur;
import com.example.supplyflow.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/fournisseurs")
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @GetMapping
    public String Listfournisseur(Model model) {
        model.addAttribute("fournisseurs", fournisseurService.getListFournisseur());
        return "fournisseur-list";
    }

    @GetMapping("/ajouter")
  public String ajouterFournisseur( Model model) {
        model.addAttribute("fournisseur", new Fournisseur());
        return "fournisseur-form";
    }

    @PostMapping("/sauvegarder")
    public String sauvegarderFournisseur(@ModelAttribute Fournisseur fournisseur) {
        fournisseurService.ajoutrFournissuer(fournisseur);
        return "redirect:/fournisseurs";
    }


}
