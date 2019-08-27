package chart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//1135. 最低成本联通所有城市
//        想象一下你是个城市基建规划者，地图上有 N 座城市，它们按以 1 到 N 的次序编号。
//
//        给你一些可连接的选项 conections，其中每个选项 conections[i] = [city1, city2, cost] 表示将城市 city1 和城市 city2 连接所要的成本。（连接是双向的，也就是说城市 city1 和城市 city2 相连也同样意味着城市 city2 和城市 city1 相连）。
//
//        返回使得每对城市间都存在将它们连接在一起的连通路径（可能长度为 1 的）最小成本。该最小成本应该是所用全部连接代价的综合。如果根据已知条件无法完成该项任务，则请你返回 -1。
//
//
//
//        示例 1：
//
//
//
//        输入：N = 3, conections = [[1,2,5],[1,3,6],[2,3,1]]
//        输出：6
//        解释：
//        选出任意 2 条边都可以连接所有城市，我们从中选取成本最小的 2 条。
//        示例 2：
//
//
//
//        输入：N = 4, conections = [[1,2,3],[3,4,4]]
//        输出：-1
//        解释：
//        即使连通所有的边，也无法连接所有城市。
public class ConnectingCitiesWithMinimumCost_1135 {
    //最小生成树，kruskal算法
    //当N=10000时，超出时间限制，应该是开头的冒泡排序花费了很多时间
    public int minimumCost(int N, int[][] connections) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
//        for (int i = connections.length - 1; i > 0; i--){
//            for (int j = 0; j < i; j++){
//                if (connections[j][2] > connections[j + 1][2]){
//                    int[] tmp = connections[j + 1];
//                    connections[j + 1] = connections[j];
//                    connections[j] = tmp;
//                }
//            }
//        }

        for (int i = 0; i < connections.length; i++){
            queue.add(connections[i]);
        }

        int[] nums = new int[N + 1];
        int weight = 0;
        for (int i = 1; i < N + 1; i++){
            nums[i] = i;
        }

       while (!queue.isEmpty()){
            int[] tmp = queue.poll();
            int boss1 = findBoss(nums, tmp[0]);
            int boss2 = findBoss(nums, tmp[1]);

            if (boss1 != boss2){
                weight = weight + tmp[2];
                nums[boss2] = boss1;
            }
        }

        int count = 0;
        for (int i = 1; i < N + 1; i++){
            if (nums[i] == i)
                count++;
        }

        if (count == 1)
            return weight;
        else
            return -1;

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
