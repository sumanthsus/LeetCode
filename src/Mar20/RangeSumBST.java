package Mar20;

public class RangeSumBST {
    public int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)
        {
            return 0;
        }
        int sum = 0;
        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }
        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high);
        }
        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
        //return root.val + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);

        /*
        int left = rangeSumBST(root.left,low,high);
        if(left>=low && left<=high)
            sum+=left;
        int right = rangeSumBST(root.right,low,high);
        if(right>=low && right<=high)
            sum+=right;
        return sum;*/
    }


    public static void main(String[] args)
    {
        RangeSumBST rsb= new RangeSumBST();
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node18 = new TreeNode(18);
        TreeNode node5 = new TreeNode(5, node3, node7);
        TreeNode node15 = new TreeNode(15, null, node18);
        TreeNode root = new TreeNode(10, node5, node15);

        System.out.println(rsb.rangeSumBST(root,7,15));

    }
}
