package br.gov.sp.fatec.springboot3top20251.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "anc_anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ancId;

    @Column(nullable = false, length = 50)
    private String ancTitulo;

    private Float ancValor;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDate ancDataCadastro;

    private LocalDate ancDataLimite;

    @Column(length = 200)
    private String ancDescricao;

}

