package programming.practice.string;

import java.util.Arrays;
import java.util.List;

public class Visa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("google".substring(0,1));
		//System.out.println(minStart(Arrays.asList(10, -5, 4, -2, 3, 1, -1, -6, -1, 0, 5)));
		//System.out.println(minStart(Arrays.asList(-4,3,2,1)));
	}

	public static long minStart(List<Integer> arr) {
		// Write your code here
		int startVal = 1;
		int result = 0;

		// result = startVal;
		for (int i = 4; i < 100; i++) {
			result = result +i;
			for (Integer val : arr) {
				result = result + val;
				System.out.println(result);
			}
			if (result == 1)
				return startVal;
			else
				startVal++;
			System.out.println();
		}

		return startVal;
	}

}
