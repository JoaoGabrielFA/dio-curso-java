import javax.swing.JOptionPane;

public class IBanco {
  public IBanco() {
  }

  public void iniciar() {
    int result = JOptionPane.showOptionDialog(
        null,
        "Escolha uma das opções abaixo:",
        "Bem vindo ao SuperBank!",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        new Object[] { "Logar", "Criar conta" },
        null);

    switch (result) {
      case 0:
        fazerLogin();
        break;
      case 1:
        criarConta();
        break;
      default:
        break;
    }
  }

  public void fazerLogin() {
    JOptionPane.showMessageDialog(null, "Logando...");
  }

  public void criarConta() {
    String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
    new Banco().adicionarCliente(new Cliente(nome));

    JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\nNome: " + nome);
  }

  public void opcaoInvalida() {
    int result = JOptionPane.showOptionDialog(
        null,
        "Opção inválida!",
        "ERRO!",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.ERROR_MESSAGE,
        null,
        new Object[] { "Tentar Novamente", "Fechar" },
        null);

    switch (result) {
      case 0:
        iniciar();
        break;
      default:
        break;
    }
  }
}