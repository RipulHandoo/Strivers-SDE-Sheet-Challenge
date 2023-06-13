import java.util.* ;
import java.io.*; 
/*
    ----------------- Binary Tree node class for reference -----------------

    class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;
	    public BinaryTreeNode<T> next;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	        next = null;
	    }
	};

*/

public class Solution {
	public static void connectNodes(BinaryTreeNode<Integer> root) {
    	// Write your code here.
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();

		q.offer(root);

		while(!q.isEmpty()){
			int c = q.size();
			List<BinaryTreeNode<Integer>> list = new ArrayList<>();
			for(int i = 0;i<c;i++){
				BinaryTreeNode temp = q.poll();

				list.add(temp);
				if(temp.left != null){
					q.offer(temp.left);
				}
				if(temp.right != null){
					q.offer(temp.right);
				}
			}

			for(int i = 0;i<list.size()-1;i++){
				BinaryTreeNode num = list.get(i);
				BinaryTreeNode numNext = list.get(i+1);

				num.next = numNext;
			}
		}
	}
}
