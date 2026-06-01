package Q13;

public class Main {
  
  public static void main(String[] args) {

    int[] numerosArray = {2, 5, 8, 11, 14, 7};

    Numeros n1 = new Numeros(numerosArray);

    System.out.println("Quantidade de pares = " + n1.contarPares());
  }
}
