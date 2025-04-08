package br.gov.sp.fatec.springboot3top20251.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springboot3top20251.entity.Trabalho;
import br.gov.sp.fatec.springboot3top20251.repository.TrabalhoRepository;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repo;
    

    // Questão 3: Método para listar todos os trabalhos
    public List<Trabalho> buscarTodos() {
        return repo.findAll();
    }


    // Questão 3: Método para cadastrar um novo trabalho
    public Trabalho novo(Trabalho trabalho) {
        if(trabalho.getTitulo() == null ||
            trabalho.getTitulo().isBlank() ||
            trabalho.getGrupo() == null ||
            trabalho.getGrupo().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Falta título ou grupo!");
        }
        if(trabalho.getDataHoraEntrega() == null) {
            trabalho.setDataHoraEntrega(LocalDateTime.now());
        }
        return repo.save(trabalho);
    }


    
    // Questão 3: Método para buscar trabalhos por título e nota
    public List<Trabalho> buscarPorTituloENota(String titulo, Integer nota) {
        return repo.buscarPorTituloENota(titulo, nota);
    }

}
