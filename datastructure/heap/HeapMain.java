package heap;

public class HeapMain {
	public static void main(String[] args) {
		
		Heap myHeap = new Heap();
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);

        System.out.println(myHeap.getHeap());


        myHeap.remove();

        System.out.println(myHeap.getHeap());


        myHeap.remove();

        System.out.println(myHeap.getHeap());

        /*
            EXPECTED OUTPUT:
            ----------------
            [95, 75, 80, 55, 60, 50, 65]
            [80, 75, 65, 55, 60, 50]
            [75, 60, 65, 55, 50]

        */
        Heap myHeap1 = new Heap();
        myHeap1.minHeapInsert(99);
        myHeap1.minHeapInsert(72);
        myHeap1.minHeapInsert(61);
        myHeap1.minHeapInsert(58);
        System.out.println(myHeap1.getHeap());
        myHeap1.minHeapInsert(10);
        myHeap1.minHeapInsert(75);
        System.out.println(myHeap1.getHeap());

        Integer removedValue1 = myHeap1.minHeapRemove();

        System.out.println("First Removed Value: " + removedValue1);
        Integer removedValue2 = myHeap1.minHeapRemove();

        System.out.println("Second Removed Value: " + removedValue2);
        System.out.println(myHeap1.getHeap());
	}

}
