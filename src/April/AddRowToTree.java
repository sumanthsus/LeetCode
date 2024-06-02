package April;

import java.util.LinkedList;
import java.util.Queue;

public class AddRowToTree {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> dep = new LinkedList<>();


        queue.offer(root);
        dep.offer(1);
        int i=1;


        TreeNode newvalleft=new TreeNode(val);
        if(depth==1)
        {
            newvalleft.left=root;
            return newvalleft;
        }
        System.out.println(queue.peek().val + " First ");
        while(!queue.isEmpty())
        {
            System.out.println("queue : " + queue.peek().val + " dep : " + dep.peek() );
            i=dep.peek();
            if(dep.peek()==depth-1)
            {
                TreeNode leftsub=queue.peek().left;
                queue.peek().left=new TreeNode(val);
                queue.peek().left.left=leftsub;

                TreeNode rightsub=queue.peek().right;
                queue.peek().right=new TreeNode(val);
                queue.peek().right.right=rightsub;


            }

            if(queue.peek().left!=null){
                queue.offer(queue.peek().left);
                dep.offer(i+1);

            }
            if(queue.peek().right!=null){
                queue.offer(queue.peek().right);
                dep.offer(i+1);

            }
            queue.poll();
            dep.poll();
        }
        return root;
    }
    public void recurr(TreeNode root,int depth,TreeNode newval,boolean left)
    {
        if(depth==0)
        {
            if(left) newval.left=root;
            else newval.right=root;
        }
    }
    public static void main(String[] args)
    {
        AddRowToTree ad = new AddRowToTree();

        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, node3, root);
        TreeNode node4 = new TreeNode(4,node2,null);

        node4.printTree();

        ad.addOneRow(node4,1,3).printTree();
    }
}
