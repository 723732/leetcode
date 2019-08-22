package Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildTreeTest {

    int[] inorder = {9,3,15,20,7};
    int[] postorder = {9,15,7,20,3};

    @Test
    public void buildTree() {
        BuildTree a = new BuildTree();
        TreeNode b = a.buildTree(inorder, postorder);

        System.out.print(b.val);
    }
}