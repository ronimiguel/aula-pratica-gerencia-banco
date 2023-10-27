package com.ronimiguel.model;

import lombok.Getter;

@Getter
public class ContaCorrente extends Conta {
  private static final long serialVersionUID = 1L;

  private int agencia;
  private double limiteCredito;

  public ContaCorrente(int numero, double saldo, double limiteCredito) {
    super(numero, saldo);
    this.limiteCredito = limiteCredito;
  }

  @Override
  public void sacar(double valor) {
    valor += 10; // taxa de retirada
    System.out.println("----------------------------------");
    System.out.println("Saque em conta corrente possui taxa de R$10.00 reais.");
    System.out.println("Valor total do saque com taxa aplicada: R$" + valor);
    System.out.println("Realizando Saque - Aguarde...");
    super.sacar(valor);
    System.out.println("Saque realizado com sucesso!");
    System.out.println("Saldo Atual: R$" + String.format("%.2f", getSaldo()));
  }
}