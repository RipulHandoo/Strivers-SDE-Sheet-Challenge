import java.util.* ;
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
    public static void leftView(ArrayList<Integer> list, TreeNode<Integer> root, int level){
        if(root == null){
            return;
        }
        if(level >= list.size()){
            list.add(root.data);
        }

        leftView(list,root.left,level+1);
        leftView(list,root.right,level+1);
    }
    public static ArrayList<Integer> getLeftView(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        leftView(list,root,0);
        return list;
    }
}
