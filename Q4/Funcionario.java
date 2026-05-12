package Q4;

public class Funcionario {
  
  public String nome;
  public double salario;

  Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public double aumentarSalario(double porcentagem) {
    salario = salario + (salario * porcentagem / 100);
    return salario;
  }
}