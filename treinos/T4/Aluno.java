package treinos.T4;

public class Aluno {
  
  private String nome;
  private double nota1;
  private double nota2;
  private double nota3;

  public Aluno(String nome, double nota1, double nota2, double nota3) {
    this.nome = nome;
    this.nota1 = nota1;
    this.nota2 = nota2;
    this.nota3 = nota3;
  }

  public double calcularMedia() {
    double media = (nota1 + nota2 + nota3) / 3;
    return media;
  }

  public void exibirDados() {
    System.out.printf("Nome: %s%nNota 1 : %.1f%nNota 2: %.1f%nNota 3: %.1f%n", nome, nota1, nota2, nota3);
  }
}
