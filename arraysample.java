public class arraysample
{
   public static void main(String[] args)
   {
      int [] nums = new int[5];
      for (int i = 0; i < nums.length; i++)
         nums[i]=(int)(Math.random()*10)+1;
      for (int i = 0; i < nums.length; i++)
         System.out.print(nums[i]+ " ");
   }
}