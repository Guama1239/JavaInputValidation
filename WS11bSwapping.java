//CS 200
//FALL 2019
//LUIS ROSALES
//INSTRUCTOR: Y. GUTSTEIN
//WS 11B
//DUE 12-04-2019
//FILE NAME: WS11bSwapping.java

import java.util.Scanner;

public class WS11bSwapping
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Total numbers to input? ");
      int total = kbd.nextInt();
      
      System.out.print("Enter numbers: ");
      int[] array = new int[total];
      for (int i=0; i < array.length; i++)
         array[i] = kbd.nextInt();
      
      array = swapEnds(array);
      for (int i = 0; i < array.length; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }
   
   public static int[] swapEnds(int[]nums)
   {
      int temp = nums[0];
      nums[0] = nums[nums.length-1];
      nums[nums.length-1] = temp;
      return nums;
   }
}