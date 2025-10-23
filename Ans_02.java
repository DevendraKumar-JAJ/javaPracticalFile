// Write a Java program to reverse a given string.
import java.util.Scanner;
public class Ans_02 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str=sc.next();
    String revStr="";
    for(int i=str.length()-1;i>=0;i--){
      revStr=revStr+str.charAt(i);
    }
    System.out.println("Reverse of '"+str+"' string is '"+revStr+"'.");
  }

  
}
