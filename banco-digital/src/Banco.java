
import java.util.HashMap;
import java.util.Map;

public class Banco {
  private final String nomeBanco = "SuperBank";
  private Map<String, Cliente> clientes;

  public Banco() {
    clientes = new HashMap<>();
  }

  public void iniciar(){
    IBanco ui = new IBanco();
    ui.iniciar();
  }

  public void adicionarCliente(Cliente cliente) {
    clientes.put(cliente.getNome(), cliente);
  }

  public Cliente getCliente(String nome) {
    return clientes.get(nome);
  }

  public boolean checarLogin(String nome, String senha){
    if(clientes.get(nome) == null){
      return false;
    } else{
      return getCliente(nome).checarSenha(senha);
    }
  }
}