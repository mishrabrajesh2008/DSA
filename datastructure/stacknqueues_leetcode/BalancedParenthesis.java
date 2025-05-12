package stacknqueues_leetcode;

import java.util.Stack;

public class BalancedParenthesis {

	public static boolean isBalancedParentheses(String testStr) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : testStr.toCharArray()) {
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					stack.pop();
				} else if (c == ')' && (stack.isEmpty() || stack.peek() != '(')) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void testAndPrint(String testStr, boolean expected) {
		// Run the test and store the result
		boolean result = isBalancedParentheses(testStr);

		// Print the test string, expected result, and actual result
		System.out.println("Test String: " + testStr);
		System.out.println("EXPECTED: " + expected);
		System.out.println("RESULT: " + result);

		// Check if the test passed or failed
		if (result == expected) {
			System.out.println("STATUS: PASS");
		} else {
			System.out.println("STATUS: FAIL");
		}

		// Print a separator for better readability
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		//testAndPrint("()", true);
		testAndPrint("()()", true);
		//testAndPrint("(())", true);
		//testAndPrint("()()()", true);
		//testAndPrint("(()())", true);
		//testAndPrint(")()(", false);
		//testAndPrint(")(", false);
		testAndPrint("(()", false);
		//testAndPrint("))", false);
		//testAndPrint("(", false);
		//testAndPrint(")", false);

	}

}
