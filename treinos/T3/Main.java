package treinos.T3;

public class Main {

  public static void main(String[] args) {

    int [] valores = {2, 5, 7, 8, 6};

    Numeros n1 = new Numeros(valores);

    System.out.println("Quantidade de ímpares = " + n1.contarImpares());
  }
  
}