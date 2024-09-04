package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.listaDeNumeros);
    if (!listaDeNumeros.isEmpty()) {
      Collections.sort(numerosAscendente);
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.listaDeNumeros);
    if (!listaDeNumeros.isEmpty()) {
      numerosAscendente.sort(Collections.reverseOrder());
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public void exibirNumeros() {
    if (!listaDeNumeros.isEmpty()) {
      System.out.println(this.listaDeNumeros);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

    numeros.adicionarNumero(2);
    numeros.adicionarNumero(5);
    numeros.adicionarNumero(4);
    numeros.adicionarNumero(1);
    numeros.adicionarNumero(99);

    numeros.exibirNumeros();
    System.out.println("Numeros em ordem ascendente: " + numeros.ordenarAscendente());
    System.out.println("Numeros em ordem descendente: " + numeros.ordenarDescendente());
  }
}