package utils;

import aparelhotelefonico.AparelhoTelefonico;
import java.util.Scanner;
import navegadorinternet.NavegadorInternet;
import reprodutormusical.ReprodutorMusical;

public class Gerenciador {

  private static final Scanner console = new Scanner(System.in);
  private static final ReprodutorMusical rm = new ReprodutorMusical(console);
  private static final AparelhoTelefonico at = new AparelhoTelefonico(console);
  private static final NavegadorInternet ni = new NavegadorInternet(console);

  public static void EscolherOpcao() {
    System.out.println("\nO que você quer fazer?\n");
    System.out.println("Digite 1 para acessar o Reprodutor Musical");
    System.out.println("Digite 2 para acessar o Aparelho Telefônico");
    System.out.println("Digite 3 para acessar o Navegador de Internet");
    System.out.println("Digite 0 para desligar o iPhone\n");

    int escolha = console.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("\nAcessando Reprodutor Musical...");
        delay(1000);
        rm.Iniciar();
        break;
      case 2:
        System.out.println("\nAcessando Aparelho Telefonico...");
        delay(1000);
        at.Iniciar();
        break;
      case 3:
        System.out.println("\nAcessando Navegador de Internet...");
        delay(1000);
        ni.Iniciar();
        break;
      case 0:
        console.close();
        System.exit(0);
      default:
        System.out.println("\nOpção inválida. Tente novamente.");
        EscolherOpcao();
        break;
    }
  }

  public static void delay(int milissegundos) {
    try {
      Thread.sleep(milissegundos);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}