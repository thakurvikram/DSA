package dsa.learning.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] A = { 2, 5, 7, 3, 9, 1 };
		mergeSort(A);

		for (Integer i : A) {
			System.out.println(i);
		}
	}

	public static int[] mergeSort(int[] a) {
		if (a == null)
			return a;
		if (a.length < 2)
			return a;

		int l = a.length;
		int mid = l / 2;

		int[] left = new int[mid];
		int[] right = new int[l - mid];

		for (int i = 0; i < left.length; i++) {
			left[i] = a[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = a[mid];
			mid++;
		}

		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right, a);

	}

	public static int[] merge(int[] l, int[] r, int[] a) {
		int lLength = l.length;
		int rLength = r.length;
		int length = a.length;

		int i = 0;
		int j = 0;
		int k = 0;

		for (; k < length; k++) {
			if (l[i] <= r[j]) {
				a[k] = l[i];
				i++;
				k++;
			} else if (l[i] > r[j]) {
				a[k] = r[j];
				j++;
				k++;
			}
			while (i < lLength) {
				a[k] = l[i];
				i++;
				k++;
			}

			while (j < rLength) {
				a[k] = r[j];
				j++;
				k++;
			}
		}

		return a;
	}
}
