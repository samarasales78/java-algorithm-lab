package treinos.T7;

import java.util.ArrayList;

public class Estoque {

  private ArrayList<Produto> produtos;

  public Estoque() {
    produtos = new ArrayList<>();
  }

  public void adicionarProduto(Produto produto) {
    produtos.add(produto);
  }

  public Produto produtoMaisCaro() {

    Produto maisCaro = produtos.get(0);

    for (Produto p : produtos) {
      if (p.getPreco() > maisCaro.getPreco()) {
        maisCaro = p;
      }
    }

    return maisCaro;
  }
}