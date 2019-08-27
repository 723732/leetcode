package chart;
//261. 以图判树
//        给定从 0 到 n-1 标号的 n 个结点，和一个无向边列表（每条边以结点对来表示），请编写一个函数用来判断这些边是否能够形成一个合法有效的树结构。
//
//        示例 1：
//
//        输入: n = 5, 边列表 edges = [[0,1], [0,2], [0,3], [1,4]]
//        输出: true
//        示例 2:
//
//        输入: n = 5, 边列表 edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
//        输出: false

public class GraphValidTree_261 {
    //无环且只有一个根节点
    //判断有无环，还没有合并为一个老大时，老大已经相同，证明有环
    //根节点只有一个，并查集老大个数为1
    public boolean validTree(int n, int[][] edges) {
        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = i;
        }

        for (int i = 0; i < edges.length; i++){
            int boss1 = findBoss(nums, edges[i][0]);
            int boss2 = findBoss(nums, edges[i][1]);
            if (boss1 == boss2)
                return false;
            else
                nums[boss2] = boss1;

        }

        int count = 0;
        for (int i = 0; i < n; i++){
            if(nums[i] == i){
                count++;
            }
        }

        if (count != 1)
            return false;


        return true;
    }

    public int findBoss(int[] nums, int i){
        while (nums[i] != i){
            int tmp = nums[i];
            nums[i] = nums[tmp];
            i = tmp;
        }
        return i;
    }
}
