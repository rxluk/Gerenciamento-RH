package com.gerenciamento.rh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Funcionario {


    @Id
    private String cpf;
    private String nome;
    private Date dtaNasc;
    private String cel;
    private Double salario;
    private String funcao;

    public Funcionario() {
        nome = "";
        cpf = "";
        dtaNasc = new Date();
        cel = "";
        salario = 0.0;
        funcao = "";

    }

    public Funcionario(String nome, String cpf, Date dtaNasc, String cel, Double salario, String funcao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtaNasc = dtaNasc;
        this.cel = cel;
        this.salario = salario;
        this.funcao = funcao;
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

    public Date getDtaNasc() {
        return dtaNasc;
    }

    public void setDtaNasc(Date dtaNasc) {
        this.dtaNasc = dtaNasc;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
