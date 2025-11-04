import java.util.Scanner;
import java.util.Locale;

public class Ex_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número não negativo");
        }
        sc.close();
    }
}