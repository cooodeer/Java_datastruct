//类似优化版的冒泡
package insertSort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] int1 = {3,5,2,1,4,6};
		int[] int2 = insertSort(int1);
		System.out.println(Arrays.toString(int2));
	}
	public static int[] insertSort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return nums;
		}
	    for(int i = 1; i < nums.length; i++) {
	        for(int j = i - 1; j >= 0 && nums[j] > nums[j + 1]; j--) {
	            int temp;
	            temp = nums[j];
	            nums[j] = nums[j+1];
	            nums[j+1] = temp;
	        }
	    }
	    return nums;
	}
}
