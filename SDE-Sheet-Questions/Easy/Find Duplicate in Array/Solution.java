import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        int slow = arr.get(0);
        int fast = arr.get(0);

        do{
            slow = arr.get(slow);
            fast = arr.get(arr.get(fast));
        }while(slow != fast);

        slow = arr.get(0);

        while(slow != fast){
            slow = arr.get(slow);
            fast = arr.get(fast);
        }

        return slow;
    }
}
