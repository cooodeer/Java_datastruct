package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	public static void main (String[] args) {
		int[] int1 = {0,2,4,3,1};
		int[] int2 = bubbleSort(int1);
		System.out.println(Arrays.toString(int2));
	}
	public static int[] bubbleSort(int[] arr) {
		int len = arr.length;
		
		for (int i=0;i<len-1;i++) {
			for (int j=0;j<len-i-1;j++) {
				if (arr[j] >arr[j+1] ) {
					int temp;
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
		return arr;
	}
}
