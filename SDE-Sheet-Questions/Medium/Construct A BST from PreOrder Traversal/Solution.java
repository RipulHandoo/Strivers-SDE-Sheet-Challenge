import java.util.* ;
import java.io.*; 
 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class Solution {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
        return constructBST(preOrder, Integer.MAX_VALUE, new int[] { 0 });
    }

    public static TreeNode<Integer> constructBST(int[] preOrder, int bound, int[] i) {
        if (i[0] == preOrder.length || preOrder[i[0]] > bound)
            return null;

        TreeNode<Integer> root = new TreeNode<>(preOrder[i[0]++]);
        root.left = constructBST(preOrder, root.data, i);
        root.right = constructBST(preOrder, bound, i);

        return root;
    }
}
