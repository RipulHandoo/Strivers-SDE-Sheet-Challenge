import java.util.* ;
import java.io.*; 
/*********************************************

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

*********************************************/

class Pair {
    public BinaryTreeNode node;
    public int horizontalDistance;

    public Pair(BinaryTreeNode node, int horizontalDistance) {
        this.node = node;
        this.horizontalDistance = horizontalDistance;
    }
}
public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        Map<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            BinaryTreeNode node = pair.node;
            int horizontalDistance = pair.horizontalDistance;

            bottomViewMap.put(horizontalDistance, node.val);

            if (node.left != null) {
                queue.offer(new Pair(node.left, horizontalDistance - 1));
            }
            if (node.right != null) {
                queue.offer(new Pair(node.right, horizontalDistance + 1));
            }
        }

        for (int value : bottomViewMap.values()) {
           list.add(value);
        }
         return list;
    }
}
