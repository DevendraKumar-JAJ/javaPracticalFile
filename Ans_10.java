// Write a Java program to display all prime numbers between 1 and n.
import java.util.Scanner;
public class Ans_10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the upper limit (n): ");
    int n = scanner.nextInt();
    System.out.println("Prime numbers between 1 and " + n + " are:");
    for (int num = 2; num <= n; num++) {
      if (isPrime(num)) {
        System.out.print(num + " ");
      }
    }
    scanner.close();
  }
  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
