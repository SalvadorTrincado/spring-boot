package com.ejercicio06.controller;

import com.ejercicio06.service.PrediccionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrediccionController {

    private final PrediccionService prediccionService;

    public PrediccionController(PrediccionService prediccionService) {
        this.prediccionService = prediccionService;
    }

    @GetMapping("/prediccion")
    public String prediccion(Model model) {
        model.addAttribute("dias", prediccionService.findAll());
        return "prediccion";
    }
}