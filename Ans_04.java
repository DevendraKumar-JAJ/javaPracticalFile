// Write a Java program to check if a string is a palindrome.
import java.util.Scanner;
class Ans_04 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter sting : ");
    String str=sc.next();
    String revStr="";
    for(int i=str.length()-1;i>=0;i--){
      revStr=revStr+str.charAt(i);
    }

    if (str.equals(revStr)) {
        System.out.println(str + " is a palindrome.");
    } else {
        System.out.println(str + " is not a palindrome.");
    }
  }
}
