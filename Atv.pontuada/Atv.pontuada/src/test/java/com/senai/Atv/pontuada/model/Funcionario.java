package com.senai.Atv.pontuada.model;

import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Entity
public class Funcionario {

    private Long id;
    private String nome;
    private String cpf;
    private String dataNascimento;
    private Sexo sexo;
    private Setor setor;
    private EstadoCivil estadoCivil;
    private double salario;
    private String email;
    private Endereco endereco;

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cpf, String dataNascimento, Sexo sexo, Setor setor, EstadoCivil estadoCivil, double salario, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.estadoCivil = estadoCivil;
        this.salario = salario;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\n== Funcionario =={" +
                "\nId: " + id +
                "\nNome:'" + nome + '\'' +
                "\ncpf: " + cpf + '\'' +
                "\nData Nascimento='" + dataNascimento + '\'' +
                "\nsexo: " + sexo +
                "\nsetor: " + setor +
                "\nestado Civil:" + estadoCivil +
                "\nsalario: " + salario +
                "\nemail: " + email + '\'' +
                "\nendereco: " + endereco +
                '}';
    }
}
