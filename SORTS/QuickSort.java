package SORTS;

public class QuickSort {

  // método principal do Quick Sort
  public static void quickSort(int[] vetor, int inicio, int fim) {

    // verifica se ainda existem elementos para ordenar
    if (inicio < fim) {

      // encontra a posição correta do pivô
      int pivo = particionar(vetor, inicio, fim);

      // ordena a parte esquerda
      quickSort(vetor, inicio, pivo - 1);

      // ordena a parte direita
      quickSort(vetor, pivo + 1, fim);
    }
  }

  // método que organiza os elementos em volta do pivô
  public static int particionar(int[] vetor, int inicio, int fim) {

    // escolhe o último elemento como pivô
    int pivo = vetor[fim];

    // variável usada para controlar elementos menores
    int i = inicio - 1;

    // percorre o vetor
    for (int j = inicio; j < fim; j++) {

      // se o elemento atual for menor que o pivô
      if (vetor[j] < pivo) {

        i++;

        // troca os elementos
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
      }
    }

    // coloca o pivô na posição correta
    int temp = vetor[i + 1];
    vetor[i + 1] = vetor[fim];
    vetor[fim] = temp;

    // retorna a posição do pivô
    return i + 1;
  }
}
