// Write a Java program that throws a custom exception if a negative number is entered.
import java.util.Scanner;
public class Ans_17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a positive number: ");
    int number = scanner.nextInt();

    try {
      if (number < 0) {
        throw new NegativeNumberException("Negative numbers are not allowed: " + number);
      } else {
        System.out.println("You entered a positive number: " + number);
      }
    } catch (NegativeNumberException e) {
      System.out.println("Error: " + e.getMessage());
    }
    scanner.close();
  }
}
class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}