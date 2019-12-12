/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*HW9 Arrays Problem 1 due 11/13/2019
* File name: HWArrayplusMethods.java
************/

public class HW9ArrayplusMethods
{
   public static void main (String[] args)
   {
      int [] nums1 = {1,2,3};int [] nums2 = {1,2,3,4,4,4,4,4,4,4,4,4,4,1};
      int [] nums3 = {1,2,1};int [] nums4 = {};
      System.out.println(sameFirstLast(nums1));
      System.out.println(sameFirstLast(nums2));
      System.out.println(sameFirstLast(nums3));
      System.out.print(sameFirstLast(nums4));
   }
   
   public static boolean sameFirstLast(int[] nums)
   {
      boolean value = false;
      if (nums.length !=0)
      {
         if (nums[0] == nums[(nums.length-1)])
         value = true;
      }
      return value;
   }
}