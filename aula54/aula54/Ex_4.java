import java.util.Scanner;
import java.util.Locale;

public class Ex_4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos pares de números: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite dois números inteiros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0) {
                System.out.println("Divisão Impossível");
            } else {
                double division = a / b;
                System.out.printf("%.1f%n", division);

            }
        }
        sc.close();
    }
}
