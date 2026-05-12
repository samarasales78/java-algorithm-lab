package Q6;

public class Main {
  public static void main(String[] args) {

    Livro l1 = new Livro("Harry Potter", "J. K. ROWLING");

    System.out.println("Disponivel? " + l1.verificarDisponibilidade());

    System.out.println("Empréstimo realizado? " + l1.emprestar());
        
    System.out.println("Disponível agora? " + l1.verificarDisponibilidade());
    
    l1.devolver();
    
    System.out.println("Depois da devolução: " + l1.verificarDisponibilidade());
  }
}