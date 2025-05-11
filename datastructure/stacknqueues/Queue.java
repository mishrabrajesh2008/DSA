package stacknqueues;

public class Queue {
	private Node first;
	private Node last;
	private int length;
	
	
	class Node{
		Node next;
		int value;
		
		Node(int value){
			this.value =value;
		}
	}
	
	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	}
	
	public void getFirst() {
		System.out.println("First: "+first.value);
	}
	
	public void getLast() {
		System.out.println("Last: "+last.value);
	}
	
	public void getLength() {
		System.out.println("Length: "+length);
	}
	
	public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    
    public void makeEmpty() {
        first = null;
        last = null;
        length = 0;
    }
}
