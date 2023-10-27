package com.ronimiguel.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cliente implements Serializable {
  private static final long serialVersionUID = 1L;
  private String nome;
  private String dataNascimento;
  private String cpf;
  @Setter
  private ContaCorrente contaCorrente;
  @Setter
  private ContaPoupanca contaPoupanca;
  
  // Construtor padrão
  public Cliente() {
  }

  public Cliente(String nome, String dataNascimento, String cpf) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;
  }
}
