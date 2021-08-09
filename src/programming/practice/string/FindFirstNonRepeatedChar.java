package programming.practice.string;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {
		char ch = getChar("vikramvi");
		System.out.println(ch);
	}

	private static char getChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				return str.charAt(i);
			}
		}
		return '0';
	}

}
