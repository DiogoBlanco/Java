package application;

import utils.CurrencyConverter;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        System.out.printf("%.2f%n", CurrencyConverter.dollarPrice);
        System.out.println("How many dollars to be bought?");
        double value = sc.nextDouble();
        System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.converter(value));

        sc.close();
    }
}
