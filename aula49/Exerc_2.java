import java.util.Scanner;

public class Exerc_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite duas coordenadas: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro quadrante");
            } else {
                System.out.println("quarto quadrante");
            }
            System.out.println("Digite duas coordenadas: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}
