import java.util.HashMap;
/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/

public class Solution {
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.
    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i = 0;i<inOrder.length;i++){
      map.put(inOrder[i],i);
    }

    return buildTreePostIn(inOrder,0, inOrder.length - 1, postOrder, 0,postOrder.length -1,map);
	}

  public static TreeNode<Integer> buildTreePostIn(int[] inorder, int is, int ie, int[] postorder,
    int ps, int pe,HashMap<Integer,Integer> hm){
        if (ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps,
        ps+ri-is-1, hm);
        TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, 
        ps+ri-is, pe-1, hm);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }
}
