// Write a Java program to print the Fibonacci series up to N terms
import java.util.Scanner;
public class Ans_06 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of terms: ");
    int terms=sc.nextInt();
    int n1=0,n2=1;
    System.out.print("Fibonacci Series: ");
    for(int i=1;i<=terms;i++){
      System.out.print(n1+" ");
      int sum=n1+n2;
      n1=n2;
      n2=sum;
    }
  }
  
}
