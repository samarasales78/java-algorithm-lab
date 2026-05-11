import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Digite o salário: ");
    float salario = s.nextFloat();

    float inss = salario * 0.11f;
    float ir = (salario - inss) * 0.15f;
    float liquido = salario - (inss + ir);

    System.out.printf("%.2f - %.2f (INSS) - %.2f (IR) = %.2f", salario, inss, ir, liquido);
  
  s.close();
  }

}
