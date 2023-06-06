import java.util.* ;
import java.io.*; 
/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/

public class Solution {
	public static void inOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }

        inOrder(root.left, result);
        result.add(root.data);
        inOrder(root.right, result);
    }

    public static void postOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }

        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.data);
    }

    public static void preOrder(BinaryTreeNode<Integer> root, List<Integer> result) {
        if (root == null) {
            return;
        }

        result.add(root.data);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        List<Integer> inOrderList = new ArrayList<>();
        inOrder(root, inOrderList);
        result.add(inOrderList);

        List<Integer> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);
        result.add(preOrderList);

        List<Integer> postOrderList = new ArrayList<>();
        postOrder(root, postOrderList);
        result.add(postOrderList);

        return result;
    }
}
