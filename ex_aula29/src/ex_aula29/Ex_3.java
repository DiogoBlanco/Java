package ex_aula29;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		System.out.println("Digite o primeiro valor:");
		A = sc.nextInt();

		System.out.println("Digite o segundo valor:");
		B = sc.nextInt();

		System.out.println("Digite o terceiro valor:");
		C = sc.nextInt();

		System.out.println("Digite o quarto valor:");
		D = sc.nextInt();

		int dif = (A * B - C * D);

		System.out.printf("A diferença entre os produtos de A e B, e C e D é: %d", dif);

		sc.close();
	}

}
