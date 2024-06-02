package June;

import java.util.ArrayList;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> deep1 = new ArrayList<>();
        ArrayList<Integer> deep2 = new ArrayList<>();
        depths(root1,deep1);
        depths(root2,deep2);
        return deep1.equals(deep2);
    }

    public void depths(TreeNode root, ArrayList<Integer> arr)
    {
        if(root.left==null && root.right==null)
        {
            arr.add(root.val);
            return;
        }
        if(root.left!=null) depths(root.left,arr);
        if(root.right!=null) depths(root.right,arr);
    }
    public static void main(String[] args)
    {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);

        // Create second tree
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        // Check if the two trees are leaf-similar
        LeafSimilarTrees solution = new LeafSimilarTrees();
        boolean result = solution.leafSimilar(root1, root2);

        System.out.println(result);  // Output: true
    }
}
