// Write a Java class `Car` with attributes like make, model, and year, and methods like start() and stop().
import java.util.Scanner;

public class Ans_11 {
  public static void main(String[] args){ // Added throws
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter car make: ");
    String make = sc.nextLine();
    System.out.print("Enter car model: ");
    String model = sc.nextLine();
    System.out.print("Enter car year: ");
    int year = sc.nextInt();

    Car myCar = new Car(make, model, year);
    myCar.start();

    // Thread.sleep(2000); // Simulate some driving time
    System.out.println("Driving the car...");
    // Thread.sleep(2000); // Simulate more driving time

    myCar.stop();
    sc.close();
  }
}

class Car {
  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void start() {
    System.out.println("Car started: " + year + " " + make + " " + model);
  }

  public void stop() {
    System.out.println("Car stopped.");
  }
}
