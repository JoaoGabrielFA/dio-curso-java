package reprodutormusical;

import java.util.Scanner;
import utils.Gerenciador;
import static utils.Gerenciador.delay;

public class ReprodutorMusical {

  private Scanner console;
  private String[] artistas;
  private String[] albuns; 
  private String[] musicas;

  public ReprodutorMusical(Scanner console) {
    this.console = console;
  }

  public void Iniciar() {
    System.out.println("\nBem-vindo ao Reprodutor Musical\n");
    System.out.println("Escolha uma opção:");
    System.out.println("Digite 1 para acessar Playlists");
    System.out.println("Digite 2 para acessar Artistas");
    System.out.println("Digite 3 para acessar Músicas");
    System.out.println("Digite 4 para acessar Vídeos");
    System.out.println("Digite 0 para voltar ao menu\n");

    int opcao = console.nextInt();

    switch (opcao) {
      case 1:
        AcessarPlaylists();
        break;
      case 2:
        AcessarArtistas();
        break;
      case 3:
        AcessarMusicas();
        break;
      case 4:
        AcessarVideos();
        break;
      case 0:
        VoltarAoMenu();
        break;
      default:
        System.out.println("\nOpção inválida. Tente novamente.");
        delay(1000);
        Iniciar();
        break;
    }
  }

  private void AcessarPlaylists() {
    System.out.println("Acessando Playlists...");
    delay(1000);

    System.out.println("\nSelecione uma playlist:");
    System.out.println("1. Rock Classics");
    System.out.println("2. Pop Hits");
    System.out.println("3. Indie Essentials");
    System.out.println("4. 80's Greatest");
    System.out.println("5. Acoustic Vibes");
    System.out.println("0. Voltar ao Reprodutor Musical\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("\nEscutando: Rock Classics");
        break;
      case 2:
        System.out.println("\nEscutando: Pop Hits");
        break;
      case 3:
        System.out.println("\nEscutando: Indie Essentials");
        break;
      case 4:
        System.out.println("\nEscutando: 80's Greatest");
        break;
      case 5:
        System.out.println("\nEscutando: Acoustic Vibes");
        break;
      case 0:
        System.out.println("\nVoltando ao Reprodutor Musical");
        delay(1000);
        Iniciar();
        return;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        AcessarPlaylists();
        break;
    }

    ExibirOpcoesDeNavegacao("a playlist");
  }

  private void AcessarArtistas() {
    System.out.println("Acessando Artistas...");
    delay(1000);

    System.out.println("\nSelecione um artista:");
    System.out.println("1. Nirvana");
    System.out.println("2. Michael Jackson");
    System.out.println("3. Pink Floyd");
    System.out.println("4. The Beatles");
    System.out.println("5. AC/DC");
    System.out.println("0. Voltar ao Reprodutor Musical\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("\nEscutando: Nirvana");
        break;
      case 2:
        System.out.println("\nEscutando: Michael Jackson");
        break;
      case 3:
        System.out.println("\nEscutando: Pink Floyd");
        break;
      case 4:
        System.out.println("\nEscutando: The Beatles");
        break;
      case 5:
        System.out.println("\nEscutando: AC/DC");
        break;
      case 0:
        System.out.println("\nVoltando ao Reprodutor Musical");
        delay(1000);
        Iniciar();
        return;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        AcessarArtistas();
        break;
    }

    ExibirOpcoesDeNavegacao("o artista");
  }

  private void AcessarMusicas() {
    System.out.println("Acessando Músicas...");
    delay(1000);

    System.out.println("\nSelecione uma música:");
    System.out.println("1. Smells Like Teen Spirit - Nirvana");
    System.out.println("2. Billie Jean - Michael Jackson");
    System.out.println("3. Comfortably Numb - Pink Floyd");
    System.out.println("4. Hey Jude - The Beatles");
    System.out.println("5. Back in Black - AC/DC");
    System.out.println("0. Voltar ao Reprodutor Musical\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("\nTocando: Smells Like Teen Spirit - Nirvana");
        break;
      case 2:
        System.out.println("\nTocando: Billie Jean - Michael Jackson");
        break;
      case 3:
        System.out.println("\nTocando: Comfortably Numb - Pink Floyd");
        break;
      case 4:
        System.out.println("\nTocando: Hey Jude - The Beatles");
        break;
      case 5:
        System.out.println("\nTocando: Back in Black - AC/DC");
        break;
      case 0:
        System.out.println("\nVoltando ao Reprodutor Musical");
        delay(1000);
        Iniciar();
        return;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        AcessarMusicas();
        break;
    }

    ExibirOpcoesDeNavegacao("a música");
  }

  private void AcessarVideos() {
    System.out.println("Acessando Vídeos...");
    delay(1000);

    System.out.println("\nSelecione um vídeo famoso:");
    System.out.println("1. Charlie Bit My Finger");
    System.out.println("2. Evolution of Dance");
    System.out.println("3. Keyboard Cat");
    System.out.println("4. Nyan Cat");
    System.out.println("5. Gangnam Style");
    System.out.println("0. Voltar ao Reprodutor Musical\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("\nAssistindo: Charlie Bit My Finger");
        break;
      case 2:
        System.out.println("\nAssistindo: Evolution of Dance");
        break;
      case 3:
        System.out.println("\nAssistindo: Keyboard Cat");
        break;
      case 4:
        System.out.println("\nAssistindo: Nyan Cat");
        break;
      case 5:
        System.out.println("\nAssistindo: Gangnam Style");
        break;
      case 0:
        System.out.println("\nVoltando ao Reprodutor Musical");
        delay(1000);
        Iniciar();
        return;
      default:
        System.out.println("\nOpção inválida. Tente de novo.");
        delay(1000);
        AcessarVideos();
        break;
    }

    ExibirOpcoesDeNavegacao("o vídeo");
  }

  private void VoltarAoMenu() {
    System.out.println("\nVoltando ao menu...");
    delay(1000);
    Gerenciador.EscolherOpcao();
  }

  private void ExibirOpcoesDeNavegacao(String escolhaAtual) {
    System.out.println("\nO que você gostaria de fazer a seguir?");
    System.out.println("1. Escolher outra " + escolhaAtual);
    System.out.println("2. Voltar ao Reprodutor Musical");
    System.out.println("0. Voltar ao menu\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        if (escolhaAtual.equals("a playlist")) {
          AcessarPlaylists();
        } else if (escolhaAtual.equals("o artista")) {
          AcessarArtistas();
        } else if (escolhaAtual.equals("a música")) {
          AcessarMusicas();
        } else if (escolhaAtual.equals("o vídeo")) {
          AcessarVideos();
        }
        break;
      case 2:
        System.out.println("\nVoltando ao Reprodutor Musical...");
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
}
