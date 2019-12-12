/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*HW9 Arrays Problem 3 due 11/13/2019
* File name: HW9P3ArrayplusMethods.java
************/

public class HW9P3ArrayplusMethods
{
   public static void main (String[] args)
   {
      int [] nums1 = {1,2,3};int [] nums2 = {1,2,3,1};
      int [] nums3 = {1,22};int [] nums4 = {22,22};
      System.out.println(commonEnd(nums1, nums2));
      System.out.println(commonEnd(nums1, nums3));
      System.out.println(commonEnd(nums1, nums4));
      System.out.print(commonEnd(nums4, nums3));
   }
   
   public static boolean commonEnd(int[] a, int[] b)
   {
      boolean result = false;
      if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
         result = true;
      return result;
   }
}