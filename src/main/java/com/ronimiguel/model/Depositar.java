package com.ronimiguel.model;

import java.util.List;
import java.util.Scanner;

public class Depositar {

  static Scanner scanner = new Scanner(System.in);

  public static void efetuarDeposito(List<Cliente> clientes) {
    System.out.print("Digite o número da conta para depósito: ");
    int numeroContaDeposito = scanner.nextInt();

    // Solicitar o valor a ser depositado
    System.out.print("Digite o valor a ser depositado: ");
    double valorDeposito = scanner.nextDouble();

    // Encontrar a conta com o número fornecido
    Cliente clienteParaDeposito = null;
    for (Cliente cliente : clientes) {
      if (cliente.getContaCorrente() != null && cliente.getContaCorrente().getNumero() == numeroContaDeposito) {
        clienteParaDeposito = cliente;
        break;
      }
    }

    if (clienteParaDeposito != null) {
      // Realizar o depósito na conta encontrada
      clienteParaDeposito.getContaCorrente().depositar(valorDeposito);
      System.out.println("Depósito realizado com sucesso!");
    } else {
      System.out.println("Conta não encontrada. Verifique o número da conta.");
    }
  }
}
