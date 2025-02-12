package com.mentes_conectadas.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mentes_conectadas.api.model.membro.MembroModel;
import com.mentes_conectadas.api.model.membro.MembroRepository;

import jakarta.transaction.Transactional;

@RequestMapping("/membro")
@Controller
public class MembroController {

    @Autowired
    private MembroRepository repository;

    @GetMapping("/cadastro")
    public String cadastrarMembro(Model model) {
        model.addAttribute("membro", new MembroModel());
        return "cadastro_membro";
    }

    @PostMapping("/cadastro")
    @Transactional
    public String salvarMembro(@ModelAttribute MembroModel membro) {
        repository.save(membro);
        return "redirect:/membro/cadastro";
    }

    @GetMapping("/listar")
public String listarMembros(Model model) {
    model.addAttribute("membros", repository.findAll());
    return "lista_membros";
}
}