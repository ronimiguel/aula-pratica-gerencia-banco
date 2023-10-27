package com.ronimiguel.model;

import java.util.Scanner;

import lombok.Getter;

@Getter
public class AdicionarCliente {

  static Scanner scanner = new Scanner(System.in);

  public static Cliente cadastrarCliente() {
    System.out.print("Nome do cliente: ");
    String nome = scanner.nextLine();
    System.out.print("Data de nascimento (dd/mm/aaaa): ");
    String dataNascimentoStr = scanner.nextLine();
    System.out.print("CPF: ");
    String cpf = scanner.nextLine();

    Cliente cliente = new Cliente(nome, dataNascimentoStr, cpf);
    System.out.println("Cliente cadastrado com sucesso!\n");
    AdicionarConta.cadastrarConta(cliente);
    listarDadosCliente(cliente);
    return cliente;
    // scanner.close();
  }

  public static void listarDadosCliente(Cliente cliente) {
    System.out.println("----------DADOS CLIENTE-----------");
    System.out.println("Nome: " + cliente.getNome());
    System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
    System.out.println("CPF: " + cliente.getCpf());
    if (cliente.getContaCorrente() != null) {
      System.out.println("Conta Corrente: " + cliente.getContaCorrente().getNumero());
      System.out.println("Saldo: R$" + String.format("%.2f", cliente.getContaCorrente().getSaldo()));
      System.out.println("Cheque Especial: R$" + String.format("%.2f", cliente.getContaCorrente().getLimiteCredito()));
    }
    if (cliente.getContaPoupanca() != null) {
      System.out.println("Conta Poupança: " + cliente.getContaPoupanca().getNumero());
      System.out.println("Saldo: R$" + String.format("%.2f", cliente.getContaPoupanca().getSaldo()));
      System.out.println("Taxa de Juros: " + cliente.getContaPoupanca().getTaxaJuros() + "%");
    }
    System.out.println("----------------------------------");
  }
}
