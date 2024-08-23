import java.util.Scanner;
import utils.Mensagens;

public class IPhone {
    private static Scanner console = new Scanner(System.in);
    private static Mensagens mensagens = new Mensagens();
    
    public static void main(String[] args) {
        BemVindo();
        console.close();
    }

    private static void BemVindo() {
        System.out.println("Olá, bem-vindo ao seu novo iPhone, o que você quer fazer?");
        mensagens.EscolherOpcao(console);
    }
}