import java.util.Scanner;

public class Ex5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int a = s.nextInt();

    System.out.println("Digite o segundo número: ");
    int b = s.nextInt();

    System.out.println("Digite o terceiro número: ");
    int c = s.nextInt();

    int maior;

    if (a > b && a > c) {
      maior = a;
    } else if (b > a && b > c) {
      maior = b;
    } else {
      maior = c;
    }

    System.out.println("Maior = " + maior);

    s.close();
  }
}
