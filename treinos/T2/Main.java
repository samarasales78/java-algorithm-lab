package treinos.T2;

public class Main {
  public static void main(String[] args) {

    int [] numerosArray = {1, 4, 56, 15, 38};
    Numeros n1 = new Numeros(numerosArray);

    System.out.println("Soma dos elementos = " + n1.somarElementos());
  }
}
