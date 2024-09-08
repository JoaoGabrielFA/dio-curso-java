package map.basico;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      if (agendaContatoMap.containsKey(nome)) {
        agendaContatoMap.remove(nome);
      } else {
        System.out.println("Contato não encontrado!");
      }
    } else {
      System.out.println("A agenda está vazia!");
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      if (agendaContatoMap.containsKey(nome)) {
        return agendaContatoMap.get(nome);
      } else {
        System.out.println("Contato não encontrado!");
        return null;
      }
    } else {
      System.out.println("A agenda está vazia!");
      return null;
    }
  }

  public static void main(String[] args) {
    AgendaContatos contatos = new AgendaContatos();
    contatos.adicionarContato("Homem de Ferro", 10000000);
    contatos.adicionarContato("Capitão América", 11111111);
    contatos.adicionarContato("Thor", 12222222);
    contatos.adicionarContato("Hulk", 13333333);
    contatos.adicionarContato("Viúva Negra", 14444444);
    contatos.adicionarContato("Gavião Arqueiro", 15555555);
    contatos.adicionarContato("Homem-Aranha", 16666666);
    contatos.adicionarContato("Pantera Negra", 17777777);
    contatos.adicionarContato("Doutor Estranho", 18888888);
    contatos.adicionarContato("Capitã Marvel", 19999999);

    contatos.exibirContatos();
    System.out.println(contatos.pesquisarPorNome("Hulk"));
    contatos.removerContato("Hulk");
    System.out.println(contatos.pesquisarPorNome("Hulk"));
    contatos.exibirContatos();
  }
}