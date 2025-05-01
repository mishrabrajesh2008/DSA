package sorting;

import java.util.Arrays;

public class MergeSort {
	
	//helper function to merge 2 sorted array
	
	public static int[] merge(int[] array1, int[] array2) {
		int[] combined = new int[array1.length +  array2.length];
		int i=0;
		int j=0;
		int index=0;
		
		while(i<array1.length && j<array2.length) {
			if(array1[i]<array2[j]) {
				combined[index] = array1[i];
				index++;
				i++;
			}else {
				combined[index] = array2[j];
				index++;
				j++;
			}
		}
			while(i<array1.length) {
				combined[index] = array1[i];
				index++;
				i++;
			}
			while(j<array2.length) {
				combined[index] = array2[j];
				index++;
				j++;
			}
			return combined;
	}
	
	public static int[] mergeSort(int[] array) {
		if(array.length==1) return array;
		int midIndex = array.length/2;
		
		
		int[] arr1 = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
		int[] arr2 = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
		
		return merge(arr1,arr2);	
		
		
	}
	
	public static void main(String[] args) {
		int[] array1 = {1,3,7,8, 9, 10};
		int[] array2 = {2,4,5,6};
		int[] mergeArray = {5,2,9,8};
		System.out.println("Output of merger is: " + Arrays.toString(merge(array1, array2)));
		System.out.println("Output of mergeSort is: "+ Arrays.toString(mergeSort(mergeArray)));
	}

}
