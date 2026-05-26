package SORTS;

public class BubbleSort {

    public static void bubbleSort(int[] vetor) {

        int n = vetor.length; // tamanho do vetor

        // percorre o vetor várias vezes
        for (int i = 0; i < n - 1; i++) {

            // a cada passagem, o maior elemento vai para o final
            for (int j = 0; j < n - 1 - i; j++) {

                // compara elementos vizinhos
                if (vetor[j] > vetor[j + 1]) {

                    // troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}