import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero; 
        String agencia;
        String nomeCliente;
        Double saldo;

        System.out.println("Insira o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Insira o numero da agencia: ");
        sc.nextLine();
        agencia = sc.nextLine();

        System.out.println("Insira o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Insira o saldo da conta: ");
        saldo = sc.nextDouble();



        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para o saque.");
    }
}
