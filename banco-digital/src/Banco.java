
import java.util.HashMap;
import java.util.Map;

public class Banco {
  private final String nomeBanco = "SuperBank";
  private Map<String, Conta> contas;

  public Banco() {
    contas = new HashMap<>();
  }

  public void iniciar(){
    IBanco ui = new IBanco();
    ui.iniciar();
  }

  public void adicionarConta(Conta conta) {
    contas.put(conta.getNomeTitular(), conta);
  }

  public Conta getConta(String nome) {
    return contas.get(nome);
  }

  public boolean checarLogin(String nome, String senha){
    if(contas.get(nome) == null){
      return false;
    } else{
      return getConta(nome).checarSenha(senha);
    }
  }
}