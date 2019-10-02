
import java.util.Scanner;
public class Week4Characters 
{
   public static void main(String [] args){
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter your 1st initial: ");
      String value = kbd.nextLine();
      
      char firstLetter = value.charAt(0);
      System.out.println(firstLetter);
      
      int length = value.length();
      System.out.println("Lenght of value: " + length);
      
      boolean isUpper = Character.isUpperCase(firstLetter);
      System.out.println(" Is Uppercase: " + isUpper);
      
      System.out.println(" To Lowercase: " + Character.toLowerCase(firstLetter));
      
      //escape characters
      System.out.println("Tav 1:\t\tSTART"); //tab
      System.out.println("Tav 11:\t\tSTART"); //tab
      System.out.println("Tav 111:\t\tSTART"); //tab
      System.out.println("Tav 1111:\t\tSTART"); //tab
      //see the pics I took on my iphone
   }
}   
