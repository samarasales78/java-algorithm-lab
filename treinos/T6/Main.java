package treinos.T6;

public class Main {

  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    Livro l1 = new Livro("O Conde de Monte Cristo", 1664);
    Livro l2 = new Livro("Drácula", 538);

    biblioteca.adicionarLivros(l1);
    biblioteca.adicionarLivros(l2);

    System.out.println("Total de páginas: " + biblioteca.calcularTotalPaginas());
  }
}
