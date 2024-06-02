package Mar20;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {


        int max = AllRecur(root,0);

        return max;
    }
    public int AllRecur(TreeNode root,int score)
    {
        if(root==null)
        {
            return score;
        }

        int left = LeftRecur(root.left, 0);
        int right = LeftRecur(root.right,0);
        System.out.println("left : " + left + " right : " + right);
        if(score<left+right)
            score=left+right;
        AllRecur(root.left,left+right);
        AllRecur(root.right,left+right);

        return score;

    }
    public int LeftRecur(TreeNode root,int score)
    {
        if(root == null)
        {
            return score;
        }
        System.out.println("left Node : " + root.val);
        int left = LeftRecur(root.left,score+1);
        int right = LeftRecur(root.right,score+1);

        if(left>right)
            score =left;
        else
            score = right;


        return score;
    }

    /*public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1]; // We use an array to hold the maximum value across recursive calls
        LeftRecur(root, max);
        return max[0];
    }

    public int LeftRecur(TreeNode root, int[] max) {
        if (root == null) {
            return 0;
        }

        int left = LeftRecur(root.left, max);
        int right = LeftRecur(root.right, max);

        max[0] = Math.max(max[0], left + right); // Update max diameter

        // Return the maximum depth of the current node's subtree
        return 1 + Math.max(left, right);
    }*/

    public int RightRecur(TreeNode root,int right)
    {
        if(root == null)
        {
            return right;
        }
        System.out.println("Right Node : " + root.val);
        right = RightRecur(root.right,right+1);
        return right;
    }
    public static void main(String[] args)
    {
        DiameterOfBinaryTree db = new DiameterOfBinaryTree();
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node18 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node4, node5);
        TreeNode root = new TreeNode(1, node2, node18);



        System.out.println(db.diameterOfBinaryTree(root));


    }
}
