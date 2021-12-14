package com.example.sistemacadastro.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.sistemacadastro.entity.Estudante;
import com.example.sistemacadastro.repository.EstudanteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
@CrossOrigin
public class CadastroAlunos {


    // Injeta uma dependencia !!!
    @Autowired
    private EstudanteRepository repo;

    // End Point 1


    // (GET) http://localhost:8080/estudantes
    @GetMapping
    public List <Estudante> getEstudantes(){

        List <Estudante> list = repo.findAll();

        return list;
    }
    
}
