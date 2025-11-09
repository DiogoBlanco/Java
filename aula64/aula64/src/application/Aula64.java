import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Aula64 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double xArea = x.area();
        double yArea = y.area();

        System.out.printf("Triangle x area: %.4f%n", xArea);
        System.out.printf("Triangle y area: %.4f%n", yArea);

        if (xArea > yArea) {
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }
        sc.close();
    }
}
