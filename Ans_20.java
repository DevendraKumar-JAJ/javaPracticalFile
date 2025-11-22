// Write a Java program to append text to an existing file and display it
import java.io.*;
import java.util.Scanner;

public class Ans_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = "output.txt";

        try {
            System.out.print("Enter text to append: ");
            String text = sc.nextLine();

            // Append text to file
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(text);
            bw.newLine();
            bw.close();

            System.out.println("\nText appended successfully.\nFile content:");
            
            // Read and display file content
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } 
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
