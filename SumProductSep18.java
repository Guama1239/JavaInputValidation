/****************
* Luis Rosales
* CS200
* WS 03
* Fall 2019**/

import java.util.Scanner;

public class SumProductSep18
{
   public static void main(String[]args)
   {  
      Scanner kbd = new Scanner(System.in);
     
      System.out.print("What is your name? ");
      String fullName = kbd.nextLine();
      System.out.print("Enter two integers: ");
      
      int num1 = kbd.nextInt();
      int num2 = kbd.nextInt();
      int sum = num1 + num2;
      int product = num1 * num2;
      
      System.out.println(); // empty line
      System.out.println("Hi " + fullName + ". You entered " + num1 + " and " + num2);
      
      System.out.println("The product of " + num1 + " x " + num2 + " is " + product);
      System.out.println("The sum of " + num1 + " + " + num2 + " is " + sum);
   } 
}