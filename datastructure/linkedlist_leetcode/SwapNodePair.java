package linkedlist_leetcode;

public class SwapNodePair {

	private Node head;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public SwapNodePair(int value) {
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
		Node D1 = new Node(0);
		D1.next = head;
		Node temp = head;
		Node prev = D1;
		// Node current = temp.next;

		while (temp != null && temp.next != null) {
			Node current = temp.next;
			prev.next = current;
			temp.next = current.next;
			current.next = temp;
			prev = temp;
			temp = temp.next;
		}
		head = D1.next;
	}

	public static void main(String[] args) {
		System.out.println("Test 1: Even number of nodes");
		SwapNodePair ll1 = new SwapNodePair(1);
		ll1.append(2);
		ll1.append(3);
		ll1.append(4);
		System.out.print("BEFORE: ");
		ll1.printList();
		ll1.swapPairs();
		System.out.print("AFTER:  ");
		ll1.printList();

		System.out.println("\nTest 2: Odd number of nodes");
		SwapNodePair ll2 = new SwapNodePair(1);
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
		SwapNodePair ll3 = new SwapNodePair(1);
		System.out.print("BEFORE: ");
		ll3.printList();
		ll3.swapPairs();
		System.out.print("AFTER:  ");
		ll3.printList();

		System.out.println("\nTest 4: Empty list");
		SwapNodePair ll4 = new SwapNodePair(1);
		ll4.makeEmpty();
		System.out.print("BEFORE: ");
		ll4.printList();
		ll4.swapPairs();
		System.out.print("AFTER:  ");
		ll4.printList();

		System.out.println("\nTest 5: Two nodes");
		SwapNodePair ll5 = new SwapNodePair(1);
		ll5.append(2);
		System.out.print("BEFORE: ");
		ll5.printList();
		ll5.swapPairs();
		System.out.print("AFTER:  ");
		ll5.printList();
	}
}
