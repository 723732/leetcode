package Tree;

import Tree.TreeNode;

import java.util.*;

public class TreeTraversal {
    //后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        Stack<TreeNode> oroot = new Stack<>();

        if (root == null)
            return postorder;

        oroot.push(root);
        while (!oroot.isEmpty()){
            root = oroot.pop();
            postorder.add(0, root.val);

            if (root.left != null)
                oroot.push(root.left);
            if (root.right != null)
                oroot.push(root.right);
        }

        return postorder;
    }

    //层序遍历
    //队列，先进先出,没法区分是哪一层的
    //给每一次统计一次个数n，将符合个数的前n个元素出队列
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> levelorder = new ArrayList<>();
        Queue<TreeNode> roots = new LinkedList<TreeNode>();

        if (root == null)
            return levelorder;
        roots.offer(root);
        while (!roots.isEmpty()){
            int count = roots.size();
            List<Integer> order = new ArrayList<>();
            while (count > 0){
                root = roots.poll();
                order.add(root.val);
                if (root.left != null){
                    roots.offer(root.left);
                }
                if (root.right != null){
                    roots.offer(root.right);
                }
                count--;
            }

            levelorder.add(order);
        }

        return levelorder;
    }

}
