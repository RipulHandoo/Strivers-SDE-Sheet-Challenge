import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] result = new int[2];
        
        for(int i = 0;i<arr.size();i++){
            int index = Math.abs(arr.get(i)) - 1;
            if(arr.get(index) < 0){
                result[1] = Math.abs(arr.get(i));
            }
            else{
                arr.set(index,-arr.get(index));
            }
        }

        for(int i = 0;i<arr.size();i++){
            if(arr.get(i) > 0){
                result[0] = i+1;
                break;
            }
        }

        return result;
    }
}
