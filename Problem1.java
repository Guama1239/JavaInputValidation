/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* Problem 1 Problem1
* WS due 10/16/2019
* File name: Problem1.java
************/

import java.util.Scanner;

public class Problem1
   {
      public static void main (String [] args)
      {
         Scanner numbers = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number1 = numbers.nextInt();
         
         System.out.print("Enter a number: ");
         int number2 = numbers.nextInt();
         
         int result = maxMode5(number1, number2);  
         System.out.print("Return Value: " + result);
      }
      public static int maxMode5(int a, int b)
      {
         return a;
      }
   }