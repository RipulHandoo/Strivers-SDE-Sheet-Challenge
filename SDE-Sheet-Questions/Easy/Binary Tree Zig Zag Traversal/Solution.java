import java.util.* ;
import java.io.*; 
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {
	public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here!
		List<Integer> list = new ArrayList<>();

		if(root == null){
			return list;
		}

		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.add(root);
		
		int level = 1;

		while(!q.isEmpty()){
			int c = q.size();
			List<Integer> list1 = new ArrayList<>();
			for(int i = 0;i<c;i++){
				BinaryTreeNode temp = q.poll();
				int data = (int) temp.data;
				if(temp.left != null){
					q.add(temp.left);
				}
				if(temp.right != null){
					q.add(temp.right);
				}

				if(level%2 != 0){
					list.add(data);
				}
				else {
					list1.add(data);
				}
			}
			for(int i = list1.size() -1 ;i>= 0;i--){
				list.add(list1.get(i)); 
			}
			level++;
		}

		return list;
	}
}
