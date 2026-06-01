package Q12;

public class Vetor {
  
  private int[] numeros;

  public Vetor(int[] numeros) {
    this.numeros = numeros;
  }

  public int maiorValor() {

    int maior = numeros [0]; // assume que o primeiro é o maior

    for (int i = 1; i < numeros.length; i++) { // percorre array

      if (numeros[i] > maior) { // compara
        maior = numeros[i];
      }
    }

    return maior;
  }
}
