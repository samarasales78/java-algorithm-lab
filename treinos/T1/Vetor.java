package treinos.T1;

public class Vetor {

  private int[] numeros;

  public Vetor(int[] numeros) {
    this.numeros = numeros;
  }

  public int menorValor() {
    int menor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {

      if (numeros[i] < menor) {
        menor = numeros[i];
      }
    }

    return menor;
  }
}