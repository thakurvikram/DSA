package dsa.learning.stack;

import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args) {
		String str = "[{()}]123";
		System.out.println(isBalancesParanthesis(str));

	}

	private static boolean isBalancesParanthesis(String str) {

		char[] chars = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();

		for (char ch : chars) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
				continue;
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				Character pop = stack.pop();
				switch (ch) {
				case ')':
					if ('(' != pop)
						return false;
					break;
				case '}':
					if ('{' != pop)
						return false;
					break;
				case ']':
					if ('[' != pop)
						return false;
					break;
				}
			}
		}

		return true;
	}

}
