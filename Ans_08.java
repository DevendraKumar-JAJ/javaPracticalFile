// Write a Java program to find the sum of digits of a given number.
import java.util.Scanner;
public class Ans_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int sum = 0;

    while (number != 0) {
      int digit = number % 10;
      sum += digit;
      number /= 10;
    }

    System.out.println("The sum of the digits is: " + sum);
    sc.close();
  }
}
