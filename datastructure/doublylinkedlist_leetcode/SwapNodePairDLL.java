package doublylinkedlist_leetcode;

public class SwapNodePairDLL {
	

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

    public SwapNodePairDLL(int value) {
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

    public void swapPairs() {
    	Node temp = head;
    	
    	
    	while(temp.next!=null || temp!=null) {
    		Node current =temp;
    		Node after = temp.next;
    		temp.next= current;
    		current = after;
    		current.next=after.next;
    		after = after.next.next;
    		current = after.next;
    	}
    	
    }
 
	
	public static void main(String[] args) {
		SwapNodePairDLL snp = new SwapNodePairDLL(1);
		snp.append(2);
		snp.append(4);
		snp.append(5);
		snp.append(3);
		snp.printList();
		snp.swapPairs();
		snp.printList();
	}

}
