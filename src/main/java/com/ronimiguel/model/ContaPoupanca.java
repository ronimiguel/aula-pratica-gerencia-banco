package com.ronimiguel.model;

import lombok.Getter;

@Getter
public class ContaPoupanca extends Conta {
    private static final long serialVersionUID = 1L;
    private double taxaJuros;

    public ContaPoupanca(int agencia, int numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        this.taxaJuros = taxaJuros;
    }
}
