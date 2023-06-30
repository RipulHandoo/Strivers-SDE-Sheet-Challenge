import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
		//write your code here
		HashSet<Character> set = new HashSet<>();
		int max = -1;
		int l = 0;
		
		for(int i = 0;i<input.length();i++){
			char curr = input.charAt(i);
			if(set.contains(curr)){ //Found a duplicate character
				while(i > l && set.contains(curr)){
					set.remove(input.charAt(l));
					l++;
				}
			}
			set.add(curr);
			max = Math.max(max, i - l + 1);
		}
		return max;
	}
}
