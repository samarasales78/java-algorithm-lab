package exemplos;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int n1 = s.nextInt();

    System.out.print("Digite o segundo número: ");
    int n2 = s.nextInt();

    int quociente = n1 / n2;
    int resto = n1 % n2;

    System.out.println("Quociente = " + quociente + ", Resto = " + resto);
    s.close();
  }
}
