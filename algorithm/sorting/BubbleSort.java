package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
	public static void bubbleSort(int[] array) {
		for(int i = array.length-1;i>0;i--) {
			for(int j=0; j<i;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter array length: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		for(int i=0; i<length;i++) {
			System.out.print("Enter elements no: " +i);
			array[i]= sc.nextInt();
		}
		
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
