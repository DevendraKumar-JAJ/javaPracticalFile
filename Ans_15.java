// Write a Java program to iterate over a Set and display its elements.
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
class Ans_15 {
  public static void main(String[] args) {
    Set<String> mySet = new HashSet<>();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter elements to add to the set (type 'exit' to stop):");
    while (true) {
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("exit")) {
        break;
      }
      mySet.add(input);
    }
    System.out.println("Elements in the set:");
    Iterator<String> iterator = mySet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    scanner.close();
  }
}