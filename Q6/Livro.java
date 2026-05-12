package Q6;

public class Livro {
  
  public String titulo;
  public String autor;
  public boolean disponivel;

  Livro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
  }

  public boolean emprestar() {
    if (disponivel) {
      disponivel = false;
      return true;
    } else {
      return false;
    }

  }

  public void devolver() {
    disponivel = true;
  }

  public boolean verificarDisponibilidade() {
    return disponivel;
  }
}