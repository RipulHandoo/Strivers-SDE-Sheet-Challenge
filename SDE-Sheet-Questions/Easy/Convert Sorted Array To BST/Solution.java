import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the TreeNode class:

    class TreeNode<T> {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


*****************************************************************/

import java.util.ArrayList;

public class Solution {
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        if(arr.size() == 0){
            return null;
        }

        TreeNode<Integer> root = new TreeNode<>(1);
        


        return createBST(arr,root,0,arr.size() -1);
    }

    public static TreeNode<Integer> createBST(ArrayList<Integer> arr, TreeNode<Integer> root, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end)/2;

        root = new TreeNode(arr.get(mid));

        root.left = createBST(arr,root,start,mid-1);
        root.right = createBST(arr,root,mid+1,end);

        return root;
    }
}
