// Write a Java program to sort an ArrayList of integers in ascending and descending order.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Ans_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'done' to finish.");
            }
        }

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted in ascending order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + numbers);

        scanner.close();
    }
}