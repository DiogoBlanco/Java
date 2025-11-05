import java.util.Scanner;
import java.util.Locale;

public class Ex_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo, quantidade;
        double preco;

        System.out.println("Digite o código do produto:");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00 * quantidade;
        } else if (codigo == 2) {
            preco = 4.50 * quantidade;
        } else if (codigo == 3) {
            preco = 5.00 * quantidade;
        } else if (codigo == 4) {
            preco = 2.00 * quantidade;
        } else if (codigo == 5) {
            preco = 1.50 * quantidade;
        } else {
            preco = 0.0;
            System.out.println("Código de produto inválido.");
        }

        System.out.printf("Total: R$ %.2f%n", preco);

        sc.close();

    }
}
