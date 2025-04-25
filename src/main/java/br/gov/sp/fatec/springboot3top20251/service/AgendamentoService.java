package br.gov.sp.fatec.springboot3top20251.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springboot3top20251.entity.Agendamento;
import br.gov.sp.fatec.springboot3top20251.repository.AgendamentoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public Agendamento cadastrar(Agendamento ag) {
        if (ag.getAgeDataHoraInicio() == null || ag.getAgeDataHoraInicio().isBefore(LocalDateTime.now().plusDays(1))) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Data/hora inválida.");
        }

        if (ag.getAgeValor() != null && ag.getAgeValor() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Valor deve ser maior que zero.");
        }

        return repository.save(ag);
    }

    public List<Agendamento> listar() {
        return repository.findAll();
    }

    public List<Agendamento> buscarComFiltro(LocalDateTime dataHora) {
        return repository.buscarPorDataHoraEValor(dataHora);
    }
}

