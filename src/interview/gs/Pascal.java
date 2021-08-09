package interview.gs;

public class Pascal {

	public static void main(String[] args) {
		int n = getPascalValue(6, 5);
		System.out.println(n);

	}

	private static int getPascalValue(int row, int col) {

		int[][] pascal;

		pascal = new int[row + 1][row + 1];
		pascal[0][0] = 1;
		pascal[1][0] = 1;
		pascal[1][1] = 1;

		for (int i = 2; i <= row; i++) {
			pascal[i][0] = 1;
			for (int j = 1; j < i; j++) {
				pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
			}
			pascal[i][i] = 1;
		}

		return pascal[row][col];
	}
}
