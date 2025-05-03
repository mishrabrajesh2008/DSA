package linkedlist_leetcode;

/*Conditions:
 * No length variable
 * If LL has even number of Node, return second middle node
 * Read about Floyd's Tortoise and Hare algorithm 
 * */


public class MiddleNodeLL {
	private Node head;
	private Node tail;
	
	class Node{
		int value;
		Node next;
		Node(int value){
			this.value = value;
		}
	}
	
	public MiddleNodeLL(int value) {
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
	
	public Node findMiddleNode() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;			
		}
		return slow;
		
	}
	
	
	public static void main(String[] args) {
		MiddleNodeLL myList = new MiddleNodeLL(2);
		myList.append(4);
		myList.append(7);
		myList.append(3);
		//myList.append(18);
		
		System.out.println("\nMiddle node: "+myList.findMiddleNode().value);
		
	}

}
