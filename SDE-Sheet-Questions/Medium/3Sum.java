import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i = 0;i<n-1;i++){
			int front = i + 1;
			int back = n -1;

			int target = K - arr[i];
			while(back > front){
				int sum = arr[back] + arr[front];
				if(sum == target){
					ArrayList<Integer> list = new ArrayList<>();
					list.add(arr[i]);
					list.add(arr[front]);
					list.add(arr[back]);
					result.add(list);

					while(back > front && arr[front + 1] == arr[front]){
						front++;
					}
					while(back > front && arr[back - 1] == arr[back]){
						back--;
					}
					front++;
					back--;
				}
				else if(sum < target){
					front++;
				}else{
					back--;
				}
			}
			while(i + 1 < n && arr[i + 1] == arr[i]){
				++i;
			}
		}
		return result;
	}
}
