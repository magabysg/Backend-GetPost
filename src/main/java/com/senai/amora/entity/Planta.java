package com.senai.amora.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Planta {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomePopular;
    private String nomeCientifico;
    private String especie;
    private String categoria;
    private String iluminacao;
    private String frequenciaRega;
    private String temperaturaIdeal;
    private String origem;
    private LocalDate cadastro;
    private String obcervacao;

    public Planta(){  }

    public Planta(String nomePopular, String nomeCientifico, String especie, String categoria, String iluminacao, String frequenciaRega, String temperaturaIdeal, String origem, LocalDate cadastro, String obcervacao) {
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.especie = especie;
        this.categoria = categoria;
        this.iluminacao = iluminacao;
        this.frequenciaRega = frequenciaRega;
        this.temperaturaIdeal = temperaturaIdeal;
        this.origem = origem;
        this.cadastro = cadastro;
        this.obcervacao = obcervacao;
    }

    public Planta(long id, String nomePopular, String nomeCientifico, String especie, String categoria, String iluminacao, String frequenciaRega, String temperaturaIdeal, String origem, LocalDate cadastro, String obcervacao) {
        this.id = id;
        this.nomePopular = nomePopular;
        this.nomeCientifico = nomeCientifico;
        this.especie = especie;
        this.categoria = categoria;
        this.iluminacao = iluminacao;
        this.frequenciaRega = frequenciaRega;
        this.temperaturaIdeal = temperaturaIdeal;
        this.origem = origem;
        this.cadastro = cadastro;
        this.obcervacao = obcervacao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIluminacao() {
        return iluminacao;
    }

    public void setIluminacao(String iluminacao) {
        this.iluminacao = iluminacao;
    }

    public String getFrequenciaRega() {
        return frequenciaRega;
    }

    public void setFrequenciaRega(String frequenciaRega) {
        this.frequenciaRega = frequenciaRega;
    }

    public String getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    public void setTemperaturaIdeal(String temperaturaIdeal) {
        this.temperaturaIdeal = temperaturaIdeal;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public LocalDate getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDate cadastro) {
        this.cadastro = cadastro;
    }

    public String getObcervacao() {
        return obcervacao;
    }

    public void setObcervacao(String obcervacao) {
        this.obcervacao = obcervacao;
    }
}
