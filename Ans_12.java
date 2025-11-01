// Create an interface `Shape` with methods `area()` and `perimeter()`. Implement this interface in classes `Circle` and `Rectangle`.
import java.util.Scanner;

public class Ans_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Circle input
    System.out.print("Enter radius of the circle: ");
    double radius = sc.nextDouble();
    Shape circle = new Circle(radius);
    System.out.println("Circle Area: " + circle.area());
    System.out.println("Circle Perimeter: " + circle.perimeter());

    // Rectangle input
    System.out.print("Enter length of the rectangle: ");
    double length = sc.nextDouble();
    System.out.print("Enter width of the rectangle: ");
    double width = sc.nextDouble();
    Shape rectangle = new Rectangle(length, width);
    System.out.println("Rectangle Area: " + rectangle.area());
    System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

    sc.close();
  }
}

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
