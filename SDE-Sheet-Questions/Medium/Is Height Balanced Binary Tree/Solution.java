import java.util.* ;
import java.io.*; 
/*************************************************************

Following is the Binary Tree node structure

class BinaryTreeNode<T> 
{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode(T data) {
        this.data = data;
        left = null;
        right = null;
    }
};

*************************************************************/
public class Solution {
    public static int check(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int left = check(root.left);
        int right = check(root.right);

        return Math.max(left,right) + 1;
    }
    public static boolean checkHt(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int left = check(root.left);
        int right = check(root.right);

        return (Math.abs(left - right) <= 1 && checkHt(root.left) && checkHt(root.right));
    }

	public static boolean isBalancedBT(BinaryTreeNode<Integer> root) {
		// Write your code here.
        if(root == null){
            return true;
        }
        return checkHt(root);
	}
}
