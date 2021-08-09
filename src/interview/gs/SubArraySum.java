package interview.gs;

import java.util.Arrays;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 1, 3, 4, 2 };
		int n = getSubArrayHavingSum(a, 7);
		System.out.println(n);
	}

	private static int getSubArrayHavingSum(int[] a, int k) {

		int[] r = new int[a.length];
		Arrays.fill(r, Integer.MAX_VALUE);
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (k == sum) {
					r[i] = j - i + 1;
				}
			}
		}
		Arrays.parallelSort(r);
		return r[0];
	}
}
