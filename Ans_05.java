// Write a Java program to find the largest and smallest number in an array.
import java.util.Scanner;
public class Ans_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < 5; i++) {
          System.out.print(i+1+" : ");
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        int smallest = array[0];
        for (int i = 1; i < 5; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);
        scanner.close();
    }
}
