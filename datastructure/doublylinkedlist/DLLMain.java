package doublylinkedlist;

public class DLLMain {

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList(7);
		dll.append(9);
		dll.append(11);
		dll.append(19);
		dll.printAll();
		dll.removeLast();
		dll.prepend(5);
		dll.prepend(8);
		dll.prepend(2);
		dll.removeFirst();
		dll.insert(2, 24);
		dll.printAll();
		dll.remove(3);
		dll.printAll();
		System.out.println("Output of get: " + dll.get(3).value);
		System.out.println(dll.set(3, 10));

	}

}
