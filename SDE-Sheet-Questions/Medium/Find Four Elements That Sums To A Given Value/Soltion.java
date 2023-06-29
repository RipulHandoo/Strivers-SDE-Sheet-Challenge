import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);
      for(int i = 0;i<n-1;i++){
        for(int j = i+1; j < n;j++){
          int front = j + 1;
          int back = n - 1;
          int target2 = target - arr[j] - arr[i];
          while(back > front){
            int twoSum = arr[front] + arr[back];
            if(target2 == twoSum){
              return "Yes";
            }else if(twoSum < target2){
              front++;
            }else{
              back--;
            }
          }
        }
      }
      return "No";
  }
}
