package Q5;

public class Main {
  
  public static void main(String[] args) {

    Carro c1 = new Carro(10);

    c1.abastecer(20);

    c1.andar(50);

    System.out.println("O carro faz " + c1.consumo + "km por litro.");
    System.out.println("Combustível após andar 50 km: " + c1.exibirCombustivel());

    c1.andar(30);

    System.out.println("Combustível após andar mais 30km: " + c1.exibirCombustivel());

  }
}
