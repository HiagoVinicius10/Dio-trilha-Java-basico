import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
 //Criando um objeto Scanner para leitura dos dados
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite Número da conta: ");
        int conta = scanner.nextInt();

        System.out.println();
        double saldo = 237.6;

       
        



        //Imprimindo os dados obtidos pelo usuatio
        System.out.println(" Olá  " + nome + " " + sobrenome);
        System.out.println(" Obrigado por criar uma conta em nosso banco, sua conta é " + conta);
        System.out.println("Sua agência é " + agencia);
        System.out.println(" Seu saldo bancário é R$" + saldo);
    }
}