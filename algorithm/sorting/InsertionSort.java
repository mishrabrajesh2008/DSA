package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void insertionSort(int[] array) {
		for(int i=1;i<array.length;i++) {
		
			int temp = array[i];
			int j= i-1;
			while(j>-1 && temp<array[j]) {
				array[j+1]=array[j];
				array[j]=temp;
				j--;
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

		insertionSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
	}

	
}
