package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthTest {
    TreeNode a = new TreeNode(3);
    TreeNode b = new TreeNode(9);
    TreeNode c = new TreeNode(20);
    TreeNode d = new TreeNode(15);
    TreeNode e = new TreeNode(7);

    @Test
    public void leafDepth() {
        a.left = b;
        a.right = c;
        b.left = null;
        b.right = null;
        c.left = d;
        c.right = e;

        MaxDepth maxDepth = new MaxDepth();
        int h = maxDepth.maxDepth(a);

        System.out.print(h);
    }
}