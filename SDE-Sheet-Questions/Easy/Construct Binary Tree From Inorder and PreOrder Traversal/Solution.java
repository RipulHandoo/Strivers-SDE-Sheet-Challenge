import java.util.* ;
import java.awt.image.IndexColorModel;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
{
    public static TreeNode<Integer> buildBinaryTree(ArrayList<Integer>  inorder, ArrayList<Integer>  preorder) 
    {
        //    Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<inorder.size();i++){
            map.put(inorder.get(i),i);
        }
        return constructBT(preorder, 0, preorder.size()-1, inorder, 0, inorder.size()-1,map);
    }

    public static TreeNode<Integer> constructBT(ArrayList<Integer> preorder, int preStart, int preEnd
    ,ArrayList<Integer> inorder, int inStart, int inEnd, HashMap<Integer,Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;

        TreeNode<Integer> root = new TreeNode<>(preorder.get(preStart));
        
        int inRoot = map.get(root.data);
        int numLeft = inRoot - inStart;

        root.left = constructBT(preorder,preStart + 1,preStart + numLeft,inorder,inStart,inRoot - 1,map);
        root.right = constructBT(preorder, preStart + numLeft + 1, preEnd, inorder, inRoot + 1, inEnd,map);

        return root;
        
    }
}
