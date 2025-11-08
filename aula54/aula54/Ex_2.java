import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite um número inteiro");
        int n = sc.nextInt(); // Número de repetições

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(); // Números a serem avaliados
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + "in");
        System.out.println(out + "out");
        sc.close();
    }
}
