import java.util.* ;


import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/
class Pair{
	BinaryTreeNode node;
	int hd;
	Pair(BinaryTreeNode node, int hd){
		this.node = node;
		this.hd = hd;
	}
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		// Write your code here.
		TreeMap<Integer,Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();

		q.offer(new Pair(root,0));

		while(!q.isEmpty()){
			Pair temp = q.poll();
			BinaryTreeNode node = temp.node;
			int hd = temp.hd;

			if(map.get(hd) == null){
				map.put(hd,node.val);
			}

			if(node.left != null){
				q.offer(new Pair(node.left,hd-1));
			}
			if(node.right != null){
				q.offer(new Pair(node.right,hd+1));
			}
		}

		for(Map.Entry<Integer,Integer> e: map.entrySet()){
			list.add(e.getValue());
		}

		return list;
	}
}
