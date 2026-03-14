package com.example.supplyflow.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeConroller {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
