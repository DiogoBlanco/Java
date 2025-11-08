import java.util.Scanner;
import java.util.Locale;

public class Ex_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas vezes quer realizar os casos de teste: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite 3 números decimais: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            double media = (x * 2 + y * 3 + z * 5) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
