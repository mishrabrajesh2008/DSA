package doublylinkedlist_leetcode;

public class PartitionListDLL {

	private Node head;
	// private int length;

	class Node {
		int value;
		Node next;
		Node prev;

		Node(int value) {
			this.value = value;
		}
	}

	public PartitionListDLL(int value) {
		Node newNode = new Node(value);
		head = newNode;
	}

	public Node getHead() {
		return head;
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

	public void partitionList(int x) {
		if (head == null)
			return;
		Node D1 = new Node(0);
		Node n1 = D1;
		Node D2 = new Node(0);
		Node n2 = D2;
		Node temp = head;
		while (temp != null) {
			if (temp.value >= x) {
				n2.next = temp;
				temp.prev = n2;
				n2 = temp;
			} else {
				n1.next = temp;
				temp.prev = n1;
				n1 = temp;
			}
			temp = temp.next;
		}
		n2.next = null;
		n1.next = D2.next;
		if (D2.next != null) {
			D2.next.prev = n1;
		}
		head = D1.next;
		if (head != null) {
			head.prev = null;
		}
	}

	public static void main(String[] args) {
		PartitionListDLL pdll = new PartitionListDLL(3);
		pdll.append(5);
		pdll.append(8);
		pdll.append(10);
		pdll.append(2);
		pdll.append(1);
		pdll.printList();
		pdll.partitionList(5);
		pdll.printList();
	}

}
