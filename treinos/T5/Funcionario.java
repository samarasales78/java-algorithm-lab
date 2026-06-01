package treinos.T5;

public class Funcionario {

  private String nome;
  private double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public void aumentarSalario(double percentual) {
    salario = salario + (salario * percentual) / 100;  
  }

  public void exibirDados() {
    System.out.printf("Nome: %s%nSalário: %.2f%n", nome, salario);
  }
}