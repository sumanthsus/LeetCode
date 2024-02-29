package Mar20;


import java.util.Deque;
import java.util.LinkedList;

public class EvenOddTree {
    public boolean isEvenOddTree(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();

        deque.offer(root);
        boolean even = false;
        while(!deque.isEmpty())
        {
            int size = deque.size();
            int prev = even ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            while(size-->0) {
                root = deque.poll();

                if(even && (root.val%2==0 || root.val <=prev))
                {
                    return false;
                }
                if(!even && (root.val%2!=0 || root.val >=prev))
                {
                    return false;
                }
                prev = root.val;

                if (root.left != null)
                    deque.add(root.left);
                if (root.right != null)
                    deque.add(root.right);

            }even =!even;
        }


        return true;
    }

    public boolean recur(TreeNode root, int Level,boolean even)
    {
        if((even && root.val%2!=0)||(!even && root.val%2==0))
        {
            System.out.println("Deentlo unna" + "even : " + even + " rootval : " + root.val);
            return false;
        }
        if(root==null)
        {
            return true;
        }

        if(root.left!=null) {
            //deque.add(tree.left);
            System.out.println(Level);
            recur(root.left,Level+1,!even);
        }
        if(root.right!=null){
            //deque.add(tree.right);
            recur(root.right,Level+1,!even);
            }

        return true;
    }
    public static void main(String[] args)
    {
        EvenOddTree ev = new EvenOddTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(7);

        System.out.println(ev.isEvenOddTree(root));
    }
}
