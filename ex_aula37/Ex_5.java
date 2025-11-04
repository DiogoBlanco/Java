import java.util.Scanner;
import java.util.Locale;

public class Ex_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int código, quantidade;
        double preço;

        System.out.println("Digite o código do produto:");
        código = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        if (código == 1) {
            preço = 4.00 * quantidade;
        } else if (código == 2) {
            preço = 4.50 * quantidade;
        } else if (código == 3) {
            preço = 5.00 * quantidade;
        } else if (código == 4) {
            preço = 2.00 * quantidade;
        } else if (código == 5) {
            preço = 1.50 * quantidade;
        } else {
            preço = 0.0;
            System.out.println("Código de produto inválido.");
        }

        System.out.printf("Total: R$ %.2f%n", preço);

        sc.close();

    }
}
