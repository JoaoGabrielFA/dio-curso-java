import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class IBanco {
  private final Banco superBank = new Banco();

  public IBanco() {
    superBank.adicionarConta(new Conta("joao", "123"));
    superBank.adicionarConta(new Conta("luis", "321"));
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
          bemVindo(superBank.getConta(nome));
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
        superBank.adicionarConta(new Conta(nome, senha));
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!\nNome: " + nome);
        iniciar();
      } else if (opcaoSenha == 1) {
        iniciar();
      }
    } else if (opcaoNome == 1) {
      iniciar();
    }
  }

  void bemVindo(Conta conta) {
    String[] opcoes = { "Sair", "Fazer Transferência", "Fazer Depósito" };

    int resposta = JOptionPane.showOptionDialog(
        null,
        "O seu saldo é " + formatarValor(conta.getSaldo()) + "\nO que gostaria de fazer?",
        "Bem vindo " + conta.getNomeTitular(),
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[0]);

    switch (resposta) {
      case 0 -> iniciar();
      case 1 -> fazerTransferencia(conta);
      case 2 -> fazerDeposito(conta);
    }
  }

  void fazerTransferencia(Conta conta) {
    JTextField campoValorTransferencia = new JTextField();

    int opcaoTransferencia = JOptionPane.showOptionDialog(
        null,
        new Object[] { "Digite o valor da transferência:", campoValorTransferencia },
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[] { "Continuar", "Voltar" },
        "Continuar");

    double valorTransferencia = Double.parseDouble(campoValorTransferencia.getText());

    if (opcaoTransferencia == 0) {
      JTextField campoContaParaTransferir = new JTextField();

      int opcaoContaParaTransferir = JOptionPane.showOptionDialog(
          null,
          new Object[] { "Para quem você gostaria de transferir?", campoContaParaTransferir },
          null,
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.INFORMATION_MESSAGE,
          null,
          new Object[] { "Transferir", "Voltar" },
          "Transferir");

      Conta contaParaTransferir = superBank.getConta(campoContaParaTransferir.getText());

      if (opcaoContaParaTransferir == 0) {
        if (contaParaTransferir != null) {
          if (conta.transferir(contaParaTransferir, valorTransferencia)) {
            JOptionPane.showMessageDialog(null, "Transferência de " + formatarValor(valorTransferencia) + " para "
                + contaParaTransferir.getNomeTitular() + " feita com sucesso!");
          } else {
            JOptionPane.showMessageDialog(null, "Saldo Insuficiente!");
          }
        } else {
          JOptionPane.showMessageDialog(null, "Conta não encontrada!");
        }
      }
    }

    bemVindo(conta);
  }

  void fazerDeposito(Conta conta) {
    JTextField campoValorDeposito = new JTextField();

    int opcao = JOptionPane.showOptionDialog(
        null,
        new Object[] { "Digite o valor do depósito:", campoValorDeposito },
        null,
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        new Object[] { "Depositar", "Voltar" },
        "Depositar");

    double valorDeposito;

    if (opcao == 0) {
      try {
        valorDeposito = Double.parseDouble(campoValorDeposito.getText());
  
        if (valorDeposito > 0) {
          conta.depositar(valorDeposito);
          JOptionPane.showMessageDialog(null, "Valor de " + formatarValor(valorDeposito) + " foi depositado na sua conta!");

        } else if (valorDeposito == 0) {
          JOptionPane.showMessageDialog(null, "O valor do depósito não pode ser 0!");
        } else {
          JOptionPane.showMessageDialog(null, "O valor do depósito não pode ser negativo!");
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor inválido!");
      }
    }

    bemVindo(conta);
  }

  String formatarValor(double valor) {
    DecimalFormat df = new DecimalFormat("#,##0.00");
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
    symbols.setDecimalSeparator(',');
    symbols.setGroupingSeparator('.');
    df.setDecimalFormatSymbols(symbols);

    String saldoFormatado = "R$" + df.format(valor);
    return saldoFormatado;
  }
}