
import java.util.*; 
  
class RadixCS201 { 
  
    // A utility function to get maximum value in arr[] 
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    // A function to do counting sort of arr[] according to 
    // the digit represented by exp. 
    static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to current digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    // The main function to that sorts arr[] of size n using 
    // Radix Sort 
    static void radixsort(int arr[], int n) 
    { 
        // Find the maximum number to know number of digits 
        int m = getMax(arr, n); 
  
        // Do counting sort for every digit. Note that instead 
        // of passing digit number, exp is passed. exp is 10^i 
        // where i is current digit number 
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
  
    // A utility function to print an array 
    static void print(int arr[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 
  
  
    /*Driver function to check for above function*/
    public static void main (String[] args) 
    { 
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66}; 
        int n = arr.length; 
        radixsort(arr, n); 
        print(arr, n); 
    } 
} 
/* This code is contributed by Luis Rosales  */
/*CountSort(int a[], int n, int pos)
{
   int Count[10] = {0};//Declaring Count array
   for (i = 0; 1 < n; i++)// first loop to count the frequency of elements
      ++Count[(a[i]/pos)%10];//dividing by pos and mode 10 will get us the digit we need
   for (i = 1; i <= k; i++)// second loop to update Count array
      Count[i] = Count[i]+Count[i-1];
   for (i = n-1; i >= 0; i--)// third loop to scan and order number from left to right in b array
      b[--Count((a[i]/pos)%10)] = a[i];     
   for (i = 0; i < n; i++)//to update or copy the elements newly sorted back to array a
      a[i]=b[i];
}

RedixSort(a, n)
{
   int max = getMax(a, n);
   for(pos=1; max/pos > 0; pos * 10)
   {
      CountSort(a, n, pos)     
   }
 }
   //****first pass
   //max = 677
   //pos = 1   
   //****second pass
   //max = 677
   //pos = pos * 10 = 10
   //max / pos = 67
   //****third pass
   //max = 677
   //pos = pos * 10 = 100
   //max / pos = 6
   
}