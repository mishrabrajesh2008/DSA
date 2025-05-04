package linkedlist_leetcode;

import java.util.HashSet;
import java.util.Set;

/*Conditions:
 * No length variable,no tail.
 * There are 2 ways, one is through loop having complexity as O(n2) and using Set having complexity as O(n).
 * Read about Floyd's Tortoise and Hare algorithm 
 * */

public class RemoveDuplicates {
	private Node head;
	// private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public RemoveDuplicates(int value) {
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

	/*
	 * public Node getTail() { return tail; }
	 */

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (head == null) {
			System.out.println("Head: null");
			// System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			// System.out.println("Tail: " + tail.value);
		}
		System.out.println("\nLinked List:");
		if (head == null) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void makeEmpty() {
		head = null;
		// tail = null;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (head == null) {
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

	// Using Loop - On(n2)
	public void removeDuplicates() {
		Node current = head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.value == current.value) {
					runner.next = runner.next.next;
					length--;
				} else {
					runner = runner.next;
				}

			}
			current = current.next;
		}

	}

	// Using Set - On(n2)
	public void removeDuplicatesSet() {
		Set<Integer> setValues = new HashSet<Integer>();
		Node previous = null;
		Node current = head;
		while (current != null) {
			if (setValues.contains(current.value)) {
				previous.next = current.next;
				length--;
			} else {
				setValues.add(current.value);
				previous = current;
			}
			current = current.next;
		}

	}

	public static void main(String[] args) {
		RemoveDuplicates myList = new RemoveDuplicates(2);
		myList.append(4);
		myList.append(7);
		myList.append(7);
		myList.append(3);
		myList.append(18);
		myList.append(18);
		myList.printList();
		System.out.println("-------------------------");
		myList.removeDuplicatesSet();
		System.out.println("-------------------------");
		myList.printList();

	}

}
