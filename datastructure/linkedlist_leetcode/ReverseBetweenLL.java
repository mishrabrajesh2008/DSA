package linkedlist_leetcode;

public class ReverseBetweenLL {
	
	private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public ReverseBetweenLL(int value) {
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

    public void reverseBetween(int m, int n) {
    	if(head == null) return;
        Node D1 = new Node(head.value);
        Node prev = D1;
        D1.next = head;
        
		 for(int i=0;i<m;i++) { prev = prev.next; }
		 
        int len = n-m;
        Node current = prev.next;
        
        for(int i=0;i<len;i++) {
        	Node toMove = current.next;
        	current.next = toMove.next;
        	toMove.next = prev.next;
        	prev.next = toMove;
        }       
        head = D1.next;
    }

	
	
	public static void main(String[] args) {
		ReverseBetweenLL rbt = new ReverseBetweenLL(5);
		rbt.append(4);
		rbt.append(18);
		rbt.append(12);
		rbt.append(14);
		
		rbt.printList();
		rbt.reverseBetween(0, 3);
		rbt.printList();
		
	}
}
