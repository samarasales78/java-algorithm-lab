package exemplos;
import java.util.Arrays;

public class Ordenacao {

    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 5, 6};

        // clonando o vetor para testar cada algoritmo separadamente
        int[] v1 = vetor.clone();
        int[] v2 = vetor.clone();
        int[] v3 = vetor.clone();

        bubbleSort(v1);
        selectionSort(v2);
        insertionSort(v3);

        System.out.println("Bubble Sort:   " + Arrays.toString(v1));
        System.out.println("Selection Sort:" + Arrays.toString(v2));
        System.out.println("Insertion Sort:" + Arrays.toString(v3));
    }

    // BUBBLE SORT
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length; // n é o tamanho do vetor, que neste caso será n = 6

        // percorre o vetor várias vezes
        for (int i = 0; i < n - 1; i++) { // começa com i = 0, enquanto i for menor que 6, a cada rodada i++ (incremento, soma 1 em i)

            System.out.println(
                "Rodada " + (i + 1) + ": " +
                Arrays.toString(vetor)
            );

            // a cada passagem, o maior elemento "flutua" para o final
            for (int j = 0; j < n - 1 - i; j++) {

                // compara elementos vizinhos
                if (vetor[j] > vetor[j + 1]) { // se o primeiro número for maior que o segundo

                    // troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    // SELECTION SORT
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

    // INSERTION SORT 
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