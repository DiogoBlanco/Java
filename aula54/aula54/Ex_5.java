import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro e calcularei o seu fatorial !: ");
        int n = sc.nextInt();
        int fatorial = 1;
        if (n == 0) {
            fatorial = 1;
        }

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
