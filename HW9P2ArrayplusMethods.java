/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*HW9 Arrays Problem 2 due 11/13/2019
* File name: HW9P2ArrayplusMethods.java
************/

public class HW9P2ArrayplusMethods
{
   public static void main (String[] args)
   {
      int [] nums1 = {1,2,3};int [] nums2 = {1,2,3,1};
      int [] nums3 = {1,22};int [] nums4 = {};
      System.out.println(sumAll(nums1));
      System.out.println(sumAll(nums2));
      System.out.println(sumAll(nums3));
      System.out.print(sumAll(nums4));
   }
   
   public static int sumAll(int[] nums)
   {
      int sum = 0;
      for (int i = 0; i < nums.length; i++)
         sum+= nums[i];
      return sum;
   }
}