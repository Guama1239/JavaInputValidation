/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 3 IsFactor
* WS5 due 10/09/2019
* File name: IsFactor.java
************/

import java.util.Scanner;

public class IsFactor
   {
      public static void main (String [] args)
      {
         Scanner numbers = new Scanner(System.in);
         System.out.print("Enter the first number: ");
         int number1 = numbers.nextInt();
         
         System.out.print("Enter the second number: ");
         int number2 = numbers.nextInt();
           
         if ((number1 <= number2) && (number2 % number1 == 0))
            System.out.println(number1 + " is a factor of " + number2);
         else if (number1 % number2 == 0)
                System.out.println(number2 + " is a factor of " + number1);
         
         else System.out.println(Math.min(number1,number2) + " is not a factor of " + Math.max(number1,number2));
         
      }
   }