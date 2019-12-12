public class Practice1
{
   public static void main (String[] args)
   {
      int[][]Array = createBoard();
      
   }
   public static int[][] createBoard()
   {
      int nums = 100;
      int[][] m = new int[10][10];
      for (int i = 0; i < m.length; i++)
         for (int j = 0; j < m[i].length; j++)
            if (i%2 == 0) 
            {
               m[i][j]=nums--;
               System.out.print(m[i][j]+" ");
               if (j == 9)
                  {
                  System.out.println();
                  nums=nums-9;
                  }
            }
            else
            {  
               // works well but some locations of matrix are print before being assigned a value
               //m[i][(m[i].length-1)-j]=nums--;
               //System.out.print(m[i][(m[i].length-1)-j]+ " ");
               //System.out.print(m[i][(m[i].length-1)-j]+ " ");
               /////////////////////////////////////////////////
               m[i][j]=nums++;//way better from here down!!!
               System.out.print(m[i][j]+" ");
               if (j == 9)
                  {
                  System.out.println();
                  nums=nums-11;
                  }
            }
      
      return m;
   }
}