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
		myList.append(8);
		myList.append(10);
		myList.append(17);
		myList.printList();
		System.out.println("\nPost change....");
		/*
		 * System.out.println("Remove last: "+myList.removeLast().value);
		 * System.out.println("Remove last: "+myList.removeLast().value);
		 * System.out.println("Remove last: "+myList.removeLast());
		 */
		myList.prepend(3);
		myList.removeFirst();
		myList.printList();
		System.out.println("\nReturn of get method: "+myList.get(4).value);
		System.out.println("\nReturn of insert: "+myList.insert(4, 23));
		myList.printList();
		myList.reverse();
		System.out.println();
		myList.printList();
	}

}
