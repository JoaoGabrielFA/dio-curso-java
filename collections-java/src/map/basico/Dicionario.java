package map.basico;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
  private Map<String, String> dicionario;

  public Dicionario() {
    dicionario = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, String definicao) {
    dicionario.put(palavra, definicao);
  }

  public void removerPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      if (dicionario.containsKey(palavra)) {
        dicionario.remove(palavra);
        System.out.println("Removendo " + palavra + " do dicionário...");
      } else {
        System.out.println("Palavra não encontrada!");
      }
    } else {
      System.out.println("O dicionário está vazio!");
    }
  }

  public void exibirPalavras() {
    if (!dicionario.isEmpty()) {
      System.out.println(dicionario);
    } else {
      System.out.println("O dicionário está vázio!");
    }
  }

  public void pesquisarPorPalavra(String palavra) {
    if (!dicionario.isEmpty()) {
      if (dicionario.containsKey(palavra)) {
        System.out.println(palavra);
      } else {
        System.out.println("Palavra não encontrada!");
      }
    } else {
      System.out.println("O dicionário está vázio!");
    }
  }

  public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();
    dicionario.adicionarPalavra("zortek", "Um dispositivo futurista de comunicação intergaláctica.");
    dicionario.adicionarPalavra("florblin", "Uma criatura mítica que habita florestas encantadas.");
    dicionario.adicionarPalavra("ventros", "Uma corrente de vento extremamente poderosa que ocorre em planetas distantes.");
    dicionario.adicionarPalavra("glimbar", "Ação de se mover rapidamente através de portais dimensionais.");
    dicionario.adicionarPalavra("vortexia", "O efeito gravitacional de uma galáxia em forma de vórtice.");
    dicionario.adicionarPalavra("quintor", "Uma substância rara encontrada apenas em cometas congelados.");
    dicionario.adicionarPalavra("lurvix", "Uma forma de energia pura gerada pela fusão de estrelas.");
    dicionario.adicionarPalavra("zenfir", "Um estilo de arte que envolve a manipulação de luz e sombra.");
    dicionario.adicionarPalavra("brantor", "Uma armadura impenetrável feita de um material desconhecido.");
    dicionario.adicionarPalavra("xenthar", "O guardião ancestral de um reino perdido nas profundezas do oceano.");
    
    dicionario.exibirPalavras();
    dicionario.pesquisarPorPalavra("zortek");
    dicionario.removerPalavra("zortek");
    dicionario.pesquisarPorPalavra("zortek");
    dicionario.exibirPalavras();
  }
}