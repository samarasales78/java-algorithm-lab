package treinos.T4;

public class Main {
  public static void main(String[] args) {

    Aluno a = new Aluno("Ana", 10.0, 9.0, 7.0);

    a.exibirDados();

    System.out.printf("Média = %.2f%n", a.calcularMedia());
  }
}
