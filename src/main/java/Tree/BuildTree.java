package Tree;

import java.util.Arrays;

public class BuildTree {
    //从中序与后序遍历构造二叉树
    //后序遍历最后一个点是根节点，把中序遍历分为左右子树两部分；
    //后序遍历再向前是右子树的根节点，左子树的根节点
    //Arrays.binarySearch使用得是排号序的序列
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0)
            return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int k = -1;
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == postorder[postorder.length - 1]){
                k = i;
                break;
            }
        }

        int[] left_treeInorder = Arrays.copyOfRange(inorder, 0, k);
        int[] right_treeInorder = Arrays.copyOfRange(inorder, k + 1, inorder.length);
        int[] left_treePostorder = Arrays.copyOfRange(postorder, 0, left_treeInorder.length);
        int[] right_treePostorder = Arrays.copyOfRange(postorder, left_treeInorder.length, postorder.length - 1);

        root.left = buildTree(left_treeInorder, left_treePostorder);
        root.right = buildTree(right_treeInorder, right_treePostorder);

        return root;

    }


    //从前序与中序遍历序列构造二叉树
    //前序遍历第一个节点是根节点，把中序遍历分为左子树和右子树
    public TreeNode buildTree1(int[] preorder, int[] inorder) {
        if (preorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 0; i < inorder.length; i++){
            if (inorder[i] == preorder[0]){
//                root.left = preinbuildTree(preorder, inorder, 0, i);
//                root.right = preinbuildTree(preorder, inorder, i+1, i);
            }
        }
        return root;
    }

//    public TreeNode preinbuildTree(int[] preorder,)
}
