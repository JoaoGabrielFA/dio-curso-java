package aparelhotelefonico;

import java.util.ArrayList;
import java.util.Scanner;
import utils.Mensagens;

public class AparelhoTelefonico {
  private Scanner console;
  private ArrayList<String> favoritos;
  private ArrayList<String> recentes;
  private String[] contatos;
  private String[] fotos; 
  private String[] correioDeVoz;

  public AparelhoTelefonico(Scanner console) {
    this.console = console;
    this.favoritos = new ArrayList<>(); 
    this.recentes = new ArrayList<>(); 
    this.contatos = new String[] {
        "João Silva",
        "Maria Oliveira",
        "Pedro Souza",
        "Ana Costa",
        "Carlos Pereira"
    };
    this.fotos = new String[] {
        "Foto1.jpg",
        "Foto2.jpg",
        "Foto3.jpg",
        "Foto4.jpg",
        "Foto5.jpg"
    };
    this.correioDeVoz = new String[] {
        "Mensagem 1: Olá, como você está?",
        "Mensagem 2: Por favor, ligue-me de volta.",
        "Mensagem 3: Reunião marcada para amanhã.",
        "Mensagem 4: Lembrete de pagamento.",
        "Mensagem 5: Atualização do projeto."
    };
  }

  public void Iniciar() {
    System.out.println("\nBem-vindo ao Aparelho Telefonico\n");
    System.out.println("Escolha uma opção:");
    System.out.println("Digite 1 para acessar Favoritos");
    System.out.println("Digite 2 para acessar Recentes");
    System.out.println("Digite 3 para acessar Contatos");
    System.out.println("Digite 4 para acessar Correio de Voz");
    System.out.println("Digite 5 para acessar Fotos");
    System.out.println("Digite 0 para voltar ao menu\n");

    int opcao = console.nextInt();

    switch (opcao) {
      case 1:
        AcessarFavoritos();
        break;
      case 2:
        AcessarRecentes();
        break;
      case 3:
        AcessarContatos();
        break;
      case 4:
        AcessarCorreioDeVoz();
        break;
      case 5:
        AcessarFotos();
        break;
      case 0:
        Mensagens.EscolherOpcao(console);
        break;
      default:
        System.out.println("\nOpção inválida. Tente novamente.");
        Iniciar();
        break;
    }
    ExibirOpcoesDeNavegacao("menu principal");
  }

  private void AcessarFavoritos() {
    System.out.println("\nAcessando Favoritos...\n");
    delay(1000);
    if (favoritos.isEmpty()) {
      System.out.println("Nenhum favorito salvo.");
      DigitarParaVoltar();
    } else {
      for (int i = 0; i < favoritos.size(); i++) {
        System.out.println((i + 1) + ". " + favoritos.get(i));
      }
      DigitarParaVoltar();
    }
    VoltarAoMenu();
  }

  private void AcessarRecentes() {
    System.out.println("\nAcessando Recentes...\n");
    delay(1000);
    if (recentes.isEmpty()) {
      System.out.println("Nenhuma chamada recente.");
      DigitarParaVoltar();
    } else {
      for (int i = 0; i < recentes.size(); i++) {
        System.out.println((i + 1) + ". " + recentes.get(i));
      }
      DigitarParaVoltar();
    }
    VoltarAoMenu();
  }

  private void AcessarContatos() {
    System.out.println("\nAcessando Contatos...");
    delay(1000);
    System.out.println("\nSelecione um contato:");

    for (int i = 0; i < contatos.length; i++) {
      System.out.println((i + 1) + ". " + contatos[i]);
    }

    System.out.println("0. Voltar ao menu\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("\nSelecionado: " + contatos[escolha - 1]);
        delay(1000);
        AdicionarRecente(contatos[escolha - 1]);
        VerContato(contatos[escolha - 1]);
        break;
      case 0:
        VoltarAoMenu();
        return;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        AcessarContatos();
        break;
    }
    ExibirOpcoesDeNavegacao("contatos");
  }

