package br.gov.sp.fatec.springboot3top20251.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.springboot3top20251.entity.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

    List<Anuncio> findByAncTituloContainingIgnoreCaseAndAncDataLimiteBefore(String ancTitulo, LocalDate dataLimite);

    List<Anuncio> findByAncTitulo(String ancTitulo);
}

