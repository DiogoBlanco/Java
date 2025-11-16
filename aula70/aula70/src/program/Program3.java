package program;

import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class Program3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter student name: ");
        student.name = sc.nextLine();
        System.out.println("Enter first note: ");
        student.firstNote = sc.nextDouble();
        System.out.println("Enter second note: ");
        student.secondNote = sc.nextDouble();
        System.out.println("Enter third note: ");
        student.thirdNote = sc.nextDouble();
        System.out.println();
        System.out.println(student.average(student.firstNote, student.secondNote, student.thirdNote));
    }
}
