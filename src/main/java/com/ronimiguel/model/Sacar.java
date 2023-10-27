package com.ronimiguel.model;

import java.util.List;
import java.util.Scanner;

public class Sacar {

  static Scanner scanner = new Scanner(System.in);

  public static void efetuarSaque(List<Cliente> clientes) {
    System.out.print("Digite o número da conta para realizar saque: ");
    int numeroContaSaque = scanner.nextInt();

    // Solicitar o valor a ser depositado
    System.out.print("Digite o valor do saque: ");
    double valorSaque = scanner.nextDouble();

    // Encontrar a conta com o número fornecido
    Cliente clienteParaRealizarSaque = null;
    for (Cliente cliente : clientes) {
      if (cliente.getContaCorrente() != null && cliente.getContaCorrente().getNumero() == numeroContaSaque) {
        clienteParaRealizarSaque = cliente;
        break;
      }
    }

    if (clienteParaRealizarSaque != null) {
      // Realizar o depósito na conta encontrada
      clienteParaRealizarSaque.getContaCorrente().sacar(valorSaque);
    } else {
      System.out.println("Conta não encontrada. Verifique o número da conta.");
    }
  }
}
