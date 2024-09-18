public class Conta {
  private String nomeTitular;
  private String senha;
  private final String agencia = "0001";
  private final String numero = "000001";
  private double saldo = 0d;
  private Cartao cartaoCredito;

  public Conta(String nomeTitular, String senha) {
    this.nomeTitular = nomeTitular;
    this.senha = senha;
  }

  public String getNomeTitular() {
    return this.nomeTitular;
  }

  public boolean checarSenha(String senha){
    return this.senha.equals(senha);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public String toString() {
    return "Titular: " + nomeTitular + ", Agencia: " + agencia + ", Numero: " + numero + ", Saldo: " + saldo;
  }
}