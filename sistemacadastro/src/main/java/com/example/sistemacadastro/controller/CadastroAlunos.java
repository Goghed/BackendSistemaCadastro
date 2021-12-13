package com.example.sistemacadastro.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.sistemacadastro.entity.Estudante;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
@CrossOrigin
public class CadastroAlunos {




    // End Point 1
    

    // (GET) http://localhost:8080/estudantes
    @GetMapping
    public List <Estudante> getEstudantes(){

        Estudante e1 = new Estudante();        
        e1.setId(10);
        e1.setNome("Ed Carlos");

        Estudante e2 = new Estudante();        
        e2.setId(10);
        e2.setNome("Ed Carlos");

        Estudante e3 = new Estudante();        
        e3.setId(10);
        e3.setNome("Ed Carlos");

        Estudante e4 = new Estudante();        
        e4.setId(10);
        e4.setNome("Ed Carlos");

        ArrayList <Estudante> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        return list;
    }
    
}
