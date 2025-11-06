import java.util.Scanner;

public class Exerc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correct_pw = 2002;
        System.out.println("Digite sua senha: ");
        int pw = sc.nextInt();
        while (pw != correct_pw) {
            System.out.println("Senha Inválida");
            pw = sc.nextInt(); // Pede novamente
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
