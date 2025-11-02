package ex_aula29;

import java.util.Scanner;
import java.util.Locale;

public class Ex_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite três números:");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        System.out.printf("Área do triângulo: %.3f%n", (A * C) / 2);
        System.out.printf("Área do círculo: %.3f%n", 3.14159 * C * C);
        System.out.printf("Área do trapézio: %.3f%n", ((A + B) * C) / 2);
        System.out.printf("Área do quadrado: %.3f%n", B * B);
        System.out.printf("Área do retângulo: %.3f%n", A * B);

        sc.close();

    }
}