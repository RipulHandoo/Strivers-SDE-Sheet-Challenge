import java.util.* ;
import java.io.*; 
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class Solution {
    public static void postOrder(List<Integer> list, TreeNode root){
        if(root == null){
            return;
        }
        postOrder(list,root.left);
        postOrder(list,root.right);
        list.add(root.data);
    }
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer> list = new ArrayList<>();
        postOrder(list,root);

        return list;
    }
}
