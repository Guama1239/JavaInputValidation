/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW 8 Arrays Problem 2 due 11/06/2019
* File name: HW8Identical.java
************/

import java.util.Scanner;
public class HW8Identical
{
   public static void main (String [] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter the list length: ");
      int llength = kbd.nextInt();
      int [] list1 = new int[llength];
      
      System.out.print("Enter list 1: ");
      for (int i = 0; i < list1.length; i++)
      {
         list1[i] = kbd.nextInt();
      }
      int [] list2 = new int[llength];
      
      System.out.print("Enter list 2: ");
      for (int i = 0; i < list2.length; i++)
      {
         list2[i] = kbd.nextInt();
      }
      boolean identical = true;
      for (int i = 0; i < list1.length; i++)
      {
         if (list1[i] != list2[i])
            identical = false; //if statements with only one line of commande do not need curly braces {}
      }
      if (identical)
         System.out.print("The lists are identical.");
          else System.out.print("The lists are not identical. ");
   }
}