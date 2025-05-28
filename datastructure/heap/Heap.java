package heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

	private List<Integer> heap;

	public Heap() {
		this.heap = new ArrayList<Integer>();
	}

	public List<Integer> getHeap() {
		return new ArrayList<>(heap);
	}

	public int leftChild(int index) {
		return 2 * index + 1;
	}

	public int rightChild(int index) {
		return 2 * index + 2;
	}

	public int parent(int index) {
		return (index - 1) / 2;
	}

	private void swap(int index1, int index2) {
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}

	public void insert(int value) {
		heap.add(value);
		int current = heap.size() - 1;
		while (current > 0 && heap.get(current) < parent(current)) {
			swap(heap.get(current), parent(current));
			current = parent(current);
		}
	}

	public Integer remove() {
		if (heap.size() == 0)
			return null;
		if (heap.size() == 1)
			return heap.get(0);

		int maxValue = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		sinkDown(0);

		return maxValue;
	}

	public void sinkDown(int index) {
		int maxIndex = index;
		while (true) {
			int leftIndex = leftChild(index);
			int rightIndex = rightChild(index);
			if (leftIndex < heap.size() && heap.get(maxIndex) < heap.get(leftIndex)) {
				maxIndex = leftIndex;
			}
			if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
				maxIndex = rightIndex;
			}
			if (maxIndex != index) {
				swap(index, maxIndex);
				index = maxIndex;
			} else {
				return;
			}
		}
	}
}
