// Write a Java program to find the factorial of a number using recursion.
import java.util.Scanner;
public class Ans_03 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number to find factorial.");
    int num=sc.nextInt();
    int factorialNum=factorial(num);
    System.out.println("Factorial of "+num+" is "+factorialNum);

  }
  
  static int factorial(int num){
    if(num==0||num==1){
      return 1;
    }
    else {
      return num*factorial(num-1);
    }
  }

}
