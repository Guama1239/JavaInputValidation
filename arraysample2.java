public class arraysample2
{
   public static void main(String[] args)
   {
      String [] suits = {"Hearts","Clubs","Diamonds","Spades"};
      String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","J","Q","K"};
      for(int i = 1; i <=4;i++)
      {
         int randS = (int)(Math.random()*4);
         int randR = (int)(Math.random()*12);
         System.out.println("Card # " + i + "+" + suits[randS] + " " + ranks[randR]);
      }
   
      int [] nums = new int[5];
      for (int i = 0; i < nums.length; i++)
         nums[i]=(int)(Math.random()*10)+1;
      for (int i = 0; i < nums.length; i++)
         System.out.print(nums[i]+ " ");
   }
}