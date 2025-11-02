package ex_aula29;

import java.util.Scanner;

import java.util.Locale;

public class Ex_2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;

		double radius;

		System.out.println("Digite o raio do círculo: ");

		radius = sc.nextDouble();

		double area = pi * (Math.pow(radius, 2));

		System.out.printf("A área de um círculo com %.2f de raio é de %.4f%n", radius, area);

		sc.close();

	}

}
