package br.gov.sp.fatec.springboot3top20251.entity;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "anc_anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ancId;

    @Column(nullable = false, length = 50)
    private String ancTitulo;

    private Float ancValor;

    @Column(nullable = false)
    private LocalDate ancDataCadastro;

    private LocalDate ancDataLimite;

    @Column(length = 200)
    private String ancDescricao;

    public Object getAncTitulo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAncTitulo'");
    }

    public ChronoLocalDate getAncDataCadastro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAncDataCadastro'");
    }

    public void setAncDataCadastro(LocalDate now) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAncDataCadastro'");
    }

    public Object getAncDataLimite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAncDataLimite'");
    }

    // Getters e Setters
}

