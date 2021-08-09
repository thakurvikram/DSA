package programming.practice.matrix;

public class MaxStudents {

	public static void main(String[] args) {

		char[][] chars = {{'#','.','.','.','#'},
                {'.','#','.','#','.'},
                {'.','.','#','.','.'},
                {'.','#','.','#','.'},
                {'#','.','.','.','#'}};
		
		/*
		 * char[][] chars = {{'.','#'}, {'#','#'}, {'#','.'}, {'#','#'}, {'.','#'}};
		 */
		
		
		
		System.out.println(maxStudents(chars));

	}

	private static int maxStudents(char[][] chars) {

		int m = chars.length;
		int count = 0;

		for (int i = m - 1; i >= 0; i--) {
			for(int j = 1 ; j <= chars[i].length-2 ; j++) {
				if('.' == chars[i][j]) {
					updateAdjecentPlaces(chars, i, j);
				}
			}
		}
		
		for (int i = m - 1; i >= 0; i--) {
			for(int j = 0 ; j <= chars[i].length-1 ; j++) {
				if('.' == chars[i][j]) {
					count++;
				}
			}
		}
		return count;
	}

	private static void updateAdjecentPlaces(char[][] chars, int i, int j) {
		if (chars[i][j - 1] == '.')
			chars[i][j - 1] = '#';
		if (chars[i][j + 1] == '.')
			chars[i][j + 1] = '#';
		if (i != 0) {
			if (chars[i-1][j - 1] == '.')
				chars[i-1][j - 1] = '#';
			if (chars[i-1][j + 1] == '.')
				chars[i-1][j + 1] = '#';
		}
	}

}

/**
 * Given a m * n matrix seats that represent seats distributions in a classroom.
 * If a seat is broken, it is denoted by '#' character otherwise it is denoted
 * by a '.' character.
 * 
 * Students can see the answers of those sitting next to the left, right, upper
 * left and upper right, but he cannot see the answers of the student sitting
 * directly in front or behind him. Return the maximum number of students that
 * can take the exam together without any cheating being possible..
 * 
 * Students must be placed in seats in good condition.
 */
