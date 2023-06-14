import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Tree node structure
	
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

public class Solution {
	public static long findMaxSumPath(TreeNode root) {
		// Write your code here.
		Long[] sum = new Long[1];

		sum[0] = (long) -1;

		findSum(root,sum);
		return sum[0];
	}

	public static long findSum(TreeNode root, Long[] sum){
		if(root == null) return 0;

		long left = findSum(root.left,sum);
		long right = findSum(root.right,sum);

		if(root.left != null && root.right != null){
			sum[0] = Math.max(sum[0], left + right + root.data);
		}

		if(root.left == null) return  right + root.data;
		else if(root.right == null) return left + root.data;
		else return Math.max(left,right) + root.data;
	}
}
