import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class IBanco {
  private final Banco superBank = new Banco();

  public IBanco() {
    superBank.adicionarCliente(new Cliente("joao", "123"));
  }

  void iniciar() {
    int opcao = JOptionPane.showOptionDialog(
        null,
        "O que gostaria de fazer?",
        "Bem vindo ao SuperBank!",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.PLAIN_MESSAGE,
        null,
        new Object[] { "Logar", "Criar conta" },
        "Logar");

    if (opcao == 0) {
      fazerLogin();
    } else if (opcao == 1) {
      criarConta();
    }
  }

  void fazerLogin() {
    JPasswordField campoSenha = new JPasswordField();
    JTextField campoNome = new JTextField();
    String nome = null;
    String senha = null;

    int opcaoNome = JOptionPane.showOptionDialog(
        null,
        new Object[] { "Digite seu nome:", campoNome },
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[] { "Confirmar", "Voltar" },
        "Confirmar");

    if (opcaoNome == 0) {
      nome = campoNome.getText();

      int opcaoSenha = JOptionPane.showOptionDialog(
          null,
          new Object[] { "Digite sua senha:", campoSenha },
          null,
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.INFORMATION_MESSAGE,
          null,
          new Object[] { "Confirmar", "Voltar" },
          "Confirmar");

      if (opcaoSenha == 0) {
        senha = new String(campoSenha.getPassword());
        if (superBank.checarLogin(nome, senha)) {
          bemVindo(superBank.getCliente(nome));
        } else {
          JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!");
          iniciar();
        }
      } else if (opcaoSenha == 1) {
        iniciar();
      }
    } else if (opcaoNome == 1) {
      iniciar();
    }
  }

  void criarConta() {
    JPasswordField campoSenha = new JPasswordField();
    JTextField campoNome = new JTextField();
    String nome = null;
    String senha = null;

    int opcaoNome = JOptionPane.showOptionDialog(
        null,
        new Object[] { "Digite seu nome:", campoNome },
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[] { "Confirmar", "Voltar" },
        "Confirmar");

    if (opcaoNome == 0) {
      nome = campoNome.getText();

      int opcaoSenha = JOptionPane.showOptionDialog(
          null,
          new Object[] { "Digite sua senha:", campoSenha },
          null,
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.INFORMATION_MESSAGE,
          null,
          new Object[] { "Confirmar", "Voltar" },
          "Confirmar");

      if (opcaoSenha == 0) {
        senha = new String(campoSenha.getPassword());
        superBank.adicionarCliente(new Cliente(nome, senha));
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\nNome: " + nome);
        iniciar();
      } else if (opcaoSenha == 1) {
        iniciar();
      }
    } else if (opcaoNome == 1) {
      iniciar();
    }
  }

  void bemVindo(Conta cliente) {
    String[] opcoes = { "Ver Fatura", "Fazer Transferência", "Fazer Depósito" };

    int resposta = JOptionPane.showOptionDialog(
        null,
        "O seu saldo é R$: " + cliente.getSaldo() + "\nO que gostaria de fazer?",
        "Bem vindo " + cliente,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]);

    switch (resposta) {
      case 0:
        verFatura();
        break;
      case 1:
        break;
      case 2:
      fazerDeposito(cliente);
        break;
    }
  }

  private void verFatura() {
    throw new UnsupportedOperationException("Unimplemented method 'verFatura'");
  }

  void fazerDeposito(Conta cliente) {
    JTextField valorDeposito = new JTextField();

    int opcao = JOptionPane.showOptionDialog(
        null,
        new Object[] { "Digite o valor do depósito:", valorDeposito },
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[] { "Depositar", "Voltar" },
        "Depositar");

    if(opcao == 0){
      cliente.depositar(Double.parseDouble(valorDeposito.getText()));
    }

    bemVindo(cliente);
  }
}