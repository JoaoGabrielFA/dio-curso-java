class Cliente {
  private String nome;
  private Conta conta;

  public Cliente(String nome) {
    this.nome = nome;
    this.conta = new Conta(this);
  }

  public String getNome() {
    return this.nome;
  }

  public Conta getConta() {
    return this.conta;
  }

  @Override
  public String toString() {
    return "Titular: " + nome + conta;
  }

}