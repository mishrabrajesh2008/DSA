package linkedlist_leetcode;

public class SwapNodePairLL {

	private Node head;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public SwapNodePairLL(int value) {
		Node newNode = new Node(value);
		head = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		StringBuilder output = new StringBuilder();
		while (current != null) {
			output.append(current.value).append(" -> ");
			current = current.next;
		}
		// Remove the last " -> " and print the result
		if (output.length() > 0) {
			output.setLength(output.length() - 4);
			System.out.println(output.toString());
		}
	}

	public void makeEmpty() {
		head = null;
		length = 0;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		length++;
	}

	public void swapPairs() {
		Node dummyNode = new Node(0);
		dummyNode.next = head;
		Node previousNode = dummyNode;

		while (head != null && head.next != null) {
			Node firstNode = head;
			Node secondNode = head.next;

			previousNode.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;

			secondNode.prev = previousNode;
			firstNode.prev = secondNode;

			if (firstNode.next != null) {
				firstNode.next.prev = firstNode;
			}

			head = firstNode.next;
			previousNode = firstNode;
		}

		head = dummyNode.next;
		if (head != null)
			head.prev = null;
	}

	public static void main(String[] args) {
		System.out.println("Test 1: Even number of nodes");
		SwapNodePairLL ll1 = new SwapNodePairLL(1);
		ll1.append(2);
		ll1.append(3);
		ll1.append(4);
		System.out.print("BEFORE: ");
		ll1.printList();
		ll1.swapPairs();
		System.out.print("AFTER:  ");
		ll1.printList();

		System.out.println("\nTest 2: Odd number of nodes");
		SwapNodePairLL ll2 = new SwapNodePairLL(1);
		ll2.append(2);
		ll2.append(3);
		ll2.append(4);
		ll2.append(5);
		System.out.print("BEFORE: ");
		ll2.printList();
		ll2.swapPairs();
		System.out.print("AFTER:  ");
		ll2.printList();

		System.out.println("\nTest 3: Single node");
		SwapNodePairLL ll3 = new SwapNodePairLL(1);
		System.out.print("BEFORE: ");
		ll3.printList();
		ll3.swapPairs();
		System.out.print("AFTER:  ");
		ll3.printList();

		System.out.println("\nTest 4: Empty list");
		SwapNodePairLL ll4 = new SwapNodePairLL(1);
		ll4.makeEmpty();
		System.out.print("BEFORE: ");
		ll4.printList();
		ll4.swapPairs();
		System.out.print("AFTER:  ");
		ll4.printList();

		System.out.println("\nTest 5: Two nodes");
		SwapNodePairLL ll5 = new SwapNodePairLL(1);
		ll5.append(2);
		System.out.print("BEFORE: ");
		ll5.printList();
		ll5.swapPairs();
		System.out.print("AFTER:  ");
		ll5.printList();
	}
}
