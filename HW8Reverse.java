/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* HW 8 Arrays Problem 1 due 11/06/2019
* File name: HW8Reverse.java
************/

import java.util.Scanner;
public class HW8Reverse
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Enter 10 integers: ");
      int [] nums = new int[10];
      for (int i = 0; i < nums.length; i++)
      {
         nums[i]=kbd.nextInt();              
      }
      int ii = nums.length-1;
      System.out.print("using a do while loop, The reverse is: ");
      do
      {
         System.out.print(nums[ii] + " ");
         ii--;
      }while (ii >= 0);
      System.out.println();
      System.out.print("using a for loop, The reverse is: ");
      for (int i = nums.length-1; i >= 0; i--)
      {
         System.out.print(nums[i]+" ");
      }
   }
}
