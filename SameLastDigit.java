/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 1 SameLastDigit
* WS5 due 10/09/2019
* File name: SameLastDigit.java
************/
import java.util.Scanner; // scanner to get user input

public class SameLastDigit
   {
      public static void main (String [] args)
      {
         Scanner kbd = new Scanner(System.in);// initializig scanner for user input
         
         System.out.print("First number: ");
         int number1 = kbd.nextInt();// get first integer
            
         System.out.print("Second number: ");
         int number2 = kbd.nextInt();// get second integer
         
         if ((number1 % 10) == (number2 % 10))
            System.out.println("Same last digit");
         else
            System.out.println("Different last digits");
         
      }
   }