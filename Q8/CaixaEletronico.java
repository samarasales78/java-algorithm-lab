package Q8;

import java.util.Scanner;

public class CaixaEletronico {

  public double saldo;

  CaixaEletronico(double saldo) {
    this.saldo = saldo;
  }

  public boolean sacar(double valor) {
    if (valor <= saldo) {
      saldo = saldo - valor;
      return true;
    } else {
      return false;
    }
  }

  public void realizarSaques() {

    Scanner sc = new Scanner(System.in);

    double valor;

    while (saldo > 0) {

      System.out.println("Saldo atual: " + saldo);
      System.out.println("Digite o valor do saque (0 para sair): ");

      valor = sc.nextDouble();

      if (valor == 0) {
        break;
      }

      if (sacar(valor)) {
        System.out.println("Saque realizado!");
      } else {
        System.out.println("Saldo insuficiente!");
      }
    }

    System.out.println("Operação encerrada.");

    sc.close();
  }
}