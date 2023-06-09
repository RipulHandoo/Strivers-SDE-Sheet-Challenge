import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the BinaryTreeNode class structure:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        
        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

*******************************************************/


public class Solution {
    public static boolean checkIdentical(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2){
        if(root1 == null && root2 == null){
            return true;
        }

        if(root1 != null && root2 != null && root1.data.equals(root2.data) && checkIdentical(root1.left,root2.left) && checkIdentical(root1.right,root2.right)){
            return true;
        }
        return false;
    }
    
    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        // Write you code here.    
        return checkIdentical(root1,root2);
    }

}
