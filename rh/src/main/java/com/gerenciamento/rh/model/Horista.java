package com.gerenciamento.rh.model;

import jakarta.persistence.Entity;

import java.util.Date;

public class Horista extends Funcionario {
    private double precoHora;
    private double horasTrab;

    public Horista() {
        super();
        setFuncao("Horista");
        precoHora = 0.0;
        horasTrab = 0.0;
    }

    public Horista(String nome, String cpf, Date dtaNasc, String cel, Double salario,
                   double precoHora, double horasTrab) {
        super(nome, cpf, dtaNasc, cel, salario, "Horista");
        this.precoHora = precoHora;
        this.horasTrab = horasTrab;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(double horasTrab) {
        this.horasTrab = horasTrab;
    }
    @Override
    public void setFuncao(String funcao) {
        super.setFuncao("Horista");
    }
}
