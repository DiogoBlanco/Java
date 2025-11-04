import java.util.Scanner;
import java.util.Locale;

public class Ex_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        sc.close();
    }
}
