/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
* WS10 Problem 1 due 11/20/2019
* File name: WS10Problem1.java
************/

public class WS10Problem1
{
   public static void main (String [] args)
   {
      int[] b = {1,5,-4,5,-4,1,0};
      int[] b1 = noDuplicates(b);
      printArray(b1);
      
      int[] c = {2,2};
      int[] c1 = noDuplicates(c);
      printArray(c1);
      
      int[] d = {-2,8,9};
      int[] d1 = noDuplicates(d);
      printArray(d1);
      
   }
   
   public static int[] noDuplicates (int[] arr)
   {
      int Ndcount=0,count=0,endOfInner=0;
      int[]Nd = new int[arr.length];
      
      
      for (int indexz = 0; indexz < arr.length; indexz++)
      {
      endOfInner += ((arr.length - arr.length)+1);
      for (int index = 0; index < endOfInner;index++)
      {
         if (arr[indexz] == arr[index])
         {
            count++;
         }//if
      }//for index
      if (count == 1)
      {
         Nd[Ndcount]=arr[indexz];
         Ndcount++;   
         count = 0;
      }//if
      else count = 0;
      }// for indexz
      return Nd;
   }
   
   public static void printArray(int[] a)
	{
		int i;
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}