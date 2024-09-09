package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
  private Map<String, Integer> palavras;

  public ContagemPalavras(){
    palavras = new HashMap<>();
  }

  public void adicionarPalavra(String palavra, Integer contagem){
    palavras.put(palavra, contagem);
  }

  public void removerPalavra(String palavra){
    palavras.remove(palavra);
  }

  public int exibirContagemPalavras(){
    int contagemTotal = 0;
    for (int contagem : palavras.values()) {
      contagemTotal += contagem;
    }
    return contagemTotal;
  }

  public String encontrarPalavraMaisFrequente(){
    String palavrasMaisFrequente = null;
    int maiorContagem = 0;
    if(!palavras.isEmpty()){
      for (Map.Entry<String, Integer> palavra : palavras.entrySet()) {
        if (palavra.getValue() > maiorContagem) {
          maiorContagem = palavra.getValue();
          palavrasMaisFrequente = palavra.getKey();
        }
      }
    } else {
      System.out.println("Não há nenhuma palavra registrada!");
    }
    return palavrasMaisFrequente;
  }

  public static void main(String[] args) {
    ContagemPalavras contagemLinguagens = new ContagemPalavras();

    contagemLinguagens.adicionarPalavra("Java", 2);
    contagemLinguagens.adicionarPalavra("Python", 8);
    contagemLinguagens.adicionarPalavra("JavaScript", 1);
    contagemLinguagens.adicionarPalavra("C#", 6);

    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    System.out.println("A linguagem mais frequente é: " + contagemLinguagens.encontrarPalavraMaisFrequente());

    contagemLinguagens.removerPalavra("Python");

    System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    System.out.println("A linguagem mais frequente é: " + contagemLinguagens.encontrarPalavraMaisFrequente());

  }
}