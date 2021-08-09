package programming.practice.string;

public class FizzBuzz {

	public static void main(String[] args) {
		// fizzBuzz(6);
		System.out.println(fillMissingBrackets("))?)?)?)())()(??((())(?)?())((((()(?"));

	}

	public static int fillMissingBrackets(String s) {

		int l = s.length();
		int result = 0;
		for (int i = 2; i <= l - 2;) {
			if (checkBalancedBrackets(s.substring(0, i)) + checkBalancedBrackets(s.substring(i, l)) ==0) {
				result++;
			}
			i = i + 2;
		}
		return result;

	}

	private static int checkBalancedBrackets(String s) {
		int round = 0;
		int square = 0;
		int wild = 0;

		System.out.println(s);
		char[] chars = s.toCharArray();
		for (Character ch : chars) {
			if ('(' == ch) {
				round++;
			} else if (')' == ch) {
				round--;
			} else if ('[' == ch) {
				square++;
			} else if (']' == ch) {
				square--;
			} else if ('?' == ch) {
				wild++;
			}
		}
		return (round +square) - wild;
	}
}
