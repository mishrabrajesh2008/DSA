package linkedlist_leetcode;

public class KthNodeFromEnd {
	
	private Node head;
	private Node tail;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	public KthNodeFromEnd(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
	}
	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public void printList() {
		Node temp =  head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
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
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
	
	/*
	 * public Node findKthFromEnd(int k) { Node slow = tail; Node fast = tail;
	 * while(fast!=null && fast.next!=null) { for(int i=0;i<k;i++) { fast =
	 * fast.next.next; slow = slow.next; } return slow; } return null;
	 * 
	 * }
	 */
	
	
	public Node findKthFromEnd(int k) {
		Node slow = head;
		Node fast = head;
			for(int i=0;i<k;i++) {
				if(fast==null) {
					return null;
				}
				fast = fast.next;
			}
			while(fast!=null) {
				slow = slow.next;
				fast = fast.next;				
			}
			return slow;		
	}
	
	
	public static void main(String[] args) {
		KthNodeFromEnd myList = new KthNodeFromEnd(2);
		myList.append(4);
		myList.append(7);
		myList.append(3);
		myList.append(18);

		int k = 2;
        int result = myList.findKthFromEnd(k).value;

        System.out.println("\nKth Node is: "+result);
		
	}

}
