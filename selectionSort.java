package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] int1 = {3,5,2,1,4,6};
		int[] int2 = selectionSort(int1);
		System.out.println(Arrays.toString(int2));
	}
	public static int[] selectionSort(int[] array) {
		int len = array.length;
		int index;
		for (int i = 0; i < len-1; i++) {
			index = i+1;
					
			for (int j = i + 2; j < len; j++) {
				;				
				if (array[j] < array[index]) {
					index = j;
				}
			}
							
			if (array[i] > array[index]) {
				int temp;
				temp = array[i];
				array[i] = array[index];
				array[index] = temp;						
			}

		}
		return array;
	}
}
