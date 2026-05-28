package Q15;

public class Main {

  public static void main(String[] args) {

      // criando estoque
      Estoque estoque = new Estoque();

      // criando produtos
      Produto p1 = new Produto("Notebook", 3500.00);
      Produto p2 = new Produto("Mouse", 120.50);
      Produto p3 = new Produto("Teclado", 250.99);

      // adicionando ao estoque
      estoque.adicionarProduto(p1);
      estoque.adicionarProduto(p2);
      estoque.adicionarProduto(p3);

      // listando produtos
      estoque.listarProdutos();

      // mostrando valor total
      System.out.printf("\nValor total do estoque: R$ %.2f%n",
              estoque.calcularValorTotal());
  }
}