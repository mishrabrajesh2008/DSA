package stacknqueues_leetcode;

import java.util.Stack;

public class ReverseString {

	public static String reverseString(String s) {

		Stack<Character> stack = new Stack<Character>();
		String reverseString = "";

		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
		}

		/*
		 * for(char c: s.toCharArray()) { stack.push(c); } //This is also valid
		 */ while (!stack.isEmpty()) {
			reverseString = reverseString + stack.pop();
		}
		return reverseString;
	}

	public static void main(String[] args) {
		String myString = "hello";
		String reversedString = reverseString(myString);
		System.out.println(reversedString);
	}

}
