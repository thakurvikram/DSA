package programming.practice.string;

import java.util.HashSet;
import java.util.Set;

public class StringManipulation {

	public static void main(String[] args) {
		// System.out.println(reverseString1("vikram"));
		String str = "how to do in java";
		
		System.out.println(numDifferentIntegers("shdlashfl"));

		String[] split = str.split("\\s");
		StringBuffer sb = new StringBuffer();
		for (String s : split) {

			sb.append(reverse(s) + " ");
		}

		System.out.println(sb);
	}

	private static String reverseString(String str) {

		char[] chars = new char[str.length()];
		int n = str.length();
		for (int i = 0; i < n; i++) {
			chars[i] = str.charAt(n - 1 - i);
		}
		return new String(chars);
	}

	private static String reverseString1(String str) {
		// checks if the string is empty
		if (str.isEmpty()) {
			// System.out.println("String is empty.");
			// if the above condition is true returns the same string
			return str;
		} else {
			return reverseString1(str.substring(1)) + str.charAt(0);
		}
	}

	private static String reverse(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		} else {
			// System.out.print(str.charAt(str.length() - 1));
			return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
		}

	}

	public static int numDifferentIntegers(String word) {

		if (word == null)
			return 0;

		char[] chars = word.toCharArray();
		
		if (chars.length == 1) {
			if (Character.isAlphabetic(chars[0]))
				return 0;
			else
				return 1;

		}

		for (int i = 0; i < word.length(); i++) {
			if (Character.isAlphabetic(chars[i])) {
				chars[i] = ' ';
			}
		}

		word = new String(chars);
		String[] words = word.trim().split("\\s+");
        Set<Integer> set = new HashSet<Integer>();
        if(words.length > 1){
            for (String str : words) {
                set.add(Integer.parseInt(str));
            }
        }
		return set.size();
	}
}

/**
 * 
 * vikram
 * 
 * 
 */
