package Mar20;


import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftTree {
    public int findBottomLeftValue(TreeNode root) {
        if(root==null)
            return -1;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        int leftmost = root.val;

        while(!q.isEmpty())
        {
            int levelSize = q.size();
            leftmost = q.peek().val;

            for(int i=0;i<levelSize;i++)
            {
                TreeNode current = q.poll();
                if(current.left !=null)
                    q.offer(current.left);
                if(current.right!=null)
                    q.offer(current.right);
            }
        }
        return leftmost;

        //return RecurBottom(root,1,-1,0);
    }

    public int RecurBottom(TreeNode root, int currentheight, int maxheight, int maxroot) {
        if (root.left == null && root.right == null) {
            if (currentheight >= maxheight) {
                maxheight = currentheight;
                maxroot = root.val;
            }
        } else {
            if (root.left != null) {
                maxroot = RecurBottom(root.left, currentheight + 1, maxheight, maxroot);
            }
            if (root.right != null) {
                maxroot = RecurBottom(root.right, currentheight + 1, maxheight, maxroot);
            }
        }
        return maxroot;
    }


    public static void main(String[] args)
    {
        BottomLeftTree bl = new BottomLeftTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
       // root.left.left = new TreeNode(4);
        //root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(bl.findBottomLeftValue(root));
    }
}
