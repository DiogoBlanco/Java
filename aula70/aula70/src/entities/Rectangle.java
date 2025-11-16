package entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(double width, double height) {
        return this.width * this.height;
    }

    public double perimeter(double width, double height) {
        return (this.width * 2) + (this.height * 2);
    }

    public double diagonal(double width, double height) {
        return (Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2)));
    }

}
