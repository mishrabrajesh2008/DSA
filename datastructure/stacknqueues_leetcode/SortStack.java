package stacknqueues_leetcode;

public class SortStack {

	public static void sortStack(StackPop<Integer> stack) {
		StackPop<Integer> sortedStack = new StackPop<Integer>();
		
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			while(!sortedStack.isEmpty() && sortedStack.peek()>temp) {
				stack.push(sortedStack.pop());
			}
			sortedStack.push(temp);
		}
		while (!sortedStack.isEmpty()) {
            stack.push(sortedStack.pop());
        }
	}

	public static void main(String[] args) {
		StackPop<Integer> stack = new StackPop<>();
		stack.push(3);
		stack.push(1);
		stack.push(4);
		stack.push(2);

		System.out.println("Before sorting:");
		stack.printStack();

		sortStack(stack);

		System.out.println("\nAfter sorting:");
		stack.printStack();

	}

}
