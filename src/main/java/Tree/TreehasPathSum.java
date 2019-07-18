package Tree;

import java.util.Stack;

public class TreehasPathSum {
    //可以递减
    public boolean hasPathSum(TreeNode root, int sum) {

    }

    //递归好难，到底咋写
    public int pathSum(TreeNode node){
        int sum = 0;
        int left_sum = 0;
        int right_sum = 0;

        if (node != null){
            left_sum = sum + pathSum(node.left);
            right_sum = sum + pathSum(node.right);
        }
    }
}
