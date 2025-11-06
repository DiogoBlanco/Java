import java.util.Scanner;

public class Exerc_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;
        System.out.println("Digite o código de abastecimento: ");
        int type = sc.nextInt();

        while (type != 4) {
            if (type == 1) {
                alcohol += 1;
            } else if (type == 2) {
                gasoline += 1;
            } else if (type == 3) {
                diesel += 1;
            }
            type = sc.nextInt();
        }
        System.out.println("Muito Obrigado!");
        System.out.println("Álcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
        sc.close();
    }
}
