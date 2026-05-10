import java.util.Scanner;
public class Ex4 {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Digite a nota do aluno: ");
    double nota = s.nextDouble();

    if (nota >= 7) {
      System.out.println("Aprovado");
    } else if (nota >= 5) {
      System.out.println("Recuperação");
    } else {
      System.out.println("Reprovado");
    }

    s.close();
  }
}
