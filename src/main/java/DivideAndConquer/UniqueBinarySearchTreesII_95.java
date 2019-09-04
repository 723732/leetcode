package DivideAndConquer;
//95. 不同的二叉搜索树 II
//        给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
//
//        示例:
//
//        输入: 3
//        输出:
//        [
//        [1,null,3,2],
//        [3,2,null,1],
//        [3,1,null,null,2],
//        [2,1,3],
//        [1,null,2,null,3]
//        ]
//        解释:
//        以上的输出对应以下 5 种不同结构的二叉搜索树：
//
//        1         3     3      2      1
//        \       /     /      / \      \
//        3     2     1      1   3      2
//        /     /       \                 \
//        2     1         2                 3

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTreesII_95 {
    //分治法，以n为根节点，分别生成左右两棵子树
    public List<TreeNode> generateTrees(int n) {
        if(n < 1)
            return new ArrayList<TreeNode>();

        return generateTree(1, n);
    }

    public List<TreeNode> generateTree(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        for (int i = start; i < end + 1; i++){
            List<TreeNode> lefts = generateTree(start, i - 1);
            List<TreeNode> rights = generateTree(i + 1, end);

            for (TreeNode left: lefts){
                for (TreeNode right: rights){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }

        if (start > end )
            res.add(null);

        return res;
    }
}
