class Cliente {
  private String nome;
  private String senha;
  private Conta conta;

  public Cliente(String nome, String senha) {
    this.nome = nome;
    this.senha = senha;
    this.conta = new Conta(this);
  }

  public String getNome() {
    return this.nome;
  }

  public Conta getConta() {
    return this.conta;
  }

  public boolean checarSenha(String senha){
      return this.senha.equals(senha);
  }

  @Override
  public String toString() {
    return "Titular: " + nome + conta;
  }

}