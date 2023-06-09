/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/

public class Solution {

    public static boolean symmetric(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 != null && root2 != null && root1.data.equals(root2.data) && symmetric(root1.left,root2.right) && symmetric(root1.right, root2.left)){
            return true;
        }
        return false;
    }

    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root == null){
            return true;
        }

        return symmetric(root.left,root.right);
    }
}
