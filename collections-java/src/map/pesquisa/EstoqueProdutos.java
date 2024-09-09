package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
  private Map<Long, Produto> produtosEmEstoque;

  public EstoqueProdutos() {
    produtosEmEstoque = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    produtosEmEstoque.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    if (!produtosEmEstoque.isEmpty()) {
      System.out.println(produtosEmEstoque);
    } else {
      System.out.println("\nNão há produtos em estoque!");
    }
  }

  public double calcularValorTotalEstoque() {
    double valorTotalDoEstoque = 0;
    if (!produtosEmEstoque.isEmpty()) {
      for (Produto produto : produtosEmEstoque.values()) {
        valorTotalDoEstoque += produto.getPreco() * produto.getQuantidade();
      }
    } else {
      System.out.println("\nNão há produtos em estoque!");
    }
    return valorTotalDoEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!produtosEmEstoque.isEmpty()) {
      for (Produto produto : produtosEmEstoque.values()) {
        if (produto.getPreco() > maiorPreco) {
          maiorPreco = produto.getPreco();
          produtoMaisCaro = produto;
        }
      }
    } else {
      System.out.println("\nNão há produtos em estoque!");
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if (!produtosEmEstoque.isEmpty()) {
      for (Produto produto : produtosEmEstoque.values()) {
        if (produto.getPreco() < menorPreco) {
          menorPreco = produto.getPreco();
          produtoMaisBarato = produto;
        }
      }
    } else {
      System.out.println("\nNão há produtos em estoque!");
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
    double maiorValorTotal = Double.MIN_VALUE;
    if (!produtosEmEstoque.isEmpty()) {
      for (Produto produto : produtosEmEstoque.values()) {
        if (produto.getPreco() * produto.getQuantidade() > maiorValorTotal) {
          maiorValorTotal = produto.getPreco() * produto.getQuantidade();
          produtoMaiorQuantidadeValorTotalNoEstoque = produto;
        }
      }
    } else {
      System.out.println("\nNão há produtos em estoque!");
    }
    return produtoMaiorQuantidadeValorTotalNoEstoque;
  }

  public static void main(String[] args) {
    EstoqueProdutos produtosEmEstoque = new EstoqueProdutos();
    produtosEmEstoque.adicionarProduto(1L, "Joia do Espaço", 5, 50);
    produtosEmEstoque.adicionarProduto(2L, "Joia da Mente", 2, 80);
    produtosEmEstoque.adicionarProduto(3L, "Joia da Realidade", 3, 40);
    produtosEmEstoque.adicionarProduto(4L, "Joia do Poder", 4, 30);
    produtosEmEstoque.adicionarProduto(5L, "Joia do Tempo", 2, 70);
    produtosEmEstoque.adicionarProduto(6L, "Joia da Alma", 1, 100);
    produtosEmEstoque.exibirProdutos();
    System.out.println("\n Valor total do estoque: " + produtosEmEstoque.calcularValorTotalEstoque());
    System.out.println("\n Produto mais caro em estoque: " + produtosEmEstoque.obterProdutoMaisCaro());
    System.out.println("\n Produto mais barato em estoque: " + produtosEmEstoque.obterProdutoMaisBarato());
    System.out.println("\n Produto com maior valor total em estoque: " + produtosEmEstoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
  }
}