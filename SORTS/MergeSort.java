package SORTS;

public class MergeSort {

  // método principal do Merge Sort
  public static void mergeSort(int[] vetor, int inicio, int fim) {

    // verifica se ainda existem elementos para dividir
    if (inicio < fim) {

      // encontra o meio do vetor
      int meio = (inicio + fim) / 2;

      // ordena a metade da esquerda
      mergeSort(vetor, inicio, meio);

      // ordena a metade da direita
      mergeSort(vetor, meio + 1, fim);

      // junta as duas partes já ordenadas
      merge(vetor, inicio, meio, fim);
    }
  }

  // método que junta as partes ordenadas
  public static void merge(int[] vetor, int inicio, int meio, int fim) {

    // cria um vetor auxiliar
    int[] auxiliar = new int[vetor.length];

    // i percorre a parte esquerda
    int i = inicio;

    // j percorre a parte direita
    int j = meio + 1;

    // k percorre o vetor auxiliar
    int k = inicio;

    // compara os elementos das duas metades
    while (i <= meio && j <= fim) {

      // se o elemento da esquerda for menor
      if (vetor[i] < vetor[j]) {

        auxiliar[k] = vetor[i];

        i++;

      } else {

        auxiliar[k] = vetor[j];

        j++;
      }

      k++;
    }

    // copia os elementos restantes da esquerda
    while (i <= meio) {

      auxiliar[k] = vetor[i];

      i++;
      k++;
    }

    // copia os elementos restantes da direita
    while (j <= fim) {

      auxiliar[k] = vetor[j];

      j++;
      k++;
    }

    // copia tudo de volta para o vetor original
    for (i = inicio; i <= fim; i++) {
      vetor[i] = auxiliar[i];
    }
  }
}