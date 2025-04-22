package br.gov.sp.fatec.springboot3top20251.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.springboot3top20251.entity.Anuncio;
import br.gov.sp.fatec.springboot3top20251.service.AnuncioService;

@RestController
@RequestMapping("/anuncio")
public class AnuncioController {

    @Autowired
    private AnuncioService service;

    @GetMapping
    public List<Anuncio> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Anuncio cadastrar(@RequestBody Anuncio anuncio) {
        return service.cadastrar(anuncio);
    }

    @GetMapping("/buscar")
    public List<Anuncio> buscar(@RequestParam String titulo, @RequestParam String dataLimite) {
        LocalDate data = LocalDate.parse(dataLimite);
        return service.buscarPorTituloEData(titulo, data);
    }
}

