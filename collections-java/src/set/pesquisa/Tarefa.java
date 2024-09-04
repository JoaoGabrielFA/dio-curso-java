package set.pesquisa;

public class Tarefa {
  private String descricao;
  private Boolean concluida;
  
  public Tarefa(String descricao, Boolean concluida) {
    this.descricao = descricao;
    this.concluida = concluida;
  }

  public Tarefa(String descricao) {
    this.descricao = descricao;
    this.concluida = false;
  }

  public String getDescricao() {
    return descricao;
  }

  public Boolean getConcluida() {
    return concluida;
  }

  public void setConcluida(Boolean concluida) {
    this.concluida = concluida;
  }

  @Override
  public String toString() {
    String status;
    if(concluida){
      status = "concluida";
    } else {
      status = "pendente";
    }

    return "\n* Tarefa [" + descricao + " - " + status + "]";
  }
}