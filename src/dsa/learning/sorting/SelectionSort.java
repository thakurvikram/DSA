package dsa.learning.sorting;

public class SelectionSort {

	public static void main(String[] a) {
		
		int[] A = {4,7,2,6,1,5};
		selectionSort(A);

		for(Integer i : A) {
			System.out.println(i);
		}
		
	}
	
	public static int[] selectionSort(int A[]) {
		if (A.length == 0)
			return A;
		int n = A.length;
		for (int i = 0; i < n - 2; i++) {
			int min = i;
			for (int j = i + 1; j < n - 1; j++) {
				if (A[j] < A[min]) {
					min = j;
				}
			}
			// Swap
			int temp = A[i];
			A[i] = A[min];
			A[min] = temp;
		}
		return A;
	}
	
}

/**
 *Pseudo code
 *SelctionSor(A){
 *	n = length if A
 * for( i = 0 to n-2){
 * 	min = i
 * 	for(j = i +1 to n-1){
 * 		if(A[j] < A[min]){
 * 			min = j
 * 		}
 * 	//Swap A[min] and A[i]
 * 	temp  = A[i]
 *  A[i] = A[min]
 *  A[min] = temp
 *  }
 * } 
 * 
 * Time complexity - O(n^2) 
 * Space Complexity - O(n)
 * 
 */
