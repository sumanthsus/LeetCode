package Mar20;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q; // If one of them is null, return true only if both are null
        }
        //return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

        if(p.val!=q.val)
            return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }

    public static void main(String[] args)
    {
        SameTree st = new SameTree();
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        // Creating tree q = [1,null,2]
        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        System.out.println(st.isSameTree(p,q));
    }
}
