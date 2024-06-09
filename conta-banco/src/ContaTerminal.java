
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero da conta:");
        int numero = scanner.nextInt();

        System.out.print("Digite o numero da agencia:");
        String agencia = scanner.next();

        System.out.print("Digite seu nome:");
        String nome = scanner.next();

        System.out.print("Digite o numero do saldo:");
        float saldo = scanner.nextFloat();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d e seu saldo %.2f ja esta disponavel para saque",nome,agencia,numero,saldo);
    }
}
