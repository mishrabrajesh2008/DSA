package doublylinkedlist;

public class DLLMain {
	
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(7);
		dll.append(9);
		dll.append(11);
		dll.append(19);
		dll.printAll();
	}

}
