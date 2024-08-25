package navegadorinternet;

import java.util.Scanner;
import utils.Mensagens;

public class NavegadorInternet {
    private Scanner console;
    private String[] emails; 

    public NavegadorInternet(Scanner console) {
        this.console = console;
        this.emails = new String[] {
            "1. Assunto: Reunião de Projeto",
            "2. Assunto: Atualização de Sistema",
            "3. Assunto: Convite para Evento",
            "4. Assunto: Oferta Especial",
            "5. Assunto: Relatório Mensal"
        };
    }

    public void Iniciar() {
        System.out.println("\nBem-vindo ao Navegador de Internet\n");
        System.out.println("Escolha uma opção:");
        System.out.println("Digite 1 para acessar o Google Maps");
        System.out.println("Digite 2 para acessar o Email");
        System.out.println("Digite 3 para acessar o Safari");
        System.out.println("Digite 0 para voltar ao menu\n");

        int opcao = console.nextInt();

        switch (opcao) {
            case 1:
                AcessarGoogleMaps();
                break;
            case 2:
                AcessarEmail();
                break;
            case 3:
                AcessarSafari();
                break;
            case 0:
                VoltarAoMenu();
                break;
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
                Iniciar();
                break;
        }
    }

    private void AcessarGoogleMaps() {
        System.out.println("\nAcessando Google Maps...");
        delay(1000);
        ExibirOpcoesDeNavegacao("Google Maps");
    }

    private void AcessarEmail() {
        System.out.println("\nAcessando Email...");
        delay(1000);
        System.out.println("\nSelecione um e-mail para ler:");
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("0. Voltar ao Navegador Internet\n");

        int escolha = console.nextInt();

        if (escolha >= 1 && escolha <= emails.length) {
            System.out.println("\nLendo e-mail: " + emails[escolha - 1] + "...");
        } else if (escolha == 0) {
            Iniciar();
        } else {
            System.out.println("\nOpção inválida. Tente de novo.");
            AcessarEmail();
        }
        ExibirOpcoesDeNavegacao("e-mail");
    }

    private void AcessarSafari() {
        System.out.println("\nAcessando Safari...");
        delay(1000);
        ExibirOpcoesDeNavegacao("Safari");
    }

    private void VoltarAoMenu() {
        System.out.println("\nVoltando ao menu...");
        Mensagens.EscolherOpcao(console);
    }

    private void ExibirOpcoesDeNavegacao(String escolhaAtual) {
        System.out.println("\nO que você gostaria de fazer a seguir?");
        System.out.println("1. Voltar ao " + escolhaAtual);
        System.out.println("2. Voltar ao Navegador Internet");
        System.out.println("0. Voltar ao menu\n");

        int escolha = console.nextInt();

        switch (escolha) {
            case 1:
                if (escolhaAtual.equals("Google Maps")) {
                    AcessarGoogleMaps();
                } else if (escolhaAtual.equals("e-mail")) {
                    AcessarEmail();
                } else if (escolhaAtual.equals("Safari")) {
                    AcessarSafari();
                }
                break;
            case 2:
                System.out.println("\nVoltando ao Navegador Internet");
                Iniciar();
                break;
            case 0:
                System.out.println("\nVoltando ao menu");
                VoltarAoMenu();
                break;
            default:
                System.out.println("\nOpção inválida. Tente de novo.");
                ExibirOpcoesDeNavegacao(escolhaAtual);
                break;
        }
    }

    private void delay(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}