// Write a Java program to print a pattern of stars (like a pyramid or diamond).
import java.util.Scanner;
public class Ans_07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows for the pyramid: ");
    int rows = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
      // Print spaces
      for (int j = rows; j > i; j--) {
        System.out.print(" ");
      }
      // Print stars
      for (int k = 1; k <= (2 * i - 1); k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    scanner.close();  
  }
}
