package com.senai.Atv.pontuada.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Endereco {
@Id

    private Long id;
    private  String logradouro;
    private  String numero;
    private  String complemento;
    private  String cidade;

    public Endereco() {

    }

    public Endereco(Long id, String logradouro, String numero, String complemento, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\n== Endereco =={" +
                "\nId: " + id +
                "\nLogradouro: " + logradouro + '\'' +
                "\nNumero: " + numero + '\'' +
                "\nComplemento: " + complemento + '\'' +
                "\nCidade: " + cidade + '\'' +
                '}';
    }
}
