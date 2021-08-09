package dsa.learning.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[] A = { 2, 5, 7, 3, 9, 1 };
		insertionSort(A);

		for (Integer i : A) {
			System.out.println(i);
		}

	}

	public static int[] insertionSort(int[] A) {
		int n = A.length;
		for (int i = 1; i <= n - 1; i++) {
			int key = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;

		}
		return A;
	}
}
