package Q14;

public class Aluno {

  private String nome;
  private double[] notas;

  public Aluno(String nome) {
    this.nome = nome;
    this.notas = new double[3];
  }

  public void adicionarNota(int posicao, double nota) {
    notas[posicao] = nota;
  }

  public double calcularMedia() {

    double soma = 0;

    for (int i = 0; i < notas.length; i++) {
      soma += notas[i];
    }

    return soma / notas.length;
  }

  public void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Notas: ");

    for (int i = 0; i < notas.length; i++) {
      System.out.println("Nota " + (i + 1) + ": " + notas[i]);
    }

    System.out.printf("Média : %.2f", calcularMedia());
  }
}
