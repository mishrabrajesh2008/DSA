package linkedlist;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		Node next;
		int value;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		tail.next = null;
		length = 1;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head is: " + head.value);
	}

	public void getTail() {
		System.out.println("Tail is: " + tail.value);
	}

	public void getLength() {
		System.out.println("Length is: " + length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			/* tail.next = null; */
		} else {
			tail.next = newNode;
			tail = newNode;
			/* newNode.next=null; */
		}
		length++;
	}

	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = head;
		Node pre = head;
		while (temp.next!= null) {
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}
}
