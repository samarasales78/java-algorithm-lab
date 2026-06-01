package treinos.T7;

public class Main {

  public static void main(String[] args) {

    Estoque estoque = new Estoque();
    Produto p1 = new Produto ("Celular", 1800.00);
    Produto p2 = new Produto ("Notebook", 3700.00);

    estoque.adicionarProduto(p1);
    estoque.adicionarProduto(p2);

    Produto maisCaro = estoque.produtoMaisCaro();

    System.out.println("Produto: " + maisCaro.getNome());
    System.out.println("Preço: " + maisCaro.getPreco());
  }
  
}
