package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
	public static void swap(int[] array, int firstIndex, int swapIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[swapIndex];
		array[swapIndex] = temp;				
	}
	
	
	public static int pivot(int[] array, int pivotIndex, int endIndex){
		int swapIndex = pivotIndex;
		for(int i = pivotIndex + 1; i<=endIndex;i++) {
			if(array[i]<array[pivotIndex]) {
				swapIndex++;
				swap(array, swapIndex, i);
			}
		}
		swap(array, pivotIndex, swapIndex);
		return swapIndex;
	}
	
	public static void quickSortHelper(int[] array, int left, int right) {
		if(left<right) {
			int pivotIndex = pivot(array, left, right);
			quickSortHelper(array, left, pivotIndex-1);
			quickSortHelper(array, pivotIndex+1, right);
		}
	}
	
	public static void quickSort(int[] array) {
		quickSortHelper(array, 0, array.length-1);
	}
	
	public static void main(String[] args) {
		int[] array = {1,8,4,9,13,2, 19};
		
		int swapIndex = pivot(array, 0, 6);
		System.out.println("Swap index: " + swapIndex);
		System.out.println("Original array is: "+ Arrays.toString(array));
		quickSort(array);
		System.out.println("Quick sorted array is: " + Arrays.toString(array));
		
	}
}
