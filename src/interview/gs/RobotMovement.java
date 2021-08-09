package interview.gs;

public class RobotMovement {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 2 }, { 1, 3, 1 }, { 2, 1, 1 } };

		int maxSum = calMaxSum(arr);
		System.out.println(maxSum);
	}

	private static int calMaxSum(int[][] arr) {
		int[][] a = new int[arr.length][arr[0].length];

		a[2][0] = arr[2][0];
		for (int i = 1; i >= 0; i--) {
			a[i][0] = arr[i + 1][0] + arr[i][0];
		}

		for (int i = 1; i <= 2; i++) {
			a[2][i] = arr[2][i - 1] + arr[2][i];
		}

		for (int i = 1; i >= 0; i--) {
			for (int j = 1; j <= 2; j++) {
				a[i][j] = Math.max(a[i][j - 1], a[i + 1][j]) + arr[i][j];
			}
		}
		return a[0][2];
	}
}
