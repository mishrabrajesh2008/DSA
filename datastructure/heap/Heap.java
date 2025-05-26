package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	
	private List<Integer> heap;
	
	public Heap() {
		this.heap = new ArrayList<Integer>();
	}
	
	private List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}
	
	private int leftChild(int index) {
		return 2*index+1;
	}
	
	private int rightChild(int index) {
		return 2*index+2;
	}
	
	private int parent(int index) {
		return (index-1)/2;
	}

}
