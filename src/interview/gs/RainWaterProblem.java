package interview.gs;

public class RainWaterProblem {

	public static void main(String[] args) {
		int[] a = { 3, 0, 2, 0, 4 };

		int n = getMaxWater(a);
		System.out.println(n);
	}

	private static int getMaxWater(int[] a) {

		int[] left = new int[a.length];
		int[] right = new int[a.length];

		left[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			left[i] = Math.max(left[i - 1], a[i]);
		}

		right[a.length-1] = a[a.length-1];
		for (int i = a.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], a[i]);
		}

		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result + Math.min(right[i], left[i]) - a[i];
		}
		return result;
	}

}
