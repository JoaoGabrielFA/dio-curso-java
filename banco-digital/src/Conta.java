public class Conta {
  private final String nomeTitular;
  private String senha;
  private final String agencia = "0001";
  private final String numero = "000001";
  private double saldo = 0d;

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

  public boolean transferir(Conta contaParaTransferir, double valorTranferencia){
    if(this.saldo >= valorTranferencia){
      this.depositar(-1 * valorTranferencia);
      contaParaTransferir.depositar(valorTranferencia);
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Titular: " + nomeTitular + ", Agencia: " + agencia + ", Numero: " + numero + ", Saldo: " + saldo;
  }
}