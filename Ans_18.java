// Program: Handle Multiple Exceptions using Try-Catch Blocks (with user input)
import java.util.Scanner;

public class Ans_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Example 1: Arithmetic Exception
            System.out.print("Enter two numbers (a and b): ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a / b; // Possible division by zero
            System.out.println("Result of division: " + result);

            // Example 2: Array Index Out of Bounds Exception
            System.out.print("Enter the size of array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter index to access: ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]); // Possible invalid index

            // Example 3: Null Pointer Exception
            sc.nextLine(); // clear buffer
            System.out.print("Enter a string (or type 'null' to simulate null): ");
            String str = sc.nextLine();
            
            if (str.equals("null")) {
                str = null; // manually make it null
            }
            System.out.println("Length of the string: " + str.length()); // Possible NullPointerException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero!");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception: Invalid index accessed!");
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Attempted to access a null object!");
        } 
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution completed. (finally block)");
        }

        sc.close();
    }
}
