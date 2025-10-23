// Write a Java program to check if a number is prime or not.
import java.util.Scanner;
class Ans_01{
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num=sc.nextInt();
    System.out.println("Entered number is : "+num);
    boolean isPrime = true;
    if(num<=1){
      isPrime = false;
    }
    else{
      for (int a=2; a<=Math.sqrt(num);a++){
        if(num%a==0){
          isPrime=false;
          break;
        }
      }
    }

    if(isPrime){
      System.out.println(num+" is a prime number");
    }else{
      System.out.println(num+" is a non-prime number");
    }
  }
}