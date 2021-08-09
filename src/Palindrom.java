
public class Palindrom {

	public static void main(String[] args) {

		String input = "eoogooe";

		int l = Integer.MIN_VALUE;
		String result = null;
		for (int i = 0; i < input.length() - 1; i++) {
			String subStr1 = longestPalindrome(input, i, i);
			if (subStr1.length() > l) {
				l = subStr1.length();
				result = subStr1;
			}
			String subStr2 = longestPalindrome(input, i, i + 1);
			if (subStr2.length() > l) {
				l = subStr2.length();
				result = subStr2;
			}
		}
		System.out.println(result);
	}

	private static String longestPalindrome(String str, int left, int right) {

		while (left >= 0 && right <= str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		return str.substring(left+1, right);
	}
}
