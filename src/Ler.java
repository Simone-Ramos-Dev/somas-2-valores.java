import java.util.Locale;
import java.util.Scanner;
public class Ler  {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    Scanner scanner = new Scanner(System.in);

    double produto1, produto2;
    double soma = 0;

            System.out.println("Digite o valor do produto1: ");
            produto1 = scanner.nextDouble();

        System.out.println("Digite o valor do produto2: ");
        produto2 = scanner.nextDouble();

        soma = produto1 + produto2;

        System.out.printf("A soma dos produtos é %.2f" ,  soma);
        }
    }