  private void AcessarCorreioDeVoz() {
    System.out.println("\nAcessando Correio de Voz...\n");
    delay(1000);
    if (correioDeVoz.length == 0) {
      System.out.println("Nenhuma mensagem de correio de voz.");
      DigitarParaVoltar();
    } else {
      for (int i = 0; i < correioDeVoz.length; i++) {
        System.out.println((i + 1) + ". " + correioDeVoz[i]);
      }
      DigitarParaVoltar();
    }
    VoltarAoMenu();
  }

  private void AcessarFotos() {
    System.out.println("\nAcessando Fotos...\n");
    delay(1000);
    if (fotos.length == 0) {
      System.out.println("Nenhuma foto disponível.");
      DigitarParaVoltar();
    } else {
      for (int i = 0; i < fotos.length; i++) {
        System.out.println((i + 1) + ". " + fotos[i]);
      }
      DigitarParaVoltar();
    }
    VoltarAoMenu();
  }

  private void VoltarAoMenu() {
    System.out.println("\nVoltando ao menu...");
    delay(1000);
    Iniciar();
  }

  private void VerContato(String contato) {
    System.out.println("\nContato: " + contato);
    delay(1000);
    System.out.println("\nO que você gostaria de fazer?");
    if (favoritos.contains(contato)) {
      System.out.println("1. Remover " + contato + " dos favoritos");
    } else {
      System.out.println("1. Adicionar " + contato + " aos favoritos");
    }
    System.out.println("2. Ligar para " + contato);
    System.out.println("3. Enviar sms para " + contato);
    System.out.println("0. Voltar");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        if (favoritos.contains(contato)) {
          RemoverFavorito(contato);
        } else {
          AdicionarFavorito(contato);
        }
        break;
      case 2:
        System.out.println("\nLigando para " + contato + "...");
        delay(1000);
        break;
      case 3:
        System.out.println("\nEnviando SMS para " + contato + "...");
        delay(1000);
        break;
      case 0:
        VoltarAoMenu();
        break;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        VerContato(contato);
        break;
    }
    ExibirOpcoesDeNavegacao("contatos");
  }

  private void AdicionarRecente(String contato) {
    if (!recentes.contains(contato)) {
      recentes.add(0, contato);
    }
    if (recentes.size() > 5) {
      recentes.subList(5, recentes.size()).clear();
    }
  }

  private void AdicionarFavorito(String contato) {
    if (!favoritos.contains(contato)) {
      favoritos.add(0, contato);
      System.out.println("\nAdicionando " + contato + " aos favoritos...");
      delay(1000);
    } else {
      System.out.println("\nRemovendo " + contato + " dos favoritos...");
      delay(1000);
    }
    if (favoritos.size() > 5) {
      favoritos.subList(5, favoritos.size()).clear();
    }
  }

  private void RemoverFavorito(String contato) {
    favoritos.remove(contato);
  }

  private void ExibirOpcoesDeNavegacao(String escolhaAtual) {
    System.out.println("\nO que você gostaria de fazer a seguir?");
    System.out.println("1. Voltar aos " + escolhaAtual);
    System.out.println("2. Voltar ao Reprodutor Musical");
    System.out.println("0. Voltar ao menu\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        if (escolhaAtual.equals("favoritos")) {
          AcessarFavoritos();
        } else if (escolhaAtual.equals("recentes")) {
          AcessarRecentes();
        } else if (escolhaAtual.equals("contatos")) {
          AcessarContatos();
        } else if (escolhaAtual.equals("fotos")) {
          AcessarFotos();
        } else if (escolhaAtual.equals("correio de voz")) {
          AcessarCorreioDeVoz();
        }
        break;
      case 2:
        System.out.println("\nVoltando ao Aparelho Telefonico");
        delay(1000);
        Iniciar();
        break;
      case 0:
        VoltarAoMenu();
        break;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        ExibirOpcoesDeNavegacao(escolhaAtual);
        break;
    }
  }

  private void DigitarParaVoltar() {
    System.out.println("\nDigite qualquer botão para voltar.");
    console.next();
  }

  private void delay(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
