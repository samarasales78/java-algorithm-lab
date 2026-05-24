package SORTS;

import java.util.Arrays;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    testar(20);
    testar(2000);
  }

  public static void testar(int tamanho) {

// B) CRIE TRES ARRAYS DE TAMANHO 20

    int[] crescente = new int[tamanho]; // B) i.
    int[] decrescente = new int[tamanho]; // B) ii.
    int[] aleatorio = new int[tamanho]; // B) iii. e C) ii. OBS.1: array aleatório é criado uma vez só

    Random r = new Random(1);

    for (int i = 0; i < tamanho; i++) {
      crescente[i] = i;
      decrescente[i] = tamanho - i;
      aleatorio[i] = r.nextInt(10000);
    }

    System.out.println("TAMANHO " + tamanho);

    executar("CRESCENTE", crescente);
    executar("DECRESCENTE", decrescente);
    executar("ALEATORIO", aleatorio); // C) ii. OBS.1: todos os algortimos usam o mesmo vetor
  }

  public static void executar(String nome, int[] vetor) {
    System.out.println("\nARRAY " + nome);

// C) PARA CADA ALGORTIMO IMPLEMENTADO, CALCULE O TEMPO DE EXECUÇÃO.

    medir("Bubble", vetor);
    medir("Selection", vetor);
    medir("Insertion", vetor);
    medir("Merge", vetor);
    medir("Quick", vetor);
    medir("Counting", vetor);
    medir("Radix", vetor);
    medir("Bucket", vetor);
  }

  public static void medir(String algoritmo, int[] original) {

    long soma = 0;

    for (int i = 0; i < 10; i++) { // c) iv. OBS.3: repete 10 vezes

      // C) iii. OBS. 2: cria cópia do vetor original. O vetor original nunca muda
      int[] copia = Arrays.copyOf(original, original.length);

      long inicio = System.nanoTime(); // gurda momento inicial

      // chama o algoritmo correto
      switch (algoritmo) {

        case "Bubble":
          BubbleSort.bubbleSort(copia);
          break;

        case "Selection":
          SelectionSort.selectionSort(copia);
          break;

        case "Insertion":
          InsertionSort.insertionSort(copia);
          break;

        case "Merge":
          MergeSort.mergeSort(copia, 0, copia.length - 1);
          break;

        case "Quick":
          QuickSort.quickSort(copia, 0, copia.length - 1);
          break;

        case "Counting":
          CountingSort.countingSort(copia);
          break;

        case "Radix":
          RadixSort.radixSort(copia);
          break;

        case "Bucket":
          BucketSort.bucketSort(copia);
          break;
      }

      long fim = System.nanoTime(); // guarda momento final

      soma += fim - inicio; // calcula quanto tempo o algortimo demorou
    }

    long media = soma / 10; // calcula a media

    System.out.println(algoritmo + ": " + media + " ns"); // exibe resultado em nanossegundos
  }
}