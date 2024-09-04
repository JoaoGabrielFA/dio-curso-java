package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
  private Set<Contato> contatos;

  public AgendaContatos() {
    this.contatos = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatos.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    if (!contatos.isEmpty()) {
      System.out.println(contatos);
    } else {
      System.out.println("A lista de contatos está vazia!");
    }
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> contatosPorNome = new HashSet<>();
    if (!contatos.isEmpty()) {
      for (Contato contato : contatos) {
        if (contato.getNome().startsWith(nome)) {
          contatosPorNome.add(contato);
        }
      }
    } else {
      System.out.println("A lista de contatos está vazia!");
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    if (!contatos.isEmpty()) {
      for (Contato contato : contatos) {
        if (contato.getNome().equalsIgnoreCase(nome)) {
          contato.setNumero(novoNumero);
          contatoAtualizado = contato;
          break;
        }
      }
    } else {
      System.out.println("A lista de contatos está vazia!");
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();
    agendaContatos.adicionarContato("Kurt Cobain", 900000001);
    agendaContatos.adicionarContato("John Lennon", 900000002);
    agendaContatos.adicionarContato("Paul McCartney", 900000003);
    agendaContatos.adicionarContato("Jimi Hendrix", 900000004);
    agendaContatos.adicionarContato("Freddie Mercury", 900000005);
    agendaContatos.adicionarContato("Mick Jagger", 900000006);
    agendaContatos.adicionarContato("David Bowie", 900000007);
    agendaContatos.adicionarContato("Keith Richards", 900000008);
    agendaContatos.adicionarContato("Jimmy Page", 900000009);
    agendaContatos.adicionarContato("Roger Waters", 900000010);
    agendaContatos.exibirContatos();
    System.out.println("\nPorcurando Kurt Cobain: " + agendaContatos.pesquisarPorNome("Kurt Cobain"));
    agendaContatos.atualizarNumeroContato("Kurt Cobain", 999999999);
    System.out.println("\nPorcurando Kurt Cobain: " + agendaContatos.pesquisarPorNome("Kurt Cobain"));
  }
}