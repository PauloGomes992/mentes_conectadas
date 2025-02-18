package com.mentes_conectadas.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SiteController {
    @GetMapping
    public String carregarPaginaIndex() {
        return "index";
    }

    @GetMapping("/cadastro_membro")
    public String carregarCadastroMembro() {
        return "cadastro_membro";
    }

    @GetMapping("/cadastro_terapeuta")
    public String carregarCadastroTerapeuta() {
        return "cadastro_terapeuta";
    }

    @GetMapping("/esqueci_senha")
    public String carregarEsqueciSenha() {
        return "esqueci_a_senha";
    }

    @GetMapping("/home")
    public String carregarHome() {
        return "home";
    }
}
