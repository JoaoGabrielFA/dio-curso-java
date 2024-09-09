package map.pesquisa;

public class Produto {
  private String nome;
  private int quantidade;
  private double preco;

  public Produto(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  public String getNome() {
    return this.nome;
  }

  public int getQuantidade() {
    return this.quantidade;
  }

  public double getPreco() {
    return this.preco;
  }

  @Override
  public String toString() {
    return "{" +
      " nome='" + getNome() + "'" +
      ", quantidade='" + getQuantidade() + "'" +
      ", preco='" + getPreco() + "'" +
      "}";
  }
}