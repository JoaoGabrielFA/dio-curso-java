package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

  private LocalDate data;

  public LocalDate getData() {
    return this.data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "{" +
      " titulo='" + getTitulo() + "'" +
      ", descricao='" + getDescricao() + "'" +
      ", data='" + getData() + "'" +
      "}";
  }

  @Override
  public double calcularXp() {
    return XP_PADRAO + 20d;
  }
}
