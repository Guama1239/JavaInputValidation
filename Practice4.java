import java.util.Scanner;
public class Practice4
{
   public static void main (String[] args)
   {
      Scanner kbd = new Scanner(System.in);         
      System.out.println("How many problems? ");
      int times = kbd.nextInt();
      int correct =0, incorrect =0;
      for (int i = 1; i <= times; i++)
      {
         int num1 = (int)(Math.random()*101);
         int num2 = (int)(Math.random()*101);
         System.out.println("Problem "+ i + ": "+ num1 + "*" + num2 + "=?");
         int answer = kbd.nextInt();
         if (answer != num1*num2)
            {
               System.out.println("(Which is incorrect)");
               incorrect++;
            }
         else
            {
               System.out.println("(Which is correct)");
               correct++;
            }
      }
      System.out.println("Total Score: Correct: " + correct + "; Incorrect: " + incorrect);
      
   }
   
}