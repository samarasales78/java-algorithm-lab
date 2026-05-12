package Q4;

public class Main {
  
  public static void main(String[] args) {

    Funcionario f1 = new Funcionario("Ana", 1500);
    Funcionario f2 = new Funcionario("Carlos", 1200);

    System.out.println("Dados do primeiro funcionário: nome = " + f1.nome + " | salário = " + f1.salario);
    System.out.println("Dados do segundo funcionário: nome = " + f2.nome + " | salário = " + f2.salario);
    
    System.out.println("O salário de Ana com aumento é = " + f1.aumentarSalario(10));
    System.out.println("O salário de Carlos com aumento é = " + f2.aumentarSalario(20));
  }
}