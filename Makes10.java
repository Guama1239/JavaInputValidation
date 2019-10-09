/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 2 Makes10
* WS5 due 10/09/2019
* File name: Makes10.java
************/

import java.util.Scanner;

public class Makes10
   {
      public static void main (String[] args)
      {
         Scanner numbers = new Scanner(System.in);
         System.out.print("First number: ");
         int firstNumber = numbers.nextInt();
         
         System.out.print("Second number: ");
         int secondNumber = numbers.nextInt();
         
         if (firstNumber + secondNumber == 10)
            System.out.println(firstNumber + " + " + secondNumber + " sums up to 10");
               else System.out.println("Does not sum up to 10");   
               if (firstNumber == 10 || secondNumber == 10)
               System.out.println("One number is 10");
         else System.out.println("Neither number is 10");
      }
   }
