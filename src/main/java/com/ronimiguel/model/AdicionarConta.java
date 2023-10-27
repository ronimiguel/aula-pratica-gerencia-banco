package com.ronimiguel.model;

import java.util.Scanner;

import lombok.Getter;

@Getter
public class AdicionarConta {
  
  static Scanner scanner = new Scanner(System.in);
  public static void cadastrarConta(Cliente cliente) {
    // Opção para criar uma conta para o cliente
    System.out.println("Deseja criar uma conta? \n1 - Conta Corrente \n2 - Conta Poupança \n0 - Voltar ao menu principal");
    System.out.print("Escolha uma opção: ");
    int opcaoConta = scanner.nextInt();
    

    if (opcaoConta == 1) {
      cadastrarContaCorrente(cliente);
    } else if (opcaoConta == 2) {
      cadastrarContaPoupanca(cliente);
    } else if (opcaoConta == 0) {
      System.out.println("Voltando ao menu principal.");
    }
  }

  private static void cadastrarContaCorrente(Cliente cliente) {
    scanner.nextLine();
    System.out.println("Digite o Número da Conta: ");
    int numeroConta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite o Saldo Inicial: ");
    double saldo = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Digite o Limite de Crédito: ");
    double limiteCredito = scanner.nextDouble();
    
    // Crie uma conta corrente para o cliente
    ContaCorrente contaCorrente = new ContaCorrente(numeroConta, saldo, limiteCredito);
    cliente.setContaCorrente(contaCorrente);
    System.out.println("Conta Corrente criada com sucesso!");
  }

  private static void cadastrarContaPoupanca(Cliente cliente) {
    scanner.nextLine();
    System.out.println("Digite o Número da Agencia:");
    int numeroAgencia = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite o Número da Conta:");
    int numeroConta = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Digite o Saldo Inicial:");
    double saldo = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Digite o Taxa de Juros:");
    double taxaJuros = scanner.nextDouble();
    scanner.nextLine();

    // Crie uma conta poupança para o cliente
    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroAgencia, numeroConta, saldo, taxaJuros);
    cliente.setContaPoupanca(contaPoupanca);
    System.out.println("Conta Poupança criada com sucesso!");
  }
}
