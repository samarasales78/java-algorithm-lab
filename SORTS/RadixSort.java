package SORTS;

public class RadixSort {

  // método principal do Radix Sort
  public static void radixSort(int[] vetor) {

    // assume que o maior é o primeiro
    int maior = vetor[0];

    // encontra o maior elemento
    for (int i = 1; i < vetor.length; i++) {

      if (vetor[i] > maior) {
        maior = vetor[i];
      }
    }

    // exp representa unidade, dezena, centena...
    for (int exp = 1; maior / exp > 0; exp *= 10) {

      counting(vetor, exp);
    }
  }

  // Counting Sort usado pelo Radix
  public static void counting(int[] vetor, int exp) {

    // vetor auxiliar
    int[] saida = new int[vetor.length];

    // vetor de contagem dos dígitos
    int[] contagem = new int[10];

    // conta os dígitos
    for (int i = 0; i < vetor.length; i++) {

      int indice = (vetor[i] / exp) % 10;

      contagem[indice]++;
    }

    // soma acumulada
    for (int i = 1; i < 10; i++) {

      contagem[i] += contagem[i - 1];
    }

    // monta o vetor ordenado
    for (int i = vetor.length - 1; i >= 0; i--) {

      int indice = (vetor[i] / exp) % 10;

      saida[contagem[indice] - 1] = vetor[i];

      contagem[indice]--;
    }

    // copia para o vetor original
    for (int i = 0; i < vetor.length; i++) {

      vetor[i] = saida[i];
    }
  }
}