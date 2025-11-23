package application;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Quantos números você vai digitar? ");
        n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        System.out.println("VALORES: " + Arrays.toString(vect));

        double sum = 0;
        double average = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
            average = sum / vect.length;

        }

        System.out.printf("SOMA: %.2f%n", sum);
        System.out.printf("MÉDIA: %.2f%n", average);


        sc.close();
    }
}
