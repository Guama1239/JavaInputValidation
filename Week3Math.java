/****************
* Luis Rosales
* CS200
* Fall 2019**/

public class Week3Math
{
   public static void main(String[]args)
   {
      int start = 5;
      int max = 10;
      int end = (max - start) +1;
      
      int rand = (int)(Math.random() * end) + start;
      System.out.println(rand);
      
      rand = (int)(Math.random() * end) + start;
      System.out.println(rand);
      
      rand = (int)(Math.random() * end) + start;
      System.out.println(rand);
      
      rand = (int)(Math.random() * end) + start;
      System.out.println(rand);
      
      System.out.println(Math.max(1, 2));
      
   } 
}