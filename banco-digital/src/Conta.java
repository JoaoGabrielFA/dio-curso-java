
import java.util.List;

public class Conta {
  private final Cliente cliente;
  private final String agencia = "0001";
  private final String numero = "000001";
  private double saldo = 0d;
  private List<Cartao> cartoes;

  public Conta(Cliente cliente) {
    this.cliente = cliente;
  }

  public double getSaldo(){
    return this.saldo;
  }

  public void depositar(double valor){
    this.saldo += valor;
  }

  @Override
  public String toString() {
    return ", Agencia: " + agencia + ", " + "Numero: " + numero;
  }
}