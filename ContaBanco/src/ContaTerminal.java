import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String NomeCliente = scanner.nextLine();

        System.out.println("Digite o número da Agência: ");
        String Agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o saldo disponível: ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco. " + "Sua agência é: " + Agencia + ", conta: " + Numero + " e seu saldo: " + "R$" + Saldo + ", já está disponível para saque. ");
        
        scanner.close();
    }

}
