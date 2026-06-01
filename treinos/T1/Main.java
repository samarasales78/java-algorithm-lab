package treinos.T1;

public class Main {

  public static void main(String[] args) {

    int[] valores = { 2, 6, 9, 3 };
    Vetor v1 = new Vetor(valores);

    System.out.println("Menor valor = " + v1.menorValor());
  }
}
