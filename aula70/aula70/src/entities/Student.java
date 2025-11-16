package entities;

public class Student {
    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public double average(double firstNote, double secondNote, double thirdNote) {
        if (firstNote < 0 || firstNote > 30) {
            System.out.println("Invalid note, must be between 0 and 30;");
        } else if (secondNote < 0 || secondNote > 35) {
            System.out.println("Invalid note, must be between 0 and 35");
        } else if (thirdNote < 0 || thirdNote > 35) {
            System.out.println("Invalid note, must be between 0 and 35");
        }

        double avg = firstNote + secondNote + thirdNote;
        if (avg > 60) {
            System.out.printf("Final Grade: %.2f%n", avg);
            System.out.println("PASS");
        } else {
            System.out.printf("Final Grade: %.2f%n", avg);
            System.out.println("FAILED");
            System.out.println("Missing " + (60 - avg) + " points.");
        }
        return avg;

    }

}
