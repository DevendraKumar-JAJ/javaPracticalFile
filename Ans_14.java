// Write a Java program to remove duplicates from an ArrayList.
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
public class Ans_14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in the ArrayList:");
    int n = scanner.nextInt();
    List<Integer> list = new ArrayList<>();
    System.out.println("Enter the elements of the ArrayList:");
    for (int i = 0; i < n; i++) {
      list.add(scanner.nextInt());
    }
    System.out.println("Original ArrayList: " + list);
    Set<Integer> set = new LinkedHashSet<>(list);
    List<Integer> uniqueList = new ArrayList<>(set);
    System.out.println("ArrayList after removing duplicates: " + uniqueList);
    scanner.close();
  }
}
