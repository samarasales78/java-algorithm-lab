import java.util.Scanner;
public class Ex2 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Digite a tempratura em graus celsius: ");
    double celsius = s.nextDouble();

    double fahrenheit = (9 * celsius) / 5 + 32;
    System.out.printf("A temperatura em Fahrenheit corresponde a: %.2f", fahrenheit);

    s.close();
  }
}
