package Q15;

import java.util.ArrayList;

public class Estoque {

    // ArrayList de produtos
    private ArrayList<Produto> produtos;

    // construtor
    public Estoque() {
        produtos = new ArrayList<>();
    }

    // adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    // listar produtos
    public void listarProdutos() {
        System.out.println("LISTA DE PRODUTOS");

        for (Produto p : produtos) {
            p.exibirProduto();
        }
    }

    // calcular valor total
    public double calcularValorTotal() {
        double total = 0;

        for (Produto p : produtos) {
            total += p.getPreco();
        }

        return total;
    }
}