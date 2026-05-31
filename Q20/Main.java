package Q20;

public class Main {
  
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana");

    a1.adicionarNota(0, 8.5);
    a1.adicionarNota(1, 7.0);
    a1.adicionarNota(2, 9.5);

    a1.exibirDados();
  }
}
