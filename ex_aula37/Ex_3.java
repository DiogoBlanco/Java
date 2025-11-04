import java.util.Scanner;
import java.util.Locale;

public class Ex_3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B;
        int divisao;

        System.out.println("Digite dois números inteiros:");
        A = sc.nextInt();
        B = sc.nextInt();
        if (B > A) {
            divisao = B / A;

        } else {
            divisao = A / B;

        }
        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números são múltiplos.");
        } else {
            System.out.println("Os números não são múltiplos.");
        }
        sc.close();
    }
}
