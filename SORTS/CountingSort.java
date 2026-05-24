package SORTS;

public class CountingSort {

  // método principal do Counting Sort
  public static void countingSort(int[] vetor) {

    // assume que o maior número é o primeiro
    int maior = vetor[0];

    // procura o maior elemento do vetor
    for (int i = 1; i < vetor.length; i++) {

      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }

    // cria vetor de contagem
    int[] contagem = new int[maior + 1];

    // conta quantas vezes cada número aparece
    for (int i = 0; i < vetor.length; i++) {

      contagem[vetor[i]]++;
    }

    // índice usado para preencher o vetor original
    int indice = 0;

    // percorre o vetor de contagem
    for (int i = 0; i < contagem.length; i++) {

      // enquanto existir aquele número
      while (contagem[i] > 0) {

        vetor[indice] = i;

        indice++;

        contagem[i]--;
      }
    }
  }
}