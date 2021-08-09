package programming.practice.matrix;

public class SpiralTraverse {

	public static void main(String[] args) {
		int a[][] = { 
				{ 1, 2, 3, 4, 5, 6 }, 
				{ 7, 8, 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16, 17, 18 },
				{ 19, 20, 21, 22, 23, 24 } };

		spiralPrint(a);
	}

	private static void spiralPrint(int[][] matrix) {
		int top = 0, left = 0;
		int down = matrix.length - 1;
		int right = matrix[0].length - 1;

		int dir = 0;

		while (top <= down && left <= right) {
			if (dir == 0) {// left->right
				for (int j = left; j <= right; j++) {
					System.out.print(matrix[top][j] + " ");
				}
				top++;
				dir = 1;
			}
			if ((top <= down && left <= right) && dir == 1) {// up->down
				for (int j = top; j <= down; j++) {
					System.out.print(matrix[j][right] + " ");
				}
				right--;
				dir = 2;
			}
			if ((top <= down && left <= right) && dir == 2) {// right->left
				for (int j = right; j >= left; j--) {
					System.out.print(matrix[down][j] + " ");
				}
				down--;
				dir = 3;
			}
			if ((top <= down && left <= right) && dir == 3) {// down->up
				for (int j = down; j >= top; j--) {
					System.out.print(matrix[j][left] + " ");
				}
				left++;
				dir = 0;
			}
		}
	}

}
