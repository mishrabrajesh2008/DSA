package linkedlist;

public class LLMain {
	
	public static void main(String[] args) {
		LinkedList myList = new LinkedList(4);
		
		/*
		 * myList.getHead(); myList.getTail(); myList.getLength();
		 */
		
		/*
		 * myList.printList(); System.out.println();
		 */
		myList.append(1);
		myList.printList();
		System.out.println("Remove last: "+myList.removeLast().value);
		System.out.println("Remove last: "+myList.removeLast().value);
		System.out.println("Remove last: "+myList.removeLast());
	}

}
