/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW10 Problem 1 due 11/20/2019
* File name: HW10Problem1.java
************/

import java.util.Scanner;

public class HW10Problem1 // PRIMES
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a positive integer or 0 to finish: ");
      int num = kbd.nextInt();
      int count = 0;
      int endOf = (int)(Math.sqrt(num)); 
      while (num !=0)
      {
         for (int i=1; i <= endOf; i++)
         {
            if (num%i == 0)
            count++;
         }//for   
         if (count > 1)
         System.out.println("The number entered " + num + " is not a prime number !!!!");
         else System.out.println("The number " + num + " is a prime number");
      System.out.print("Enter a positive integer or 0 to finish: ");
      num = kbd.nextInt();
      endOf = (int)(Math.sqrt(num));
      count = 0;
      }// while
      
   }//main
   
}//
