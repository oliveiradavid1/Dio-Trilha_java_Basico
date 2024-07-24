
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {


        String nome;
        int numeroConta;
        String agencia;
        double saldo;

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nùmero da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        nome = scanner.next();

        System.out.println("Digite o saldo que deseja adicionar à conta: ");
        saldo = scanner.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + "e seu saldo de " + saldo + " já está disponível para saque!");
    }
    
}
