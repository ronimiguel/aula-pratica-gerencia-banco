package com.ronimiguel.interfaces;

public interface IConta {
  void sacar(double valor);
  void depositar(double valor);
  double getSaldo();
}
