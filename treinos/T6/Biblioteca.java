package treinos.T6;

import java.util.ArrayList;

public class Biblioteca {

  private ArrayList<Livro>livros; // nome da class Livro

  public Biblioteca() {
    livros = new ArrayList<>();
  }

  public void adicionarLivros(Livro livro) {
    livros.add(livro);
  }

  public int calcularTotalPaginas() {
    int total = 0;

    for (Livro livro : livros) {
      total += livro.getPaginas();
    }

    return total;
  }
}