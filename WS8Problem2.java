/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS 8 Loops Problem 2 due 11/06/2019
* File name: WS8Problem2.java
************/

public class WS8Problem2
{
   public static void main (String[] args)
   {
      System.out.println(divideSelf(128));
      System.out.println(divideSelf(102));
      System.out.println(divideSelf(33222));
      System.out.println(divideSelf(39));
   }
   
   public static boolean divideSelf (int n)
   {
      boolean value = true;
      int m = n, r;
      
      while (value && m>0)
      {
         r = m%10;
         
         if ((r != 0) && (n%r == 0))
         {m/=10;}
         else {value = false;}
      }
      return value;
   }
}
