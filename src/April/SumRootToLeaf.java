package April;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SumRootToLeaf {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(root,0));
        int currentSum=0,TotalSum=0;
        while(!queue.isEmpty())
        {

            System.out.print(" R :" + queue.peek().root.val + " " +queue.peek().num + " ");


            currentSum=queue.peek().num;
            currentSum=currentSum*10 + queue.peek().root.val;


            if((queue.peek().root.left==null)&&(queue.peek().root.right==null))
            {
                System.out.print(" rot : " + queue.peek().root.val);
                TotalSum+=currentSum;
            }

            if(queue.peek().root.left!=null) queue.offer(new Pair(queue.peek().root.left,currentSum));
            if(queue.peek().root.right!=null) queue.offer(new Pair(queue.peek().root.right,currentSum));

            System.out.println("Current : " + currentSum + " Total Sum : " + TotalSum);

            queue.poll();

        }


        //sumt(root,0);
        return TotalSum;
        //return sumRecur(root,0);
    }
    public void sumt(TreeNode root,int number)
    {
        number=number*10+root.val;
        if(root.left==null && root.right==null)
        {
            sum=sum+number;
        }

        if(root.left!=null) sumt(root.left,number);
        if(root.right!=null) sumt(root.right,number);
    }

    public int sumRecur(TreeNode root, int sum)
    {
        sum=sum*10+root.val;

        if(root.left==null && root.right==null)
        {
            System.out.println(sum);
            return sum;
        }
        int left=0,right=0;
        if(root.left!=null)
        {
            left=sumRecur(root.left,sum);
        }
        if(root.right!=null)
        {
            right=sumRecur(root.right,sum);
        }

        return left+right;

    }
    public static void main(String[] args)
    {
        SumRootToLeaf st = new SumRootToLeaf();
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node18 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode root = new TreeNode(1, node2, node18);

        System.out.println(st.sumNumbers(root));

    }
}
