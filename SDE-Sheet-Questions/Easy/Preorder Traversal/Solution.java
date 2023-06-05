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
	public static void preOrder(List<Integer> list, TreeNode root){
        if(root == null){
            return;
        }
		list.add(root.data);
        preOrder(list,root.left);       
        preOrder(list,root.right);
    }
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
		List<Integer> list = new ArrayList<>();
		preOrder(list,root);
		return list;
    }
}
