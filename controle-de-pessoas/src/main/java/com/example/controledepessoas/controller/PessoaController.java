package com.example.controledepessoas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controledepessoas.model.Pessoa;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @GetMapping
    public List<Pessoa> obterTodos() {
        Pessoa p1 = new Pessoa();
        p1.setNome("João");
        p1.setEmail("joao@gmail.com");
        p1.setTelefone("21999999999");

        Pessoa p2 = new Pessoa();

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        pessoas.add(p1);
        pessoas.add(p2);

        return pessoas;
    }
}
