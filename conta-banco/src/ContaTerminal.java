import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String Agencia;
        String NomeCliente;
        int Numero;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome !");
        NomeCliente = sc.next();
        
        System.out.println("Por favor, digite o número da agência !");
        Agencia = sc.next();

        System.out.println("Por favor, digite o número da conta !");
        Numero = sc.nextInt();

        System.out.println("Por favor, digite o saldo da conta !");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo de R$ " + Saldo + " já está disponível para saque.");
    }
}
