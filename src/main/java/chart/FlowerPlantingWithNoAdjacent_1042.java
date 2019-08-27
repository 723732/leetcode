package chart;
//1042. 不邻接植花
//        有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。
//
//        paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。
//
//        另外，没有花园有 3 条以上的路径可以进入或者离开。
//
//        你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。
//
//        以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。花的种类用  1, 2, 3, 4 表示。保证存在答案。
//
//
//
//        示例 1：
//
//        输入：N = 3, paths = [[1,2],[2,3],[3,1]]
//        输出：[1,2,3]
//        示例 2：
//
//        输入：N = 4, paths = [[1,2],[3,4]]
//        输出：[1,2,1,2]
//        示例 3：
//
//        输入：N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
//        输出：[1,2,3,4]
//
//
//        提示：
//
//        1 <= N <= 10000
//        0 <= paths.size <= 20000
//        不存在花园有 4 条或者更多路径可以进入或离开。
//        保证存在答案。

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerPlantingWithNoAdjacent_1042 {
    //先构成图，然后给与此时的节点连接的节点图上没有使用过的颜色
    public int[] gardenNoAdj(int N, int[][] paths) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < N; i++){
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < paths.length; i++){
            graph.get(paths[i][0]-1).add(paths[i][1]-1);
            graph.get(paths[i][1]-1).add(paths[i][0]-1);
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++){
            boolean[] used = new boolean[5];
            for (int j: graph.get(i)){
                used[answer[j]] = true;
            }
            for (int k = 1; k < 5; k++){
                if (!used[k]){
                    answer[i] = k;
                    break;
                }
            }
        }

        return answer;

    }
}
