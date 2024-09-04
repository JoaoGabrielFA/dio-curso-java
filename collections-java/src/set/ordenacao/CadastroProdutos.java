package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> produtos;

  public CadastroProdutos() {
    this.produtos = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtos.add(new Produto(cod, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtos);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtos);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1, "Espada Longa", 150.0, 10);
    cadastroProdutos.adicionarProduto(2, "Escudo de Aço", 120.0, 15);
    cadastroProdutos.adicionarProduto(3, "Poção de Cura", 50.0, 50);
    cadastroProdutos.adicionarProduto(4, "Arco e Flecha", 200.0, 8);
    cadastroProdutos.adicionarProduto(5, "Elmo de Ferro", 100.0, 20);
    cadastroProdutos.adicionarProduto(6, "Manto Mágico", 300.0, 5);
    cadastroProdutos.adicionarProduto(7, "Anel de Proteção", 400.0, 3);
    cadastroProdutos.adicionarProduto(8, "Botas de Velocidade", 250.0, 7);
    cadastroProdutos.adicionarProduto(9, "Cajado Arcano", 500.0, 2);
    cadastroProdutos.adicionarProduto(10, "Luvas de Força", 175.0, 12);

    System.out.println("\n -Exibir produtos por nome: " + cadastroProdutos.exibirProdutosPorNome());
    System.out.println("\n- Exibir produtos por preco: " + cadastroProdutos.exibirProdutosPorPreco());
  }
}