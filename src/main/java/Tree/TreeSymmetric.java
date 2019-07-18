package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeSymmetric {
    public boolean isSymmetric1(TreeNode root){
        if (root == null)
            return true;
        return ispartialSymmetric(root.left, root.right);
    }
    //递归
    //同时比较两棵树的左子树和右子树
    public boolean ispartialSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null)
            return true;

        if (left == null || right == null)
            return false;

        if (left.val != right.val)
            return false;

        return ispartialSymmetric(left.left, right.right) && ispartialSymmetric(left.right, right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        //二叉树要对称，首先每一层节点个数为双数
        // 层序遍历，每一层判断是否镜像对称，没有的位置记为空
        boolean result = true;
        Queue<TreeNode> roots = new LinkedList<>();
        roots.offer(root);

        while (!roots.isEmpty()){
            int count = roots.size();
            List<Integer> vals = new ArrayList<>();
            while (count > 0){
                root = roots.poll();
                if (root == null)
                    vals.add(null);
                else
                    vals.add(root.val);
                if (root.left != null)
                    roots.offer(root.left);
                else
                    roots.offer(null);

                if (root.right != null)
                    roots.offer(root.right);
                else
                    roots.offer(null);

                count--;
            }

            for (int i = 0; i < vals.size()/2; i++){
                if (vals.get(i) != vals.get(vals.size()-1-i))
                    result = false;
            }
        }

        return result;
    }
}
