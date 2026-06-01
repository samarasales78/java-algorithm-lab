package Q11;

public class Main {
  
  public static void main(String[] args) {

    int[] numerosArray = {10, 20, 30, 40};

    Numeros n1 = new Numeros(numerosArray);

    System.out.println("Soma = " + n1.calcularSoma());
  }
}
