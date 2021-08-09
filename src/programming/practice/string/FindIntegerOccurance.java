package programming.practice.string;

public class FindIntegerOccurance {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 2, 2, 5, 5, 5, 5, 5, 6, 6, 7 };

		int lastIndex = findInteger(a, 2, false);
		int firstIndex = findInteger(a, 2, true);

		if (firstIndex != -1 && lastIndex != -1) {
			int result = lastIndex - firstIndex + 1;
			System.out.println(result);
		}

	}

	private static int findInteger(int[] a, int x, boolean serachFirst) {
		int result = -1;
		int left = 0;
		int length = a.length;
		int right = length;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (x == a[mid]) {
				result = mid;
				if (serachFirst) {
					// first occurance
					right = mid - 1;
				} else {
					// last occurance
					left = mid + 1;
				}
			} else if (x < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return result;
	}
}
