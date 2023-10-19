package com.gerenciamento.rh.model;


import java.util.Date;

public class Comissionado extends Funcionario {

    private double taxaComissao;
    private double valorVendaBruta;

    public Comissionado() {
        super();
        setFuncao("Comissionado");
        taxaComissao = 0.0;
        valorVendaBruta = 0.0;
    }

    public Comissionado(String nome, String cpf, Date dtaNasc, String cel, Double salario,
                        double taxaComissao, double valorVendaBruta) {
        super(nome, cpf, dtaNasc, cel, salario, "Comissionado");
        this.taxaComissao = taxaComissao;
        this.valorVendaBruta = valorVendaBruta;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getValorVendaBruta() {
        return valorVendaBruta;
    }

    public void setValorVendaBruta(double valorVendaBruta) {
        this.valorVendaBruta = valorVendaBruta;
    }

    @Override
    public void setFuncao(String funcao) {
        super.setFuncao("Comissionado");
    }
}
