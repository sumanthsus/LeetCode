package June;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void printTree() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(this);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            StringBuilder levelString = new StringBuilder();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                String leftIndicator = (node.left != null) ? " /" : "  ";
                String rightIndicator = (node.right != null) ? "\\ " : "  ";
                levelString.append(node.val).append(leftIndicator).append(rightIndicator).append(" ");

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }

            System.out.println(levelString);
        }
    }
}
