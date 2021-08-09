package dsa.learning.stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverse("vikram"));

	}

	private static String reverse(String str) {

		Stack<Character> stack = new Stack<Character>();
		char[] reverseString = new char[str.length()];

		char[] chars = str.toCharArray();
		for (char ch : chars) {
			stack.push(ch);
		}
		int i = 0;
		while (!stack.isEmpty()) {
			reverseString[i] = stack.pop();
			i++;
		}
		return new String(reverseString);
	}
}
