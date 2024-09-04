package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> listaDeTarefas;

  public ListaTarefas() {
    this.listaDeTarefas = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    listaDeTarefas.add(new Tarefa(descricao));
  }

  public void adicionarTarefa(String descricao, Boolean concluida) {
    listaDeTarefas.add(new Tarefa(descricao, concluida));
  }

  public void removerTarefa(String descricao) {
    Tarefa TarefaParaRemover = null;
    if (!listaDeTarefas.isEmpty()) {
      for (Tarefa tarefa : listaDeTarefas) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          TarefaParaRemover = tarefa;
        } else {
          System.out.println("Tarefa não encontrada!");
        }
      }
    } else {
      System.out.println("A lista está vazia!");
    }
    listaDeTarefas.remove(TarefaParaRemover);
  }

  public void exibirTarefas() {
    if (!listaDeTarefas.isEmpty()) {
      System.out.println(listaDeTarefas);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public int contarTarefas() {
    return listaDeTarefas.size();
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    if (!listaDeTarefas.isEmpty()) {
      for (Tarefa tarefa : listaDeTarefas) {
        if (tarefa.getConcluida()) {
          tarefasConcluidas.add(tarefa);
        }
      }
    } else {
      System.out.println("Nenhuma tarefa concluída!");
    }
    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    if (!listaDeTarefas.isEmpty()) {
      for (Tarefa tarefa : listaDeTarefas) {
        if (!tarefa.getConcluida()) {
          tarefasPendentes.add(tarefa);
        }
      }
    } else {
      System.out.println("Nenhuma tarefa pendente!");
    }
    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    Tarefa TarefaParaMarcarComoConcluida = null;
    if (!listaDeTarefas.isEmpty()) {
      for (Tarefa tarefa : listaDeTarefas) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          TarefaParaMarcarComoConcluida = tarefa;
        }
      }
    } else {
      System.out.println("A lista está vazia!");
    }

    if (TarefaParaMarcarComoConcluida == null) {
      System.out.println("Tarefa não encontrada!");
    }

    TarefaParaMarcarComoConcluida.setConcluida(true);
  }

  public void marcarTarefaPendente(String descricao) {
    Tarefa TarefaParaMarcarComoPendente = null;
    if (!listaDeTarefas.isEmpty()) {
      for (Tarefa tarefa : listaDeTarefas) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
          TarefaParaMarcarComoPendente = tarefa;
        }
      }
    } else {
      System.out.println("A lista está vazia!");
    }

    if (TarefaParaMarcarComoPendente == null) {
      System.out.println("Tarefa não encontrada!");
    }

    TarefaParaMarcarComoPendente.setConcluida(false);
  }

  public void limparListaTarefas() {
    if (!listaDeTarefas.isEmpty()) {
      listaDeTarefas.clear();
    } else {
      System.out.println("A lista já está vazia!");
    }
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();
    listaTarefas.adicionarTarefa("Treinar um dragão para acender a lareira", true);
    listaTarefas.adicionarTarefa("Levar o unicórnio para passear no parque", true);
    listaTarefas.adicionarTarefa("Construir um castelo de areia na Lua", true);
    listaTarefas.adicionarTarefa("Organizar uma corrida de lesmas no quintal", true);
    listaTarefas.adicionarTarefa("Fazer amizade com um alienígena e convidá-lo para o jantar", true);
    listaTarefas.adicionarTarefa("Pintar um arco-íris com cores invisíveis");
    listaTarefas.adicionarTarefa("Escrever uma carta para o Papai Noel no Polo Norte");
    listaTarefas.adicionarTarefa("Criar uma poção da invisibilidade usando suco de laranja");
    listaTarefas.adicionarTarefa("Aprender a falar a língua dos golfinhos");
    listaTarefas.adicionarTarefa("Plantar uma árvore de chocolates no jardim");

    listaTarefas.exibirTarefas(); 
    System.out.println("\n- A lista possuí " + listaTarefas.contarTarefas() + " tarefas!");

    System.out.println("\n- " + listaTarefas.obterTarefasConcluidas().size() + " tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
    System.out.println("\n- " + listaTarefas.obterTarefasPendentes().size() + " tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

    listaTarefas.marcarTarefaConcluida("Plantar uma árvore de chocolates no jardim");
    listaTarefas.marcarTarefaPendente("Treinar um dragão para acender a lareira");

    // listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}