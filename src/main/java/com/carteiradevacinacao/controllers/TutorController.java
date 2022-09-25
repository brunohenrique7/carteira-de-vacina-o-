package com.carteiradevacinacao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TutorController {

    // Lista dos cadastros
    @GetMapping("/tutor")
    public String index(Model model) {
        return "tutor/index";
    }

    // Novo cadastro
    @GetMapping("/tutor/novo")
    public String novo() {
        return "tutor/novo";
    }


}
