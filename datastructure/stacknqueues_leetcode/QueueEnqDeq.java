package stacknqueues_leetcode;

import java.util.Stack;

//Queue enqueue using Stack
public class QueueEnqDeq {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public QueueEnqDeq() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public int peek() {
		return stack1.peek();
	}

	public boolean isEmpty() {
		return stack1.isEmpty();
	}

	public void enqueue(int value) {
		while (!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(value);

		while (!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}

	public Integer dequeue() {
		if(isEmpty()) return null;
		else {
			return stack1.pop();
		}
		
	}
	
	public static void main(String[] args) {
		// Create a new queue
		QueueEnqDeq q = new QueueEnqDeq();

		// Enqueue some values
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		

		// Output the front of the queue
		System.out.println("Front of the queue: " + q.peek());

		// Check if the queue is empty
		System.out.println("Is the queue empty? " + q.isEmpty());
		
		System.out.println("Value of dequeue: "+q.dequeue());

	}

}
