package SORTS;

public class InsertionSort {
  public static void insertionSort(int[] vetor) {
    int n = vetor.length;

    // começa do segundo elemento
    for (int i = 1; i < n; i++) {

      int chave = vetor[i]; // elemento a ser inserido
      int j = i - 1;

      // move os elementos maiores para a direita
      while (j >= 0 && vetor[j] > chave) {
        vetor[j + 1] = vetor[j];
        j--;
      }

      // insere o elemento na posição correta
      vetor[j + 1] = chave;
    }
  }
}
