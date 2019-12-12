/************
* CS200
* Fall, 2019
* Luis Rosales
* Instructor: Y. Gutstein
* 
*HW9 Arrays Problem 5 due 11/13/2019
* File name: HW9P5ArrayplusMethods.java
************/


public class HW9P5ArrayplusMethods {

	public static void main(String[] args) {
		int[] arr1 = {10,3,5,6};
		int[] arr2 = {7,2,10};
		int[] arr3 = {11,2,9,4,1};

		System.out.println(bigDiff(arr1));
		System.out.println(bigDiff(arr2));
		System.out.println(bigDiff(arr3));
	}

	private static int bigDiff(int[] arr) {
		int min = arr[0], max = arr[0];
		for(int i = 1; i < arr.length; i++){
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
			/*
			 * Alternative way of finding max and min values
			 */
//			if(arr[i] < min)
//				min = arr[i];
//			if(arr[i] > max)
//				max = arr[i];
		}
		return max - min;
	}
}
