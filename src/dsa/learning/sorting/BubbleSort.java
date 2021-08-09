package dsa.learning.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] A = {2,5,7,3,9,1};
		bubbleSort(A);
		
		for(Integer i:A) {
			System.out.println(i);
		}

	}
	
	public static int[] bubbleSort(int[] A) {
		int n = A.length;

		int j =0;
		while(j < n-1) {
		for (int i = 0; i < n - 1; i++) {
			if (A[i + 1] < A[i]) {
				int temp = A[i];
				A[i] = A[i + 1];
				A[i + 1] = temp;
			}
		}
		j++;
	}
		return A;

	}

}

/**
 * BubbleSort(A){
 *  n = length of A
 *  while(j = 0 to n-1)
 *  for(i=0 to n-2){
 *  	if(A[i+1] < A[i])
 *  		{
 *  		//swap
 *  		temp = A[i]
 *  		A[i] = A[i+1]
 *  		A[i+1] = A[i]
 *  	}
 *  }
 *  }
 * 
 * 
 * 
 * 
 * 
 */
