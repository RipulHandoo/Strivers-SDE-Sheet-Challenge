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


class Tuple {
    public TreeNode<Integer> node;
    public int x;
    public int y;

    public Tuple(TreeNode<Integer> node, int x, int y) {
        this.node = node;
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        TreeMap<Integer, TreeMap<Integer, List<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<>();

        queue.offer(new Tuple(root, 0, 0));

        while (!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            TreeNode<Integer> node = tuple.node;
            int x = tuple.x;
            int y = tuple.y;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }
            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new ArrayList<>());
            }
            map.get(x).get(y).add(node.data);

            if (node.left != null) {
                queue.offer(new Tuple(node.left, x - 1, y + 1));
            }
            if (node.right != null) {
                queue.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        for (TreeMap<Integer, List<Integer>> ys : map.values()) {
            for (List<Integer> nodes : ys.values()) {
                result.addAll(nodes);
            }
        }

        return result;
    }
}
