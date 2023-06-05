import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        // we Will be using e-Dutch national flag algorithm
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(high >= mid){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int low, int high){
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
