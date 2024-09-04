package set.basico;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavrasUnicas;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicas = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicas.add(palavra);
  }

  public void removerPalavra(String palavra) {
    if (!palavrasUnicas.isEmpty()) {
      if (palavrasUnicas.contains(palavra)) {
        palavrasUnicas.remove(palavra);
      } else {
        System.out.println("Palavra não encontrada na lista!");
      }
    } else {
      System.out.println("Não há nenhuma palavra na lista!");
    }
  }

  public boolean verificarPalavra(String palavra) {
    return palavrasUnicas.contains(palavra);
  }

  public void exibirPalavrasUnicas() {
    if (!palavrasUnicas.isEmpty()) {
      System.out.println(palavrasUnicas);
    } else {
      System.out.println("Não há nenhuma palavra na lista!");
    }
  }

  public static void main(String[] args) {
    ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    conjuntoPalavrasUnicas.adicionarPalavra("Maça");
    conjuntoPalavrasUnicas.adicionarPalavra("Banana");
    conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
    conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");

    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    System.out.println("Banana está na lista? " + conjuntoPalavrasUnicas.verificarPalavra("Banana"));
    conjuntoPalavrasUnicas.removerPalavra("Banana");
    conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    System.out.println("Banana está na lista? " + conjuntoPalavrasUnicas.verificarPalavra("Banana"));
    conjuntoPalavrasUnicas.removerPalavra("Banana");
  }
}