package Tree;

import java.util.Stack;

public class TreehasPathSum {
    //可以递减
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;

        if (root != null)
            sum = sum - root.val;

        if (root.left == null && root.right == null && sum == 0)
            return true;

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);


    }
}
