/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* #1 SortNumbers
* HW 05 06 due 10/09/2019
* File name: SortNumbers.java
************/

import java.util.Scanner;

public class SortNumbers
   {
      public static void displaySortedNumbers(int a, int b, int c)
      {  
         //int min, mid, max;
         if (a < b && b < c)
            System.out.println(a + " " + b + " " + c);
         else if (a < c && c < b)
            System.out.println(a + " " + c + " " + b);
         else if (b < a && a < c)
            System.out.println(b + " " + a + " " + c);
         else if (b < c && c < a)
            System.out.println(b + " " + c + " " + a); 
         else if (c < a && a < b)
            System.out.println(c + " " + a + " " + b);
         else
            System.out.println(c + " " + b + " " + a);
      }
      public static void main(String [] args)
      {
         Scanner numbers = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number1 = numbers.nextInt();
         
         System.out.print("Enter a number: ");
         int number2 = numbers.nextInt();
         
         System.out.print("Enter a number: ");
         int number3 = numbers.nextInt();
         
         displaySortedNumbers(number1, number2, number3);
         
      }
   }