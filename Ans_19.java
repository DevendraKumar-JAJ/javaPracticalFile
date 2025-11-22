// Write a Java program to read data from a file and print it on the console.
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;

public class Ans_19 {
    public static void main(String[] args) {
        String filePath = "input.txt"; // Specify the file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }         
}
