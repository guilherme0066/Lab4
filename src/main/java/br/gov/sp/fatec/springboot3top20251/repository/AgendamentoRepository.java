package br.gov.sp.fatec.springboot3top20251.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springboot3top20251.entity.Agendamento;

import java.time.LocalDateTime;
import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    @Query("SELECT a FROM Agendamento a WHERE a.ageDataHoraInicio > :dataHora AND a.ageValor > 0")
    List<Agendamento> buscarPorDataHoraEValor(LocalDateTime dataHora);
}


