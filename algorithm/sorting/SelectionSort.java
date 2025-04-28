package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	
	public static void selectionSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
				}
			}
			if(i!=minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.print("Enter array length: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter elements no " + i+ ": ");
			array[i] = sc.nextInt();
		}

		selectionSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
