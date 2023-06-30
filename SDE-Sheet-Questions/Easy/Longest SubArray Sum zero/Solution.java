import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		HashMap<Integer,Integer> map = new HashMap<>();
		int max = 0;
		int prefixSum = 0;
		
		for(int i = 0;i<arr.size();i++){
			prefixSum += arr.get(i);
			
			if(prefixSum == 0){
				max = i + 1;
			}
			if(!map.containsKey(prefixSum)){
				map.put(prefixSum,i);
			}else if(map.containsKey(prefixSum)){
				max = Math.max(max, i - map.get(prefixSum));
			}
		}
		return max;
	}
}
