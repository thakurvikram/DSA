package interview.gs;

public class RainWater {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 2, 1, 0,
                1, 3, 2, 1, 2, 1};
		int result = maxRainWater(arr);
		System.out.println(result);
	}

	private static int maxRainWater(int[] arr) {

		int[] left = new int[arr.length];
		int[] right = new int[arr.length];

		int minl = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			minl = Math.max(minl, arr[i]);
			left[i] = minl;
		}

		int minr = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			minr = Math.max(minr, arr[i]);
			right[i] = minr;
		}

		int res = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			res = res + Math.min(left[i], right[i]) - arr[i];
		}
		
		return res;
	}

}
