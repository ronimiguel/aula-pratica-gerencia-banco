package com.ronimiguel.model;

import java.io.Serializable;

import com.ronimiguel.interfaces.IConta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta implements IConta, Serializable {

  private static final long serialVersionUID = 1L;
  private int numero;
  private double saldo;

  // Construtor padrao
  public Conta() {
  }

  public Conta(int numero, double saldo) {
    setNumero(numero);
    this.saldo = saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
    System.out.println("----------------------------------");
    System.out.println("Novo Saldo: R$" + String.format("%.2f", this.saldo));
    System.out.println("----------------------------------");
  }

  public void sacar(double valor) {
    this.saldo -= valor;
  }

  public double getSaldo() {
    return this.saldo;
  }
}
