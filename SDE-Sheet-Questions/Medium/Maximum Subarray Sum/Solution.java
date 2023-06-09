import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long max = Long.MIN_VALUE;
		long max_so_far = 0;

		for(int i = 0;i<arr.length;i++){
			max_so_far += arr[i];
			
			if(max_so_far > max){
				max = max_so_far;
			}

			if(max_so_far < 0){
				max_so_far = 0;
			}
		}

		if(max < 0){
			return 0;
		}

		return max;
	}

}
