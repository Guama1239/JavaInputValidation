/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*HW9 Arrays Problem 4 due 11/13/2019
* File name: HW9P4ArrayplusMethods.java
************/

public class HW9P4ArrayplusMethods
{
   public static void main (String[] args)
   {
      int [] nums1 = {1,2,3,4};int [] nums2 = {7,1,3,2,4,9};
      int [] nums3 = {1,22};//int [] nums4 = {};
      //System.out.println(makeMiddle(nums1));
      //System.out.println(makeMiddle(nums2));
      //System.out.println(makeMiddle(nums3));
      //System.out.print(makeMiddle(nums4));
      int[] result = makeMiddle(nums1);
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
			if(i < result.length - 1)
				System.out.print(", ");			
		}
		System.out.println();
		result = makeMiddle(nums2);
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
			if(i < result.length - 1)
				System.out.print(", ");			
		}
		System.out.println();
		result = makeMiddle(nums3);
		for(int i = 0; i < result.length; i++){
			System.out.print(result[i]);
			if(i < result.length - 1)
				System.out.print(", ");			
		}
	}


   
   public static int[] makeMiddle(int[] nums)
   {
      //int [] newarray = new int[2]; 
      int newindex = 0;
      newindex = (nums.length-1)/2;
      int [] result = new int[2];
      result[0]=nums[newindex];
      result[1]=nums[newindex+1];
      return result;
   }
}