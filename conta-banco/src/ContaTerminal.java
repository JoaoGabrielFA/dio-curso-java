import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int Numero = 1021;
        String Agencia = "067-8";
        String NomeCliente = "MARIO ANDRADE";
        double Saldo = 237.48;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numeroDigitado = sc.nextInt();
        if (numeroDigitado == Numero) {
            System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$ " + Saldo + " já está disponível para saque.");
        } else {
            System.out.println("Conta não encontrada");
        }
    }
}
