/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW7 Loops Problem 1 due 10/23/2019
* File name: HW7ForLoops.java
************/

import java.util.Scanner;

public class HW7ForLoops
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a number greater than 1: ");
      
      int num = kbd.nextInt();
      int sum = 0;
      
      for (int i = 1; i <= num; i++)
      {
         sum = sum + i;
      }
      System.out.println("The sum is " + sum);
      
   }
}