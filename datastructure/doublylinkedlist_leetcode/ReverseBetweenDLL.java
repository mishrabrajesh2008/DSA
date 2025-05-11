package doublylinkedlist_leetcode;

public class ReverseBetweenDLL {

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

	public ReverseBetweenDLL(int value) {
		Node newNode = new Node(value);
		head = newNode;
	}

	public Node getHead() {
		return head;
	}
	
	public int getLength() {
		return length;
	}

	public void printList() {
		StringBuilder output = new StringBuilder();
		Node temp = head;
		while (temp != null) {
			output.append(temp.value);
			if (temp.next != null) {
				output.append(" <-> ");
			}
			temp = temp.next;
		}
		System.out.println(output.toString());
	}

	public void makeEmpty() {
		head = null;
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
			newNode.prev = current;
		}
	}

	public void reverseBetween(int startIndex, int endIndex) {
		if (head == null || startIndex == endIndex)
			return;
		Node D1 = new Node(0);
		Node prev = D1;
		D1.next = head;
		int len = endIndex - startIndex;

		for (int i = 0; i < startIndex; i++) {
			prev = prev.next;
		}

		Node current = prev.next;

		for (int i = 0; i < len; i++) {
			Node toMove = current.next;
			current.next = toMove.next;
			if (toMove.next != null) {
				toMove.next.prev = current;
			}
			toMove.next = prev.next;
			prev.next.prev = toMove;
			prev.next = toMove;
			toMove.prev = prev;
		}
		head = D1.next;
		head.prev = null;

	}

	public static void main(String[] args) {
		ReverseBetweenDLL rbdll = new ReverseBetweenDLL(5);
		rbdll.append(4);
		rbdll.append(18);
		rbdll.append(12);
		rbdll.append(14);

		rbdll.printList();
		rbdll.reverseBetween(0, 3);
		rbdll.printList();
	}
}
