import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;

public class Solution {
	public static void boundaryLeft(TreeNode root, ArrayList<Integer> result){
		if(root == null){
			return;
		}

		if(root.left != null){
			result.add(root.data);
			boundaryLeft(root.left,result);
		}
		else if(root.right != null){
			result.add(root.data);
			boundaryLeft(root.right,result);
		}
	}

	public static void boundaryRight(TreeNode root, ArrayList<Integer> result){
		if(root == null){
			return;
		}

		if(root.right != null){
			boundaryRight(root.right,result);
			result.add(root.data);
		}
		else if(root.left != null){
			boundaryRight(root.left,result);
			result.add(root.data);
		}
	}

	public static void leafNode(TreeNode root, ArrayList<Integer> result){
		if(root == null){
			return;
		}

		leafNode(root.left,result);

		if(root.left == null && root.right == null){
			result.add(root.data);
		}
		
		leafNode(root.right,result);
	}

	public static ArrayList<Integer> traverseBoundary(TreeNode root){
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<>();
		
		if(root != null){
			result.add(root.data);

			boundaryLeft(root.left,result);
			leafNode(root.left,result);
			leafNode(root.right,result);
			boundaryRight(root.right,result);
		}

		return result;
	}
}
