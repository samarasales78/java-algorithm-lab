package SORTS;

public class BucketSort {

  // método principal do Bucket Sort
  public static void bucketSort(int[] vetor) {

    // assume que o maior elemento é o primeiro
    int maior = vetor[0];

    // encontra o maior elemento
    for (int i = 1; i < vetor.length; i++) {

      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }

    // cria os "baldes"
    int[] bucket = new int[maior + 1];

    // conta quantas vezes cada número aparece
    for (int i = 0; i < vetor.length; i++) {

      bucket[vetor[i]]++;
    }

    // índice usado para preencher o vetor
    int indice = 0;

    // percorre os buckets
    for (int i = 0; i < bucket.length; i++) {

      // enquanto existir aquele número
      while (bucket[i] > 0) {

        vetor[indice] = i;

        indice++;

        bucket[i]--;
      }
    }
  }
}