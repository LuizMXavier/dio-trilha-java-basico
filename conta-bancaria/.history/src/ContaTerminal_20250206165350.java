import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        int numero = scanner.next();

        
        System.out.println("Digite seu agência: ");
        String agencia = scanner.next();

        
        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Ola, me chamo " + nome);
    }
}
