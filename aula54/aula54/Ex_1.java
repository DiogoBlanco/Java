// Mostra todos os números ímpares conforme o número de repetições, começando em 1 e aumentando em 1.

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int x = sc.nextInt(); // Número de repetições

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
