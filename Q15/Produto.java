package Q15;

public class Produto {

  // atributos privados
  private String nome;
  private double preco;

  // construtor
  public Produto(String nome, double preco) {
      this.nome = nome;
      this.preco = preco;
  }

  // getters
  public String getNome() {
      return nome;
  }

  public double getPreco() {
      return preco;
  }

  // método para exibir produto
  public void exibirProduto() {
      System.out.printf("Produto: %s | Preço: R$ %.2f%n", nome, preco);
  }
}