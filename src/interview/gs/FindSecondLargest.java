package interview.gs;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int n = getSecondLargest(a);
		System.out.println("second largest element is " + n);
		
		int n1 = getSecondLargest1(a);
		System.out.println("second largest element is " + n1);
	}

	private static int getSecondLargest(int[] a) {
		int largest = a[0];
		int secondLargest = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		return secondLargest;
	}

	private static int getSecondLargest1(int[] a) {
		Arrays.sort(a);
		return a[a.length-2];
	}
}
