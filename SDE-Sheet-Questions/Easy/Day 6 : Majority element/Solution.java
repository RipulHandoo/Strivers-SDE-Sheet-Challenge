import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int num: arr){
			if(!map.containsKey(num)){
				map.put(num,1);
			}
			else if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}
		}

		for(Map.Entry<Integer,Integer> e: map.entrySet()){
			if(e.getValue() > n/2){
				return e.getKey();
			}
		}

		return -1;
	}
}
