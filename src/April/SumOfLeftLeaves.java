package April;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Boolean> bol = new LinkedList<>();

        queue.offer(root);
        bol.offer(false);
        int sum=0;
        int i=5;
        while(!queue.isEmpty()&&i>0)
        {
            TreeNode temp = queue.poll();
            if(Boolean.TRUE.equals(bol.peek()) && temp.left==null && temp.right==null)
            {
                sum=sum+temp.val;
            }

            if(temp.left!=null)
            {
                queue.offer(temp.left);
                bol.offer(true);
            }
            if(temp.right!=null)
            {
                queue.offer(temp.right);
                bol.offer(false);
            }
            //System.out.println(temp.val);

            //queue.poll();
            bol.poll();
        }

        return sum;


        //return recur(root,0,false);
    }


    /*public int recur(TreeNode root,int sum, boolean left)
    {
        if(root.left==null && root.right==null)
        {
            if(left)
            return sum+root.val;
            else
                return 0;
        }
        int left1=0,right1=0;
        if(root.left!=null)
            left1=recur(root.left,sum,true);

        if(root.right!=null)
            right1=recur(root.right,sum,false);

        return left1+right1;

    }*/

    public static void main(String[] args)
    {
        SumOfLeftLeaves sl = new SumOfLeftLeaves();
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node3 = new TreeNode(3,node6,null);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(sl.sumOfLeftLeaves(root));
    }
}
