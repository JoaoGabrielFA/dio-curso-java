package set.basico;

import java.util.HashSet;
import java.util.Set;

public class ListaDeConvidados {
  Set<Convidado> listaDeConvidados;

  public ListaDeConvidados() {
    this.listaDeConvidados = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoDoConvite) {
    listaDeConvidados.add(new Convidado(nome, codigoDoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoDoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado convidado : listaDeConvidados) {
      if (convidado.getCodigoDoConvite() == codigoDoConvite) {
        convidadoParaRemover = convidado;
        break;
      }
    }
    listaDeConvidados.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return listaDeConvidados.size();
  }

  public void exibirConvidados() {
    if (!listaDeConvidados.isEmpty()) {
      System.out.println(listaDeConvidados);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {
    ListaDeConvidados listaDeConvidados = new ListaDeConvidados();

    listaDeConvidados.exibirConvidados();
    System.out.println("\nA lista possuí " + listaDeConvidados.contarConvidados() + " convidados");
    
    listaDeConvidados.adicionarConvidado("Darth Vader", 1001);
    listaDeConvidados.adicionarConvidado("Luke Skywalker", 1002);
    listaDeConvidados.adicionarConvidado("Harry Potter", 1003);
    listaDeConvidados.adicionarConvidado("Hermione Granger", 1004);
    listaDeConvidados.adicionarConvidado("Tony Stark", 1005);
    listaDeConvidados.adicionarConvidado("Bruce Wayne", 1006);
    listaDeConvidados.adicionarConvidado("Peter Parker", 1007);
    listaDeConvidados.adicionarConvidado("Clark Kent", 1008);
    listaDeConvidados.adicionarConvidado("Diana Prince", 1009);
    listaDeConvidados.adicionarConvidado("Frodo Baggins", 1010);
    listaDeConvidados.adicionarConvidado("Bilbo Baggins", 1011);
    listaDeConvidados.adicionarConvidado("Sherlock Holmes", 1012);
    listaDeConvidados.adicionarConvidado("James Bond", 1013);
    listaDeConvidados.adicionarConvidado("Leia Organa", 1014);
    listaDeConvidados.adicionarConvidado("Gandalf", 1015);

    listaDeConvidados.exibirConvidados();
    System.out.println("\nA lista possuí " + listaDeConvidados.contarConvidados() + " convidados");
    
    listaDeConvidados.removerConvidadoPorCodigoConvite(1011);
    
    listaDeConvidados.exibirConvidados();
    System.out.println("\nA lista possuí " + listaDeConvidados.contarConvidados() + " convidados");
  }
}