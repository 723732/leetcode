package chart;
//323. 无向图中连通分量的数目
//        给定编号从 0 到 n-1 的 n 个节点和一个无向边列表（每条边都是一对节点），请编写一个函数来计算无向图中连通分量的数目。
//
//        示例 1:
//
//        输入: n = 5 和 edges = [[0, 1], [1, 2], [3, 4]]
//
//        0          3
//        |          |
//        1 --- 2    4
//
//        输出: 2
//        示例 2:
//
//        输入: n = 5 和 edges = [[0, 1], [1, 2], [2, 3], [3, 4]]
//
//        0           4
//        |           |
//        1 --- 2 --- 3
//
//        输出:  1

import java.util.HashSet;
import java.util.Set;

public class NumberofConnectedComponentsinanUndirectedGraph_323 {
    //分组，统计组的个数就是连通分量的个数
    //6
    //[[0,1],[0,2],[2,5],[3,4],[3,5]]
    public int countComponents(int n, int[][] edges) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = i;
        }

        for (int i = 0; i < edges.length; i++){
            //找各自的老大
            int boss1 = findBoss(nums, edges[i][0]);
            int boss2 = findBoss(nums, edges[i][1]);

            //如果两个boss不同，强制使boss2成为boss1的手下
            if (boss1 != boss2)
                nums[boss2] = boss1;
        }

        int count = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == i)
                count++;
        }

        return count;
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
