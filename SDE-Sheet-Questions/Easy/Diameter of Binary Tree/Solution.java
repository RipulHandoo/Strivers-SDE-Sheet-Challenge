/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static int diameter(TreeNode<Integer> root, int[] dia){
		if(root == null){
			return 0;
		}
		int left = diameter(root.left,dia);
		int right = diameter(root.right,dia);
		dia[0] = Math.max(dia[0],left + right);

		return Math.max(left,right) + 1;
	}
	public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
		if(root == null){
			return 0;
		}
		int dia[] = new int[1];
		diameter(root,dia);

		return dia[0];

	}
}
