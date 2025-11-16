package program;

import entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();
        System.out.printf("AREA: %.2f%n", rectangle.area(rectangle.width, rectangle.height));
        System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter(rectangle.width, rectangle.height));
        System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal(rectangle.width, rectangle.height));

        sc.close();
    }

}
