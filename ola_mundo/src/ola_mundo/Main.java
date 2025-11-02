package ola_mundo;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		int idade = 31;
		String nome = "Maria";
		double renda = 4000.0;
		double x = 10.35784;
		
		Locale.setDefault(Locale.US);
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha %.2f reais%n.", nome, idade, renda);
	}

}
