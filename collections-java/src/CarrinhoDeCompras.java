
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> CarrinhoDeCompras;

  public CarrinhoDeCompras(){
    this.CarrinhoDeCompras = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    CarrinhoDeCompras.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> ItensParaRemover = new ArrayList<>();
    if(!CarrinhoDeCompras.isEmpty()){
      for (Item item : CarrinhoDeCompras) {
        if(item.getNome().equalsIgnoreCase(nome)){
          ItensParaRemover.add(item);
        }
      }
      CarrinhoDeCompras.removeAll(ItensParaRemover);
    } else {
      System.out.println("O Carrinho está vazio");
    }
  }

  public double calcularValorTotal(){
    double valorTotal = 0;
    if(!CarrinhoDeCompras.isEmpty()){
      for (Item item : CarrinhoDeCompras) {
        valorTotal += item.getPreco() * item.getQuantidade();
      }
    }

    return valorTotal;
  }

  public void exibirItens(){
    System.out.println(CarrinhoDeCompras);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras minhasCompras = new CarrinhoDeCompras();
      minhasCompras.adicionarItem("Arroz", 10.0, 1);
      minhasCompras.adicionarItem("Batata", 0.7, 5);
      minhasCompras.adicionarItem("Chocolate", 4.0, 1);
      minhasCompras.adicionarItem("Pão", 0.5, 10);
      minhasCompras.exibirItens();
      System.out.println("O valor total do carrinho é: R$" + minhasCompras.calcularValorTotal());

      minhasCompras.removerItem("Arroz");
      minhasCompras.exibirItens();
      System.out.println("O valor total do carrinho é: R$" + minhasCompras.calcularValorTotal());
  }
}
