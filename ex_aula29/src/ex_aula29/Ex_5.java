package ex_aula29;

import java.util.Scanner;

import java.util.Locale;

public class Ex_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int code1, quantity1, code2, quantity2;

		double price1, price2;

		System.out.println("Digite o código do produto 1:");
		code1 = sc.nextInt();
		System.out.println("Digite a quantidade do produto 1:");
		quantity1 = sc.nextInt();
		System.out.println("Digite o preço unitário do produto 1:");
		price1 = sc.nextDouble();

		System.out.println("Digite o código do produto 2:");
		code2 = sc.nextInt();
		System.out.println("Digite a quantidade do produto 2:");
		quantity2 = sc.nextInt();
		System.out.println("Digite o preço unitário do produto 2:");
		price2 = sc.nextDouble();

		double total = (quantity1 * price1) + (quantity2 * price2);

		System.out.printf("O total a pagar é: R$ %.2f%n", total);

	}
}