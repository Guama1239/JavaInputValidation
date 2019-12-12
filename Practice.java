import java.util.Scanner;
public class Practice
{
   public static void main (String[] args)
   {
      int guess, digit1, digit2;
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a two digit number ");
      
      guess = kbd.nextInt();
      System.out.println(guess/10);
      System.out.println(guess%10); 
      System.out.println(2*3-3>2&&4-2>5); 
      System.out.println((2*3-3>2||4-2>5) || (2*3-3>2||4-2>5) && (2*3-3>2&&4-2>5)); 
      System.out.println((2*3-3>2||4-2>5) && (2*3-3>2||4-2>5) || (2*3-3>2&&4-2>5)); 
      System.out.println((2*3-3>2||4-2>5) && (2*3-3>2||4-2>5) && (2*3-3>2&&4-2>5)); 
      System.out.println(2*2-3>2^4-2>5); 
      System.out.println(Math.min(Math.max(2.5,4.6), Math.min(3,5.6)));
      System.out.println(Math.max(Math.max(2.5,4.6), Math.min(3,5.6)));
      System.out.println('a' < 'b');
      System.out.println('a' <= 'b');
      System.out.println('a' > 'b');
      System.out.println('a' >= 'b');
      System.out.println('a' == 'b');
      System.out.println('a'!=  'b');
      
      
   }
}