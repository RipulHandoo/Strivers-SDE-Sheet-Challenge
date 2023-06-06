import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		int n = permutation.size();
		List<Integer> result = new ArrayList<>();
		int index = -1;

		for(int i = n-2;i>=0;i--){
			if(permutation.get(i) < permutation.get(i+1)){
				index = i;
				break;
			} 
		}
		if(index == -1){
			Collections.reverse(permutation);
			return permutation;
		}

		for(int i = n-1; i>index;i--){
			if(permutation.get(i) > permutation.get(index)){
				int temp = permutation.get(i);
				permutation.set(i,permutation.get(index));
				permutation.set(index,temp);
				break;
			}
		}

		result = permutation.subList(index+1,n);
		Collections.reverse(result);

		return permutation;
	}
}
