import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int low = 0;
        int high = mat.size() * mat.get(0).size()-1;
        int col = mat.get(0).size();

        while(high >= low){
            int mid = (low + (high - low)/2);

            int value = mat.get(mid/col).get(mid%col);

            if(value == target){
                return true;
            }

            else if(value < target){
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return false;
    }
}
