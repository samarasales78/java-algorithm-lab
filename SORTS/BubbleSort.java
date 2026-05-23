package SORTS;

public class BubbleSort {

  public static void bubbleSort(int[] vetor) {

    int n = vetor.length;

    for (int i = 0; i < n - 1; i++) {

      for (int j = 0; j < n - 1 - i; j++) {

        if (vetor[j] > vetor[j + 1]) {

          int temp = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = temp;
        }
      }
    }
  }
}