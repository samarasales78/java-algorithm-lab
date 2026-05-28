package Q16;

public class Contato {

  // atributos privados
  private String nome;
  private String telefone;

  // construtor
  public Contato(String nome, String telefone) {
      this.nome = nome;
      this.telefone = telefone;
  }

  // getters
  public String getNome() {
      return nome;
  }

  public String getTelefone() {
      return telefone;
  }

  // exibir contato
  public void exibirContato() {
      System.out.println("Nome: " + nome + " | Telefone: " + telefone);
  }
}
