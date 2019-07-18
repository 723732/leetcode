package Tree;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int max=0;//存储子树的深度
        int leftMax=0;
        int rightMax=0;
        if (root != null) {//如果当前子树不为空,非空树
            max++;//深度加1
            leftMax = maxDepth(root.left);//左子树深度
            rightMax = maxDepth(root.right);//右子树深度
            max += leftMax >= rightMax ? leftMax : rightMax;//当前子树的深度
        }
        return max;//返回当前子树的深度

    }

}
