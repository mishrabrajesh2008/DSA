package stacknqueues;

public class QueueMain {

	public static void main(String[] args) {
		Queue ql = new Queue(1);
		ql.enqueue(3);
		ql.printList();
		ql.dequeue();
		ql.printList();
	}

}
