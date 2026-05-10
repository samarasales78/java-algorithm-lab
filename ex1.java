import java.util.Scanner;
import java.util.Locale;

public class Ex1 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    s.useLocale(Locale.US);

    System.out.print("Digite o primeiro número: ");
    double n1 = s.nextDouble();

    System.out.print("Digite o segundo número: ");
    double n2 = s.nextDouble();

    System.out.print("Digite o terceiro número: ");
    double n3 = s.nextDouble();
    
    double media = (n1 + n2 + n3) / 3;
    System.out.printf("Média: %.2f", media);

    s.close();
  }
}
