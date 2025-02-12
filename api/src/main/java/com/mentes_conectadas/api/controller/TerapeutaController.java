package com.mentes_conectadas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mentes_conectadas.api.model.terapeuta.TerapeutaModel;
import com.mentes_conectadas.api.model.terapeuta.TerapeutaRepository;

import jakarta.transaction.Transactional;

@RequestMapping("/terapeuta")
@Controller
public class TerapeutaController {

    @Autowired
    private TerapeutaRepository repository;

    @GetMapping("/cadastro")
    public String cadastrarTerapeuta(Model model) {
        model.addAttribute("terapeuta", new TerapeutaModel());
        return "cadastro_terapeuta";
    }

    @PostMapping("/cadastro")
    @Transactional
    public String salvarTerapeuta(@ModelAttribute TerapeutaModel terapeuta) {
        repository.save(terapeuta);
        return "redirect:/terapeuta/cadastro";
    }

    @GetMapping("/listar")
public String listarTerapeutas(Model model) {
    model.addAttribute("terapeutas", repository.findAll());
    return "lista_terapeutas";
}
}