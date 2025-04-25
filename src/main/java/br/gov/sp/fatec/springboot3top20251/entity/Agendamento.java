package br.gov.sp.fatec.springboot3top20251.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "age_agendamento")
public class Agendamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ageId;

    private String ageInstrucoes;
    private Double ageValor;

    @Column(nullable = false)
    private LocalDateTime ageDataHoraInicio;

    private Integer ageDuracaoPrevista;

    // Getters e setters
    public Long getAgeId() { return ageId; }
    public void setAgeId(Long ageId) { this.ageId = ageId; }

    public String getAgeInstrucoes() { return ageInstrucoes; }
    public void setAgeInstrucoes(String ageInstrucoes) { this.ageInstrucoes = ageInstrucoes; }

    public Double getAgeValor() { return ageValor; }
    public void setAgeValor(Double ageValor) { this.ageValor = ageValor; }

    public LocalDateTime getAgeDataHoraInicio() { return ageDataHoraInicio; }
    public void setAgeDataHoraInicio(LocalDateTime ageDataHoraInicio) { this.ageDataHoraInicio = ageDataHoraInicio; }

    public Integer getAgeDuracaoPrevista() { return ageDuracaoPrevista; }
    public void setAgeDuracaoPrevista(Integer ageDuracaoPrevista) { this.ageDuracaoPrevista = ageDuracaoPrevista; }
}
