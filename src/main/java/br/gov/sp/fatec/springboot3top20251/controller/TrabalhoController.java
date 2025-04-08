package br.gov.sp.fatec.springboot3top20251.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3top20251.entity.Trabalho;
import br.gov.sp.fatec.springboot3top20251.service.TrabalhoService;

@RestController
@CrossOrigin
@RequestMapping(value = "trabalho")
public class TrabalhoController {
    
    @Autowired
    public TrabalhoService service;

    // Questão 4: Rota para listar todos os trabalhos
    @GetMapping
    public List<Trabalho> buscarTrabalhos() {
        return service.buscarTodos();
    }

    // Questão 4: Rota para cadastrar um novo trabalho
    @PostMapping
    public Trabalho novoTrabalho(@RequestBody Trabalho trabalho) {
        return service.novo(trabalho);
    }

    // Questão 4: Rota para buscar trabalhos por título e nota
    @GetMapping(value = "/{titulo}/{nota}")
    public List<Trabalho> buscarTrabalhoPorTituloENota(@PathVariable("titulo") String titulo, @PathVariable("nota") Integer nota) {
        return service.buscarPorTituloENota(titulo, nota);
    }

}
