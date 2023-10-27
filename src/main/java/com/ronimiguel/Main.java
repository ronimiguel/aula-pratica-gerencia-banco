package com.ronimiguel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ronimiguel.model.AdicionarCliente;
import com.ronimiguel.model.Cliente;
import com.ronimiguel.model.Depositar;
import com.ronimiguel.model.Sacar;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Cliente> clientes = new ArrayList<>();
    int opcao;

    do {
      System.out.println("************************************************");
      System.out.println("Bem-vindo ao sistema de gerenciamento bancário!");
      System.out.println("************************************************");
      System.out.println("Total de Clientes Cadastrados: " + clientes.size());
      System.out.println("---------------MENU---------------");
      System.out.println("1 - Cadastrar cliente");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          Cliente novoCliente = AdicionarCliente.cadastrarCliente();
          clientes.add(novoCliente);
          break;
        case 2:
          Depositar.efetuarDeposito(clientes);
          break;
        case 3:
          Sacar.efetuarSaque(clientes);
          break;
        case 0:
          System.out.println("Saindo do sistema. Até logo!");
          break;
        default:
          System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
      }
    } while (opcao != 0);
    scanner.close();
  }
}
