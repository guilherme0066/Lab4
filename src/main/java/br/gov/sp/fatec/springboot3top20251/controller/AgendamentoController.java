package br.gov.sp.fatec.springboot3top20251.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.gov.sp.fatec.springboot3top20251.entity.Agendamento;
import br.gov.sp.fatec.springboot3top20251.service.AgendamentoService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @PostMapping
    public Agendamento cadastrar(@RequestBody Agendamento agendamento) {
        return service.cadastrar(agendamento);
    }

    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }

    @GetMapping("/buscar")
    public List<Agendamento> buscarPorData(@RequestParam("dataHora") LocalDateTime dataHora) {
        return service.buscarComFiltro(dataHora);
    }
}
