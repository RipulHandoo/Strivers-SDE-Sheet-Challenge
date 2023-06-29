import java.util.ArrayList;


public class Solution {
	public static int quickSelect(ArrayList<Integer> arr, int left, int right, int k){
		if (left <= right) {
            int pivotIndex = partition(arr, left, right);
            if (pivotIndex == k - 1) {
                return arr.get(pivotIndex); // kth smallest element found
            } else if (pivotIndex > k - 1) {
                return quickSelect(arr, left, pivotIndex - 1, k); // search in the left subarray
            } else {
                return quickSelect(arr, pivotIndex + 1, right, k); // search in the right subarray
            }
        }
        return -1;
	}

	public static int partition(ArrayList<Integer> arr , int left, int right){
		int pivot = arr.get(right);
		int j = left;

		for(int i = left; i <= right;i++){
			if(arr.get(i) < pivot){
				int temp = arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,temp);
				j++;
			}
		}

		int temp = arr.get(right);
		arr.set(right,arr.get(j));
		arr.set(j,temp);

		return j;
	}
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer> result = new ArrayList<>();
		int samllestElement = quickSelect(arr,0,arr.size()-1,k);
		int largestElement = quickSelect(arr,0,arr.size()-1,arr.size() - k + 1);
		result.add(samllestElement);
		result.add(largestElement);

		return result;
	}
}
