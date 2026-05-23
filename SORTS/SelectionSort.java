package SORTS;

public class SelectionSort {

  public static void selectionSort(int[] vetor) {
    int n = vetor.length;

    // percorre o vetor
    for (int i = 0; i < n - 1; i++) {

      // assume que o menor elemento é o atual
      int menor = i;

      // busca o menor elemento no restante do vetor
      for (int j = i + 1; j < n; j++) {
        if (vetor[j] < vetor[menor]) {
          menor = j;
        }
      }

      // troca o menor elemento encontrado com a posição atual
      int temp = vetor[i];
      vetor[i] = vetor[menor];
      vetor[menor] = temp;
    }
  }
}
