package br.gov.sp.fatec.springboot3top20251.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.gov.sp.fatec.springboot3top20251.entity.Anuncio;
import br.gov.sp.fatec.springboot3top20251.repository.AnuncioRepository;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository repo;

    public List<Anuncio> listarTodos() {
        return repo.findAll();
    }

    public List<Anuncio> buscarPorTituloEData(String titulo, LocalDate dataLimite) {
        return repo.findByAncTituloContainingIgnoreCaseAndAncDataLimiteLessThan(titulo, dataLimite);
    }

    public Anuncio cadastrar(Anuncio anuncio) {
        if (anuncio.getAncTitulo() == null || ((String) anuncio.getAncTitulo()).length() < 10) {
            throw new IllegalArgumentException("Título inválido");
        }

        if (anuncio.getAncDataCadastro() == null) {
            anuncio.setAncDataCadastro(LocalDate.now());
        }

        if (anuncio.getAncDataLimite() != null && ((LocalDate) anuncio.getAncDataLimite()).isBefore(anuncio.getAncDataCadastro())) {
            throw new IllegalArgumentException("Data limite deve ser posterior à data de cadastro.");
        }

        return repo.save(anuncio);
    }
}

