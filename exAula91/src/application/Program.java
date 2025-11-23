package application;

import entities.Rooms;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rooms[] vect = new Rooms[10]; // cria um array vazio de 10 posições;

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("RENT #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rooms(name, email); // cria um objeto com o nome e email, na posição do quarto escolhida no array de 10;
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) { // itera sobre o array de 10;
            if (vect[i] != null) { // se o array não for nulo;
                System.out.println(i + ": " + vect[i]); // Mostra o numero do quarto e as informações;
            }
        }

        sc.close();
    }
}
